package com.accenture.fers.entity;

import java.util.Set;

/**
 * @Author Coritel
 *
 * @version v1
 *
 *          Entity class for Visitor
 */

public class Visitor extends People {

	private int visitorId;
	private String userName;
	private String password;
	private Set<Event> registeredEvents;

	
	public Visitor() {

	}

	public Visitor(Visitor visitor) {

	}

}
