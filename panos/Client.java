package panos;

import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class Client implements INotifyForComputer{
    private final String interest;
    private final int ID;

    public Client(int ID,String interest){
        this.interest = interest;
        this.ID = ID;
    }
//
//    @Override
    public void ClientFactoryComputerMatchOccurred(String Computerinterest) {
        System.out.println("There is a computer match for client "+ID+" that wants "+interest);
    }

    public void action(){
        if(interest=="Laptop"){
            System.out.println("Client "+ID+" Takes a picture");
        }
        if(interest=="Desktop"){
            System.out.println("Client "+ID+" runs an Chrome");
        }
    }

    public String getInterest() {
        return interest;
    }
}
