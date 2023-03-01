package com.walletapp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
@Entity
public class WalletDto { // POJO
    @NotNull(message = "Id cant be null")
    @Id
    private Integer id;
    @NotBlank(message = "Name cant be null, it should contain chars")
    @Pattern(regexp = "[a-zA-Z]{3,16}", message = "Name should contain min 3 & max 16 chars , no digits and special chars allowed.")
    private String name;

    public WalletDto(Integer id, String name, Double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public WalletDto() {

    }

    public Integer getId() {
        return id;
    }

    public WalletDto(Integer id, String name, Double balance, String email, String pass, String date) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.email = email;
        this.pass = pass;
        this.date = date;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public void setBalance(Double balance,Double amount) {
        this.balance = balance+amount;
    }
    public void setBalancewithdraw(Double balance,Double amount) {
        this.balance = balance-amount;
    }
    private Double balance;

    @Override
    public String toString() {
        return "WalletDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // email, pWD, date of wallet creation
    @Email(message = "Please provide valid email. e.g name@ford.com")
     private String email;
     private String pass;
    @Pattern(regexp="([0-9]){2}([/]){1}([0-9]){2}([/]){1}([0-9]){4}" ,message = "enter in dd/mm/yyyy format")
     private String date;

   /* @Override
    public String toString() {
        return "WalletDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", date=" + date +
                '}';

    }*/
}
