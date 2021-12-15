package src.poo;

import java.util.Date;

public class Item {
    public String name;
    public Double price;
    public Double tax;
    public Date expirationDate;

    public Double getTotalToPay() {
        Double totalToPay=price+tax;
        return totalToPay;
    }

    public void calculateTax () {
        tax=price*0.21;
    }

    public boolean canItBeSold () {
       Date today;
        today = new Date();
        return expirationDate.after(today);
    }
}

