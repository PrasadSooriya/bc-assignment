package com.prasad.demo.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "number", "name", "isDaytime", "temperature", "temperatureUnit", "temperatureTrend", "windSpeed",
		"windDirection", "icon", "shortForecast", "detailedForecast" })
public class Period {

	public static String getHeaders() {
		return "|#|      Name    |\tDateTime|Temp|Wind Speed  |Direction| Fore Cast|"
				+
				"\n==================================================================";
	}

	@Override
	public String toString() {
		return "|" + number + "|" + String.format("%1$" + 14 + "s", name) 
		+ "|\t" + isDaytime + "\t|"
				+ temperature + "\u00B0" 
		+ temperatureUnit
				+ "|" + String.format("%1$"	+ 12 + "s", windSpeed)
				+ "|" + String.format("%1$"+ 8 + "s", windDirection)
				+ "\"|"
				+ shortForecast + "\n\t" + String.format("%1$-"+ 180 + "s", detailedForecast)+
				"\n------------------------------------------------------------------";
	}

	@JsonProperty("number")
	private Integer number;
	@JsonProperty("name")
	private String name;
	@JsonProperty("startTime")
	private String startTime;
	@JsonProperty("endTime")
	private String endTime;
	@JsonProperty("isDaytime")
	private Boolean isDaytime;
	@JsonProperty("temperature")
	private Integer temperature;
	@JsonProperty("temperatureUnit")
	private String temperatureUnit;
	@JsonProperty("temperatureTrend")
	private Object temperatureTrend;
	@JsonProperty("windSpeed")
	private String windSpeed;
	@JsonProperty("windDirection")
	private String windDirection;
	@JsonProperty("icon")
	private String icon;
	@JsonProperty("shortForecast")
	private String shortForecast;
	@JsonProperty("detailedForecast")
	private String detailedForecast;

	@JsonProperty("number")
	public Integer getNumber() {
		return number;
	}

	@JsonProperty("number")
	public void setNumber(Integer number) {
		this.number = number;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("startTime")
	public String getStartTime() {
		return startTime;
	}

	@JsonProperty("startTime")
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	@JsonProperty("endTime")
	public String getEndTime() {
		return endTime;
	}

	@JsonProperty("endTime")
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@JsonProperty("isDaytime")
	public Boolean getIsDaytime() {
		return isDaytime;
	}

	@JsonProperty("isDaytime")
	public void setIsDaytime(Boolean isDaytime) {
		this.isDaytime = isDaytime;
	}

	@JsonProperty("temperature")
	public Integer getTemperature() {
		return temperature;
	}

	@JsonProperty("temperature")
	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}

	@JsonProperty("temperatureUnit")
	public String getTemperatureUnit() {
		return temperatureUnit;
	}

	@JsonProperty("temperatureUnit")
	public void setTemperatureUnit(String temperatureUnit) {
		this.temperatureUnit = temperatureUnit;
	}

	@JsonProperty("temperatureTrend")
	public Object getTemperatureTrend() {
		return temperatureTrend;
	}

	@JsonProperty("temperatureTrend")
	public void setTemperatureTrend(Object temperatureTrend) {
		this.temperatureTrend = temperatureTrend;
	}

	@JsonProperty("windSpeed")
	public String getWindSpeed() {
		return windSpeed;
	}

	@JsonProperty("windSpeed")
	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}

	@JsonProperty("windDirection")
	public String getWindDirection() {
		return windDirection;
	}

	@JsonProperty("windDirection")
	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}

	@JsonProperty("icon")
	public String getIcon() {
		return icon;
	}

	@JsonProperty("icon")
	public void setIcon(String icon) {
		this.icon = icon;
	}

	@JsonProperty("shortForecast")
	public String getShortForecast() {
		return shortForecast;
	}

	@JsonProperty("shortForecast")
	public void setShortForecast(String shortForecast) {
		this.shortForecast = shortForecast;
	}

	@JsonProperty("detailedForecast")
	public String getDetailedForecast() {
		return detailedForecast;
	}

	@JsonProperty("detailedForecast")
	public void setDetailedForecast(String detailedForecast) {
		this.detailedForecast = detailedForecast;
	}
}
