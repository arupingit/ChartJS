package com.arupingit.model;

import java.util.List;

public class ChartsResponse {
	private String appName;
	private List<String> lables;
	private List<Dataset> datasets;
		
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public List<String> getLables() {
		return lables;
	}
	public void setLables(List<String> lables) {
		this.lables = lables;
	}
	public List<Dataset> getDatasets() {
		return datasets;
	}
	public void setDatasets(List<Dataset> datasets) {
		this.datasets = datasets;
	}
	
}
