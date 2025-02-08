package com.bank.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import com.bank.accounts.entity.BaseEntity;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Accounts extends BaseEntity {

    @Column(name="customer_id")
    private Long customerId;

    @Column(name="account_number")
    @Id
    private Long accountNumber;

    @Column(name="account_type")
    private String accountType;

    @Column(name="branch_address")
    private String branchAddress;

}
