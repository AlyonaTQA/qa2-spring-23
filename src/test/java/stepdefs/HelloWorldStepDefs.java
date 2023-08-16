package stepdefs;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modal.weather.WeatherResponse;

import java.io.File;
import java.io.IOException;

public class HelloWorldStepDefs {
    @When("we are printing {string} in console")
    public void print_string_to_console(String text) {
        System.out.println(text);
    }

//    @Given("city ID is {int}")
//    public void city_id_is(Integer int1) throws IOException {
//        ObjectMapper mapper = new ObjectMapper();
//        File file = new File(
//                this.getClass().getClassLoader().getResource("w").getFile()
//        );
//        WeatherResponse weatherResponse = mapper.readValue(file, WeatherResponse.class);
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @When("we are requesting weather forecast")
//    public void we_are_requesting_weather_forecast() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("latitude is {double}")
//    public void latitude_is(Double double1) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("longitude is {double}")
//    public void longitude_is(Double double1) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("timezone is {string}")
//    public void timezone_is(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("timezone offset is {int}")
//    public void timezone_offset_is(Integer int1) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("current data is:")
//    public void current_data_is(io.cucumber.datatable.DataTable dataTable) {
//        // Write code here that turns the phrase above into concrete actions
//        // For automatic transformation, change DataTable to one of
//        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//        // Double, Byte, Short, Long, BigInteger or BigDecimal.
//        //
//        // For other transformations you can register a DataTableType.
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("current weather is:")
//    public void current_weather_is(io.cucumber.datatable.DataTable dataTable) {
//        // Write code here that turns the phrase above into concrete actions
//        // For automatic transformation, change DataTable to one of
//        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//        // Double, Byte, Short, Long, BigInteger or BigDecimal.
//        //
//        // For other transformations you can register a DataTableType.
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("minutely is:")
//    public void minutely_is(io.cucumber.datatable.DataTable dataTable) {
//        // Write code here that turns the phrase above into concrete actions
//        // For automatic transformation, change DataTable to one of
//        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//        // Double, Byte, Short, Long, BigInteger or BigDecimal.
//        //
//        // For other transformations you can register a DataTableType.
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("hourly is:")
//    public void hourly_is(io.cucumber.datatable.DataTable dataTable) {
//        // Write code here that turns the phrase above into concrete actions
//        // For automatic transformation, change DataTable to one of
//        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//        // Double, Byte, Short, Long, BigInteger or BigDecimal.
//        //
//        // For other transformations you can register a DataTableType.
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("hourly weather is:")
//    public void hourly_weather_is(io.cucumber.datatable.DataTable dataTable) {
//        // Write code here that turns the phrase above into concrete actions
//        // For automatic transformation, change DataTable to one of
//        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//        // Double, Byte, Short, Long, BigInteger or BigDecimal.
//        //
//        // For other transformations you can register a DataTableType.
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("daily is:")
//    public void daily_is() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @And("daily temp is:")
//    public void dailyTempIs() {
//    }
//
//    @And("daily feels like:")
//    public void dailyFeels_like() {
//    }
//
//    @And("daily weather is:")
//    public void dailyWeatherIs() {
//    }
//
//    @And("alerts is:")
//    public void alertsIs() {
//    }
//
//    @And("alert tags are:")
//    public void alertTagsAre() {
//    }
}
