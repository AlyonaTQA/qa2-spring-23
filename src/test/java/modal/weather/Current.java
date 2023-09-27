package modal.weather;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Current {
    private long dt;
    private long sunrise;
    private long sunset;
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

    public long getDt() {
        return dt;
    }

    public Current setDt(long dt) {
        this.dt = dt;
        return this;
    }

    public long getSunrise() {
        return sunrise;
    }

    public Current setSunrise(long sunrise) {
        this.sunrise = sunrise;
        return this;
    }

    public long getSunset() {
        return sunset;
    }

    public Current setSunset(long sunset) {
        this.sunset = sunset;
        return this;
    }

    public double getTemp() {
        return temp;
    }

    public Current setTemp(double temp) {
        this.temp = temp;
        return this;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public Current setFeelsLike(double feelsLike) {
        this.feelsLike = feelsLike;
        return this;
    }

    public int getPressure() {
        return pressure;
    }

    public Current setPressure(int pressure) {
        this.pressure = pressure;
        return this;
    }

    public int getHumidity() {
        return humidity;
    }

    public Current setHumidity(int humidity) {
        this.humidity = humidity;
        return this;
    }

    public double getDewPoint() {
        return dewPoint;
    }

    public Current setDewPoint(double dewPoint) {
        this.dewPoint = dewPoint;
        return this;
    }

    public double getUvi() {
        return uvi;
    }

    public Current setUvi(double uvi) {
        this.uvi = uvi;
        return this;
    }

    public int getClouds() {
        return clouds;
    }

    public Current setClouds(int clouds) {
        this.clouds = clouds;
        return this;
    }

    public int getVisibility() {
        return visibility;
    }

    public Current setVisibility(int visibility) {
        this.visibility = visibility;
        return this;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public Current setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
        return this;
    }

    public int getWindDeg() {
        return windDeg;
    }

    public Current setWindDeg(int windDeg) {
        this.windDeg = windDeg;
        return this;
    }

    public double getWindGust() {
        return windGust;
    }

    public Current setWindGust(double windGust) {
        this.windGust = windGust;
        return this;
    }

    public List<Weather> getWeathers() {
        return weathers;
    }

    public Current setWeathers(ArrayList<Weather> weathers) {
        this.weathers = weathers;
        return this;
    }
}
