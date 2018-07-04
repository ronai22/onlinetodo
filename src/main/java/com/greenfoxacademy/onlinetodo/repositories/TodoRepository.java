package com.greenfoxacademy.onlinetodo.repositories;

import com.greenfoxacademy.onlinetodo.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
