package com.atawfeek.accounts.service;

import com.atawfeek.accounts.dto.CustomerDto;

public interface IAccountsService {
    
    /**
     * 
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);
}
