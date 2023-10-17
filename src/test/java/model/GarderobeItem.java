package model;

import java.util.List;

public class GarderobeItem {
    private String type;
    private String color;
    private String size;
    private String gender;
    private String brand;
    private List<String> materials;
    private String country;

    public String getType() {
        return type;
    }

    public GarderobeItem setType(String type) {
        this.type = type;
        return this;
    }

    public String getColor() {
        return color;
    }

    public GarderobeItem setColor(String color) {
        this.color = color;
        return this;
    }

    public String getSize() {
        return size;
    }

    public GarderobeItem setSize(String size) {
        this.size = size;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public GarderobeItem setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public GarderobeItem setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public List<String> getMaterials() {
        return materials;
    }

    public GarderobeItem setMaterials(List<String> materials) {
        this.materials = materials;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public GarderobeItem setCountry(String country) {
        this.country = country;
        return this;
    }

    public void printGarderobeItemDetails() {
        System.out.println("I have bought " + color + " " + type);
    }

    public void printGarderobeItemInfo() {
        System.out.println("Some " + gender + "'s clothes are fit for women");
    }
}
