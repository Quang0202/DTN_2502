package vti.accountmanagement.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import vti.accountmanagement.payload.PageResponse;
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
@Tag(name = "Account Controller", description = "APIs for managing accounts: create, update, delete, and retrieve accounts.")
public class AccountController {
    private final AccountService accountService;
    private final AccountRepository accountRepository;

    @GetMapping("")
    @Operation(summary = "Get a list of accounts", description = "Retrieve a paginated list of accounts with optional search and sorting.")
    public ResponseEntity<PageResponse<AccountListDto>> getDepartment(
            @Parameter(description = "Page number (starting from 0)")
            @Min(value = 0, message = "Page must not be less than 0")
            @RequestParam(defaultValue = "0") Integer page,

            @Parameter(description = "Number of records per page")
            @Max(value = ConstantUtils.MAX_PAGE_SIZE, message = "Size must not be greater than " + ConstantUtils.MAX_PAGE_SIZE)
            @Min(value = 1, message = "Size must not be less than 1")
            @RequestParam(defaultValue = "10") Integer size,

            @Parameter(description = "Sorting criteria, e.g., accountId,asc or username,desc")
            @RequestParam(defaultValue = "accountId,asc") String[] sort,

            @Parameter(description = "Search keyword")
            @RequestParam(required = false, defaultValue = "") String search
    ) {
        return ResponseEntity.ok(
                accountService.getAll(PageRequest.of(page, size, SortUtils.getSort(sort)), search)
        );
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get account details", description = "Retrieve detailed information of an account by its ID.")
    public ResponseEntity<AccountInfoDto> getAccountById(
            @Parameter(description = "ID of the account")
            @PathVariable int id
    ) {
        return ResponseEntity.ok(accountService.getAccountById(id));
    }

    @PostMapping("/create")
    @Operation(summary = "Create a new account", description = "Create a new account with the provided information.")
    public ResponseEntity<String> createAccount(
            @Parameter(description = "Information of the account to be created")
            @Valid @RequestBody AccountCreateRequest account
    ){
        accountService.save(account);
        return ResponseEntity.ok(ConstantUtils.CREATE_SUCCESSFULLY);
    }

    @PostMapping("/update")
    @Operation(summary = "Update an existing account", description = "Update information of an existing account.")
    public ResponseEntity<String> updateAccount(
            @Parameter(description = "Information of the account to be updated")
            @Valid @RequestBody AccountUpdateRequest account
    ){
        accountService.update(account);
        return ResponseEntity.ok(ConstantUtils.UPDATE_SUCCESSFULLY);
    }

    @DeleteMapping("{id}")
    @Operation(summary = "Delete an account", description = "Delete an account by its ID.")
    public ResponseEntity<String> deleteAccount(
            @Parameter(description = "ID of the account to be deleted")
            @PathVariable Integer id
    ) {
        accountService.delete(id);
        return ResponseEntity.ok(ConstantUtils.DELETE_SUCCESSFULLY);
    }
}
