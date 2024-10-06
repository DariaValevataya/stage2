package com.valevataya.entity.user;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {
  private static Warehouse instance;
  private final Set<User> users = new HashSet<>();

  private Warehouse() {
  }

  public static Warehouse getInstance() {
    if (instance == null) {
      instance = new Warehouse();
    }
    return instance;
  }

  public void addUser(User user) {
    users.add(user);
  }

  public Set<User> getUsers() {
    return users;
  }

  @Override
  public String toString() {
    StringBuilder allUsers = new StringBuilder();
    for (User user : users) {
      allUsers.append(user.toString());
      allUsers.append('\n');
    }
    return allUsers.toString();
  }
}
