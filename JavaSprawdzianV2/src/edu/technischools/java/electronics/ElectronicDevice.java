package edu.technischools.java.electronics;

public abstract class ElectronicDevice {
        private String brand;
        private String model;
        private double price;

        public ElectronicDevice(String brand, String model, double price){
                this.brand = brand;
                this.model = model;
                this.price = price;
        }


        public String getBrand() {
                return brand;
        }
        public void setBrand(String brand){
                this.brand = brand;
        }



        public String getModel() {
                return model;
        }
        public void setModel(String model) {
                this.model = model;
        }



        public double getPrice() {
                return price;
        }
        public void setPrice(double price) {
                this.price = price;
        }

        //ZAD 2
        public String toString() {
                return "Electronic device [brand=" + brand + ", model=" + model + ", price=" + price + "]";
        }
}
