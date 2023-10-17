package model.weather;

public class Weather {
    private long id;
    private String main;
    private String description;
    private String icon;

    public long getId() {
        return id;
    }

    public Weather setId(long id) {
        this.id = id;
        return this;
    }

    public String getMain() {
        return main;
    }

    public Weather setMain(String main) {
        this.main = main;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Weather setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public Weather setIcon(String icon) {
        this.icon = icon;
        return this;
    }
}
