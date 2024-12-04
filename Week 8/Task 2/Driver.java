public class Driver {
    private String name;
    private Car rentedCar;

    public Driver(String name) {
        this.name = name;
        this.rentedCar = null;
    }

    public void rentCar(Car car) {
        if (!car.isRented()) {
            this.rentedCar = car;
            car.rent();
        } else {
            System.out.println("Автомобиль " + car.getLicensePlate() + " уже арендован.");
        }
    }

    public void returnCar() {
        if (rentedCar != null) {
            rentedCar.returnCar();
            rentedCar = null;
        } else {
            System.out.println("У водителя нет арендованного автомобиля.");
        }
    }

    public void displayInfo() {
        System.out.println("Водитель: " + name);
        if (rentedCar != null) {
            System.out.println("Арендованный автомобиль:");
            rentedCar.displayInfo();
        } else {
            System.out.println("Арендованный автомобиль: Нет");
        }
    }
}
