//access point for testing
public class Main {
    public static void main(String args[]){
        Car c1 = new Car("tractorMakers", "tractor9000",2, 4, 1782);
        Car c2 = new Car("yeep", "elyeep",4, 5, 1836);
        Car c3 = new Car("transformer", "bumblebee",9000, 1, 2020);
        Car c4 = new Car("theAliens", "UFO",80, 20, 1999);
        Race r1 = new Race(c1, c2, c3, c4, "miami", "grandMiami");
        System.out.println(r1.getWinner().model);
    }
}