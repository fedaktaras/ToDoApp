package com.example.ToDoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ListOfTasksController {
    @Autowired
    private ListOfTasksService listOfTasksService;

    @RequestMapping("/lists")
    ArrayList<ListOfTasks> getListsOfTasks(){
        return listOfTasksService.getAllListOfTasks();
    }
    @PostMapping("/lists")
    public void newListOfTasks(@RequestBody ListOfTasks newListOfTasks){
        listOfTasksService.addListOfTasks(newListOfTasks);
    }

}
