
package project;

public class bakeryProduct extends product {
private double weight;

//Default Constructor
public bakeryProduct(){
    super();
    weight=0.0;
}
/*Parameterized Constructor
public bakeryProduct(int i, String n, double p, double weight){
    super(i, n, p);
    this.weight=weight;
}*/
// no value of parent class was setting except weight when I used it in main method , So i used setValue instead //

    //SET AND GET METHOD
    public void setWeight(double weight) {this.weight = weight; }

    public double getWeight() {return weight;}

    public void setValue(int id, String n, double p, double weight){
        setId(id);
        setName(n);
        setPrice(p);
        this.weight=weight;
    }//used in place of parameterized constructor as mentioned above.
//setWeight and getWeight was used before Abstraction was taught;

//use of Abstracction + Polymorphism
@Override
public void setQty(double qty){
    this.weight=qty;
}
@Override
public double getQty(){
    return this.weight;
}



}
