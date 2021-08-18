/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4.Employees;

public class Test {

//    Manager Test
//    public static void main(String args[]) {
//        Manager mgr = new Manager(151, "Tom", "444-44-4444", 8000, "admin");
//
//        System.out.println("Manager: " + mgr.getDetails());
//        
//        Employee emp1 = new Employee(121, "Ron", "111-11-1111", 5000);
//        System.out.println("Employee 1:  " + emp1.getDetails());
//        
//        Employee emp2 = new Employee(122, "ken", "222-22-2222", 6000);
//        System.out.println("Employee 2:  " + emp2.getDetails());
//    }
//}
//    Good Bonus Test
//    public static void main(String[] args) {
//        Employee e = new Employee(101, "Jim Smith", "011-12-2345", 100_000.00);
//        Engineer eng = new Engineer(111, "Joe Smith", "111-12-2345", 101_000.00, "Software Developer");
//        Manager m = new Manager(102, "Joan Kern", "012-23-4567", 110_450.54, "Marketing");
//        Director d = new Director(103, "Abigail Adams", "112-23-4567",
//                112_450.54, "Marketing", "Government Marketing");
//        GoodBonus bonus = new GoodBonus();
//
//        System.out.println(e.getDetails());
//        System.out.println("Bonus: " + bonus.calcBonus(e));
//        System.out.println(eng.getDetails());
//        System.out.println("Bonus: " + bonus.calcBonus(eng));
//        System.out.println(m.getDetails());
//        System.out.println("Bonus: " + bonus.calcBonus(m));
//        System.out.println(d.getDetails());
//        System.out.println("Bonus: " + bonus.calcBonus(d));
//
//    }
//    Cast Test 1
    public static void main(String[] args) {
        Employee e = new Managers(102, "Joan Kern",
                "012-23-4567", 110_450.54, "Marketing");

        if (e instanceof Managers) {
//      Manager m = (Manager) e;
            Managers m = new Managers(102, "Joan Kern", "012-23-4567", 110_450.54, "Marketing");
            m.setDeptName("HR");
            System.out.println(m.getDetails());
            System.out.println(e.getDetails());

            System.out.println("E object hascode: " + e.hashCode());
            System.out.println("M object hascode: " + m.hashCode());
        }
    }
}
