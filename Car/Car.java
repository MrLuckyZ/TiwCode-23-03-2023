package Car;

public class Car {
    Engine engine;

    Car(String horsepower, String model) {
        engine = new Engine(horsepower, model);
    }
}
