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

    // constructor
    // Signature: String Integer String -> Person
    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

class PersonAddress {
    //fields
    String city;
    String state;
    Person person;

    // constructor #1
    // String Integer String String String-> PersonAddress
    PersonAddress(String name, int age, String gender, String city, String state) {
        // "this" is the way to call a constructor from a constructor
        this(new Person(name, age, gender), city, state);
    }

    // constructor #2
    // Person String String -> PersonAddress
    PersonAddress(Person person, String city, String state) {
        this.person = person;
        this.state = state;
        this.city = city;
    }
}

class ExamplesPerson {
    public static void main(String args[]) {
        Person John = new Person("John", 27, "male");
        PersonAddress ex1 = new PersonAddress("John", 27, "male", "Boston", "MA");
        PersonAddress ex2 = new PersonAddress(John, "Boston", "MA");
        System.out.println(John.name);
    }
}

