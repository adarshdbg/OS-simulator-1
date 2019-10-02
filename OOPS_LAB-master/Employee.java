public class Employee {
    String name, designation;
    double salary;

    public Employee(String name, String designation ,double salary){
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    public static void main(String[] args){

        Executive exec = new Executive("Karna  ","Asst.Prof  ",20000,"cse  ");
        exec.printString();
    }
}

class Manager extends Employee{

    String department;
    public Manager(String name,String designation,double salary,String department){
        super(name,designation,salary);
        this.department = department;
    }

    void print(){
        System.out.println("Manager Name: "+ super.name+"Department: "+department+"Salary: "+super.salary);
    }
}

class Executive extends Manager{

    public Executive(String name,String designation,double salary,String department){
        super(name,designation,salary,department);
    }
    void printString(){
        System.out.print("Executive  : ");
        super.print();
    }
}

