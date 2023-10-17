package stepdefs;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.weather.WeatherResponse;
import org.junit.jupiter.api.Assertions;
import requesters.WeatherRequester;

import java.util.*;

public class WeatherStepDefs {
    private long cityId;
    private WeatherResponse response;

    @Given("city ID is {long}")
    public void set_city_id(long cityId) {
        this.cityId = cityId;
    }

    @When("we are requesting weather forecast")
    public void request_weather() throws JsonProcessingException {
        WeatherRequester requester = new WeatherRequester();
        response = requester.requestWeather(cityId);
    }

    @Then("latitude is {double}")
    public void latitude_check(double latitude) {
        Assertions.assertEquals(latitude, response.getLat(), "Incorrect Latitude!");
    }

    @Then("longitude is {double}")
    public void longitude_check(double longitude) {
        Assertions.assertEquals(longitude, response.getLon(), "Incorrect Longitude!");
    }

    @Then("timezone is {string}")
    public void timezone_check(String timezone) {
        Assertions.assertEquals(timezone, response.getTimezone(), "incorrect timezone!");
    }

    @Then("timezone offset is {int}")
    public void timezone_offset_check(int offset) {
        Assertions.assertEquals(offset, response.getTimezoneOffset(), "Incorrect offset!");
    }

    @Then("current data is:")
    public void current_data_check(Map<String, String> params) {
        Assertions.assertEquals(Long.parseLong(params.get("dt")), response.getCurrent().getDt(), "Incorrect dt!");
        Assertions.assertEquals(Long.parseLong(params.get("sunrise")), response.getCurrent().getSunrise(), "Incorrect sunrise!");
        Assertions.assertEquals(Long.parseLong(params.get("sunset")), response.getCurrent().getSunset(), "Incorrect sunset!");
        Assertions.assertEquals(Double.parseDouble(params.get("temp")), response.getCurrent().getTemp(), "Incorrect temp!");
        Assertions.assertEquals(Double.parseDouble(params.get("feels_like")), response.getCurrent().getFeelsLike(), "Incorrect feels like!");
        Assertions.assertEquals(Integer.parseInt(params.get("pressure")), response.getCurrent().getPressure(), "Incorrect pressure!");
        Assertions.assertEquals(Integer.parseInt(params.get("humidity")), response.getCurrent().getHumidity(), "Incorrect humidity!");
        Assertions.assertEquals(Double.parseDouble(params.get("dew_point")), response.getCurrent().getDewPoint(), "incorrect dew point!");
        Assertions.assertEquals(Double.parseDouble(params.get("uvi")), response.getCurrent().getUvi(), "Incorrect uvi!");
        Assertions.assertEquals(Integer.parseInt(params.get("clouds")), response.getCurrent().getClouds(), "Incorrect clouds!");
        Assertions.assertEquals(Integer.parseInt(params.get("visibility")), response.getCurrent().getVisibility(), "Incorrect visibility!");
        Assertions.assertEquals(Double.parseDouble(params.get("wind_speed")), response.getCurrent().getWindSpeed(), "Incorrect wind speed!");
        Assertions.assertEquals(Integer.parseInt(params.get("wind_deg")), response.getCurrent().getWindDeg(), "Incorrect wind deg!");
        Assertions.assertEquals(Double.parseDouble(params.get("wind_gust")), response.getCurrent().getWindGust(), "Incorrect wind gust!");
    }

    @Then("current weather is:")
    public void current_weather_check(Map<String, String> params) {
        Assertions.assertEquals(Integer.parseInt(params.get("id")), response.getCurrent().getWeathers().get(0).getId(), "Incorrect id!");
        Assertions.assertEquals(params.get("main"), response.getCurrent().getWeathers().get(0).getMain(), "Incorrect main!");
        Assertions.assertEquals(params.get("description"), response.getCurrent().getWeathers().get(0).getDescription(), "Incorrect description!");
        Assertions.assertEquals(params.get("icon"), response.getCurrent().getWeathers().get(0).getIcon(), "Incorrect icon!");
    }

    @Then("minutely is:")
    public void minutely_check(Map<String, String> params) {
        Assertions.assertEquals(Long.parseLong(params.get("dt")), response.getMinutelyList().get(0).getDt(), "Incorrect dt!");
        Assertions.assertEquals(Integer.parseInt(params.get("precipitation")), response.getMinutelyList().get(0).getPrecipitation(), "Incorrect precipitation!");
    }

    @Then("hourly is:")
    public void hourly_check(Map<String, String> params) {
        Assertions.assertEquals(Long.parseLong(params.get("dt")), response.getHourly().get(0).getDt(), "Incorrect dt!");
        Assertions.assertEquals(Double.parseDouble(params.get("temp")), response.getHourly().get(0).getTemp(), "Incorrect temp!");
        Assertions.assertEquals(Double.parseDouble(params.get("feels_like")), response.getHourly().get(0).getFeelsLike(), "Incorrect feels like!");
        Assertions.assertEquals(Integer.parseInt(params.get("pressure")), response.getHourly().get(0).getPressure(), "Incorrect pressure!");
        Assertions.assertEquals(Integer.parseInt(params.get("humidity")), response.getHourly().get(0).getHumidity(), "Incorrect humidity!");
        Assertions.assertEquals(Double.parseDouble(params.get("dew_point")), response.getHourly().get(0).getDewPoint(), "Incorrect dew point!");
        Assertions.assertEquals(Double.parseDouble(params.get("uvi")), response.getHourly().get(0).getUvi(), "Incorrect uvi!");
        Assertions.assertEquals(Integer.parseInt(params.get("clouds")), response.getHourly().get(0).getClouds(), "Incorrect clouds!");
        Assertions.assertEquals(Integer.parseInt(params.get("visibility")), response.getHourly().get(0).getVisibility(), "Incorrect visibility!");
        Assertions.assertEquals(Double.parseDouble(params.get("wind_speed")), response.getHourly().get(0).getWindSpeed(), "Incorrect wind speed!");
        Assertions.assertEquals(Integer.parseInt(params.get("wind_deg")), response.getHourly().get(0).getWindDeg(), "Incorrect wind deg!");
        Assertions.assertEquals(Double.parseDouble(params.get("wind_gust")), response.getHourly().get(0).getWindGust(), "Incorrect wind gust!");
        Assertions.assertEquals(Double.parseDouble(params.get("pop")), response.getHourly().get(0).getPop(), "Incorrect pop!");
    }

    @Then("hourly weather is:")
    public void hourly_weather_check(Map<String, String> params) {
        Assertions.assertEquals(Integer.parseInt(params.get("id")), response.getHourly().get(0).getWeathers().get(0).getId(), "Incorrect id!");
        Assertions.assertEquals(params.get("main"), response.getHourly().get(0).getWeathers().get(0).getMain(), "Incorrect main!");
        Assertions.assertEquals(params.get("description"), response.getHourly().get(0).getWeathers().get(0).getDescription(), "Incorrect description!");
        Assertions.assertEquals(params.get("icon"), response.getHourly().get(0).getWeathers().get(0).getIcon(), "Incorrect icon!");
    }

    @Then("daily is:")
    public void daily_check(Map<String, String> params) {
        Assertions.assertEquals(Long.parseLong(params.get("dt")), response.getDaily().get(0).getDt(), "Incorrect dt!");
        Assertions.assertEquals(Long.parseLong(params.get("sunrise")), response.getDaily().get(0).getSunrise(), "Incorrect sunrise!");
        Assertions.assertEquals(Long.parseLong(params.get("sunset")), response.getDaily().get(0).getSunset(), "Incorrect sunset!");
        Assertions.assertEquals(Long.parseLong(params.get("moonrise")), response.getDaily().get(0).getMoonrise(), "Incorrect moonrise!");
        Assertions.assertEquals(Long.parseLong(params.get("moonset")), response.getDaily().get(0).getMoonset(), "Incorrect moonset!");
        Assertions.assertEquals(Double.parseDouble(params.get("moon_phase")), response.getDaily().get(0).getMoonPhase(), "Incorrect moon phase!");
        Assertions.assertEquals(Integer.parseInt(params.get("pressure")), response.getDaily().get(0).getPressure(), "Incorrect pressure!");
        Assertions.assertEquals(Integer.parseInt(params.get("humidity")), response.getDaily().get(0).getHumidity(), "Incorrect humidity!");
        Assertions.assertEquals(Double.parseDouble(params.get("dew_point")), response.getDaily().get(0).getDewPoint(), "Incorrect dew point!");
        Assertions.assertEquals(Double.parseDouble(params.get("wind_speed")), response.getDaily().get(0).getWindSpeed(), "Incorrect wind speed!");
        Assertions.assertEquals(Integer.parseInt(params.get("wind_deg")), response.getDaily().get(0).getWindDeg(), "Incorrect wind_deg!");
        Assertions.assertEquals(Double.parseDouble(params.get("wind_gust")), response.getDaily().get(0).getWindGust(), "Incorrect wind gust!");
        Assertions.assertEquals(Integer.parseInt(params.get("clouds")), response.getDaily().get(0).getClouds(), "Incorrect clouds!");
        Assertions.assertEquals(Double.parseDouble(params.get("pop")), response.getDaily().get(0).getPop(), "Incorrect pop!");
        Assertions.assertEquals(Double.parseDouble(params.get("rain")), response.getDaily().get(0).getRain(), "Incorrect rain!");
        Assertions.assertEquals(Double.parseDouble(params.get("uvi")), response.getDaily().get(0).getUvi(), "Incorrect wind uvi!");
    }

    @Then("daily temp is:")
    public void daily_temp_check(Map<String, String> params) {
        Assertions.assertEquals(Double.parseDouble(params.get("day")), response.getDaily().get(0).getTemp().getDay(), "Incorrect day!");
        Assertions.assertEquals(Double.parseDouble(params.get("min")), response.getDaily().get(0).getTemp().getMin(), "Incorrect min!");
        Assertions.assertEquals(Double.parseDouble(params.get("max")), response.getDaily().get(0).getTemp().getMax(), "Incorrect max!");
        Assertions.assertEquals(Double.parseDouble(params.get("night")), response.getDaily().get(0).getTemp().getNight(), "Incorrect night!");
        Assertions.assertEquals(Double.parseDouble(params.get("eve")), response.getDaily().get(0).getTemp().getEve(), "Incorrect eve!");
        Assertions.assertEquals(Double.parseDouble(params.get("morn")), response.getDaily().get(0).getTemp().getMorn(), "Incorrect morn!");
    }

    @Then("daily feels like:")
    public void daily_feels_like_check(Map<String, String> params) {
        Assertions.assertEquals(Double.parseDouble(params.get("day")), response.getDaily().get(0).getFeelsLike().getDay(), "Incorrect day!");
        Assertions.assertEquals(Double.parseDouble(params.get("night")), response.getDaily().get(0).getFeelsLike().getNight(), "Incorrect night!");
        Assertions.assertEquals(Double.parseDouble(params.get("eve")), response.getDaily().get(0).getFeelsLike().getEve(), "Incorrect eve!");
        Assertions.assertEquals(Double.parseDouble(params.get("morn")), response.getDaily().get(0).getFeelsLike().getMorn(), "Incorrect morn!");
    }

    @Then("daily weather is:")
    public void daily_weather_check(Map<String, String> params) {
        Assertions.assertEquals(Integer.parseInt(params.get("id")), response.getDaily().get(0).getWeather().get(0).getId(), "Incorrect id!");
        Assertions.assertEquals(params.get("main"), response.getDaily().get(0).getWeather().get(0).getMain(), "Incorrect main!");
        Assertions.assertEquals(params.get("description"), response.getDaily().get(0).getWeather().get(0).getDescription(), "Incorrect description!");
        Assertions.assertEquals(params.get("icon"), response.getDaily().get(0).getWeather().get(0).getIcon(), "Incorrect icon!");
    }

    @Then("alerts is:")
    public void alerts_check(Map<String, String> params) {
        Assertions.assertEquals(params.get("sender_name"), response.getAlerts().get(0).getSenderName(), "Incorrect sender name!");
        Assertions.assertEquals(params.get("event"), response.getAlerts().get(0).getEvent(), "Incorrect sender event!");
        Assertions.assertEquals(Long.parseLong(params.get("start")), response.getAlerts().get(0).getStart(), "Incorrect sender start!");
        Assertions.assertEquals(Long.parseLong(params.get("end")), response.getAlerts().get(0).getEnd(), "Incorrect sender end!");
        Assertions.assertEquals(params.get("description"), response.getAlerts().get(0).getDescription(), "Incorrect sender description!");
    }

    @Then("alert tags are:")
    public void alert_tags_check(Map<String, String> params){
        List<String> tags;
        if (Objects.isNull(params.get("tags"))) tags = new ArrayList<>();
        else tags = Collections.singletonList(params.get("tags"));

        Assertions.assertEquals(tags, response.getAlerts().get(0).getTags(), "Incorrect tags!");
    }
}
