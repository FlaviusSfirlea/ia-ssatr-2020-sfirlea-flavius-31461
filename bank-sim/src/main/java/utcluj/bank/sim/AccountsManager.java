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
public class AccountsManager
{
    BankAccount b[] = new BankAccount[10];
    public void addAccount(BankAccount bank)
    {
        for(int i=0;i<b.length;i++){
           if(b[i]==null){
               b[i] = bank;
               System.out.println("New bank account added.");
               return;
           }   
       System.out.println("No other bank accounts to add.");
    }
    }
    
    public int getTotalBalance()
    {
       int total = 0;
       for(BankAccount ba: b){ 
           if(b!=null){
            int sum = ba.getBalance();
            total=total+sum;
           }
       }
       System.out.println("The balance for all owners is: " + total);
       return total;
    }
}
