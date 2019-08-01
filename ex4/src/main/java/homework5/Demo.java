package homework5;

public class Demo {

    private static final int masiv = 10;
    private static final double extraHours = 2;

    public static void main(String[] args) {
        Person[] people = new Person[masiv];


// Създаване на Обектите
        Person gencho = new Person("Генчо", 64, true);
        Person ganka = new Person("Ганка", 58, false);
        Student simo = new Student("Симеон", 25, true, 5);
        Student ekaterina = new Student("Екатерина", 24, false, 4);
        Employee kiko = new Employee("Кристиян", 28, true, 780);
        Employee zuzi = new Employee("Златина", 26, false, 940);

// Поставяне на обектите в масива
        people[0] = gencho;
        people[1] = ganka;
        people[2] = simo;
        people[3] = ekaterina;
        people[4] = kiko;
        people[5] = zuzi;

// Обхождане на масива
        for(int i=0; i < people.length; i++){
        Person per = people[i];
            if(per != null) {
                System.out.println(" ");
                if (per instanceof Student) {
                    ((Student) per).showStudentInfo();
                    continue;
                }
                if (per instanceof Employee) {
                    ((Employee) per).showEmployeeInfo();
                    continue;
                }
                if (per instanceof Person) {
                    per.showPersonInfo();
                }
            }
        }

        System.out.println("----------------------------------");

        for(Person p : people) {
            if(p != null && p instanceof Employee) {
                double overtime = ((Employee) p).calculateOvertime(extraHours);
                System.out.println("На " + p.getName() + " допълнителните часове работа са " + overtime + "\n");
            }
        }


    }

}
