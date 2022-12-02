package panos;
// implements Lazy Initialization with on-demand holder
public class Store {
    private static String name;
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
}
