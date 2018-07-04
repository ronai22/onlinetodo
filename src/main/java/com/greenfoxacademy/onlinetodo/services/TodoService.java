package com.greenfoxacademy.onlinetodo.services;

import com.greenfoxacademy.onlinetodo.models.Todo;

import java.util.List;

public interface TodoService {

  List<Todo> findActive(Boolean isActive);

}
