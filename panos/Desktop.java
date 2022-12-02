package panos;

public class Desktop extends Computer{
    private final String RAM;
    private final String CPU;
    private final float Price;

    public Desktop(String RAM, String CPU, float Price){
        this.RAM = RAM;
        this.CPU = CPU;
        this.Price = Price;
    }

    @Override
    public String getRAM(){ return RAM;}
    @Override
    public String getCPU(){ return CPU;}
    @Override
    public float getPrice(){ return Price;}

    @Override
    public String toString(){
        return "\nDesktop with: \n" +
                "RAM= "+this.getRAM()+"\n" +
                "CPU= "+this.getCPU()+"\n" +
                "Price= "+this.getPrice()+"\n";
    }
}


