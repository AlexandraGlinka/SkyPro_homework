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
    // из-за того, что не разобралась, как сделать возвращаемое значение в п.2, не получается посчитать среднее
//    public void printAvgSalaryForMonth() {
//        int avgSalary;
//        avgSalary =
//    }

    // 6. Получить Ф. И. О. всех сотрудников (вывести в консоль)
    public void printEmployeesFIO() {
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getFirstName() + ' ' + employee.getMiddleName() + ' ' +
                    employee.getLastName());
        }
    }
}
