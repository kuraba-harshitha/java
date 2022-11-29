/*Write a java mini project for Smart canteen*/
import java.util.*;
class Breakfast
{
    Scanner sc = new Scanner(System.in);
    void breaki()
    {
         int ch=0;
        do
        {
            System.out.println("1.Dosa\n2.Idly\n3.Poori\n4.Chapathi\n5.Exit");
            System.out.println("Enter Your Choice");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    dosa();//Calls Dosa Method
                    break;
                case 2:
                    Idly();//Calls Idly Method
                    break;
                case 3:
                    Poori();//Calls Poori Method
                    break;
                case 4:
                    Chapathi();//Calls Poori Method
                    break;
                case 5:
                    break;
           
            }
        }while(ch!=5);
        System.out.println("Pay Bill at the Counter!");
    }
    void dosa()
    {
        System.out.println("Available Dosas");
        System.out.println("1.MASALA DOSA\n2.ONION DOSA\n3.PLAIN DOSA\n4.KARAM DOSA\n5.EGG DOSA\n6.EXIT");
        int ch=0;
        int tot= 0;
        do
        {
            System.out.println("Enter Your Choice");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Price of Masala Dosa is---Rs.40");
                    System.out.println("Your Order is Placed...!");
                    break;
                case 2:
                    System.out.println("Price of ONION Dosa is---Rs.35");
                    System.out.println("Your Order is Placed...!");
                    break;
                case 3:
                    System.out.println("Price of Plain Dosa is---Rs.20");
                    System.out.println("Your Order is Placed...!");
                    break;
                case 4:
                    System.out.println("Price of KARAM Dosa is---Rs.30");
                    System.out.println("Your Order is Placed...!");
                    break;
                case 5:
                    System.out.println("Price of EGG Dosa is---Rs.40");
                    System.out.println("Your Order is Placed...!");
                    break;
                case 6:
                    break;
            }
        }while(ch!=6);
    }
    void Idly()
    {
        int id = 5;
        System.out.println("Enter the number of Idlies:");
        int n = sc.nextInt();
        int tot = n * id;
        System.out.println("The price for "+n+" Idlies is "+tot);
        
    }
    void Poori()
    {
        int id = 8;
        System.out.println("Enter the number of Poori:");
        int n = sc.nextInt();
        int tot = n * id;
        System.out.println("The price for "+n+"Poories is "+tot);
        
    }
    void Chapathi()
    {
        int id = 9;
        System.out.println("Enter the number of Chapathi:");
        int n = sc.nextInt();
        int tot = n * id;
        System.out.println("The price for "+n+" Chapathi is "+tot);
        
    }

 }
 
 
 //Dinner Class
 class Dinner
{
    Scanner sc = new Scanner(System.in);
    void Dinneri()
    {
         int ch=0;
        do
        {
            System.out.println("1.Biryani\n2.Fried Rice\n3.Chapathi\n4.Roti\n5.Exit");
            System.out.println("Enter Your Choice");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    Biryani();//Calls Biryani Method
                    break;
                case 2:
                    Friedrice();//Calls Friedrice Method
                    break;
                case 3:
                    Roti();//Calls Roti Method
                    break;
                case 4:
                    Chapathi();//Calls Chapathi Method
                    break;
                case 5:
                    break;
           
            }
        }while(ch!=5);
        System.out.println("Pay Bill at the Counter!");
    }
    
    void Biryani()
    {
        int id = 130;
        System.out.println("Enter the number of Plates:");
        int n = sc.nextInt();
        int tot = n * id;
        System.out.println("The price for "+n+" Biryani plates is "+tot);
        
    }
    void Friedrice()
    {
        int id = 60;
        System.out.println("Enter the number of plates of Fried Rice:");
        int n = sc.nextInt();
        int tot = n * id;
        System.out.println("The price for "+n+"Plates of Fried rice is "+tot);
        
    }
    void Chapathi()
    {
        int id = 25;
        System.out.println("Enter the number of Chapathi:");
        int n = sc.nextInt();
        int tot = n * id;
        System.out.println("The price for "+n+" Chapathi is "+tot);
        
    }
    void Roti()
    {
        int id = 30;
        System.out.println("Enter the number of Roti: ");
        int n = sc.nextInt();
        int tot = n * id;
        System.out.println("The price for "+n+" Roties is "+tot);
        
    }

 }
 
 
 //Lunch class
class Lunch
{
   Scanner sc=new Scanner(System.in);
   void Lunchi()
   {
       int scc=0;
       do
       {
           System.out.println("1.Egg rice\n2.Gobbi rice\n3.Chicken rice\n4.Egg noodles\n5.Gobbi noodles\n6.porota\n7.Biryani\n8.exit");
           System.out.println("Choose your order");
           scc = sc.nextInt();
           switch(scc)
           {
               case 1:
                   Eggrice();
                   break;
               case 2:
                   Gobirice();
                   break;
                case 3:
                 Chickenrice();
                    break;
                case 4:
                    Eggnoodles();
                    break;
                case 5:
                    Gobinoodles();
                    break;
                case 6:
                    Porota();
                    break;
                case 7:
                    Biryani();
                    break;
                case 8:
                    break;
           }
       }
       while(scc!=8);
       System.out.println("pay the amount for your lunch");
   }
   void Eggrice()
   {
      int amt=60;
      System.out.println("Enter the number of plates:");
      int n=sc.nextInt();
      int tot=n * amt;
      System.out.println("The price for"+n+" Eggrice is "+tot);
   }
   void Gobirice()
   {
      int amt=70;
      System.out.println("Enter the number of plates:");
      int n=sc.nextInt();
      int tot=n * amt;
      System.out.println("The price for"+n+" Gobirice is "+tot );
   }
   void Chickenrice()
   {
      int amt=120;
      System.out.println("Enter the number of plates:");
      int n=sc.nextInt();
      int tot=n * amt;
      System.out.println("The price for"+n+" Chickenrice is "+tot );
   }
   void Eggnoodles()
   {
      int amt=50;
      System.out.println("Enter the number of plates:");
      int n=sc.nextInt();
      int tot=n * amt;
      System.out.println("The price for"+n+" Eggnoodles is "+tot );
   }
   void Gobinoodles()
   {
      int amt=70;
      System.out.println("Enter the number of plates:");
      int n=sc.nextInt();
      int tot=n * amt;
      System.out.println("The price for"+n+" Gobinoodles is "+tot );
   }
   void Porota()
   {
      int amt=65;
      System.out.println("Enter the number of plates:");
      int n=sc.nextInt();
      int tot=n * amt;
      System.out.println("The price for"+n+" Porato is "+tot );
   }
   void Biryani()
   {
      int amt=80;
      System.out.println("Enter the number of plates:");
      int n=sc.nextInt();
      int tot=n * amt;
      System.out.println("The price for"+n+" Biryani is "+tot );
   }
}
 
 
 //Main class
public class Project3
{
    public static void main(String[] args)
    {
        Scanner V = new Scanner(System.in);
        Breakfast bf = new Breakfast();
        Lunch l = new Lunch();
        Dinner d = new Dinner();
        int k=0;
        System.out.println("\t\t\t*SMART CANTEEN*");
        System.out.println("\t\t\t  WELCOMES YOU");
        do
        {
            System.out.println("Select What you wanna Have?");
            System.out.println("1.BREAKFAST\n2.LUNCH\n3.DINNER\n4.EXIT");
            k = V.nextInt();
            switch(k)
            {
                case 1:
                    bf.breaki();//Calls breaki Method
                    break;
                case 3:
                    d.Dinneri();//Calls dinner Method 
                    break;
                case 2:
                    l.Lunchi();//Calls Lunch Method
                    break;
                case 4:
                    break;
        }
    }while(k!=4);
    System.out.println("*************              THANK YOU VISIT AGAIN                 *************");
    }
}
