package com.covid19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class Covid19HospitalUtil {
	//OpenAPI 데이터 가져오
	public static Covid19HospitalList getCovid19HospitalInfo(int page, int perPage) {
		try {
			//URL 생성
			URL url = new URL("https://api.odcloud.kr/api/15077586/v1/centers"+ "?page=" + page + "&perPage=" + perPage 
				+ "&serviceKey=egr%2B71ijUJcND46fMc8u1OjOioZO0vFasEmffJTsoHLIRJIt%2FYpb3OfTYWXaGaM8r2fbGuuWgIZogI1VPRlbKA%3D%3D");
			//http url 연결
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			//요청 데이터 읽어오기
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			StringBuilder sb = new StringBuilder();
			String input = "";
			while((input = br.readLine()) != null) {
				sb.append(input);
			}
			br.close();
			con.disconnect();
			//gson를 이용한 deserialize
			Gson gson = new Gson();
			Covid19HospitalList hospitalInfo = gson.fromJson(sb.toString(), Covid19HospitalList.class);
			
			return hospitalInfo;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	//전체 데이터수 가져오기
	public static int getTotalCount() {
		return getCovid19HospitalInfo(1,1).getTotalCount();
	}
}
