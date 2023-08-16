package modal.weather;

public class Minutely {
    private long dt;
    private int precipitation;

    public long getDt() {
        return dt;
    }

    public Minutely setDt(long dt) {
        this.dt = dt;
        return this;
    }

    public int getPrecipitation() {
        return precipitation;
    }

    public Minutely setPrecipitation(int precipitation) {
        this.precipitation = precipitation;
        return this;
    }
}
