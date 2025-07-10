public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;
    public static String brand = "Mazda";
    public static String model = "sedan";
    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    void display() {
        System.out.println(name + " " + engine);
    }
}
