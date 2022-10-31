package edu.technischools.java;

import edu.technischools.java.electronics.BatteryUpgrade;
import edu.technischools.java.electronics.ElectronicDevice;
import edu.technischools.java.electronics.Laptop;
import edu.technischools.java.electronics.MobilePhone;
import edu.technischools.java.electronics.Phone;
import edu.technischools.java.electronics.interfaces.HasBattery;

import java.util.*;

public class ElectronicShop {
    public static void main(String[] args) {
        //ZAD 6
        Phone phone = new Phone("samsung", "galaxy s10", 2500);
        Phone phone2 = new Phone("ajfon", "xProMaxUltra", 5000);


        MobilePhone mobilePhone = new MobilePhone("Samsung", "S10+", 5000, false, 128);
        mobilePhone.setBatteryLife(32);

        MobilePhone mobilePhone2 = new MobilePhone("Samsung", "1", 1000, true, 16);
        mobilePhone2.setBatteryLife(23);


        Laptop laptop = new Laptop("asus", "FX501", 7000, "intel core i7", "windows");
        laptop.setBatteryLife(43);

        Laptop laptop2 = new Laptop("dell", "x8", 5000, "intel core i7", "windows");
        laptop2.setBatteryLife(98);


        //ZAD 7
        Set<ElectronicDevice> electronicDevices = new HashSet<>();

        electronicDevices.add(phone);
        electronicDevices.add(phone2);


        electronicDevices.add(mobilePhone);
        electronicDevices.add(mobilePhone2);


        electronicDevices.add(laptop);
        electronicDevices.add(laptop2);


        //ZAD 8
        List<HasBattery> withBatteries = new ArrayList<>();
        List<ElectronicDevice> noBatteries = new ArrayList<>();

        for (ElectronicDevice device : electronicDevices ) {
            if (device instanceof HasBattery){
                withBatteries.add((HasBattery) device);
            }else {
                noBatteries.add(device);
            }
        }

        //ZAD 9
        noBatteries.forEach(device -> System.out.println(device));



        System.out.println(".....");


        //ZAD 10
        withBatteries.sort((a, b) -> b.getBatteryLife() - a.getBatteryLife());
        System.out.println(withBatteries);



        System.out.println(".....");


        //ZAD 12
        BatteryUpgrade upgrade = new BatteryUpgrade();
        withBatteries.forEach(device -> upgrade.accept(device));

        System.out.println(withBatteries);
    }
}