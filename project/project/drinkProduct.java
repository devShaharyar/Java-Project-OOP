package project;

public class drinkProduct extends product {

private double litre;

// Default Constructor
public drinkProduct() {
super(); 
litre = 0.0;
}

//SET AND GET METHOD
public void setLitre(double litre) {this.litre = litre; }

public double getLitre() {return litre;}

public void setValue(int id, String n, double p, double litre){
    setId(id);
    setName(n);
    setPrice(p);
    this.litre=litre;
}//used in place of parameterized constructor as mentioned in bakeryProduct Class.
//setLitre and getLitre was used before Abstraction was taught;

//use of Abstraction + Polymorphism
@Override
public void setQty(double qty){
    this.litre=qty;
}
@Override
public double getQty(){
    return this.litre;
}


    
}
