package courseWorks.cw1;

public class Main {

    //1. Получить список всех сотрудников со всеми имеющимися по ним данными printEmployeeList
    public static void printEmployeeList(Employee emp) {
        System.out.println(emp);
    }
        public static void main(String[] args) {
        Employee employee[] = new Employee[10]; // создали объект для хранения всех сотрудников

        Employee ivanovII = new Employee("Иван", "Ивановач", "Иванов", 1, 83_000);
        Employee gudovAV = new Employee("Александр", "Васильевич", "Гудов", 2, 70_000);
        Employee petrovGN = new Employee("Григорий", "Николаевич", "Петров", 1, 90_000);
        Employee volkovaAS = new Employee("Анна", "Сергеевна", "Волкова", 4, 65_000);
        Employee sazonovaEA = new Employee("Екатерина", "Андреевна", "Сазонова", 3, 58_000);
        Employee burovSV = new Employee("Сергей", "Витальевич", "Буров", 5, 114_000);


        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
            printEmployeeList(employee[i]);
        }

        System.out.println(ivanovII);
        System.out.println(employee[0]);
    }







// (вывести в консоль значения всех полей (toString)).
//2. Посчитать сумму затрат на зарплаты в месяц.
//3. Найти сотрудника с минимальной зарплатой.
//4. Найти сотрудника с максимальной зарплатой.
//5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
//6. Получить Ф. И. О. всех сотрудников (вывести в консоль)


    //2. Посчитать сумму затрат на зарплаты.        checkSalary
    //3. Найти сотрудника с минимальной заплатой.   findMinSalaryOfEmployee
    //4. Найти сотрудника с максимальной зарплатой. findMaxSalaryOfEmployee
    //5. Подсчитать среднее значение зарплат.       countAvgSalary
}
