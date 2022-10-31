//ZAD 11

package edu.technischools.java.electronics;
import edu.technischools.java.electronics.interfaces.HasBattery;

public class BatteryUpgrade implements java.util.function.Consumer<HasBattery>{
    @Override
    public void accept(HasBattery n) {
        n.setBatteryLife(n.getBatteryLife() + 1);
    }
}
