package modal.weather;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class WeatherResponse {
    private double lat;
    private double lon;
    private String timezone;
    @JsonProperty("timezone_offset")
    private int timezoneOffset;
    private Current current;
    @JsonProperty("minutely")
    private List<Minutely> minutelyList;
    private List<Hourly> hourly;
    private List<Daily> daily;
    private List<Alerts> alerts;

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

    public List<Minutely> getMinutelyList() {
        return minutelyList;
    }

    public WeatherResponse setMinutelyList(ArrayList<Minutely> minutelyList) {
        this.minutelyList = minutelyList;
        return this;
    }

    public List<Hourly> getHourly() {
        return hourly;
    }

    public WeatherResponse setHourly(ArrayList<Hourly> hourly) {
        this.hourly = hourly;
        return this;
    }

    public List<Daily> getDaily() {
        return daily;
    }

    public WeatherResponse setDaily(ArrayList<Daily> daily) {
        this.daily = daily;
        return this;
    }

    public List<Alerts> getAlerts() {
        return alerts;
    }

    public WeatherResponse setAlerts(ArrayList<Alerts> alerts) {
        this.alerts = alerts;
        return this;
    }
}
