package chapter3;

public class PetrolPurchase {

    private String stationLocation;

    private String petrolType;

    private int quantity;

    private double liter;

    private double discount;

    private double purchase;


    public PetrolPurchase(String stationLocation, String petrolType, int quantity, double litre, double discount,double purchase) {
        this.stationLocation = stationLocation;
        this.purchase = purchase;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.liter = litre;
        this.discount = discount;

    }

    public void setStationLocation() {
        this.stationLocation = stationLocation;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setPetrolType() {
        this.petrolType = petrolType;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getLiter() {
        return liter;
    }

    public double getDiscount() {
        return discount;
    }

    public double getPurchase() {
        return purchase;
    }

    public double purchase() {


        return purchase;
    }
}


