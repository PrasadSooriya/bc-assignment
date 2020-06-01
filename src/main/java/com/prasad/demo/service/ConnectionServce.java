package com.prasad.demo.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class ConnectionServce {
	private ConnectionServce() {
		super();
	}
	
	public static String getURLData(String URL) throws Exception{
		String respJson = "";
		try {
			URL url = new URL(URL);
			HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
			try  {
				conn.setRequestMethod("GET");
				conn.addRequestProperty("Accept", "application/json");
				int respCode = conn.getResponseCode();

				switch (respCode) {
				case 200: {
					BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					String resp = null;
					while ((resp = br.readLine()) != null) {
						respJson += resp;
					}
					break;
				}

				default: 
					throw new Exception("Falied to get response");
				}
			} finally {
				conn.disconnect();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return respJson;
	}
}
