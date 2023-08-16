package modal.weather;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Daily {

    private long dt;
    private long sunrise;
    private long sunset;
    private long moonrise;
    private long moonset;

    @JsonProperty("moon_phase")
    private double moonPhase;

    private Temp temp;

    @JsonProperty("feels_like")
    private FeelsLike feelsLike;

    private int pressure;
    private int humidity;

    @JsonProperty("dew_point")
    private double dewPoint;

    @JsonProperty("wind_speed")
    private double windSpeed;

    @JsonProperty("wind_deg")
    private int windDeg;

    @JsonProperty("wind_gust")
    private double windGust;

    private ArrayList<Weather> weather;

    private int clouds;
    private double pop;
    private double rain;
    private double uvi;

    public long getDt() {
        return dt;
    }

    public Daily setDt(long dt) {
        this.dt = dt;
        return this;
    }

    public long getSunrise() {
        return sunrise;
    }

    public Daily setSunrise(long sunrise) {
        this.sunrise = sunrise;
        return this;
    }

    public long getSunset() {
        return sunset;
    }

    public Daily setSunset(long sunset) {
        this.sunset = sunset;
        return this;
    }

    public long getMoonrise() {
        return moonrise;
    }

    public Daily setMoonrise(long moonrise) {
        this.moonrise = moonrise;
        return this;
    }

    public long getMoonset() {
        return moonset;
    }

    public Daily setMoonset(long moonset) {
        this.moonset = moonset;
        return this;
    }

    public double getMoonPhase() {
        return moonPhase;
    }

    public Daily setMoonPhase(double moonPhase) {
        this.moonPhase = moonPhase;
        return this;
    }

    public Temp getTemp() {
        return temp;
    }

    public Daily setTemp(Temp temp) {
        this.temp = temp;
        return this;
    }

    public FeelsLike getFeelsLike() {
        return feelsLike;
    }

    public Daily setFeelsLike(FeelsLike feelsLike) {
        this.feelsLike = feelsLike;
        return this;
    }

    public int getPressure() {
        return pressure;
    }

    public Daily setPressure(int pressure) {
        this.pressure = pressure;
        return this;
    }

    public int getHumidity() {
        return humidity;
    }

    public Daily setHumidity(int humidity) {
        this.humidity = humidity;
        return this;
    }

    public double getDewPoint() {
        return dewPoint;
    }

    public Daily setDewPoint(double dewPoint) {
        this.dewPoint = dewPoint;
        return this;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public Daily setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
        return this;
    }

    public int getWindDeg() {
        return windDeg;
    }

    public Daily setWindDeg(int windDeg) {
        this.windDeg = windDeg;
        return this;
    }

    public double getWindGust() {
        return windGust;
    }

    public Daily setWindGust(double windGust) {
        this.windGust = windGust;
        return this;
    }

    public ArrayList<Weather> getWeather() {
        return weather;
    }

    public Daily setWeather(ArrayList<Weather> weather) {
        this.weather = weather;
        return this;
    }

    public int getClouds() {
        return clouds;
    }

    public Daily setClouds(int clouds) {
        this.clouds = clouds;
        return this;
    }

    public double getPop() {
        return pop;
    }

    public Daily setPop(double pop) {
        this.pop = pop;
        return this;
    }

    public double getRain() {
        return rain;
    }

    public Daily setRain(double rain) {
        this.rain = rain;
        return this;
    }

    public double getUvi() {
        return uvi;
    }

    public Daily setUvi(double uvi) {
        this.uvi = uvi;
        return this;
    }
}
