import java.util.ArrayList;
import java.util.List;

public class CarPark {
    private List<Car> cars;

    public CarPark() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void displayAvailableCars() {
        System.out.println("Доступные автомобили:");
        for (Car car : cars) {
            if (!car.isRented()) {
                car.displayInfo();
            }
        }
    }
}