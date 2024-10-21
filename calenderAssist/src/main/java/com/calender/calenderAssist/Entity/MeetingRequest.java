package com.calender.calenderAssist.Entity;



import java.util.List;


public class MeetingRequest {
    private String owner;
    private Meeting meeting;
    private List<String> participants;
    
	public MeetingRequest(String owner, Meeting meeting, List<String> participants) {
		super();
		this.owner = owner;
		this.meeting = meeting;
		this.participants = participants;
	}
	public MeetingRequest() {
		super();
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Meeting getMeeting() {
		return meeting;
	}
	public void setMeeting(Meeting meeting) {
		this.meeting = meeting;
	}
	public List<String> getParticipants() {
		return participants;
	}
	public void setParticipants(List<String> participants) {
		this.participants = participants;
	}
	@Override
	public String toString() {
		return "MeetingRequest [owner=" + owner + ", meeting=" + meeting + ", participants=" + participants + "]";
	}
    
}

