package com.sqltodolist.todolist;

import com.sqltodolist.todolist.dao.TodoListDao;
import com.sqltodolist.todolist.models.TodoList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
class TodoListApplicationTests {
	@Autowired
	private TodoListDao todoListDao;

	@Test
	void testGetTodos() {
		List<TodoList> todos = todoListDao.getTodos();
		System.out.println(todos);
		assertNotNull(todos);
		//assertEquals(2, todos.size());
	}
//	@Test
//	void testAddTodos() {
//		List<TodoList> todos1 = todoListDao.getTodos();
//		System.out.println(todos1);
//		TodoList todoList = new TodoList();
//		todoList.setTodo("Task 1");
//		todoList.setCompleted(false);
//		todoListDao.addTodo(todoList);
//
//		List<TodoList> todos2 = todoListDao.getTodos();
//		System.out.println(todos2);
//	}

}
