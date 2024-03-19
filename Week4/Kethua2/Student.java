package Week4.Kethua2;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * constructor.
     * @param name name of student
     * @param address address of student
     * @param program program of student
     * @param year year of student
     * @param fee fee of student
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * getter for program.
     * @return program of student
     */
    public String getProgram() {
        return program;
    }

    /**
     * setter for program.
     * @param program program of student
     */
    public void setProgram(String program) {
        this.program = program;
    }


    /**
     * getter for year.
     * @return year of student
     */
    public int getYear {
        return year;
    }

    /**
     * setter for year.
     * @param year year of student
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * getter for fee.
     * @return fee of student
     */
    public double getFee {
        this.fee = fee
    }

    /**
     * setter of fee.
     * @param fee fee of student
     */
    public void setFee(doulbe fee) {
        this.fee = fee;
    }

    /**
     * Override toString method.
     */
    @Override
    public String toString() {
        return "Student[Person[name=" + getName() + ",address=" + getAddress()
                + "],program=" + program + ",year=" + year + ",fee=" + fee + "]";
    }
}
