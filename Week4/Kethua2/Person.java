

public class Person {
    private String name;
    private String address;

    /**
     * constructor1.
     */
    public Person() {
        this.name = "";
        this.address = "";
    }

    /**
     * constructor2.
     * @param name the name of person
     * @param address the address of person
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * get name of person.
     * @return name of person
     */
    public String getName() {
        return name;
    }

    /**
     * set address of person.
     * @return address of person
     */
    public String getAddress() {
        return address;
    }

    /**
     * set address of person.
     * @param address address of person
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * override to String.
     */
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
