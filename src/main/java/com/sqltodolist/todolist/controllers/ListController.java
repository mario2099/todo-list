package com.sqltodolist.todolist.controllers;

import com.sqltodolist.todolist.dao.TodoListDao;
import com.sqltodolist.todolist.models.TodoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ListController {
    @Autowired
    private TodoListDao todoListDao;

    @RequestMapping(value= "api/todolist")
    public List<TodoList> getTodos() {
        return todoListDao.getTodos();
    }
    @RequestMapping(value = "api/todolist", method = RequestMethod.POST)
    public void addTodo(@RequestBody TodoList todoList){todoListDao.addTodo(todoList); }

    @RequestMapping(value = "api/todolist/delete/{id}", method = RequestMethod.DELETE)
    public void deleteTodo(@PathVariable Long id){todoListDao.deleteTodo(id);}
    @RequestMapping(value = "api/todolist/complete/{id}", method = RequestMethod.PUT)
    public void completeTodo(@PathVariable Long id){todoListDao.completeTodo(id);}
}
