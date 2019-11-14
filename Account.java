import java.util.Date;

public class Account {

   private int id;
   private double balance;
   private double annualInterestRate;
   private Date dateCreated;
   
   public Account() {
      this.id = 0;
      this.balance = 0;
      this.annualInterestRate = 0;
      this.dateCreated = new Date();
   }
   
   public Account(int id, double balance) {
      this.id = id;
      this.balance = balance;
      this.annualInterestRate = 0;
      this.dateCreated = new Date();
   }
   
   public void setID(int id) {
      this.id = id;
   }
   
   public void setBalance(double balance) {
      this.balance = balance;
   }
   
   public void setAnnualInterestRate(double annualRate) {
      this.annualInterestRate = annualRate;
   }
   
   public int getID() {
      return this.id;
   }
   
   public double getBalance() {
      return (int)(this.balance * 100)/100.0;
   }
   
   public double getAnnualInterestRate() {
      return this.annualInterestRate;
   }
   
   public Date getDateCreated() {
      return this.dateCreated;
   }
   
   public double getMonthlyInterestRate() {
      return (this.annualInterestRate / 12);
   }
   
   public void withdraw(double amount) {
      balance -= amount;
   }
   
   public void deposit(double amount) {
      balance += amount;
   }
   
   //Extra Methods
   
   public String toString() {
      return "This account, created on " + this.dateCreated + " has an ID of " + this.id + ", a balance of " + this.balance + 
      ", and an annual interest rate of " + this.annualInterestRate + ".";
   }
  
}//end class

class AccountTester {

   public static void main(String[] args) {
      Account act = new Account(1122, 20000.00);
      act.setAnnualInterestRate(.045);
      act.withdraw(2500);
      act.deposit(3000);
      System.out.println("This account has a balance of $" + act.getBalance() + ".");
      System.out.println("The monthly interest on this account is " + (act.getMonthlyInterestRate()*100) + "%.");
      System.out.println("This account was created on " + act.getDateCreated());
   }
   
}//end class
