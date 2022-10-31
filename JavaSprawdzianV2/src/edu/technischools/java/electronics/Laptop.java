package edu.technischools.java.electronics;

import edu.technischools.java.electronics.interfaces.HasBattery;

public class Laptop extends ElectronicDevice implements HasBattery {    //ZAD 4

        private String cpu;
        private String operatingSystem;
        private int batteryLife;   //ZAD 4

        public Laptop(String brand, String model, double price, String cpu, String operatingSystem) {
                super(brand, model, price);
                this.cpu = cpu;
                this.operatingSystem = operatingSystem;
        }


        public void setCpu(String cpu){
                this.cpu = cpu;
        }
        public String getCpu(){
                return cpu;
        }




        public void setOperatingSystem(String operatingSystem){
                this.operatingSystem = operatingSystem;
        }
        public String getOperatingSystem() {
                return operatingSystem;
        }

        @Override
        public int getBatteryLife() {  //ZAD 4
                return batteryLife;
        }
        @Override
        public void setBatteryLife(int batteryLife) {   //ZAD 4
                this.batteryLife = batteryLife;
        }


        @Override
        public String toString() {
                return "Laptop [cpu=" + cpu + ", operatingSystem=" + operatingSystem + ", batteryLife=" + batteryLife + "]";
        }  //ZAD 5
}
