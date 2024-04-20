public class Car {
    private String make;
    private String model;
    private int year;
    private Engine engine;

    //Constructor
    public Car(String ma, String mo, int y, Engine eng) {
        this.make = ma;
        this.model = mo;
        this.year = y;
        this.engine = new Engine(eng);
    }

    //Setters

    public void setMake(String ma) {
        this.make = ma;
    }

    public void setModel(String mo) {
        this.model = mo;
    }
    public void setYear(int y) {
        this.year = y;
    }

    public void setEngine(Engine eng) {
        this.engine = new Engine(eng);
    }

    //Getters

    public String getMake() {
        return this.make;
    }
    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year;
    }
    public Engine getEngine() {
        return this.engine;
    }



    @Override //overriding toString method to create our custom one
    public String toString() { //method to return string with our objects fields info
        return
                "Make = " + make + ", Model = " + model + ", Year = " + year + ", " + engine;
    }



    public boolean equals(Car car2) {

        //Comparing the current objects fields with the given object fields
        if (!make.equals(car2.make)) return false;
        if (!model.equals(car2.model)) return false;
        if (year != car2.year) return false;
        if (!engine.equals(car2.engine)) return false;


        return true;
    }


}
