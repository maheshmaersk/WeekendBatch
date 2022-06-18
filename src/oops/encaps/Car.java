package oops.encaps;

public class Car {

    private int id;
    private String name;
    private String modelName;
    private String manufacturer;

    public Car(int id, String name, String modelName, String manufacturer) {
        this.id = id;
        this.name = name;
        this.modelName = modelName;
        this.manufacturer = manufacturer;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
