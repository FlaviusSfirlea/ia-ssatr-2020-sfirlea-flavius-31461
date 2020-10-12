/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utcluj.bank.sim;

/**
 *
 * @author flavi
 */
public class BankAccount {
    
    private String owner;
    private int balance;
    
    BankAccount(String owner, int balance)
    {
        this.owner = owner;
        this.balance = balance;
    }
    
    public String getOwner ()
    {
        return owner;
    }
    
    public int getBalance()
    {
        return balance;
    }
    
    public void setBalance(int bal)
    {
        this.balance = bal;
    }
}
