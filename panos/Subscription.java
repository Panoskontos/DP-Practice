package panos;

import java.util.ArrayList;
import java.util.List;

public class Subscription {
    private int laptopInterestedCount = 0;
    private int DesktopIterestedCount = 0;
    private List<INotifyForComputer> endiaferomenoi = new ArrayList<>();

    public void addListener(INotifyForComputer INotifyForComputer, String interest){
        endiaferomenoi.add(INotifyForComputer);

        //        append count
        if(interest=="Laptop"){
            laptopInterestedCount=laptopInterestedCount+1;
        }
        if(interest=="Desktop"){
            DesktopIterestedCount=DesktopIterestedCount+1;
        }
    }
    public void removeListener(INotifyForComputer INotifyForComputer,String interest){
        endiaferomenoi.remove(INotifyForComputer);
        if(interest=="Laptop"){
            laptopInterestedCount=laptopInterestedCount-1;
        }
        if(interest=="Desktop"){
            DesktopIterestedCount=DesktopIterestedCount-1;
        }
    }

    public int getDesktopIterestedCount() {
        return DesktopIterestedCount;
    }

    public int getLaptopInterestedCount() {
        return laptopInterestedCount;
    }

    public List<INotifyForComputer> getEndiaferomenoi() {
        return endiaferomenoi;
    }


}
