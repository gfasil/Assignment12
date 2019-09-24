/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L12HW;

/**
 *
 * @author asus
 */
public class CustomerAccount {
    
    private String cus_name;
    private double balance;
    private int Acc_No;
    
    
    public boolean deposit(double amount){ 
       
        balance+=amount;
        
        
    return true;
    }
    public boolean withdraw(double amount){
     try{
        if (amount>balance) throw new InsuffiecientBalanceException("amount to wihdraw greater than current balance.\n amount :" + amount +"\n balance :" +balance);
        if(balance-amount<100) throw new MinimumAmountException("can not withdraw "+ amount+ " balance will go down from the minmum amount. balance :" +balance);
      
        balance-=amount;
        
        }
        catch(MinimumAmountException e){
            
            System.out.println(e.getMessage());
            return false;
        
        }
     catch(InsuffiecientBalanceException e){
         
            System.out.println(e.getMessage());
            return false;
        }
     
    
    return true;}
    
    
    class InsuffiecientBalanceException extends Exception{
    
   public InsuffiecientBalanceException(String msg){
   super(msg);
   }
    }
    
     class MinimumAmountException extends Exception{
    
   public MinimumAmountException(String msg){
   super(msg);
   }
    }
   
     public static void main(String args[]){
         
         CustomerAccount acc=new CustomerAccount("fasil", 200.00,123345);
         acc.deposit(100);
         acc.withdraw(600);
     
     }

    public CustomerAccount(String cus_name, double balance, int Acc_No) {
        this.cus_name = cus_name;
        this.balance = balance;
        this.Acc_No = Acc_No;
    }
}

