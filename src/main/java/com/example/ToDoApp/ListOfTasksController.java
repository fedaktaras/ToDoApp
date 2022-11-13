package com.example.ToDoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ListOfTasksController {
    @Autowired
    private ListOfTasksService listOfTasksService;
    @Autowired
    private ListItemService listItemService;

    @RequestMapping("/lists")
    ArrayList<ListOfTasks> getListsOfTasks(){
        return listOfTasksService.getAllListOfTasks();
    }
    @PostMapping("/lists")
    public void newListOfTasks(@RequestBody ListOfTasks newListOfTasks){
        listOfTasksService.addListOfTasks(newListOfTasks);
    }

    @PostMapping(value = "/lists/{id}")
    public void newListItemOnListOfTasks (@RequestBody ListItem listItem, @PathVariable("id") long id){
        listItemService.addListItem(listItem);
        long listItemId = listItemService.listItemRepository.findLastId();
        listItem = listItemService.getListItemById(listItemId);
        ListOfTasks listOfTasks =  listOfTasksService.getListOfTasksById(id);
        listOfTasks.getItemsOnBoard().put(listItemId, listItem);
        listOfTasksService.listOfTasksRepository.save(listOfTasks);
    }
}
