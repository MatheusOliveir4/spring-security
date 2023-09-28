package com.matheus.security.user;

public enum Role {
  USER("user"),
  ADMIN("admin");

  private String role;

  Role(String role) {
    this.role = role;
  }
}
