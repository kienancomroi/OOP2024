package Week7;

public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Constructor Car.
     * @param brand brand of car
     * @param model model of car
     * @param registrationNumber registration number of car
     * @param owner owner of car
     * @param numberOfDoors number of doors of car
     */
    public Car(String brand, String model, String registrationNumber, Person owner,
               int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * get information of car.
     * @return String information of car
     */
    public String getInfo() {
        String info = "Car:";
        info += String.format("\n\tBrand: %s", this.brand);
        info += String.format("\n\tModel: %s", this.model);
        info += String.format("\n\tRegistration Number: %s", this.registrationNumber);
        info += String.format("\n\tNumber of Doors: %d", this.numberOfDoors);
        info += String.format("\n\tBelongs to %s - %s",
                this.owner.getName(), this.owner.getAddress());
        return info;
    }
