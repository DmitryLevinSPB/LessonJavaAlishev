public class Classes_and_Objects {
public static void main(String[] args) {

    Person per1 = new Person();
    per1.name = "Рома";
    per1.age = 15;
int retirement1 = per1.yearOfRetirement();
    //per1.speak();
    System.out.println();
        Person per2 = new Person();
        per2.name = "Гена";
        per2.age = 25;
      //  per2.sayHello();
        int retirement2 = per2.yearOfRetirement();
    System.out.println("Чуваку 1 до пенсии " + retirement1 + " лет ");
    System.out.println("Чуваку 2 до пенсии " + retirement2 + " лет ");
   }
    class Person {
        String name;
        int age;

        int yearOfRetirement() {
            int year = 65 - age;
            return year;
        }

        void speak (){
            for (int i=0; i<3; i++) {
                System.out.println("Меня зовут " + name + " и мой возраст " + age + " лет");
            }
        }
        void sayHello (){
            System.out.println("Hello");
        }
    }
}


