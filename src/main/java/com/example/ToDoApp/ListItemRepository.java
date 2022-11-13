package com.example.ToDoApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ListItemRepository extends JpaRepository<ListItem, Long> {

    @Query("SELECT id FROM ListItem WHERE id = (SELECT MAX(id) FROM ListItem)")
    public Long findLastId();
}
