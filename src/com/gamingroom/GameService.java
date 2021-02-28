package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu, bradley.jackson2@snhu.edu
 */
public class GameService {

	// A list of the active games
	private static List<Game> games = new ArrayList<Game>();

	// Holds the next game identifier
	private static long nextGameId = 1;
	// Holds the next player identifier
	private static long nextPlayerId = 1;
	// Holds the next team identifier
	private static long nextTeamId = 1;

	// Create singleton pattern for GameService
	private static GameService service;

	// Private Constructor will prevent the instantiation of this class directly
	private GameService() {

	}

	/**
	 * Checks if there is a game service running
	 * 
	 * @return the game service instance (new or existing)
	 */
	public static GameService getInstance() {
		if (service == null) {
			service = new GameService();
			System.out.println("Game Service created.");
		} else {
			System.out.println("Game Service already running.");
		}
		return service;
	}

	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// if found, simply return the existing instance
		for (Game gameObj : games) {
			if (gameObj.getName().equals(name)) {
				game = gameObj;
			}
		}

		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * 
	 * Scope is package/local for testing purposes.
	 * 
	 * 
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}

	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// if found, simply assign that instance to the local variable
		for (Game gameObj : games) {
			if (gameObj.getId() == id) {
				game = gameObj;
			}
		}

		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {
		// a local game instance
		Game game = null;
		// if found, simply assign that instance to the local variable
		for (Game gameObj : games) {
			if (gameObj.getName().equals(name)) {
				game = gameObj;
			}
		}
		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}

	/**
	 * Returns the next player id in the queue then increments
	 * 
	 * @return the next player id in the queue
	 */
	public long getNextPlayerId() {
		long id = nextPlayerId++;
		return id;
	}

	/**
	 * Returns the next team id in the queue then increments
	 * 
	 * @return the next team id in the queue
	 */
	public long getNextTeamId() {
		long id = nextTeamId++;
		return id;
	}

}
