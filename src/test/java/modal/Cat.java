package modal;

public class Cat {
    private String breed;
    private String name;
    private String color;
    private String sound;
    private Boolean gender;
    private int age;

    public String getBreed() {
        return breed;
    }

    public Cat setBreed(String breed) {
        this.breed = breed;
        return this;
    }

    public String getName() {
        return name;
    }

    public Cat setName(String name) {
        this.name = name;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Cat setColor(String color) {
        this.color = color;
        return this;
    }

    public String getSound() {
        return sound;
    }

    public Cat setSound(String sound) {
        this.sound = sound;
        return this;
    }

    public Boolean getGender() {
        return gender;
    }

    public Cat setGender(Boolean gender) {
        this.gender = gender;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Cat setAge(int age) {
        this.age = age;
        return this;
    }

    public void printCatsSound() {
        System.out.println("My cat " + name + " " + sound + "s" + " very loud");
    }

    public void printCatsBreed() {
        System.out.println(breed + " are very active");
    }
}
