package homework5;

// Създаваме единия ни child клас
public class Student extends Person{

// Дефинираме полето за оценките, не ни трябва друго, другите ги унаследява от parent-a
    private double score;

// Ето го и конструкторчето унслаедено от parent-a, само че е с допълнителният аргумент за оценката.
    public Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        this.score = score;


    }
// Тук си създаме метод и после вътре в него ще извикаме метода на нашия суперклас в него.
// Също и ще принтираме оценката
    public void showStudentInfo(){
        showPersonInfo();
        System.out.println("Оценката на студента е: " + score);
    }
}
