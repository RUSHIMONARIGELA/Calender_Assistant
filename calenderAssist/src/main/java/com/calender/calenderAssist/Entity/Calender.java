package com.calender.calenderAssist.Entity;

import java.util.List;

public class Calender {
	private String owner;
	private List<Meeting> meetings;

	public Calender(String owner, List<Meeting> meetings) {
		super();
		this.owner = owner;
		this.meetings = meetings;
	}

	public Calender() {
		super();
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public List<Meeting> getMeetings() {
		return meetings;
	}

	public void setMeetings(List<Meeting> meetings) {
		this.meetings = meetings;
	}

	@Override
	public String toString() {
		return "Calender [owner=" + owner + ", meetings=" + meetings + "]";
	}

}
