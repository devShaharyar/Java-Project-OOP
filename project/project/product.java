package project;
import java.io.*;

public abstract class product implements Serializable {
private int id;
private String name;
private double price;

//Default Constructor
public product() {id=0; name=""; price=0.00; }

//Parameterized Constructor
public product(int id, String name, double price)  
{this.id=id; this.name=name; this.price=price;}


//SET AND GET METHODS
public int getId(){ return id;}
public String getName(){ return name;}
public double getPrice(){ return price;}

public void setId(int id){ this.id=id;}
public void setName(String name ){ this.name=name;}
public void setPrice(double price){ this.price=price;}

//Abstraction:
public abstract void setQty(double qty);
public abstract double getQty();




}
