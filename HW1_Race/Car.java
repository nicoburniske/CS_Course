public class Car {
    String manufacturer;
    String model;
    int topSpeed;
    int mpg;
    int yearMade;

    public Car(String manufacturer, String model, int topSpeed, int mpg, int yearMade) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.topSpeed = topSpeed;
        this.mpg = mpg;
        this.yearMade = yearMade;
    }
    
    public int getAge() {
        return 2019 - this.yearMade;
    }

    public String getFastestCar(Car c) {
        if (this.topSpeed > c.topSpeed) {
            return this.model;
        } else {
            return c.model;
        }
    }
}