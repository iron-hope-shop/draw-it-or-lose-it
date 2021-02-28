package com.gamingroom;

/**
 * A simple class to hold the common attributes and behaviors about an entity
 * 
 * @author bradley.jackson2@snhu.edu
 *
 */

public class Entity {
  long id;
  String name;

  private Entity() {

  }

  /*
   * Constructor with an identifier and name
   */
  public Entity(long id, String name) {
    this();
    this.id = id;
    this.name = name;
  }

  /**
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return string of entity properties
   */
  @Override
  public String toString() {
    return "Entity [id=" + id + ", name=" + name + "]";
  }
}
