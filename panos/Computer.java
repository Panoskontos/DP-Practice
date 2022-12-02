package panos;

public abstract class Computer {
    public abstract String getRAM();
    public abstract String getCPU();
    public abstract float getPrice();

    @Override
    public String toString(){
        return "computer features";
    }
}
