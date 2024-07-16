package com.accounts.service;

import com.accounts.dto.CustomerDto;
import jakarta.validation.Valid;

public interface IAccountsService {

    void createAccount(@Valid CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}
