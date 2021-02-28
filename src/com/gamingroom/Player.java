package com.gamingroom;

/**
 * A simple class to hold information about a player
 * 
 * Notice the overloaded constructor that requires an id and name to be passed
 * when creating. Also note that no mutators (setters) defined so these values
 * cannot be changed once a player is created.
 * 
 * 
 * @author coce@snhu.edu, bradley.jackson2@snhu.edu
 *
 */
public class Player extends Entity {
	long id;
	String name;

	/*
	 * Constructor with an identifier and name
	 */
	public Player(long id, String name) {
		super(id, name);
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}
}
