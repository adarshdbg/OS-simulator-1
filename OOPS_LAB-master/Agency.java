//Agency
import java.util.Scanner;

public class Agency {
    String name, place, dos, dor;
    public void print(){
        System.out.println("Name :"+name  +"Place Visited :"+place  +"Start Date :"+dos  +"Return Date :"+dor);
    }
}

class Age extends Agency {
    int age;
    public Age(String name, String place, String dos, String dor, int age) {
        super.name = name;
        super.place = place;
        super.dos = dos;
        super.dor = dor;
        this.age = age;
    }
}

class testclass {
    public static void  main(String [] args) {
        Age[] ages = new Age[4];
        String name, place, dos, dor;
        int age;
        Scanner in = new Scanner(System.in);
        for(int i=0; i<2; i++) {
            System.out.println("Enter the name , place visited, start date, return date, age");
            name = in.next();
            place = in.next();
            dos = in.next();
            dor = in.next();
            age = in.nextInt();
            ages[i] = new Age(name, place, dos, dor, age);
        }
        for(int i=0;i<2;i++){
            if(ages[i].age <= 12){
                ages[i].print();
            }
        }
    }
}
