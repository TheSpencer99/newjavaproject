package chapter3;

public class Account {
     private int age;
     private String name;
     private  double balance;




     public Account(int age, String name, double balance){
         this.age = age;
         this.name = name;
         this.balance = balance;
     }
     public void setName(){
         this.name = name;
     }
     public String getName(){
         return name;
     }
     public void setAge(){
         this.age = age;
     }
     public int getAge(){
         return age;
     }
     public double getBalance(){
         return balance;
     }

    public void withdraw(int amount) {
         if (amount > balance){
             System.out.println("withdraw amount exceeded account balance");
         }
         balance = balance - amount;
    }

    public void deposit(int amount) {
            balance = balance + amount;
    }

}

