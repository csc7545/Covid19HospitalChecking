package com.covid19;

import java.util.List;

public class Covid19HospitalList {

	private Integer currentCount;
	private List<Datum> data = null;
	private Integer matchCount;
	private Integer page;
	private Integer perPage;
	private Integer totalCount;
	
	public Integer getCurrentCount() {
		return currentCount;
	}
	
	public void setCurrentCount(Integer currentCount) {
		this.currentCount = currentCount;
	}
	
	public List<Datum> getData() {
		return data;
	}
	
	public void setData(List<Datum> data) {
		this.data = data;
	}
	
	public Integer getMatchCount() {
		return matchCount;
	}
	
	public void setMatchCount(Integer matchCount) {
		this.matchCount = matchCount;
	}
	
	public Integer getPage() {
		return page;
	}
	
	public void setPage(Integer page) {
		this.page = page;
	}
	
	public Integer getPerPage() {
		return perPage;
	}
	
	public void setPerPage(Integer perPage) {
		this.perPage = perPage;
	}
	
	public Integer getTotalCount() {
		return totalCount;
	}
	
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
}