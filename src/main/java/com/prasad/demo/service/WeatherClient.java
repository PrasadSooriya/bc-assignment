package com.prasad.demo.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prasad.demo.domain.Forecast;
import com.prasad.demo.domain.Period;
import com.prasad.demo.domain.point.Point;
import com.prasad.demo.domain.point.PointProperties;

public class WeatherClient {

	// https://api.weather.gov/points/{latitude},{longitude}
	public PointProperties getPoints(String location) {
		PointProperties pPoints = null;
		try {
			String respJson = ConnectionServce.getURLData(Constants.SERVICE_URL + "/points/" + location);
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

			try {
				Point point = mapper.readValue(respJson, Point.class);
				pPoints = point.getProperties();
			} catch (JsonParseException e) {
				System.out.println(e.getMessage());
			} catch (JsonMappingException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return pPoints;
	}

	public List<Period> getForecast(String officeGrid) {
		List<Period> periods = new ArrayList<>();
		try {
			String respJson = ConnectionServce.getURLData(Constants.SERVICE_URL + "/gridpoints/" +officeGrid + "/forecast");
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			try {
				Forecast forecast = mapper.readValue(respJson, Forecast.class);
				periods = forecast.getProperties().getPeriods();
			} catch (JsonParseException e) {
				System.out.println(e.getMessage());
			} catch (JsonMappingException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return periods;
	}
}
