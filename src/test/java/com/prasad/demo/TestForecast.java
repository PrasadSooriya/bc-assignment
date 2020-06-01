package com.prasad.demo;


import org.junit.jupiter.api.Test;

import com.prasad.demo.Forecaster;

class TestForecast {

	@Test
	void testMain() {
		double latitude = 39.7456;
		double longitude = -97.0892;
		String[] args = new String[] { (latitude + "," + longitude)};
		Forecaster.main(args);
	}
}
