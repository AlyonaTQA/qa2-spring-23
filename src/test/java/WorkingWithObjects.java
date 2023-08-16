import modal.*;
import org.junit.jupiter.api.Test;

public class WorkingWithObjects {
    @Test
    public void creatingAndUsingObjects() {
        Student dima = new Student();
        dima.setFirstName("Dmitrij");
        dima.setLastName("Tester");
        dima.setEmail("test@test.lv");
        dima.setAge(81);

        Student misha = new Student();
        misha.setFirstName("Mihailina");
        misha.setLastName("The Test Girl");
        misha.setEmail("trololo@misha.lv");
        misha.setAge(18);

        System.out.println(misha.getFirstName());
        System.out.println(misha.getLastName());
        System.out.println(dima.getFirstName() + " " + dima.getLastName());
        misha.printFullName();

        System.out.println();
        Cat betty = new Cat();
        betty.setName("Betty");
        betty.setSound("meow");
        betty.printCatsSound();
        betty.setBreed("Burmese");
        betty.printCatsBreed();

        System.out.println();
        Bicycle bike = new Bicycle();
        bike.setColor("white");
        bike.printBikeColor();
        bike.setSpeedCount(24);
        bike.printBikeSpeed();

        System.out.println();
        Dish dish = new Dish();
        dish.setCountry("Italy");
        dish.printCuisineCountry();
        dish.setName("pizza");
        dish.printDishName();

        System.out.println();
        Flat flat = new Flat();
        flat.setFloorCount(1);
        flat.printFloorsCount();
        flat.setFloorCount(5);
        flat.printHouseFloors();

        System.out.println();
        Car car = new Car();
        car.setBrandName("Toyota");
        car.setHullType("SUV");
        car.printCarInfo();
        car.setColor("black");
        car.setYear(2020);
        car.printCarDetails();

        System.out.println();
        Computer computer = new Computer();
        computer.setCorpusType("ATX");
        computer.setMotherboard("Prime Z590");
        computer.printComputerInfo();
        computer.setRamCapacity(32);
        computer.setHddCapacity(512);
        computer.printComputerDetails();

        System.out.println();
        Mobile mobile = new Mobile();
        mobile.setBrand("OnePlus");
        mobile.setModel("9RT 5G");
        mobile.printMobileInfo();
        mobile.setPlatform("Android");
        mobile.setScreenSize(6.62);
        mobile.printMobileDetails();

        System.out.println();
        GarderobeItem garderobeItem = new GarderobeItem();
        garderobeItem.setColor("black");
        garderobeItem.setType("trousers");
        garderobeItem.printGarderobeItemDetails();
        garderobeItem.setGender("man");
        garderobeItem.printGarderobeItemInfo();

        System.out.println();
        Movie movie = new Movie();
        movie.setName("Avatar");
        movie.setDirector("James Cameron");
        movie.printMovieDetails();
        movie.setLanguage("english");
        movie.printMovieLanguage();

        System.out.println();
        Wine wine = new Wine();
        wine.setBrand("Tussock Jumper");
        wine.setCountry("Australia");
        wine.printVineDetails();
        wine.setStrength(11.5);
        wine.setVolume(750);
        wine.printVineInfo();

    }
}
