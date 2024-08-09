package com.atawfeek.accounts.service.impl;

import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.atawfeek.accounts.constants.AccountsConstants;
import com.atawfeek.accounts.dto.CustomerDto;
import com.atawfeek.accounts.entity.Accounts;
import com.atawfeek.accounts.entity.Customer;
import com.atawfeek.accounts.exception.CustomerAlreadyExistsException;
import com.atawfeek.accounts.mapper.CustomerMapper;
import com.atawfeek.accounts.repository.AccountsRepository;
import com.atawfeek.accounts.repository.CustomerRepository;
import com.atawfeek.accounts.service.IAccountsService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private final CustomerRepository customerRepository;
    private final AccountsRepository accountsRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {
        //verify there is no customer with the received mobile number
        Optional<Customer> optionalCustomer = customerRepository.findByMobileNumber(customerDto.getMobileNumber());
        if(optionalCustomer.isPresent()) {
            throw new CustomerAlreadyExistsException("Customer already registered with given mobileNumber "
                    +customerDto.getMobileNumber());
        }

        Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
        //create a new customer
        Customer savedCustomer = customerRepository.save(customer);

        //create a new account for the newly created customer
        accountsRepository.save(createNewAccount(savedCustomer));
    }

    /**
     * @param customer - Customer Object
     * @return the new account details
     */
    private Accounts createNewAccount(Customer customer) {
        Accounts newAccount = new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());
        long randomAccNumber = 1000000000L + new Random().nextInt(900000000);

        newAccount.setAccountNumber(randomAccNumber);
        newAccount.setAccountType(AccountsConstants.SAVINGS);
        newAccount.setBranchAddress(AccountsConstants.ADDRESS);
        return newAccount;
    }

}
