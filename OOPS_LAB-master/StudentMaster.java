package com.company;

import java.util.*;
class StudentMaster
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        Student []st=new Student[100];
        int sno=0;
        String rno;
        int ch;
        boolean b;
        while(true)
        {
            System.out.println("\n 1. Admit a student");
            System.out.println(" 2. Migrate a student");
            System.out.println(" 3. Display");
            System.out.println(" 4. Exit");
            System.out.println(" 5. Enter Your Choice");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    st[sno]=new Student();
                    st[sno++].addStudent();
                    break;
                case 2:
                    System.out.println("Enter Registration no : ");
                    rno=sc.next();
                    b=false;
                    for(int i=0;i<sno;i++)
                    {
                        if(st[i].getStudentRegNo().equals(rno))
                        {
                            b=true;
                            st[0].migrate();
                            break;
                        }
                    }
                    if(b==false)
                    {
                        System.out.println("Student Not Found");
                    }
                    break;
                case 3:
                    System.out.println("Enter Registration no : ");
                    rno=sc.next();
                    b=false;
                    for(int i=0;i<sno;i++)
                    {
                        if(st[i].getStudentRegNo().equals(rno))
                        {
                            b=true;
                            st[0].display();
                            break;
                        }
                    }
                    if(b==false)
                    {
                        System.out.println("Student Not Found");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("--Invalid Entry--");
            }
        }
    }
}
