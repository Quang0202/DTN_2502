package vti.accountmanagement.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vti.accountmanagement.request.account.AccountCreateRequest;
import vti.accountmanagement.request.account.AccountUpdateRequest;
import vti.accountmanagement.response.dto.account.AccountInfoDto;
import vti.accountmanagement.response.dto.account.AccountListDto;


@Service
public interface AccountService {
    Page<AccountListDto> getAll(Pageable pageable, String search);
    AccountInfoDto getAccountById(int id);
    void save(AccountCreateRequest account);
    void update(AccountUpdateRequest account);
    void delete(Integer id);
}
