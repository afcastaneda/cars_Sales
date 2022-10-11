package beans;

public class Cars {
    private int id_car;
    private String name_car;
    private String brand;
    private int model;
    private String type_fuel;
    private String color;
    private int cylinder_capacity;
    private int stock;

    public Cars(int id_car, String name_car, String brand, int model, String type_fuel, String color, int cylinder_capacity, int stock) {
        this.id_car = id_car;
        this.name_car = name_car;
        this.brand = brand;
        this.model = model;
        this.type_fuel = type_fuel;
        this.color = color;
        this.cylinder_capacity = cylinder_capacity;
        this.stock = stock;
    }

    public int getId_car() {
        return id_car;
    }

    public void setId_car(int id_car) {
        this.id_car = id_car;
    }

    public String getName_car() {
        return name_car;
    }

    public void setName_car(String name_car) {
        this.name_car = name_car;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getType_fuel() {
        return type_fuel;
    }

    public void setType_fuel(String type_fuel) {
        this.type_fuel = type_fuel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCylinder_capacity() {
        return cylinder_capacity;
    }

    public void setCylinder_capacity(int cylinder_capacity) {
        this.cylinder_capacity = cylinder_capacity;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Cars{" + "id_car=" + id_car + ", name_car=" + name_car + ", brand=" + brand + ", model=" + model + ", type_fuel=" + type_fuel + ", color=" + color + ", cylinder_capacity=" + cylinder_capacity + ", stock=" + stock + '}';
    }
    
    
    
}
