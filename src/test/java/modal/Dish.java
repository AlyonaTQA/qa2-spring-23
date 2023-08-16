package modal;

import java.math.BigDecimal;
import java.util.List;

public class Dish {
    private String name;
    private String country;
    private String category;
    private String spiciness;
    private String dietType;
    private int ingredients;
    private BigDecimal price;
    private List<String> allergens;

    public String getName() {
        return name;
    }

    public Dish setName(String name) {
        this.name = name;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Dish setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Dish setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getSpiciness() {
        return spiciness;
    }

    public Dish setSpiciness(String spiciness) {
        this.spiciness = spiciness;
        return this;
    }

    public String getDietType() {
        return dietType;
    }

    public Dish setDietType(String dietType) {
        this.dietType = dietType;
        return this;
    }

    public int getIngredients() {
        return ingredients;
    }

    public Dish setIngredients(int ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Dish setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public List<String> getAllergens() {
        return allergens;
    }

    public Dish setAllergens(List<String> allergens) {
        this.allergens = allergens;
        return this;
    }

    public void printCuisineCountry() {
        System.out.println("My husband likes cuisine of " + country + " very much");
    }

    public void printDishName() {
        System.out.println("Especially " + name);
    }
}
