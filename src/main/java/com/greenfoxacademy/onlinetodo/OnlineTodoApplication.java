package com.greenfoxacademy.onlinetodo;

import com.greenfoxacademy.onlinetodo.models.Todo;
import com.greenfoxacademy.onlinetodo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineTodoApplication implements CommandLineRunner {


  @Autowired
  TodoRepository todoRepository;

  public static void main(String[] args) {
    SpringApplication.run(OnlineTodoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    todoRepository.save(new Todo("Update Kelet Kavezo menu"));
    todoRepository.save(new Todo("Update Kelet Kavezo menu"));
    todoRepository.save(new Todo("Update Kelet Kavezo menu"));
    todoRepository.save(new Todo("Update Kelet Kavezo menu"));
    todoRepository.save(new Todo("Update Kelet Kavezo menu"));
    todoRepository.save(new Todo("Update Kelet Kavezo menu"));
    todoRepository.save(new Todo("Update Kelet Kavezo menu"));
    todoRepository.save(new Todo("Update Kelet Kavezo menu"));

  }
}
