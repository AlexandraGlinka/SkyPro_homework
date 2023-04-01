package courseWorks.cw1;

import java.util.Scanner;

public class EmployeeBook {
    private final Employee[] employees;
    public int counter;

    public EmployeeBook(int size) {
        this.employees = new Employee[size]; // создали массив с 10 ячейками памяти
    }

    public void addEmployee(String firstName, String middleName, String lastName, int department, int salary) {
        if (counter >= employees.length) {
            System.out.println("Книга сотрудников заполнена");
        } else {
            Employee newEmployee = new Employee(firstName, middleName, lastName, department, salary);
            //counter++;
            employees[counter++] = newEmployee;
        }
    }

    //1. Получить список всех сотрудников со всеми имеющимися по ним данными printEmployeeList
    public void printEmployeeList() {
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }

    //2. Посчитать сумму затрат на зарплаты в месяц. getSalaryForMonth
    public int getSalaryForMonth() {
        int totalSalary = 0;
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            totalSalary += employee.getSalary();
        }
        //System.out.println(totalSalary);
        return totalSalary;
    }

    //3. Найти сотрудника с минимальной зарплатой. checkSalary
    public Employee getMinSalaryEmployee() {
        int minSalary = employees[0].getSalary();
        int ind = 0;
        for (int i = 1; i < counter; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                ind = i;
            }
        }
        return employees[ind];
    }

    //4. Найти сотрудника с максимальной зарплатой
    public Employee getMaxSalaryEmployee() {
        int maxSalary = employees[0].getSalary();
        int ind = 0;
        for (int i = 1; i < counter; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                ind = i;
            }
        }
        return employees[ind];
    }

    //5. Подсчитать среднее значение зарплат
    public int getAvgSalaryForMonth() {
        int avgSalary;
        avgSalary = getSalaryForMonth() / counter;
        return avgSalary;
    }

    // 6. Получить Ф. И. О. всех сотрудников (вывести в консоль)
    public void printEmployeesFIO() {
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getFirstName() + ' ' + employee.getMiddleName() + ' ' +
                    employee.getLastName());
        }
    }

//    Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
    public void getIndexSalary(int index) {
        int newSalary;
        float ind = 1 + index / 100f;
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            newSalary = (int) (employee.getSalary() * ind);
            employee.setSalary(newSalary);
            System.out.println(employee);
        }
    }

    //    2. Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
//            1. Сотрудника с минимальной зарплатой.
    public Employee getMinSalaryEmployeeInDepart(int department) {
        int dep = department;
        Employee[] employeesFromDepartment = new Employee[counter];
        int index = 0;
        if (dep > 5 || dep < 0) {
            throw new RuntimeException("Такого отдела в компании не существует");
        }
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            boolean trueDepartment = employee.getDepartment() == dep;
            if (true) {
                employeesFromDepartment[index] = employees[i]; // если нужный отдел, то добавляем значение в новый массив
            } else {
                employeesFromDepartment[index] = null; // иначе добавляем null в массив
            }
            index++;
        }
        int minSalaryEmployeeFromDepartment = getMaxSalaryEmployee().getSalary(); // в минимальную зп кладем самую большую зп
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            if (employeesFromDepartment[i].equals(employees[i])) { // если ячейки совпадают (а это должны быть все, где не null
                if (employee.getSalary() < minSalaryEmployeeFromDepartment) { // то сравниваем текущий минимум с новой зп
                    minSalaryEmployeeFromDepartment = employee.getSalary(); // кладем сюда новую зп
                    index = i;
                }
            }
        }
        return employees[index];
    }

//        index = neededIndexes[0];
//        int minSalary = employees[index].getSalary();
//        for (int i = 0; i < neededIndexes.length; i++) {
//            Employee employee = employees[i];
//            if (employees[i].getSalary() < minSalary) {
//                minSalary = employee.getSalary();
//                index = i;
//            }
//        }
//        return employees[index];
//    }

//            2. Сотрудника с максимальной зарплатой.
//            3. Сумму затрат на зарплату по отделу.
//            4. Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
//            5. Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
//    6. Напечатать всех сотрудников отдела (все данные, кроме отдела).

    //    3. Получить в качестве параметра число и найти:
//            1. Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой вконсоль).
    public void getEmployeesSalaryLessThan(int lessThanSalary) {
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() < lessThanSalary) {
                System.out.println(employee.id + ": " + employee.getFirstName() + ' ' + employee.getMiddleName() + ' ' +
                        employee.getLastName() + " - " + employee.getSalary());
            }
        }
    }
//            2. Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. изарплатой в консоль).

    public void getEmployeesSalaryMoreThan(int moreThanSalary) {
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() >= moreThanSalary) {
                System.out.println(employee.id + ": " + employee.getFirstName() + ' ' + employee.getMiddleName() + ' ' +
                        employee.getLastName() + " - " + employee.getSalary());
            }
        }
    }

}
