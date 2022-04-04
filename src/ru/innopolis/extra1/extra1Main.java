package ru.innopolis.extra1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class extra1Main {
}

interface BankAccount{
    double getBalance();
}

class SingleBankAccount implements BankAccount{

    private double balance;

    @Override
    public double getBalance() {
        return balance;
    }

    public SingleBankAccount(double balance) {
        this.balance = balance;
    }
}

class ContainerOfAccounts implements BankAccount{
    private ArrayList<SingleBankAccount> list = new ArrayList<>();
    @Override
    public double getBalance() {
        return list.stream().collect(Collectors.summingDouble(x -> x.getBalance()));
    }
    public void addAccount(SingleBankAccount acc){
        list.add(acc);
    }
}
