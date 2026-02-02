
public class Car {
    private String model;
    private String licensePlate;
    private boolean isAvailable;

    public Car(String model, String licensePlate) {
        this.model = model;
        this.licensePlate = licensePlate;
        this.isAvailable = true; // all cars start as available
    }

    
    public String getModel() { return model; }
    public String getLicensePlate() { return licensePlate; }
    public boolean isAvailable() { return isAvailable; }
    public void rentCar() {
        isAvailable = false;
    }

    // Return the car
    public void returnCar() {
        isAvailable = true;
    }

    // Show car details
    @Override
    public String toString() {
        return model + " (" + licensePlate + ") - " + (isAvailable ? "Available" : "Rented");
    }
}
