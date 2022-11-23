package com.example.ToDoApp;

import java.util.LinkedList;
import java.util.List;

public class ListWithTasks extends ListOfTasks{

    ListWithTasks(ListOfTasks listOfTasks){
        this.setId(listOfTasks.getId());
        this.setId(listOfTasks.getId());
        this.setText(listOfTasks.getText());
    }
    private List<ListItem> listOfItems;
    public List<ListItem> getListOfItems() {return listOfItems;}
    public void setListOfItems(List<ListItem> listOfItems) {this.listOfItems = listOfItems;}
}
