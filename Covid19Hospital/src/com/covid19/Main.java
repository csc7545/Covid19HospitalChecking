package com.covid19;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int totalCount = Covid19HospitalUtil.getTotalCount();
		System.out.println("현재 전국에 코로나19 예방접종센터는 " + totalCount +"개 등록되어 있습니다.");
		
		Covid19HospitalList hpInfo = Covid19HospitalUtil.getCovid19HospitalInfo(1, totalCount);
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("\n시설명 또는 지역 입력(X 종료) : ");
			String str = s.nextLine();
			if(str.equals("X"))
					break;
			
			System.out.println("******************************");
			for(Datum item : hpInfo.getData()) {
				if(item.getFacilityName().contains(str) ||
				   item.getAddress().contains(str)) {
					System.out.println("센터이름: " + item.getCenterName());
					System.out.println("주소: " + item.getAddress());
					System.out.println("시설명: " + item.getFacilityName());
					System.out.println("전화번호: " + item.getPhoneNumber());
					System.out.println("수정일: " + item.getUpdatedAt());
					System.out.println("");
				}
			}
		}
		System.out.println("종료되었습니다.");
	}

}
