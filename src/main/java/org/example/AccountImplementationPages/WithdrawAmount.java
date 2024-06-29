package org.example.AccountImplementationPages;

public class WithdrawAmount implements Account {
    private double balance;

    public WithdrawAmount(double balance){
        this.balance = balance;
    }
    @Override
    public boolean withdraw(double amount) {
        if(amount<balance){
            balance-=amount;
            return true;
        }
        return false;
    }


}
