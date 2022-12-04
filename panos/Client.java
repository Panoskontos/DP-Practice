package panos;

import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class Client implements Observer{
    private final String interest;
    private final int ID;

    public Client(int ID,String interest){
        this.interest = interest;
        this.ID = ID;
    }

    @Override
    public void match() {
        if(interest=="Laptop"){
            System.out.println("Client "+ID+" buys Laptop and takes a picture");
        }
        if(interest=="Desktop"){
            System.out.println("Client "+ID+" buys Desktop and runs an Chrome");
        }
    }

    public String getInterest() {
        return interest;
    }
}
