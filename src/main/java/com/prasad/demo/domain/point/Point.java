package com.prasad.demo.domain.point;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "properties" })
public class Point {

	@JsonProperty("properties")
	private PointProperties properties;

	@JsonProperty("properties")
	public PointProperties getProperties() {
		return properties;
	}

	@JsonProperty("properties")
	public void setProperties(PointProperties properties) {
		this.properties = properties;
	}
}