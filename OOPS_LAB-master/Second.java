import java.util.*;
class Product{
    private String Itemname;
    private int UnitPrice;
    Product(String Itemname,int UnitPrice)
    {
        this.Itemname=Itemname;
        this.UnitPrice=UnitPrice;
    }
    Product()
    {
        this.Itemname="no product";
        this.UnitPrice=0;
    }
    int getPrice(){
        return UnitPrice;
    }

    public String toString() {
        return (Itemname+" @"+ UnitPrice);
    }
}
class WeightedProduct extends Product{
    private int weight;
    //private String Itemname;
    //private int UnitPrice;
    WeightedProduct(String Itemname,int UnitPrice,int c)
    {
        super(Itemname,UnitPrice);
        this.weight=c;
    }

    @Override
    int getPrice() {
        return (super.getPrice()*weight);
    }

    @Override
    public String toString() {
        return (super.toString()+" "+weight+"units "+super.getPrice()*weight);
    }
}
class CountedProduct extends Product{
    private int quantity;
    //private String Itemname;
    //private int UnitPrice;
    CountedProduct(String Itemname,int UnitPrice,int c)
    {
        super(Itemname,UnitPrice);
        this.quantity=c;
    }

    @Override
    int getPrice() {
        return (super.getPrice()*quantity);
    }

    @Override
    public String toString() {
        return (super.toString()+" "+quantity+"units "+super.getPrice()*quantity);
    }
}
public class Second {
    public static void main(String args[]) {
        WeightedProduct w1 = new WeightedProduct("pencil", 10, 50);
        System.out.printf("Product=%s\n", w1.toString());
        CountedProduct c1 = new CountedProduct("Rubber", 30, 5);
        System.out.printf("Product=%s\n", c1.toString());
    }
}
