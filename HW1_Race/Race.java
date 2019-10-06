/**
 * This object represents a race event between multiple cars
 * Requirements:
 * - Look and understand the fields included in the class below.
 * - Create a constructor
 * - Create a method getWinner that will return the winning car (the fastest car will win the race)
 * - Create a method getPodium that returns the top three cars in the race (1st, 2nd, 3rd)
 * - Create a method addCar that will add a car to the race.
 */
public class Race {
    //a list of all the cars participating in the race
    Car[] cars;
    //a name of the stadium or city where the race is being held
    String location;
    //name of the event.
    String name;

    //constructor
    //signature: Car Car Car Car String String -> Race
    public Race(Car c1, Car c2, Car c3, Car c4, String location, String name) {
        this.cars = new Car[4];
        cars[0] = c1;
        cars[1] = c2;
        cars[2] = c3;
        cars[3] = c4;
        this.location = location;
        this.name = name;
        System.out.println(cars[0].model);
    }

    //getWinner
    //Purpose statement: says which car won -- person who finished first
    //Signature: () -> Car
    public Car getWinner() {
        Car fastestSoFar = this.cars[0];
        for (int i = 1; i < cars.length; i++) {
            if (this.cars[i].topSpeed > fastestSoFar.topSpeed) {
                fastestSoFar = this.cars[i];
            }
        }
        return fastestSoFar;
    }


    //getPodium 
    //Purpose statement:
    //Signature:

    //addCar
    //Purpose statement:
    //Signature:   

}