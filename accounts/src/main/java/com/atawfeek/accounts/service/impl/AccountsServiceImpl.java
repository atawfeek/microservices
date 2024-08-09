package com.atawfeek.accounts.service.impl;

import org.springframework.stereotype.Service;

import com.atawfeek.accounts.dto.CustomerDto;
import com.atawfeek.accounts.repository.AccountsRepository;
import com.atawfeek.accounts.repository.CustomerRepository;
import com.atawfeek.accounts.service.IAccountsService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private CustomerRepository customerRepository;
    private AccountsRepository accountsRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {
        // TODO Auto-generated method stub


        
    }

}
