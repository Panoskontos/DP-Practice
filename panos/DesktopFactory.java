package panos;

public class DesktopFactory implements ComputerAbstractFactory{

    private final String RAM;
    private final String CPU;
    private final float Price;

    public DesktopFactory(String RAM, String CPU, float Price){
        this.RAM = RAM;
        this.CPU = CPU;
        this.Price = Price;
    }

    @Override
    public Computer createComputer(){ return new Desktop(RAM,CPU,Price);}
}
