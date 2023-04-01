package courseWorks.cw1;

import java.util.Scanner;

public class Main {
        public static void printSeparator() {
            System.out.println("=======================================");
        }
        public static void main(String[] args) {
        //Employee[] employee = new Employee[10]; // создали объект для хранения всех сотрудников
                EmployeeBook employeeBook = new EmployeeBook(10);

                employeeBook.addEmployee("Иван", "Ивановач", "Иванов", 1, 83_000);
                employeeBook.addEmployee("Александр", "Васильевич", "Гудов", 2, 70_000);
                employeeBook.addEmployee("Григорий", "Николаевич", "Петров", 1, 90_000);
                employeeBook.addEmployee("Анна", "Сергеевна", "Волкова", 4, 65_000);
                employeeBook.addEmployee("Екатерина", "Андреевна", "Сазонова", 3, 200_000);
                employeeBook.addEmployee("Сергей", "Витальевич", "Буров", 5, 114_000);

                printSeparator();
                System.out.println("Список всех сотрудников со всеми имеющимися по ним данными:");
                employeeBook.printEmployeeList();
                printSeparator();

                System.out.println("Посчитать сумму затрат на зарплаты в месяц:");
                int totalSalary = employeeBook.getSalaryForMonth();
                System.out.println(totalSalary + " руб.");
                printSeparator();

                System.out.println("Сотрудник с минимальной зарплатой:");
                Employee minSalaryEmployee = employeeBook.getMinSalaryEmployee();
                System.out.println(minSalaryEmployee);
                printSeparator();

                System.out.println("Сотрудник с максимальной зарплатой:");
                Employee maxSalaryEmployee = employeeBook.getMaxSalaryEmployee();
                System.out.println(maxSalaryEmployee);
                printSeparator();

                System.out.println("Сотрудник с максимальной зарплатой:");
                int avgSalary = employeeBook.getAvgSalaryForMonth();
                System.out.println(avgSalary + " руб.");
                printSeparator();

                System.out.println("Список ФИО всех сотрудников:");
                employeeBook.printEmployeesFIO();

                printSeparator();
                System.out.print("Введите уровень индексации (%): ");
                Scanner sc = new Scanner(System.in);
                int index = sc.nextInt();
                employeeBook.getIndexSalary(index);

                printSeparator();
                System.out.print("Введите номер отдела (от 1 до 5): ");
                int department = sc.nextInt();
                System.out.println("Сотрудники с наименьшей з/п в отделе " + department + ":");
                employeeBook.getMinSalaryEmployeeInDepartment(department);

                printSeparator();
                System.out.print("Введине зарплату: ");
                int lessThanSalary = sc.nextInt();
                System.out.println("Сотрудники с зарплатой меньше " + lessThanSalary + " руб.:");
                employeeBook.getEmployeesSalaryLessThan(lessThanSalary);

                printSeparator();
                System.out.print("Введине зарплату: ");
                int moreThanSalary = sc.nextInt();
                System.out.println("Сотрудники с зарплатой больше (или равно) " + moreThanSalary + " руб.:");
                employeeBook.getEmployeesSalaryMoreThan(moreThanSalary);
        }






        // for (int i = 0; i < employee.length; i++) {
//            System.out.println(employee[i]);
//            printEmployeeList(employee[i]);
//        }
//
//        System.out.println(ivanovII);
//        System.out.println(employee[0]);
    //1. Получить список всех сотрудников со всеми имеющимися по ним данными printEmployeeList
//    public static void printEmployeeList(Employee emp) {
//        System.out.println(emp);
//    }


}
