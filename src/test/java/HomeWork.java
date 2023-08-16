import modal.Cat;
import modal.Movie;
import org.junit.jupiter.api.Test;

public class HomeWork {
    @Test
    public void homeWorkWithObjects() {
        Cat cat = new Cat();
        cat.setName("Betty");
        cat.setSound("meow");
        cat.setAge(1);
        cat.setBreed("Burmese");
        cat.setColor("braun");
        cat.setGender(false);
        System.out.println(cat.getName() + " " + cat.getSound() + " " + cat.getAge() + " " + cat.getBreed() + " " + cat.getColor() + " " + cat.getGender());

        System.out.println();
        Movie movie = new Movie();
        movie.setName("Avatar");
        movie.setDirector("James Cameron");
        movie.setLanguage("english");
        movie.setCountry("USA");
        movie.setYear(2022);
        movie.setGenre("action");
        movie.setImdbRating(7.7);
        System.out.println(movie.getName() + " " + movie.getDirector() + " " + movie.getLanguage() + " " + movie.getCountry() + " " + movie.getYear() + " " + movie.getGenre() + " " + movie.getImdbRating());
    }
}
