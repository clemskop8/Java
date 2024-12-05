public abstract class Pet {
    private String name;
    private int age;
    private PetType type;
    private HealthStatus healthStatus;

    public Pet(String name, int age, PetType type, HealthStatus healthStatus) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.healthStatus = healthStatus;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public PetType getType() {
        return type;
    }

    public HealthStatus getHealthStatus() {
        return healthStatus;
    }

    public abstract void displayInfo();
}
