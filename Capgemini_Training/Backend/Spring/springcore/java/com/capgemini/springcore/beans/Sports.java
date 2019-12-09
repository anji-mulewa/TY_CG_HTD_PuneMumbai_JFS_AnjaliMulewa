package com.capgemini.springcore.beans;

import java.util.Map;

public class Sports {
	private String name;
	private int noOfPlayers;
	private Map<String, String> teamInfo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public Map<String, String> getTeamInfo() {
		return teamInfo;
	}

	public void setTeamInfo(Map<String, String> teamInfo) {
		this.teamInfo = teamInfo;
	}

}
