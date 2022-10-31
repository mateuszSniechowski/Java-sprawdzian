package edu.technischools.java.electronics;

public class Phone extends ElectronicDevice {

    public Phone(String brand, String model, double price) {
        super(brand, model, price);
    }

    public enum MODE{
            PULSE,
            TONE,
        }

}
