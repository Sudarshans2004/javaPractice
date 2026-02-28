package abstraction;

//✅ Q3. Employee Salary System
//Abstract class Employee:
//fields: name, id
//abstract method calculateSalary()
//concrete method displayDetails()
//Child classes:
//FullTimeEmployee
//PartTimeEmployee

public class Practice2 {
    static abstract class Employee{
        String name;
        int id;
        abstract void calculateSalary();
        void displayDetails(){
            System.out.println("name :"+name +"ID:" + id);
        }
        Employee(int id , String name){
            this.name = name;
            this.id = id;
        }
    }

    static class FullTimeEmployee extends Employee{
        double monthlySalary;
        FullTimeEmployee(int id ,String name ,double monthlySalary){
            super(id,name);
            this.monthlySalary=monthlySalary;
        }
        @Override
        void calculateSalary(){
            System.out.println("Monthly Salary :"+monthlySalary);
        }
    }
    static class PartTimeEmployee extends Employee{
        int hoursWorked;
        double ratePerHour;

        PartTimeEmployee(int id , String name ,double ratePerHour,int hoursWorked ){
            super(id,name);
            this.hoursWorked= hoursWorked;
            this.ratePerHour= ratePerHour;
        }
        @Override
        void calculateSalary(){
            System.out.println("id: " +id +"name: "+ "monthly salary :"+ratePerHour*hoursWorked);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(101, "Rahul", 50000);
        Employee e2 = new PartTimeEmployee(102, "Priya", 5, 500);

        e1.displayDetails();
        e1.calculateSalary();

        System.out.println();

        e2.displayDetails();
        e2.calculateSalary();      }


}
