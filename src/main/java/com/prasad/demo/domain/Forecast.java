package com.prasad.demo.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.prasad.demo.domain.point.PointProperties;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"properties" })
public class Forecast {

	@JsonProperty("properties")
	private Properties properties;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("properties")
	public Properties getProperties() {
		return properties;
	}

	@JsonProperty("properties")
	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}