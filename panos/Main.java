package panos;

import java.util.Scanner;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

        System.out.println("----------------Computer Store Start--------------------\n");

        // Computer and Clients input
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter number of computers:");
        int computers = myobj.nextInt();
//        System.out.println("Enter number of clients:");
//        int clients = myobj.nextInt();



        // Initialize our store
        Store s1 = Store.getInstance("Panos_Computer_Shop");


//        Dummy Data
        String[] Category = {"Laptop","Desktop"};
        String[] RAM_Array = {"8GB","16GB"};
        String[] CPU_Array = {"Core i7","Ryzen 7"};
        String[] Camera_Array = {"720p","1080p"};
        String[] Battery_Array = {"12 Hours","24 Hours"};
        float[] Price_Array = {1000,1500, 2000};


        System.out.println("\n---------Generated Computers----------");
//        Generate Random Requirements for computers and create them
        for (int i = 0; i < computers; i++) {
            Random generator = new Random();
            int randomIndexCategory = generator.nextInt(Category.length);
            int randomIndexRAM = generator.nextInt(RAM_Array.length);
            int randomIndexCPU = generator.nextInt(CPU_Array.length);
            int randomIndexPrice = generator.nextInt(Price_Array.length);
            if(Category[randomIndexCategory]=="Laptop"){
                int randomIndexCamera = generator.nextInt(Camera_Array.length);
                int randomIndexBattery = generator.nextInt(Battery_Array.length);

                // Create Laptop
                Computer l1 = s1.getComputer(
                        new LaptopFactory(
                                RAM_Array[randomIndexRAM],
                                CPU_Array[randomIndexCPU],
                                Price_Array[randomIndexPrice],
                                Camera_Array[randomIndexCamera],
                                Battery_Array[randomIndexBattery]));
                System.out.println(l1.toString());

            } else {
                // Create Desktop
                Computer d1 = s1.getComputer(
                        new DesktopFactory(
                                RAM_Array[randomIndexRAM],
                                CPU_Array[randomIndexCPU],
                                Price_Array[randomIndexPrice]));
                System.out.println(d1.toString());

            }
            }


        System.out.println("Enter number of clients:");
        int clients = myobj.nextInt();
        for (int i=0; i<clients;i++){
            Random generator = new Random();
            int randomIndexCategory = generator.nextInt(Category.length);
            System.out.println("client "+(i+1)+" wants "+Category[randomIndexCategory]);
        }





//        Computer l1 = s1.getComputer(new LaptopFactory("4GB","Ryzen",1000,"4MB","12 Hours"));
//        System.out.println(l1.toString());
//
//        Computer d1 = s1.getComputer(new DesktopFactory("16GB", "Core i9", 1500));
//        System.out.println(d1.toString());



        System.out.println("\n---------------Computer Store End-----------------------");

    }


}