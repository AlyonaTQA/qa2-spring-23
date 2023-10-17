package model;

public class Flat {
    private int floorCount;
    private int rooms;
    private boolean balcony;
    private int ceilingHeight;
    private String district;
    private String streetName;
    private String series;

    public int getFloorCount() {
        return floorCount;
    }

    public Flat setFloorCount(int floorCount) {
        this.floorCount = floorCount;
        return this;
    }

    public int getRooms() {
        return rooms;
    }

    public Flat setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public Flat setBalcony(boolean balcony) {
        this.balcony = balcony;
        return this;
    }

    public int getCeilingHeight() {
        return ceilingHeight;
    }

    public Flat setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    public String getDistrict() {
        return district;
    }

    public Flat setDistrict(String district) {
        this.district = district;
        return this;
    }

    public String getStreetName() {
        return streetName;
    }

    public Flat setStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public String getSeries() {
        return series;
    }

    public Flat setSeries(String series) {
        this.series = series;
        return this;
    }

    public void printFloorsCount() {
        System.out.println("We live on the " + floorCount + "st floor");
    }

    public void printHouseFloors() {
        System.out.println("Of " + floorCount + " floors building");
    }
}
