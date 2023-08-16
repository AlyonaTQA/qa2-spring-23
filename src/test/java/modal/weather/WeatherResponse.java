package modal.weather;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class WeatherResponse {
    private double lat;
    private double lon;
    private String timezone;
    @JsonProperty("timezone_offset")
    private int timezoneOffset;
    private Current current;
    @JsonProperty("minutely")
    private ArrayList<Minutely> minutelyList;
    private ArrayList<Hourly> hourly;
    private ArrayList<Daily> daily;
    private ArrayList<Alerts> alerts;

    public double getLat() {
        return lat;
    }

    public WeatherResponse setLat(double lat) {
        this.lat = lat;
        return this;
    }

    public double getLon() {
        return lon;
    }

    public WeatherResponse setLon(double lon) {
        this.lon = lon;
        return this;
    }

    public String getTimezone() {
        return timezone;
    }

    public WeatherResponse setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    public int getTimezoneOffset() {
        return timezoneOffset;
    }

    public WeatherResponse setTimezoneOffset(int timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
        return this;
    }

    public Current getCurrent() {
        return current;
    }

    public WeatherResponse setCurrent(Current current) {
        this.current = current;
        return this;
    }

    public ArrayList<Minutely> getMinutelyList() {
        return minutelyList;
    }

    public WeatherResponse setMinutelyList(ArrayList<Minutely> minutelyList) {
        this.minutelyList = minutelyList;
        return this;
    }

    public ArrayList<Hourly> getHourly() {
        return hourly;
    }

    public WeatherResponse setHourly(ArrayList<Hourly> hourly) {
        this.hourly = hourly;
        return this;
    }

    public ArrayList<Daily> getDaily() {
        return daily;
    }

    public WeatherResponse setDaily(ArrayList<Daily> daily) {
        this.daily = daily;
        return this;
    }

    public ArrayList<Alerts> getAlerts() {
        return alerts;
    }

    public WeatherResponse setAlerts(ArrayList<Alerts> alerts) {
        this.alerts = alerts;
        return this;
    }
}
