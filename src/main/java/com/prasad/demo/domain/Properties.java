package com.prasad.demo.domain;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "periods" })
public class Properties {

	@JsonProperty("periods")
	private List<Period> periods = null;

	@JsonProperty("periods")
	public List<Period> getPeriods() {
		return periods;
	}

	@JsonProperty("periods")
	public void setPeriods(List<Period> periods) {
		this.periods = periods;
	}

}