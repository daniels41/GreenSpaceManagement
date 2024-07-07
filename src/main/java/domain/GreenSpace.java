package domain;

public class GreenSpace {

    private String name;

    private Address address;

    private double area;

    public GreenSpace(String name, Address address, double area) {
        this.name = name;
        this.address = address;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public double getArea() {
        return area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setArea(double area) {
        this.area = area;
    }

}
