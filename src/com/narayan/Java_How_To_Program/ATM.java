package com.narayan.Java_How_To_Program;



public class ATM{
    private  boolean userAuthenticated;
    private int currentAccountNumber;
    private Screene screen;
    private Keypad keypad;
    private CashDiscpenser cashDispenser;
    private DepositSlot depositSlot;
    private BankDatabase bankDatabase;

    private static  final int BALANCE_ENQUIRY  = 1;
    private static  final int WITHDRAWAL  = 2;
    private static  final int DEPOSIT  = 3;
    private static  final int EXIT  = 4;


    public ATM() {
        userAuthenticated=false;
        currentAccountNumber=0;
        screen=new Screene();
        this.keypad=new Keypad();
        this.cashDispenser=new CashDiscpenser();
        this.depositSlot=new DepositSlot();
        this.bankDatabase=new BankDatabase();
    }// public ATM()

    public void run()
    {
        while ( true)
        {
             while ( ! isUserAuthenticated())
             {
                 screen.displayMessageLine("\n WELCOME");
                 authenticateUser();
             } //while ( ! isUserAuthenticated())
          //   performTransactions();
             setUserAuthenticated( false );
             setCurrentAccountNumber( 0 );
             screen.displayMessageLine( "\n Thankyou !  GoodBye " );

        } // while true
    }  // public void run

    public boolean isUserAuthenticated() {
        return userAuthenticated;
    }

    public void setUserAuthenticated(boolean userAuthenticated) {
        this.userAuthenticated=userAuthenticated;
    }

    public int getCurrentAccountNumber() {
        return currentAccountNumber;
    }

    public void setCurrentAccountNumber(int currentAccountNumber) {
        this.currentAccountNumber=currentAccountNumber;
    }

    public CashDiscpenser getCashDispenser() {
        return cashDispenser;
    }

    public void setCashDispenser(CashDiscpenser cashDispenser) {
        this.cashDispenser=cashDispenser;
    }

    public static int getBalanceEnquiry() {
        return BALANCE_ENQUIRY;
    }

    public static int getWITHDRAWAL() {
        return WITHDRAWAL;
    }

    public static int getDEPOSIT() {
        return DEPOSIT;
    }

    public static int getEXIT() {
        return EXIT;
    }

    public void authenticateUser() {
        screen.displayMessageLine( "Please enter your account number : " );
      //  int accountNumber = keypad.getInput();
        screen.displayMessageLine( "Enter your PIN" );
      //  int pin = keypad.getInput();
     //   userAuthenticated = bankDatabase.authenticateUser( accountNumber, pin);
        if ( isUserAuthenticated())
        {
      //      setCurrentAccountNumber( accountNumber );
        }
        else
        {
            screen.displayMessageLine( "INVALID USER NO OR PIN" );
            setUserAuthenticated( false );

        }

    }

} // public class ATM
