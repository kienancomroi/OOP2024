package Week7;

public class MotorBike extends Vehicle {

    private boolean hasSidecar;

    /**
     * Constructor Motorbike.
     * @param brand  brand of motorbike.
     * @param model  model of motorbike.
     * @param registrationNumber registration number of motorbike.
     * @param owner owner of motorbike.
     * @param hasSidecar motorbike has a sidecar or not.
     */

    public MotorBike(String brand, String model, String registrationNumber,
                     Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * Get information about motorbike.
     * @return A string containing information about motorbike.
     */

    public String getInfo() {
        String info = "Motor Bike:";
        info += String.format("\n\tBrand: %s", this.brand);
        info += String.format("\n\tModel: %s", this.model);
        info += String.format("\n\tRegistration Number: %s", this.registrationNumber);
        info += String.format("\n\tHas Side Car: %b", this.hasSidecar);
        info += String.format("\n\tBelongs to %s - %s",
                this.owner.getName(), this.owner.getAddress());
        return info;
    }

    /**
     * Motorbike has a sidecar or not.
     * @return Whether motorbike has a sidecar or not.
     */

    public boolean isHasSidecar() {
        return this.hasSidecar;
    }

    /**
     * Set whether the motorbike has a sidecar or not.
     * @param hasSidecar Whether motorbike has a sidecar or not.
     */

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
