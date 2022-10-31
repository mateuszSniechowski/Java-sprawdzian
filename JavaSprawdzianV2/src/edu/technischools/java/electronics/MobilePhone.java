package edu.technischools.java.electronics;

import edu.technischools.java.electronics.interfaces.HasBattery;

public class MobilePhone extends Phone implements HasBattery { //ZAD 4
        private boolean keyboard;
        private int storageSize;
        private int batteryLife;    //ZAD 4

        public MobilePhone(String brand, String model, double price, boolean keyboard, int storageSize) {
                super(brand, model, price);
                this.keyboard = keyboard;
                this.storageSize = storageSize;
        }

        public boolean isKeyboard() {
                return keyboard;
        }

        public int getStorageSize() {
                return storageSize;
        }

        public void setKeyboard(boolean keyboard) {
                this.keyboard = keyboard;
        }

        public void setStorageSize(int storageSize) {
                this.storageSize = storageSize;
        }


        @Override
        public int getBatteryLife()   // ZAD 4
        {
                return batteryLife;
        }

        @Override
        public void setBatteryLife(int batteryLife) {   //ZAD 4
                this.batteryLife = batteryLife;
        }




        @Override
        public String toString() {
                return "Mobile Phone [keyboard=" + keyboard + ", storageSize=" + storageSize + ", batteryLife=" + batteryLife +",]";
        }   //ZAD 5


}

