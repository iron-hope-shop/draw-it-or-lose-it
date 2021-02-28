package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * Notice the overloaded constructor that requires an id and name to be passed
 * when creating. Also note that no mutators (setters) defined so these values
 * cannot be changed once a game is created.
 * 
 * @author coce@snhu.edu, bradley.jackson2@snhu.edu
 *
 */
public class Game extends Entity {
	long id;
	String name;
	private static List<Team> teams = new ArrayList<Team>();

	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		super(id, name);
		this.id = id;
		this.name = name;
	}

	public Team addPlayer(String name) {
		for (Team teamObj : teams) {
			if (teamObj.getName().equals(name)) {
				return teamObj;
			}
		}
		return new Team(1, name);
	}

	@Override
	public String toString() {

		return "Game [id=" + id + ", name=" + name + "]";
	}

}
