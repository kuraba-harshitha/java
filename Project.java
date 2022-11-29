/*create a Airline ticket Management System using java*/


import java.util.*;

class Admin
{
    public long balance;
    public String idno;
    public long number;
    Scanner sc=new Scanner(System.in);
    //method to open an account
    void booking()
    {
        System.out.println("Enter your id number:");
        idno=sc.nextLine();
        System.out.println("Enter your passport number:");
        number=sc.nextLong();
        System.out.println("Budjet:");
        balance=sc.nextLong();
        
        
    }

//method to display account details
    void showDetails()
    {
        System.out.println("Enter your details:");
        System.out.println(idno+" "+number+" "+balance);
    }
//method to deposit
    void Payment()
    {
        System.out.println("Enter the payment ammount:");
        long amt;
        amt=sc.nextLong();
        balance=balance+amt;
    }
//method to withdraw
    void Cancelation()
    {
    
        long amt;
        System.out.println("Dont worry the ammount will be credited very soon....");
        amt=sc.nextLong();
        
        if(balance>=amt)
        {
            balance=balance-amt;
        }
        else
        {
            System.out.println("Invalid id number");
        }   
    }
//method to search an account number
    boolean search(String acn)
    {
        if(idno.equals(acn))
        {
            showDetails();
            return true;
        }
        else
        return false;
    }
}
//main class
public class Project
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //create initial account
        System.out.println("WELCOME TO 5✨  AIRLINES ");
        System.out.println("How many seats to be alloted:");
        int n=sc.nextInt();
        Admin C[]=new Admin[n];
        for(int i=0;i<C.length;i++)//01234
        {
            C[i]=new Admin();//C[0],C[1],C[2],C[3],C[4],C[5]
            C[i].booking();// accno,name,balance for five times it will ask
        }
        //run the loop until 5 is not pressed
        int ch;
        do
        {
            System.out.println("Main menu\n1.Display All\n2.Search location\n3.Payment\n4.Cancellation\n5.Feedback.");
            System.out.println("Enter your choice:");
            ch=sc.nextInt();//switch value
            switch(ch)
            {
                case 1:
                    for(int i=0;i<C.length;i++)
                    {
                        C[i].showDetails();
                    }
                    break;
                case 2:
                    System.out.println("Enter location you wanna go: ");
                    String acn=sc.next();
                    boolean found=false;
                    for(int i=0;i<C.length;i++)
                    {
                        found=C[i].search(acn);
                        if(found)
                        {
                            break;
                        }
                    }
                        if(!found)
                        {
                            System.out.println("!....Slots are available...!");
                        }
                         break;
                case 3:
                    System.out.println("Enter Account number:");
                    acn=sc.next();
                    found=false;
                    for(int i=0;i<C.length;i++)
                    {
                        found=C[i].search(acn);
                        if(found)
                        {
                            C[i].Payment();
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Account does not exist");
                    }
                    break;
                case 4:
                    System.out.println("Enter id number:");
                    acn=sc.next();
                    found=false;
                    for(int i=0;i<C.length;i++)
                    {
                        found=C[i].search(acn);
                        if(found)
                        {
                            C[i].Cancelation();
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Account does not exist");
                    }
                    break;
                case 5:
                    System.out.println("Thank you and visit again...!");
                    break;
            }
        }while(ch!=5);
    }
}
