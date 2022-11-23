package com.example.ToDoApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.List;

public interface ListItemRepository extends JpaRepository<ListItem, Long> {

    @Query("SELECT id FROM ListItem WHERE id = (SELECT MAX(id) FROM ListItem)")
    public Long findLastId();
    @Query("SELECT l_i  FROM ListItem l_i WHERE l_i.listOfTasksId = :listOfTasksID")
    public List<ListItem> findAllByListId(@Param("listOfTasksID") Long idOfLis);
}
