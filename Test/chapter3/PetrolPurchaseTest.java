package chapter3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PetrolPurchaseTest {
    @Test
    public void TestThatAccountPetrolPurchaseExist() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Lagos", "Total", 300, 100.0, 200.0, 1500.0);
        assertNotNull(petrolPurchase);
    }

}