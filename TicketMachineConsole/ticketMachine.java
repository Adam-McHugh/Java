package TicketMachineConsole;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ticketMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in); 

     
      int childPrice=18;
        int adultprice=36;
        double seniorprice=32.50;
        int infantprice=0;
        int quantity=0;
        int ticketPrice=0;
        double totalCost=0.0;
        boolean continuebuying=true;
        String tickets="";
        String Category;
    int order;    

    double costTicketType1 = 18.00; 

    double costTicketType2 = 36.00; 

    double costTicketType3 = 32.50; 

  

    String purchases = ""; 

    String itemName; 

    double ticketCost = 0.0; 

     

    NumberFormat currencyFormat=NumberFormat.getCurrencyInstance(); 

     

    //Main Menu d splay for Ticket Machine 

    System.out.println("Welcome to Winter Wonder World"); 

    System.out.println(""); 

    MainMenu myObj=new MainMenu(); 

    myObj.Menu(); 

   

    //start of iteration  

   do {
        
        
        System.out.println(" ");
        System.out.println("Enter you Ticket Category:");
        order=sc.nextInt();
        switch (order){
            case 1:
                Category="Child";
                break;
                case 2:
                Category="Adult";
                break;
                case 3:
                Category="Senior";
                break;
                case 4:
                Category="Infant";
                break;
                default:
                Category="Invalid option";
        
        }
        System.out.println("you have selected " + Category);
        System.out.println("enter the number of tickets you would like");
        quantity=sc.nextInt();
        if (Category.equals("Child")){
            ticketPrice= childPrice;
           tickets+="Child";
        double cost=childPrice*quantity;
        
        totalCost+=cost;
        
        }
        
        
        else if (Category.equals("Adult")){
            ticketPrice=adultprice;
            tickets+="adult";
        double cost=adultprice*quantity;
        
        totalCost+=cost;
        
        }
        
       else if (Category.equals("Senior")){
            ticketPrice=adultprice;
            tickets+="Senior";
        double cost=adultprice*quantity;
        
        totalCost+=cost;
        
        }
       
         else if (Category.equals("Infant")){
            ticketPrice=adultprice;
            tickets+="Infant";
        double cost=adultprice*quantity;
        
        totalCost+=cost;
        
        }
        
        
    else {
            
            System.out.println("this is not a ticket number");
            return;
        }
        
        tickets+="" + quantity + "tickets at" + currencyFormat.format(ticketPrice) + "each" + "\n";
        int total=quantity*ticketPrice;
        
        System.out.println("you are buying " + quantity + "" + Category + "tickets at" + currencyFormat.format(ticketPrice) + "each");
     
        
               
        System.out.println("Do you wish to purchase another type of ticket y/n");
        String response2=sc.next();
        
        if (response2.equals("n")){
            continuebuying = false;
            
            
        }
        
        else {
        myObj.Menu();
        
        }}
        while (continuebuying);
        System.out.println();
   
        System.out.println(" You have  purchased:\n" + tickets + "Total overall cost " + currencyFormat.format(totalCost));
System.exit(0);
        }
        
         
}

class MainMenu{
    public void Menu(){

System.out.println("   Ticket Option    ");
System.out.println("Winter Wonderland Ticket Costs");
System.out.println("1=Child (4-17 years)");
System.out.println("2=Adult (18-59 years)");
System.out.println("3=Senior (60+ years)");
System.out.println("Children 3 and under are free and don't need a ticket ");
}}