package com.accenture.fers.entity;


/**
 * Accenture Technology Solutions
 *
 *
 * @version v1
 *
 *          Entity class for Event
 */
/**
 * 
 * @author rebeca.velasco
 *
 */
public class Event {

	private int eventId;
	private String name;
	private String description;
	private String place;
	private String duration;
	private String eventType;
	private int seatsAvailable;

	/**
	 * Default constructor
	 *
	 * @param event
	 *
	 */
	public Event() {

	}
	/**
	 * Copy constructor
	 *
	 * @param event
	 */
	public Event(Event event) {

	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public int getSeatsAvailable() {
		return seatsAvailable;
	}

	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}


}
