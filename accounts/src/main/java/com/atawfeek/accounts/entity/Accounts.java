package com.atawfeek.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Accounts extends BaseEntity {
    @Column(name="customer_id")
    private Long customerId;

    @Id
    @Column(name="account_number")
    private Long accountNumber; // no automatic strategy is required where logic will be used in the rest Api to set it according to bank account pattern

    @Column(name="account_type")
    private String accountType;

    @Column(name="branch_address")
    private String branchAddress;
}
