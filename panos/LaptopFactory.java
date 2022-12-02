package panos;

public class LaptopFactory implements ComputerAbstractFactory{
    private final String RAM;
    private final String CPU;
    private final float Price;
    private final String Camera;
    private final String Battery;

    public LaptopFactory(String RAM, String CPU, float Price,String Camera, String Battery){
        this.RAM = RAM;
        this.CPU = CPU;
        this.Price = Price;
        this.Camera = Camera;
        this.Battery = Battery;
    }

    @Override
    public Computer createComputer(){ return new Laptop(RAM,CPU,Price,Camera,Battery);}
}
