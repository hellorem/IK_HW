package department;

public class employee {
    String name;
    String manager;
    String department;
    String title;
    int salary;

void position(){
    System.out.println( name + " is working for " + manager + " at "+department + " department as " +title + ".");
}
void riseSalary(int RaiseSalary){
    System.out.println( name + "'s salary is "+ salary + ".");
    salary+=RaiseSalary;
    System.out.println("It is going to be " + salary + " after rise." );
}
}
