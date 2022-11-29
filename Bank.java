/*Create a Bank Management System( Console based mini project). */
import java.util.Scanner;
class Admin
{
    private String accno;
    private String name;
    private long balance;
    Scanner ma=new Scanner(System.in);
    //method to open an account
    void openAccount()
    {
        System.out.println("Enter account number:");
        accno=ma.nextLine();
        System.out.println("Enter name:");
        name=ma.nextLine();
        System.out.println("Enter balance:");
        balance=ma.nextLong();
        
    }
    //method to display account details
    void showAccount()
    {
        System.out.println("Display the details:");
        System.out.println("Account Number:"+accno);
         System.out.println("Name:"+name);
          System.out.println("Balance:"+balance);
    }
    //method to deposit
    void deposit()
    {
        System.out.println("welcome");
        System.out.println("Enter the amount to deposit:");
        long a=ma.nextLong();
        balance=balance+a;
    }
    //method to withdraw money
    void withdraw()
    {
        System.out.println("Enter the amount to withdraw:");
        long amt=ma.nextLong();
        if(amt>=balance)
        {
         System.out.println("amount is insufficient");   
        }
        else
        {
          balance=balance-amt;
          System.out.println("balance"+balance);
        }
    }
    //method to search an account number
    boolean search(String acn)
    {
        if(accno.equals(acn))
        {
            showAccount();
            return true;
        }
        return (false);
    }
}
//main class
public class Bank
{
    public static void main(String args[])
    {
     Scanner ma=new Scanner(System.in);
     System.out.println("                       Bank Management System");
     System.out.println("                       **** ********** ******");
     System.out.println("Enter how many customers do you want:");
     int n=ma.nextInt();
     Admin c[]=new Admin[n];
     for(int i=0;i<c.length;i++)//01234
     {
         c[i]=new Admin();//c[0],c[1],c[2],c[3]c[4]
         c[i].openAccount();//accno,name,balance
     }
     //run the loop until 5 is pressed
     int ch;
     do
     {
         System.out.println("Main menu\n1.Display All\n2.Search By Account\n3.Deposit\n4.withdraw\n5.Exit");
         System.out.println("Enter your choice:");
         ch=ma.nextInt();//switch value
     switch(ch)
      {
        case 1:
            for(int i=0;i<c.length;i++)
            {
                c[i].showAccount();
            }
            break;
        case 2:
            System.out.println("Enter account number:");
            String acn=ma.next();
            boolean found=false;
            for(int i=0;i<c.length;i++)
            {
                found=c[i].search(acn);
                if(found)
                {
                    break;
                }
            }
            if(!found)
            {
                System.out.println("Your search fails,not found an account");
            }
            break;
        case 3:
            System.out.println("Enter account number:");
            acn=ma.next();
            found=false;
            for(int i=0;i<c.length;i++)
            {
                found=c[i].search(acn);
                if(found)
                {
                    c[i].deposit();
                    break;
                }
            }
            if(!found)
            {
                System.out.println("Sorry account does not exist");
            }
                break;
            case 4:
            System.out.println("Enter account number:");
            acn=ma.next();
            found=false;
            for(int i=0;i<c.length;i++)
            {
                found=c[i].search(acn);
                if(found)
                {
                    c[i].withdraw();
                    break;
                }
            }
            if(!found)
            {
                System.out.println("Sorry account does not exist");
            }
                break;
            case 5:
                System.out.println("Thanks for visiting");
                break;
      }
     }while(ch!=5);
    }
}
