

public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Constructor.
     * @param name name of staff member
     * @param address address of staff member
     * @param school school staff member
     * @param pay pay of staff member
     */

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * Getter for school.
     * @return school school
     */

    public String getSchool() {
        return school;
    }

    /**
     * Setter for school.
     * @param school school
     */

    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * Getter for pay.
     * @return pay pay
     */

    public double getPay() {
        return pay;
    }

    /**
     * Setter for pay.
     * @param pay pay
     */

    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * Overrides the toString method.
     */

    @Override
    public String toString() {
        return "Staff[Person[name=" + getName() + ",address=" + getAddress()
                + "],school=" + school + ",pay=" + pay + "]";
    }

}