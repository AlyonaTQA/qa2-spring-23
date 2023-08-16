package modal.weather;

public class Temp {

    private double day;
    private double min;
    private double max;
    private double night;
    private double eve;
    private double morn;

    public double getDay() {
        return day;
    }

    public Temp setDay(double day) {
        this.day = day;
        return this;
    }

    public double getMin() {
        return min;
    }

    public Temp setMin(double min) {
        this.min = min;
        return this;
    }

    public double getMax() {
        return max;
    }

    public Temp setMax(double max) {
        this.max = max;
        return this;
    }

    public double getNight() {
        return night;
    }

    public Temp setNight(double night) {
        this.night = night;
        return this;
    }

    public double getEve() {
        return eve;
    }

    public Temp setEve(double eve) {
        this.eve = eve;
        return this;
    }

    public double getMorn() {
        return morn;
    }

    public Temp setMorn(double morn) {
        this.morn = morn;
        return this;
    }
}
