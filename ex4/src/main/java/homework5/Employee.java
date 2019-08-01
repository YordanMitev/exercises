package homework5;

// Създаваме втория ни child клас
public class Employee extends Person{

// Дефинираме полетата си
    private static final int restriction = 18;
    private static final double overtime = 1.5;
    private double daySalary;

// Конструктора унаследен от parent-a и допълнителният аргумент daySalary
    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }
// Метод за извънредно положен труд
    public double calculateOvertime(double hours) {
        if(getAge() < restriction) {
            return 0;
        } else {
            return hours * overtime * daySalary/6;
        }
    }
// Метод за показване на дневното заплащане на работника
    public void showEmployeeInfo() {
        showPersonInfo();
        System.out.println("Дневна заплата на работника : " + daySalary);
    }


}
