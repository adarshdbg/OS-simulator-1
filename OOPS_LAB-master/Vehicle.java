package com.company;

//public class Vehicle {
//
////    protected regNumber, milage,
////
////    regNumber, mileage, color, ownerName and a
////    method showData ( )
//}
import java.util.*;
class Vehicle
{
    protected int regnNumber,speed;
    protected String color,ownerName;
    Vehicle(int r,int s,String c,String o)
    {
        regnNumber=r;
        speed=s;
        color=c;
        ownerName=o;
    }
    void showData()
    {
        System.out.println("This is a Vehicle class");
        System.out.println("Registration number="+regnNumber);
        System.out.println("Maximum Speed="+speed);
        System.out.println("Colour="+color);
        System.out.println("Owner Name="+ownerName);
    }
}
class Bus extends Vehicle
{
    private int routeNumber;
    Bus(int r,int s,String c,String o,int r1)
    {
        super(r,s,c,o);
        routeNumber=r1;
    }
    void showData()
    {
        super.showData();
        System.out.println("Route Number:"+routeNumber);
    }
}
class Car extends Vehicle
{
    private String manufacturerName;
    Car(int r,int s,String c,String o,String m)
    {
        super(r,s,c,o);
        manufacturerName=m;
    }
    void showData()
    {
        super.showData();
        System.out.println("Manufacturer Name:"+manufacturerName);
    }
}
class VehicleMain
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Registration number");
        int a=sc.nextInt();
        System.out.println("Enter the maximum speed");
        int b=sc.nextInt();
        System.out.println("Enter the colour:");
        String c=sc.nextLine();
        c=sc.nextLine();
        System.out.println("Enter the Owner Name:");
        String e=sc.nextLine();
        System.out.println("--------------Super class Vehicle----------");
        Vehicle v=new Vehicle(a,b,c,e);
        v.showData();
        System.out.println("Enter the route Number:");
        int r=sc.nextInt();
        System.out.println("----------------Sub Class Bus---------------");
        Bus b1=new Bus(a,b,c,e,r);
        b1.showData();
        System.out.println("Enter the Manufacturer Name:");
        String m=sc.nextLine();
        m=sc.nextLine();
        System.out.println("------------Sub Class Car--------------");
        Car c1=new Car(a,b,c,e,m);
        c1.showData();
    }
}//end of class
