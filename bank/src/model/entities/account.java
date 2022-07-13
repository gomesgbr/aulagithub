package model.entities;

import model.exceptions.WithdrawException;

public class account{

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public account(int number, String holder, double balance, double withdrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder){
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount){
        balance+= amount;
    }

    public void withdraw(double amount)throws WithdrawException{

        if(balance <= 0){
            throw new WithdrawException("Seu saldo é menor que o saque!");
        }
        if(amount > withdrawLimit){
            throw new WithdrawException("Saque maior que o limite estipulado!");
        }
        balance-= amount;
    }
    
    @Override
    public String toString(){
        return "Number account: " + number
        + "\nHolder: " + holder 
        + "\nBalance: " + balance
        + "\nWithdraw Limit: " + withdrawLimit;
    }

}