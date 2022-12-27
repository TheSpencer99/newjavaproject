package chapter3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AccountTest {
    @Test
    public void testThatWithdrawCanBeMade(){
        Account account = new Account(67, "Spencer", 2000.0);
        assertEquals(2000.0, account.getBalance());
         account.withdraw(1000);
        assertEquals(1000.0, account.getBalance());
    }

    @Test
    public void testThatDepositCanBeMade(){
        Account account = new Account(67,"Spencer",5000.0);
        assertEquals(5000.0, account.getBalance());
        account.deposit(3000);
        assertEquals(8000.0, account.getBalance());

    }


}