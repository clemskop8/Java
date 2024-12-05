public class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, String breed, HealthStatus healthStatus) {
        super(name, age, PetType.DOG, healthStatus);
        this.breed = breed;
    }

    @Override
    public void displayInfo() {
        System.out.println("Имя: " + getName() + ", Возраст: " + getAge() + ", Тип: " + getType());
        System.out.println("Порода: " + breed);
    }
}
