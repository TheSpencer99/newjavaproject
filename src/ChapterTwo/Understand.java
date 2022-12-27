package ChapterTwo;

public class Understand {
    public static void main(String... args) {
        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a " + a + " - b " + b);
        Person gospel = new Person("gospel");
           Person  spencer = new Person("spencer");
        System.out.println(spencer.name + " " + gospel.name);
    }
    static class Person{
        String name;
        Person(String name) {this.name = name;
        }




    }



}
