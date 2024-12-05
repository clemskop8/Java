public class Cat extends Pet {
    private String color;

    public Cat(String name, int age, String color, HealthStatus healthStatus) {
        super(name, age, PetType.CAT, healthStatus);
        this.color = color;
    }

    @Override
    public void displayInfo() {
        System.out.println("Имя: " + getName() + ", Возраст: " + getAge() + ", Тип: " + getType());
        System.out.println("Цвет: " + color);
    }
}
