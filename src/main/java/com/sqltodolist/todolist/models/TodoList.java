package com.sqltodolist.todolist.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.*;

@Entity
@Table(name = "todo-list")
@ToString @EqualsAndHashCode
public class TodoList {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private Long id;

    @Getter @Setter @Column(name = "todo")
    private String  todo;

    @Getter @Setter @Column(name = "completed")
    private boolean completed;




}
