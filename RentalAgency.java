import java.util.ArrayList;

public class RentalAgency {
    private ArrayList<Car> cars;

    public RentalAgency() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void showAvailableCars() {
        System.out.println("\nAvailable Cars:");
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            if (car.isAvailable()) {
                System.out.println((i + 1) + ". " + car);
            }
        }
    }

    public boolean rentCar(int index) {
        if (index >= 0 && index < cars.size()) {
            Car car = cars.get(index);
            if (car.isAvailable()) {
                car.rentCar();
                return true;
            }
        }
        return false;
    }
}

