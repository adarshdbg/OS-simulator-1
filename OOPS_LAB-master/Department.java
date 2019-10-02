package com.company;

public interface Department
{
    public void getDetpName();
    public void getDetpHead();
}

class Hostel
{
    protected String hname,hlocation;
    int noofroom;
    void getHostelName()
    {
        System.out.println("Name Of the Hostel : " + hname);
    }
    void getHostelLocation()
    {
        System.out.println("Hostel Location : " + hlocation);
    }
    void getNoOfRoom()
    {
        System.out.println("Total Room : " + noofroom);
    }
}
