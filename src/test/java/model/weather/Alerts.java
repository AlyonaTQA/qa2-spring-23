package model.weather;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Alerts {

    @JsonProperty("sender_name")
    private String senderName;

    private String event;
    private long start;
    private long end;
    private String description;
    private List<String> tags;

    public String getSenderName() {
        return senderName;
    }

    public Alerts setSenderName(String senderName) {
        this.senderName = senderName;
        return this;
    }

    public String getEvent() {
        return event;
    }

    public Alerts setEvent(String event) {
        this.event = event;
        return this;
    }

    public long getStart() {
        return start;
    }

    public Alerts setStart(long start) {
        this.start = start;
        return this;
    }

    public long getEnd() {
        return end;
    }

    public Alerts setEnd(long end) {
        this.end = end;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Alerts setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<String> getTags() {
        return tags;
    }

    public Alerts setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

}
