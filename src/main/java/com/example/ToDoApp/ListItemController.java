package com.example.ToDoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ListItemController {
    @Autowired
    private ListItemService listItemService;

    @RequestMapping("/items")
    public ArrayList<ListItem> getListItems(){return listItemService.getAllListItems();}

    @GetMapping(value = "/{id}")
    public ListItem getListItemById(@PathVariable("id") long id){ return listItemService.getListItemById(id);}

    @PostMapping(value = "/item")
    public void addListItem(@RequestBody ListItem listItem){listItemService.addListItem(listItem); }



}
