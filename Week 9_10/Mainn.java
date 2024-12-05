public class Mainn {
    public static void main(String[] args) {
        PetClinic clinic = new PetClinic();

        try {
            Dog dog1 = new Dog("Бобик", 3, "Шершавая", HealthStatus.HEALTHY);
            Cat cat1 = new Cat("Мурка", 2, "Черный", HealthStatus.HEALTHY);

            clinic.addPet(dog1);
            clinic.addPet(cat1);

            clinic.displayPets();

            Dog dog2 = new Dog("Бобик", 5, "Лабрадор", HealthStatus.SICK);
            clinic.addPet(dog2);

            Cat cat2 = new Cat("Гарри", 2, "Рыжий", HealthStatus.HEALTHY);
            clinic.addPet(cat2);

            clinic.displayPets();

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
