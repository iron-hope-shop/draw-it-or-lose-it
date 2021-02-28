package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a team
 * 
 * Notice the overloaded constructor that requires an id and name to be passed
 * when creating. Also note that no mutators (setters) defined so these values
 * cannot be changed once a team is created.
 * 
 * 
 * @author coce@snhu.edu, bradley.jackson2@snhu.edu
 *
 */
public class Team extends Entity {
	long id;
	String name;
	private static List<Player> players = new ArrayList<Player>();

	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		super(id, name);
		this.id = id;
		this.name = name;
	}

	public Player addPlayer(String name) {
		Player player = null;
		for (Player playerObj : players) {
			if (playerObj.getName().equals(name)) {
				player = playerObj;
			}
		}
		return player;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + "]";
	}
}
