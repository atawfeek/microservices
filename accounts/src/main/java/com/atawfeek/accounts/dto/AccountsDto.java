package com.atawfeek.accounts.dto;

import lombok.Data;

@Data
public class AccountsDto {

    // only encapculate the props we need to send to client app

    private Long accountNumber;

    private String accountType;

    private String branchAddress;
}
