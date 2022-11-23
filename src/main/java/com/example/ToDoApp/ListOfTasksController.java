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
    ArrayList<ListWithTasks> getListsOfTasks(){
        ArrayList<ListOfTasks> list = listOfTasksService.getAllListOfTasks();
        ArrayList<ListWithTasks> listWithTasks = new ArrayList<>();
        for (int i = 0; i< list.size(); i++){
            listWithTasks.add(new ListWithTasks(list.get(i)));
            listWithTasks.get(i).setListOfItems(listOfTasksService.getAllListOfTasksByListId(list.get(i).getId()));
        }
        return listWithTasks;
    }
    @PostMapping("/list")
    public void newListOfTasks(@RequestBody ListOfTasks newListOfTasks){listOfTasksService.addListOfTasks(newListOfTasks);}
    @PostMapping(value = "/lists")
    public void newListItemOnListOfTasks (@RequestBody ListItem listItem){listItemService.addListItem(listItem);}
    @GetMapping("/list/{id}")
    ListWithTasks getListsOfTask(@PathVariable("id") long listOfTasksId){
        ListWithTasks listWithTasks = new ListWithTasks(listOfTasksService.getListOfTasksById(listOfTasksId));
        listWithTasks.setListOfItems(listOfTasksService.getAllListOfTasksByListId(listOfTasksId));
        return listWithTasks;
    }

}
