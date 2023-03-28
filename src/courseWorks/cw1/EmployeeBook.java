package courseWorks.cw1;

public class EmployeeBook {
    private final Employee[] employees;
    public int counter;

    public EmployeeBook() {
        this.employees = new Employee[10]; // создали массив с 10 ячейками памяти
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

    //2. Посчитать сумму затрат на зарплаты в месяц. printSalaryForMonth
    // ХОТЕЛА ВОЗВРАТИТЬ ЗНАЧЕНИЕ, А НЕ ПЕЧАТАТЬ
    // НЕ ПОНИМАЮ, ЧТО НАДО ПЕРЕДАТЬ В ПАРАМЕТР, ЧТОБЫ ВСЕ СЧИТАЛОСЬ КОРРЕКТНО????
    // значение salary находится в массиве класса Employee
    public void printSalaryForMonth() {
        int totalSalary = 0;
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            totalSalary += employee.getSalary();
        }
        System.out.println(totalSalary);
    }

    //3. Найти сотрудника с минимальной зарплатой. checkSalary
    public void printMinSalaryEmployee() {
        int minSalary = employees[0].getSalary();
        int ind = 0;
        for (int i = 1; i < counter; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                ind = i;
            }
        }
        System.out.println(employees[ind]);
    }

    //4. Найти сотрудника с максимальной зарплатой
    public void printMaxSalaryEmployee() {
        int maxSalary = employees[0].getSalary();
        int ind = 0;
        for (int i = 1; i < counter; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                ind = i;
            }
        }
        System.out.println(employees[ind]);
    }



//4. Найти сотрудника с максимальной зарплатой.
//5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
//6. Получить Ф. И. О. всех сотрудников (вывести в консоль)
}

//2. Посчитать сумму затрат на зарплаты.        checkSalary
//3. Найти сотрудника с минимальной заплатой.   findMinSalaryOfEmployee
//4. Найти сотрудника с максимальной зарплатой. findMaxSalaryOfEmployee
//5. Подсчитать среднее значение зарплат.       countAvgSalary