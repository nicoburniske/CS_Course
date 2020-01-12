/**
 * ;; to represent a person
 * ;; A Person is (make-person String Number String)
 * (define-struct person [name age gender])
 */

//to represent a person
class Person {
    //fields
    String name;
    int age;
    String gender;

    //constructor
    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static void main(String args[]) {
        Person John = new Person("John", 27, "male");
        System.out.println(John.name);
    }
}

class PersonAddress{
    //fields
    String city;
    String state;
    Person person;

    //constructor
    PersonAddress(String name, int age, String gender, String city, String state){
        this.city = city;
        this.state = state;
        this.person = new Person(name, age, gender);
    }

}

