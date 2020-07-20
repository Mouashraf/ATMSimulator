package atm.simulator;

public class currentBalance extends mainMenu  {
    
    public currentBalance(int bal ){
       balance = bal;
    }
    
    public void run(){
        System.out.println("Your current Balance is "+ balance +"\n");
    }
    
}
