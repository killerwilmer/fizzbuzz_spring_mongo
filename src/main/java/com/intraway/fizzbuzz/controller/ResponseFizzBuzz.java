package com.intraway.fizzbuzz.controller;

public class ResponseFizzBuzz {

  private long code;
  private String list;
  private String description;
  private long timestamp;

  public ResponseFizzBuzz(long code, String list, String description, long timestamp) {
    this.code = code;
    this.list = list;
    this.description = description;
    this.timestamp = timestamp;
  }

  public long getCode() {
    return code;
  }

  public String getList() {
    return list;
  }

  public String getDescription() {
    return description;
  }

  public void setCode(long code) {
    this.code = code;
  }

  public void setList(String list) {
    this.list = list;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }
}
