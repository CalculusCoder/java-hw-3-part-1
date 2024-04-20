
public class Main {
    public static void main(String[] args) {



        Engine engine1 = new Engine("I6", 600, Engine.FuelType.Gasoline);
        Engine engine2 = new Engine("V8", 400, Engine.FuelType.Diesel);
        Engine engine3 = new Engine("I6", 600, Engine.FuelType.Gasoline);




        Car car1 = new Car("Nissan", "GTR", 2019, engine1);
        Car car2 = new Car("Nissan", "GTR", 2019, engine2);

        System.out.println(car1.equals(car2));
    }
}