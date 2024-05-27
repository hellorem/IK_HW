package department;

public class empinfo {
    public static void main(String[] args){
        employee emp1 = new employee();
        employee emp2 = new employee();
        employee emp3 = new employee();

        emp1.name = "Ceren Pilavcı";
        emp1.department = "IT";
        emp1.title = "Business Analyst";
        emp1.manager = "Ayse Fatma";
        emp1.salary = 150;

        emp2.name = "Mete Pilavcı";
        emp2.department = "Mechanics";
        emp2.title = "Specialist";
        emp2.manager = "Metin Usta";
        emp2.salary = 150;

        emp3.name = "Turta Pilavcı";
        emp3.department = "Security";
        emp3.title = "Senior Bodyguard";
        emp3.manager = "Omur Meltem";
        emp3.salary = 250;

        emp1.position();
        emp1.riseSalary(100);
        System.out.println(".......");
        emp2.position();
        emp2.riseSalary(100);
        System.out.println(".......");
        emp3.position();
        emp3.riseSalary(75);


    }
}
