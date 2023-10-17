package model;

public class Movie {
    private String name;
    private String director;
    private String country;
    private String language;
    private String genre;
    private int year;
    private double imdbRating;

    public String getName() {
        return name;
    }

    public Movie setName(String name) {
        this.name = name;
        return this;
    }

    public String getDirector() {
        return director;
    }

    public Movie setDirector(String director) {
        this.director = director;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Movie setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public Movie setLanguage(String language) {
        this.language = language;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public Movie setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Movie setYear(int year) {
        this.year = year;
        return this;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public Movie setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
        return this;
    }

    public void printMovieDetails() {
        System.out.println("Yesterday I watched " + name + " movie by " + director);
    }

    public void printMovieLanguage() {
        System.out.println("I watched it in " + language + " language for practise");
    }
}
