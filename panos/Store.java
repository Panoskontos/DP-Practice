package panos;
// implements Lazy Initialization with on-demand holder
public class Store {
    private static String name;
    private int laptopCount = 0;
    private int DesktopCount = 0;

    private Store(String name){
        this.name = name;
    }
    private static class SingletonHolder {
        static Store Store = new Store(name);
    }
    public static Store getInstance(String name){
        return SingletonHolder.Store;
    }
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }

    public int getLaptopCount() {
        return laptopCount;
    }

    public int getDesktopCount() {
        return DesktopCount;
    }

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


}
