package model.weather;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Hourly {

    private long dt;
    private double temp;

    @JsonProperty("feels_like")
    private double feelsLike;

    private int pressure;
    private int humidity;

    @JsonProperty("dew_point")
    private double dewPoint;

    private double uvi;
    private int clouds;
    private int visibility;

    @JsonProperty("wind_speed")
    private double windSpeed;

    @JsonProperty("wind_deg")
    private int windDeg;

    @JsonProperty("wind_gust")
    private double windGust;

    @JsonProperty("weather")
    private List<Weather> weathers;
    private double pop;

    public double getPop() {
        return pop;
    }

    public Hourly setPop(double pop) {
        this.pop = pop;
        return this;
    }

    public long getDt() {
        return dt;
    }

    public Hourly setDt(long dt) {
        this.dt = dt;
        return this;
    }

    public double getTemp() {
        return temp;
    }

    public Hourly setTemp(double temp) {
        this.temp = temp;
        return this;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public Hourly setFeelsLike(double feelsLike) {
        this.feelsLike = feelsLike;
        return this;
    }

    public int getPressure() {
        return pressure;
    }

    public Hourly setPressure(int pressure) {
        this.pressure = pressure;
        return this;
    }

    public int getHumidity() {
        return humidity;
    }

    public Hourly setHumidity(int humidity) {
        this.humidity = humidity;
        return this;
    }

    public double getDewPoint() {
        return dewPoint;
    }

    public Hourly setDewPoint(double dewPoint) {
        this.dewPoint = dewPoint;
        return this;
    }

    public double getUvi() {
        return uvi;
    }

    public Hourly setUvi(double uvi) {
        this.uvi = uvi;
        return this;
    }

    public int getClouds() {
        return clouds;
    }

    public Hourly setClouds(int clouds) {
        this.clouds = clouds;
        return this;
    }

    public int getVisibility() {
        return visibility;
    }

    public Hourly setVisibility(int visibility) {
        this.visibility = visibility;
        return this;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public Hourly setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
        return this;
    }

    public int getWindDeg() {
        return windDeg;
    }

    public Hourly setWindDeg(int windDeg) {
        this.windDeg = windDeg;
        return this;
    }

    public double getWindGust() {
        return windGust;
    }

    public Hourly setWindGust(double windGust) {
        this.windGust = windGust;
        return this;
    }

    public List<Weather> getWeathers() {
        return weathers;
    }

    public Hourly setWeathers(List<Weather> weathers) {
        this.weathers = weathers;
        return this;
    }
}
