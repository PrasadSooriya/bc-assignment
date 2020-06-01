package com.prasad.demo.domain.point;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "cwa", "gridX", "gridY", "relativeLocation", "forecast" })
public class PointProperties {

	@JsonProperty("relativeLocation")
	private RelativeLocation relativeLocation;

	@Override
	public String toString() {
		return relativeLocation + ", forecast=" + forecast;
	}

	@JsonProperty("cwa")
	private String cwa;

	@JsonProperty("gridX")
	private Integer gridX;

	@JsonProperty("gridY")
	private Integer gridY;

	@JsonProperty("forecast")
	private String forecast;

	@JsonProperty("cwa")
	public String getCwa() {
		return cwa;
	}

	@JsonProperty("cwa")
	public void setCwa(String cwa) {
		this.cwa = cwa;
	}


	@JsonProperty("gridX")
	public Integer getGridX() {
		return gridX;
	}

	@JsonProperty("gridX")
	public void setGridX(Integer gridX) {
		this.gridX = gridX;
	}

	@JsonProperty("gridY")
	public Integer getGridY() {
		return gridY;
	}

	@JsonProperty("gridY")
	public void setGridY(Integer gridY) {
		this.gridY = gridY;
	}

	@JsonProperty("relativeLocation")
	public RelativeLocation getRelativeLocation() {
		return relativeLocation;
	}

	@JsonProperty("relativeLocation")
	public void setRelativeLocation(RelativeLocation relativeLocation) {
		this.relativeLocation = relativeLocation;
	}

	@JsonProperty("forecast")
	public String getForecast() {
		return forecast;
	}

	@JsonProperty("forecast")
	public void setForecast(String forecast) {
		this.forecast = forecast;
	}
}