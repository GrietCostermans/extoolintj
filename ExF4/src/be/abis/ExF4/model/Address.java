package be.abis.ExF4.model;

public class Address {
    private String street;
    private int num;
    private String town;

    public Address(String street, int num, String town) {
        this.street = street;
        this.num = num;
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
