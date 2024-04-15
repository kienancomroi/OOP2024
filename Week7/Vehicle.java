package Week7;
abstract class Vehicle {

    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * Constructor Vehicle.
     * @param brand brand of vehicle
     * @param model model of vehicle
     * @param registrationNumber registration number of vehicle
     * @param owner owner of number
     */
    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * Abstract method for information vehicle.
     * @return information of vehicle
     */
    abstract String getInfo();

    /**
     * Transfer vehicle to new owner.
     * @param newOwner new owner of vehicle
     */
    public void transferOwnership(Person newOwner) {
        this.owner = newOwner;
    }

    /**
     * Get brand of vehicle.
     * @return brand of vehicle
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Set brand of vehicle.
     * @param brand brand of vehicle
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Get model of vehicle.
     * @return model of vehicle
     */
    public String getModel() {
        return model;
    }

    /**
     * Set model of vehicle.
     * @param model model of vehicle
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Get registration number of vehicle.
     * @return registration number of vehicle
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Set registration number of vehicle.
     * @param registrationNumber registration number of vehicle
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * Get owner of vehicle.
     * @return owner of vehicle
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * Set owner for vehicle.
     * @param owner owner of vehicle
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }
}