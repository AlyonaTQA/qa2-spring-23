package modal.weather;

public class FeelsLike {

    private double day;
    private double night;
    private double eve;
    private double morn;

    public double getDay() {
        return day;
    }

    public FeelsLike setDay(double day) {
        this.day = day;
        return this;
    }

    public double getNight() {
        return night;
    }

    public FeelsLike setNight(double night) {
        this.night = night;
        return this;
    }

    public double getEve() {
        return eve;
    }

    public FeelsLike setEve(double eve) {
        this.eve = eve;
        return this;
    }

    public double getMorn() {
        return morn;
    }

    public FeelsLike setMorn(double morn) {
        this.morn = morn;
        return this;
    }
}
