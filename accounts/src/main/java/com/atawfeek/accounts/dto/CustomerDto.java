package com.atawfeek.accounts.dto;

import lombok.Data;

@Data
public class CustomerDto {
    
    // only encapculate the props we need to send to client app

    private String name;

   
    private String email;

   
    private String mobileNumber;

    
    private AccountsDto accountsDto;

}
