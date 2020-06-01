package com.prasad.demo;

import java.util.List;

import com.prasad.demo.domain.Period;
import com.prasad.demo.domain.point.PointProperties;
import com.prasad.demo.service.WeatherClient;

public class Forecaster {
	private static boolean validArg(String arg) {
		try {
			String[] coord = arg.split(",");
			Double lat = Double.parseDouble(coord[0].trim());
			Double lon = Double.parseDouble(coord[1].trim());
			if (Math.abs(lat) <= 90 && Math.abs(lon) <= 180) {
				return true;
			}
		} catch (Exception e) {
		}
		System.out.println("Argument [" + arg + "] is invalid.");
		return false;
	}

	
	private static String getForecastURI(PointProperties pPoint) {
		return pPoint.getCwa() + "/" + pPoint.getGridX() + "," + pPoint.getGridY() ;
	}
	
	public static void main(String[] args) {
		if (args.length > 0 && !args[0].isEmpty()) {
			if (validArg(args[0])) {
				System.out.println("Forecasting wheather for place " + args[0]);
				System.out.println("-----------------------------------------------");
				WeatherClient wc = new WeatherClient();
				PointProperties point = wc.getPoints(args[0]);
				List<Period> forecastData = null;
				if (point != null) {
					System.out.println(point);
					forecastData = wc.getForecast(getForecastURI(point));
				}

				
				if (forecastData!= null && !forecastData.isEmpty()) {
					System.out.println(Period.getHeaders());
				}
				forecastData.stream().limit(5).forEach(System.out::println);
			}
		} else {
			System.out.println("Required argument is missing.");
			System.out.println("usage : "
					+ "mvn -q clean compile exec:java -Dexec.mainClass=\"com.prasad.demo.Forecaster\" -Dexec.args=\"39.7456,-97.0892\"");
		}
	}
}
