package panos;

import java.util.ArrayList;
import java.util.List;

public class Subscription {
    private List<INotifyForComputer> endiaferomenoi = new ArrayList<>();

    public void addListener(INotifyForComputer INotifyForComputer){
        endiaferomenoi.add(INotifyForComputer);
    }
    public void computerMatch(){
        System.out.println("There is a match");
        for (INotifyForComputer iNotifyForCar : endiaferomenoi)
            iNotifyForCar.ClientFactoryComputerMatchOccurred();
    }
}
