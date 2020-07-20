
package atm.simulator;

public class mainMenu extends bankingSystem{
    
    mainMenu()
    {
        
    }
    
    mainMenu(String cCCN, String cP)

    {
        customerCCNumber = cCCN;
        customerPassword = cP;
    }
        
    public void Menu()
    {
       java.util.Scanner sc = new java.util.Scanner(System.in);
       
        int option;        
        System.out.println("Click 1 to Check your Balance");
        System.out.println("Click 2 to Deposit money");
        System.out.println("Click 3 to Withdraw money");
        System.out.println("Click 4 to Display your Previous Transaction");
        System.out.println("Click 5 to Exit\n");
        
        do{
            System.out.println("Choose an Option!\n");
            option = sc.nextInt();
            System.out.println("\n");
            
             
        if (option == 1)
        {
          Processing t1 = new Processing();
          t1.start();
          try{Thread.sleep(3000);}
          catch(InterruptedException e){System.out.println(e);}  
          System.out.println("Your Balance is "+balance);
          System.out.println("\n");

        }   
        
        if (option == 2)
        {
            System.out.println("Enter an Amount to Deposit\n");
            amount = sc.nextInt();
            Processing t1 = new Processing();
            t1.start();
            deposit(amount);

            try{
                t1.join();
            }catch (InterruptedException e){System.out.println(e);} 
            try{Thread.sleep(3000);}
            catch(InterruptedException e){System.out.println(e);}             
            System.out.println(amount+" Has been deposited to your account!\n");
            
            currentBalance b1 = new currentBalance(balance);
            b1.start();
            try{
                b1.join();
            }catch (InterruptedException e){System.out.println(e);}             
        }
        
        if (option == 3)
        {
         
            System.out.println("Enter an Amount to Withdraw\n");
            amount = sc.nextInt();
            Processing t1 = new Processing();
            t1.start();
            try{Thread.sleep(3000);}
            catch(InterruptedException e){System.out.println(e);}  
            
            if (balance == 0 || amount > balance)
                System.out.println("You can't Withdraw this amount\n");
            else    
            {
            withdraw(amount);
            System.out.println(amount+" Has been Withdrawn!\n");
         
            currentBalance b1 = new currentBalance(balance);
            b1.start();
            try{
                b1.join();
            }catch (InterruptedException e){System.out.println(e);}             

            }
        }
        
        if (option == 4)
        {
            Processing t1 = new Processing();
            t1.start();
            try{Thread.sleep(3000);}
            catch(InterruptedException e){System.out.println(e);}
            
            PreviousTransaction();
            System.out.println("\n");
        }
        
        if (option > 5 || option ==0) 
            System.out.println("Invalid Entry! Please try again.\n");
       
        }while (option != 5);
        {
            System.out.println("Thank you for Banking with us!");
        }

    }
}
