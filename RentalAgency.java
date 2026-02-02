

import java.util.ArrayList;

public class RentalAgency {
    private ArrayList<Car> cars;

    public RentalAgency() {
        cars = new ArrayList<>();
    }

    // Add a car to the system
    public void addCar(Car car) {
        cars.add(car);
    }

    // Show available cars
    public void showAvailableCars() {
        System.out.println("\nAvailable Cars:");
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            if (car.isAvailable()) {
                System.out.println((i + 1) + ". " + car);
            }
        }
    }

    // Rent a car by index
    public boolean rentCar(int index) {
        if (index >= 0 && index < cars.size()) {
            Car car = cars.get(index);
            if (car.isAvailable()) {
                car.rentCar();
                return true; // rental successful
            }
        }
        return false; // invalid index or already rented
    }
}

