package atm.simulator;

import java.util.Scanner;

public class ATMSimulator extends Thread{


    public static void main(String[] args) {
        
     Scanner reader = new Scanner(System.in); 
        System.out.println("Enter your Credit Card Number\n");
        String cCCN = reader.nextLine(); 
        while (cCCN.length() != 16)
        {
            System.out.println("Please enter the right Credit Card Number!");
            System.out.println("\n");
            cCCN = reader.nextLine(); 

        }
        System.out.println("\nEnter your Password\n");
        String cP = reader.nextLine();
        while (cP.length() != 4)
        {
            System.out.println("Please enter the Correct Password!\n");
            cP = reader.nextLine();
        }
        System.out.println("\n");
        
        mainMenu obj = new mainMenu(cCCN, cP);
        obj.Menu();
        
  
    }
}