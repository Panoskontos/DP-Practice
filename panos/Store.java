package panos;


import java.util.ArrayList;
import java.util.List;


// implements Lazy Initialization with on-demand holder
public class Store implements Subscribe{

//    Our Store name
    private static String name;



//    Observer implementation
    private List<Observer> endiaferomenoi = new ArrayList<>();
    private int laptopCount = 0;
    private int DesktopCount = 0;
    private int laptopInterestedCount = 0;
    private int DesktopInterestedCount = 0;




//    Singleton implementation
    private Store(String name){
        this.name = name;
    }
    private static class SingletonHolder {
        static Store Store = new Store(name);
    }
    public static Store getInstance(String name){

        return SingletonHolder.Store;
    }




//    Abstract Factory Create Computer
    public static Computer getComputer(ComputerAbstractFactory factory){

        return factory.createComputer();
    }



//    Getters
    public int getLaptopCount() {
        return laptopCount;
    }

    public int getLaptopInterestedCount() {
        return laptopInterestedCount;
    }

    public int getDesktopInterestedCount() {
        return DesktopInterestedCount;
    }

    public int getDesktopCount() {
        return DesktopCount;
    }




//    Setters for latops
    public void addLaptop(){
        this.laptopCount =this.laptopCount+1;
    }
    public void addDesktop(){
        this.DesktopCount =this.DesktopCount+1;
    }

    public void removeLaptop(){
        this.laptopCount =this.laptopCount-1;
    }
    public void removeDesktop(){
        this.DesktopCount =this.DesktopCount-1;
    }





//    Observer implementation
    @Override
    public void addSubscriber(Observer observer, String interest) {
        endiaferomenoi.add(observer);
        if(interest=="Laptop"){
            laptopInterestedCount=laptopInterestedCount+1;
        }
        if(interest=="Desktop"){
            DesktopInterestedCount=DesktopInterestedCount+1;
        }

    }

    @Override
    public void removeSubscriber(Observer observer, String interest) {
        endiaferomenoi.remove(observer);
        if(interest=="Laptop"){
            laptopInterestedCount=laptopInterestedCount-1;
        }
        if(interest=="Desktop"){
            DesktopInterestedCount=DesktopInterestedCount-1;
        }
    }

    @Override
    public void handleSubscriber(Observer observer,String interest) {
        if(interest=="Laptop"&&laptopCount>0){
            System.out.println("Laptop is available");
            removeLaptop();
            observer.match();
            removeSubscriber(observer,interest);
        }
        if(interest=="Desktop"&&DesktopCount>0){
            System.out.println("Desktop is available");
            removeDesktop();
            observer.match();
            removeSubscriber(observer,interest);
        }



    }
}
