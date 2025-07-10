public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactive 3");
        Car car2 = new Car("Mazda 6", "Skyactive 6");
        Car car3 = new Car("Mazda 2", "Skyactive 2");

        car1.display();
        car2.display();
        car3.display();

        System.out.println("Tong so xe la: " + Car.numberOfCars);
        System.out.println("Hang xe la: " + Car.brand);
        System.out.println("Hang xe la: " + Car.model);
    }
}
