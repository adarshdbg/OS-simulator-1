package com.company;

import java.util.*;
class Student extends Hostel implements Department
{
    String sname,regno,elesub;
    String deptName,deptHead;
    int avgMarks;
    void getStudentName()
    {
        System.out.println("Student : " + sname);
    }
    String getStudentRegNo()
    {
        return regno;
    }
    void getElectiveSubject()
    {
        System.out.println("Elective Subject : " + elesub);
    }
    void getAvgMarks()
    {
        System.out.println("Average Marks : " + avgMarks);
    }
    public void getDetpName()
    {
        System.out.println("Department Name : " + deptName);
    }
    public void getDetpHead()
    {
        System.out.println("Department Head : " + deptHead);
    }
    void addStudent()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student name : ");
        sname=sc.nextLine();
        System.out.print("Enter Registration Number : ");
        regno=sc.nextLine();
        System.out.print("Enter Elective Subject : ");
        elesub=sc.nextLine();
        System.out.print("Enter Hostel Name : ");
        hname=sc.nextLine();
        System.out.print("Enter Hostel Location : ");
        hlocation=sc.nextLine();
        System.out.print("Enter Department Name : ");
        deptName=sc.nextLine();
        System.out.print("Enter Department Head : ");
        deptHead=sc.nextLine();
        System.out.print("Enter No of room : ");
        noofroom=sc.nextInt();
        System.out.print("Enter Avg Marks : ");
        avgMarks=sc.nextInt();
    }
    void migrate()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter new Department Name : ");
        deptName=sc.nextLine();
        System.out.print("Enter new Department Head : ");
        deptHead=sc.nextLine();
    }
    void display()
    {
        getStudentName();
        System.out.println(" Student Registration No is : " + getStudentRegNo());
        getElectiveSubject();
        getAvgMarks();
        getDetpName();
        getDetpHead();
    }
}