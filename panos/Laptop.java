package panos;

public class Laptop extends Computer{
    private final String RAM;
    private final String CPU;
    private final float Price;
    private final String Camera;
    private final String Battery;

    public Laptop(String RAM, String CPU, float Price,String Camera, String Battery){
        this.RAM = RAM;
        this.CPU = CPU;
        this.Price = Price;
        this.Camera = Camera;
        this.Battery = Battery;
    }

    @Override
    public String getRAM(){ return RAM;}
    @Override
    public String getCPU(){ return CPU;}
    @Override
    public float getPrice(){ return Price;}

    public String getCamera(){ return Camera;}
    public String getBattery(){return Battery;}

    @Override
    public String toString(){
        return "\nLaptop with: \n" +
                "RAM= "+this.getRAM()+"\n" +
                "CPU= "+this.getCPU()+"\n" +
                "Camera= "+this.getCamera()+"\n" +
                "Battery= "+this.getBattery()+"\n" +
                "Price= "+this.getPrice()+"\n";
    }
}
