public class Engine {

    public enum FuelType { //Enum with 3 fields, can be used as a "type"
        Gasoline, Diesel, Electric
    }
    private String EngineType;
    private int HorsePower;
    private FuelType fuelType;

    //Constructor
    public Engine (String et, int hp, FuelType ft) {
        this.EngineType = et;
        this.HorsePower = hp;
        this.fuelType = ft;
    }

    //Constructor Copy. initializes new object from existing engine object
    public Engine(Engine engine2) {
        this.EngineType = engine2.EngineType;
        this.HorsePower = engine2.HorsePower;
        this.fuelType = engine2.fuelType;
    }

    //Setters
    public void setEngineType(String et) {
        this.EngineType = et;
    }

    public void setHorsePower(int hp) {
        this.HorsePower = hp;
    }

    public void setFuelType(FuelType ft) {
        this.fuelType = ft;
    }

    //Getters

    public String getEngineType() {
        return this.EngineType;
    }

    public int getHorsePower() {
        return this.HorsePower;
    }

    public FuelType getFuelType() {
        return this.fuelType;
    }

    @Override //overriding toString method to use our custom one
    public String toString() { //returning objects fields in string form
        return
                "Engine Type = " + EngineType + ", Horse Power = " + HorsePower + ", Fuel Type = " + fuelType;
    }


    public boolean equals(Engine eng2) { //takes an Object as an argument

        //Comparing the current objects fields with the given object fields
        if (HorsePower != eng2.HorsePower) return false;
        if (!EngineType.equals(eng2.EngineType)) return false;
        if (fuelType != eng2.fuelType) return false;

        return true;
    }

}
