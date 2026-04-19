package collection.comparableandcomparator;

import java.util.Comparator;
import java.util.TreeSet;

class Employee
{
    String name;
    int eid;
    Employee(String name, int eid){
        this.name=name;
        this.eid = eid;
    }

    @Override
    public String toString() {
        return name+"--" + eid;
    }
}
class Comparaator implements Comparator <Employee>{

    public int compare(Employee e1,Employee e2 ) {

        return e1.name.compareTo(e2.name);
    }

}
public class ComparatorEmployeeDemo {

    public static void main(String[] args) {
        Employee e1 = new Employee("Nag", 100);
        Employee e2 = new Employee("Bala", 200);
        Employee e3 = new Employee("Chiru", 50);
        Employee e4 = new Employee("Venki", 150);
        Employee e5 = new Employee("Nag", 100);

        TreeSet <Employee> t1 = new TreeSet <>(new Comparaator());
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        System.out.println(t1);
    }
}
