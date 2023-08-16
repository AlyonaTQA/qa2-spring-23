package modal;

public class Computer {
    private String corpusType;
    private String motherboard;
    private String cpu;
    private String ram;
    private int ramCapacity;
    private String hddType;
    private int hddCapacity;

    public String getCorpusType() {
        return corpusType;
    }

    public Computer setCorpusType(String corpusType) {
        this.corpusType = corpusType;
        return this;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public Computer setMotherboard(String motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    public String getCpu() {
        return cpu;
    }

    public Computer setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public String getRam() {
        return ram;
    }

    public Computer setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public Computer setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
        return this;
    }

    public String getHddType() {
        return hddType;
    }

    public Computer setHddType(String hddType) {
        this.hddType = hddType;
        return this;
    }

    public int getHddCapacity() {
        return hddCapacity;
    }

    public Computer setHddCapacity(int hddCapacity) {
        this.hddCapacity = hddCapacity;
        return this;
    }

    public void printComputerInfo() {
        System.out.println("This corpus " + corpusType + " compatible with " + motherboard);
    }

    public void printComputerDetails() {
        System.out.println("RAM capacity is " + ramCapacity + "GB and HDD capacity " + hddCapacity + "GB");
    }
}
