package src.poo;

import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        Item tuna = new Item();
        tuna.name="Gomez";
        tuna.price=100.0;
        tuna.calculateTax();
        tuna.expirationDate = new Date(2021,12,20);

        if (tuna.canItBeSold()) {

            System.out.println("Nombre del item: " + tuna.name);
            System.out.println("Precio del item: " + tuna.price);
            System.out.println("Impuesto del item: " + tuna.tax);
            System.out.println("El total a pagar por el item: " + tuna.getTotalToPay());
        } else {
            System.out.println("Este item no está habilitado para la venta");
        }

    }
}
