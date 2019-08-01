package homework5;


// Това е първия клас, който си създавам и той ще е father на другите два: Student и Employee.
// Задавам и полетата на класа
public class Person {
    public String name;
    public int age;
    public boolean isMan;

//Тук е дефиниран конструктора с аргументите от полетата по-горе.
    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isMan() {
        return isMan;
    }
    public void setMan(boolean isMan) {
        this.isMan = isMan;
    }

    public void showPersonInfo() {
        System.out.println("Име: " + name);
        System.out.println("Години: " + age);
        if(isMan) {
            System.out.println("Опаааа мъжко е :)");
        } else {
            System.out.println("Един брой женско ;)");
        }
    }

}
