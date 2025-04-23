package vti.accountmanagement.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import vti.accountmanagement.repository.AccountRepository;
import vti.accountmanagement.request.account.AccountCreateRequest;
import vti.accountmanagement.request.account.AccountUpdateRequest;
import vti.accountmanagement.response.dto.account.AccountInfoDto;
import vti.accountmanagement.response.dto.account.AccountListDto;
import vti.accountmanagement.service.AccountService;
import vti.accountmanagement.utils.ConstantUtils;
import vti.accountmanagement.utils.SortUtils;

@RestController
@RequestMapping("/api/account")
@AllArgsConstructor
@Validated
public class AccountController {
    private final AccountService accountService;
    private final AccountRepository accountRepository;

    @GetMapping("")
    public ResponseEntity<Page<AccountListDto>> getDepartment(
            @Min(value = 0, message = "Page must not be less than 0")
            @RequestParam(defaultValue = "0")
            Integer page,
            @Max(value = ConstantUtils.MAX_PAGE_SIZE, message = "Size must not be greater than " + ConstantUtils.MAX_PAGE_SIZE)
            @Min(value = 1, message = "Size must not be less than 1")
            @RequestParam(defaultValue = "10")
            Integer size,
            @RequestParam(defaultValue = "accountId,asc")
            String[] sort,
            @RequestParam(required = false, defaultValue = "")
            String search
    ) {
        return ResponseEntity.ok(accountService.getAll(PageRequest.of(page, size, SortUtils.getSort(sort)), search));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccountInfoDto> getAccountById(@PathVariable int id) {
        return ResponseEntity.ok(accountService.getAccountById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<String> createAccount(@Valid @RequestBody AccountCreateRequest account){
        accountService.save(account);
        return ResponseEntity.ok("Account created");
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateAccount(@Valid @RequestBody AccountUpdateRequest account){
        accountService.update(account);
        return ResponseEntity.ok("Account updated");
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteAccount(@PathVariable Integer id) {
        accountService.delete(id);
        return ResponseEntity.ok("Account deleted");
    }
}
