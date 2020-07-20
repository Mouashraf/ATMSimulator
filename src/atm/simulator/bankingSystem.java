package atm.simulator;

 class bankingSystem extends ATMSimulator{
    

    int balance = 0;
    int amount;
    int previousTransaction;
    String customerCCNumber;
    String customerPassword;

    void deposit(int amount)
    {
        balance = balance + amount;
        previousTransaction = -amount;
    }
    
    void withdraw (int amount)
    {
        balance = balance - amount;
        previousTransaction = -amount;
    }
    

    void PreviousTransaction()
    {
        if (previousTransaction > 0)
            System.out.println("You Have Deposited "+previousTransaction);
        else
            System.out.println("You Have Withdrawn "+previousTransaction);
    }
}

