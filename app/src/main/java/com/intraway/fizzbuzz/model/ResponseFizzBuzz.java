package com.intraway.fizzbuzz.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseFizzBuzz {

  private Long code;
  private String list;
  private String description;
  private long timestamp;
  private Integer status;
  private String error;
  private String exception;
  private String message;
  private String path;

  public ResponseFizzBuzz() {}

  public Long getCode() {
    return code;
  }

  public String getList() {
    return list;
  }

  public String getDescription() {
    return description;
  }

  public void setCode(Long code) {
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

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public String getException() {
    return exception;
  }

  public void setException(String exception) {
    this.exception = exception;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }
}
