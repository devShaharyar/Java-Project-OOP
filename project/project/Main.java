package project;
import java.util.*;
import java.io.*;

public class Main {


public static void main(String[] args) { 

System.out.println();
Scanner cin = new Scanner(System.in);

//See the reason to put these menu outside on Line 50 & 93:
//Bakery Items Menu:
int b_items = 4;
bakeryProduct[] B = new bakeryProduct[100];
for (int i = 0; i < B.length; i++) { B[i]=new bakeryProduct(); }
//Items in bakery items menu;
B[0].setValue(1, "Shwarma", 150, 0.3);
B[1].setValue(2, "Pizza", 250, 0.4);
B[2].setValue(3, "Cake", 1200, 1.2);
B[3].setValue(4, "Borgir", 120, 0.2);
//Drink Items Menu:
int d_items = 4;
drinkProduct[] D = new drinkProduct[100];
for (int i = 0; i < D.length; i++) { D[i]=new drinkProduct(); }
//Items in drink items menu;
D[0].setValue(1, "Coffee", 150, 0.3);
D[1].setValue(2, "Limcaa", 170, 0.5);
D[2].setValue(3, "Margeritta", 130, 0.6);
D[3].setValue(4, "Juice", 180, 1.2);

//START READING FROM HERE
int choice;
System.out.println("-------------------------------------------------------------------------");
System.out.println("\t\t\t\t\t\t Members :\n \t\t\t\t\t\t Amna 1129\n\t\tGroup Code Donutz ===>> \t Ayesha Shoaib 1108\n \t\t\t\t\t\t Khaleeq-ur-Rehman 1089\n \t\t\t\t\t\t Shaharyar Naveed 1121");
System.out.println("-------------------------------------------------------------------------");
System.out.println("|\t\t\t    WELCOME TO CODE DONUTZ    \t\t\t|");
System.out.println("-------------------------------------------------------------------------");
System.out.println(" ->   Press 1 for order menu : ");
System.out.println(" ->   Press 2 for adding new product : ");
System.out.println(" ->   Press 3 for deleting an existing product : ");
System.out.println(" ->   Press 4 to save Data in file //Serialization : ");
System.out.println(" ->   Press 0 to Exit : ");
choice = cin.nextInt();

do{
switch (choice) {
    case 1:
        {
        //for displaying menu:
        System.out.println(" Press 1 to get Bakery items menu : ");
        System.out.println(" Press 2 to get Drink items menu : ");
        int choice1 = cin.nextInt();
        switch (choice1) {
            case 1:
                {   //created menu outside so that I can acces in it Add item's case on Line 150
                    //display menu
                    System.out.println("ID"+"   "+"NAME"+"\t"+"PRICE"+"\t\t"+"WEIGHT");
                    for (int i = 0; i < b_items; i++) {
                        System.out.println(B[i].getId()+"   "+B[i].getName()+"\t"+"Rs."+B[i].getPrice()+"\t"+B[i].getWeight()+" kg(s)");
                        }
                    //ORDER + BILL NOW
                    //getting order
                    double bill = 0;
                    int bill_id;
                    System.out.println("How many Product do You Want to order ?");
                    double[] price = new double[cin.nextInt()]; //store all prices of ordered products
                    String[] name = new String[price.length]; //store all names of ordered products.
                    int loop_i = 0;
                    do {
                    System.out.println("Enter the ID of the Product you want to order");
                    bill_id= cin.nextInt();
                    boolean check = false;
                    for (int i = 0; i < B.length; i++) {
                        if (bill_id == B[i].getId()) {
                            price[loop_i] = B[i].getPrice();
                            name[loop_i] = B[i].getName();
                            check = true;}
                    }
                    if (check==false) {
                    System.out.println("Invalid Product id ");}
                    ++loop_i;
                    }
                    while(loop_i<price.length); 
                    //Printing + Calculating Bill
                    System.out.println("You ordered : ");
                    for (int i = 0; i < price.length; i++) {
                        System.out.println(name[i]+"\t"+"Rs. "+price[i]);
                        bill+=price[i];
                        }
                    System.out.println("\n\n\t\tYOUR TOTAL BILL IS "+bill+" RUPEES.\n");
                    System.out.println("\t\tTHANK YOU FOR SHOPPING ! \n\n");

                break;
                }
            case 2:
                {   //created menu outside so that I can acces in it Add item's case on Line 150
                    
                    
                    //display
                    System.out.println("ID"+"   "+"NAME"+"\t"+"PRICE"+"\t\t"+"LITRES");
                    for (int i = 0; i < d_items; i++) {
                        System.out.println(D[i].getId()+"   "+D[i].getName()+"\t"+"Rs."+D[i].getPrice()+"\t"+D[i].getLitre()+" litre(s)");
                        }
                    //ORDER + BILL NOW
                    //getting order
                    double bill = 0;
                    int bill_id;
                    System.out.println("How many Product do You Want to order ?");
                    double[] price = new double[cin.nextInt()]; //store all prices of ordered products
                    String[] name = new String[price.length]; //store all names of ordered products.
                    int loop_i = 0;
                    do {
                    System.out.println("Enter the ID of the Product you want to order");
                    bill_id= cin.nextInt();
                    boolean check = false;
                    for (int i = 0; i < D.length; i++) {
                        if (bill_id == D[i].getId()) {
                            price[loop_i] = D[i].getPrice();
                            name[loop_i] = D[i].getName();
                            check = true;}
                    }
                    if (check==false) {
                    System.out.println("Invalid Product id ");}
                    ++loop_i;
                    }
                    while(loop_i<price.length); 
                    //Printing + Calculating Bill
                    System.out.println("You ordered : ");
                    for (int i = 0; i < price.length; i++) {
                        System.out.println(name[i]+"\t"+"Rs. "+price[i]);
                        bill+=price[i];
                        }
                    System.out.println("\n\n\t\tYOUR TOTAL BILL IS "+bill+" RUPEES.\n");
                    System.out.println("\t\tTHANK YOU FOR SHOPPING ! \n\n");
                break; 
                }
            default:
            System.out.println("Invalid Input for Items Menu");
            break;
            }
        break;
        }
    case 2:
        {
        // for adding a new product; 
        System.out.println(" Press 1 to Add in Bakery items menu : ");
        System.out.println(" Press 2 to Add in Drink items menu : ");
        int choice2 = cin.nextInt();
        switch (choice2) {
            case 1:
                {
                    //Adding item in Bakery Menu
                    
                    char addMore ;
                    do{
                    ++b_items; //so that another elements get created in array.
                    
                    System.out.println("Enter Product's ID:");
                    int b_id = cin.nextInt();
                        for(int i = 0; i < B.length; i++) {
                            if(b_id==B[i].getId())
                            {   System.out.println("ID already exists , Enter another ID.");
                                b_id=cin.nextInt();
                                i=0; //so that the loop runs again.
                            }   }
                    B[b_items-1].setId(b_id);        
                    System.out.println("Enter Product's Name:");
                    B[b_items-1].setName(cin.next());    
                    System.out.println("Enter Product's Price:");    
                    B[b_items-1].setPrice(cin.nextDouble());
                    System.out.println("Enter Product's Weight:");    
                    B[b_items-1].setQty(cin.nextDouble()); 
                    
                    //Displaying updated menu
                    System.out.println("ID"+"   "+"NAME"+"\t"+"PRICE"+"\t\t"+"WEIGHT");
                    for (int i = 0; i < b_items; i++) {
                        System.out.println(B[i].getId()+"   "+B[i].getName()+"\t"+"Rs."+B[i].getPrice()+"\t"+B[i].getQty()+" kg(s)");
                        }
                    //Asking to add more products
                    System.out.println("Type Y to add more products or press any other key to exit");
                    
                    addMore = cin.next().charAt(0); //besause there is no nextChar() in Java
                    }
                    while(addMore == 'Y' || addMore == 'y'); 
                    
                        
                    
                }
                break;
            case 2:
                {
                    //Adding items in Drink Menu
                    char addMore ;
                    do{
                    ++d_items; //so that another elements get created in array.
                    
                    System.out.println("Enter Product's ID:");
                    int d_id = cin.nextInt();
                        for(int i = 0; i < D.length; i++) {
                            if(d_id==D[i].getId())
                            {   System.out.println("ID already exists , Enter another ID.");
                                d_id=cin.nextInt();
                                i=0; //so that the loop runs again.
                            }   }
                    D[d_items-1].setId(d_id);        
                    System.out.println("Enter Product's Name:");
                    D[d_items-1].setName(cin.next());    
                    System.out.println("Enter Product's Price:");    
                    D[d_items-1].setPrice(cin.nextDouble());
                    System.out.println("Enter Product's Litre(s):");    
                    D[d_items-1].setQty(cin.nextDouble()); 
                    
                    //Displaying updated menu
                    System.out.println("ID"+"   "+"NAME"+"\t"+"PRICE"+"\t\t"+"LITRES");
                    for (int i = 0; i < d_items; i++) {
                        System.out.println(D[i].getId()+"   "+D[i].getName()+"\t"+"Rs."+D[i].getPrice()+"\t"+D[i].getQty()+" litre(s)");
                        }
                    //Asking to add more products
                    System.out.println("Type Y to add more products or press any other key to exit");
                    
                    addMore = cin.next().charAt(0); //besause there is no nextChar() in Java
                    }
                    while(addMore == 'Y' || addMore == 'y'); 
                }
                break;
            default:
            System.out.println("Invalid Input for Adding Items. ");
            break;}
        break;    
        }

        
    case 3:
        {
        // for deleting an existing product;   
        System.out.println(" Press 1 to Delete in Bakery items menu : ");
        System.out.println(" Press 2 to Delete in Drink items menu : ");
        int choice3 = cin.nextInt();
        switch (choice3) {
            case 1:
                {   //Deleting Items in Bakery Menu
                    //First to display Menu:
                    System.out.println("ID"+"   "+"NAME"+"\t"+"PRICE"+"\t\t"+"WEIGHT");
                    for (int i = 0; i < b_items; i++) {
                        System.out.println(B[i].getId()+"   "+B[i].getName()+"\t"+"Rs."+B[i].getPrice()+"\t"+B[i].getWeight()+" kg(s)");
                        }
                    
                    char addMore ;
                    do{
                    
                    //Now deleting
                    System.out.println("\n Enter the ID of Product You want to be deleted:");
                    int b_id = cin.nextInt();
                        boolean check = false;
                        for(int i = 0; i < B.length; i++) {
                            if(b_id==B[i].getId())
                            {   System.out.println("Product Deleted");
                                B[i]= new bakeryProduct();
                                check = true;
                            }} 
                            if (check==false) {System.out.println("This ID does not exists !! ");}
                        
                            
                    //To display Updated Menu:
                    System.out.println("\n UPDATED MENU \n");
                    System.out.println("ID"+"   "+"NAME"+"\t"+"PRICE"+"\t\t"+"WEIGHT");
                    for (int i = 0; i < b_items; i++) {
                        System.out.println(B[i].getId()+"   "+B[i].getName()+"\t"+"Rs."+B[i].getPrice()+"\t"+B[i].getWeight()+" kg(s)");
                    
                       }
                    //Asking to delete more products
                    System.out.println("Type Y to delete more products or press any other key to exit");
                    
                    addMore = cin.next().charAt(0); //besause there is no nextChar() in Java
                    }
                    while(addMore == 'Y' || addMore == 'y');   

                }
                break;
            case 2:
                {
                    //Deleting Items in Drinks Menu
            
                  
                    //First to display Menu:
                    System.out.println("ID"+"   "+"NAME"+"\t"+"PRICE"+"\t\t"+"LITRES");
                    for (int i = 0; i < d_items; i++) {
                        System.out.println(D[i].getId()+"   "+D[i].getName()+"\t"+"Rs."+D[i].getPrice()+"\t"+D[i].getLitre()+" Litre(s)");
                        }
                    
                    char addMore ;
                    do{
                    
                    //Now deleting
                    System.out.println("\n Enter the ID of Product You want to be deleted:");
                    int d_id = cin.nextInt();
                        boolean check = false;
                        for(int i = 0; i < D.length; i++) {
                            if(d_id==D[i].getId())
                            {   System.out.println("Product Deleted");
                                D[i]= new drinkProduct();
                                check = true;
                            }} 
                            if (check==false) {System.out.println("This ID does not exists !! ");}
                        
                    //To display Updated Menu:
                    System.out.println("\n UPDATED MENU \n");
                    System.out.println("ID"+"   "+"NAME"+"\t"+"PRICE"+"\t\t"+"LITRES");
                    for (int i = 0; i < d_items; i++) {
                        System.out.println(D[i].getId()+"   "+D[i].getName()+"\t"+"Rs."+D[i].getPrice()+"\t"+D[i].getLitre()+" Litre(s)");
                        }
                    //Asking to delete more products
                    System.out.println("Type Y to delete more products or press any other key to exit");
                    
                    addMore = cin.next().charAt(0); //besause there is no nextChar() in Java
                    }
                    while(addMore == 'Y' || addMore == 'y');   
                }
                break;
            
            default:
            {System.out.println("Invalid Input for Deleting Items. ");
            break;}}
        break;
        }    
    case 4: 
        {
            //SERIALIZATION-Writing Objects Into File:
            //Bakery
            try {
                
                FileOutputStream fileOut = new FileOutputStream("bakery.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                for (int i = 0; i < B.length; i++) {
                    out.writeObject(B[i]);
                }
                out.close();
                fileOut.close();    
                System.out.println("ALl Objects Are Serialized");
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            break;
        }

    default:
    System.out.println("Invalid Input for Main Menu. ");
    break;}

    //For repetition :
    System.out.println("-------------------------------------------------------------------------");
    System.out.println("|\t\t\t    WELCOME TO CODE DONUTZ    \t\t\t|");
    System.out.println("-------------------------------------------------------------------------");
    System.out.println(" ->   Press 1 for order menu : ");
    System.out.println(" ->   Press 2 for adding new product : ");
    System.out.println(" ->   Press 3 for deleting an existing product : ");
    System.out.println(" ->   Press 4 to save Data in file //Serialization : ");
    System.out.println(" ->   Press 0 to Exit : ");
    choice = cin.nextInt();


}while(choice!=0);{
    System.out.println("\t\tTHANK YOU FOR SHOPPING ! \n\n");
    System.out.println("\t\tSEE YOU AGAIN :) ");
}
}
}
