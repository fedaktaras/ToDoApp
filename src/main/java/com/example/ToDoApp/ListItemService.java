package com.example.ToDoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ListItemService {
    @Autowired
    public ListItemRepository listItemRepository;

    public ArrayList<ListItem> getAllListItems(){
        ArrayList<ListItem> listItemArrayList = new ArrayList<>();
        listItemRepository.findAll().forEach(listItemArrayList::add);
        return listItemArrayList;
    }
    public  ListItem getListItemById(long id){
        Optional<ListItem> result;
        result =  listItemRepository.findById(id);
        return result.get();
    }

    public void addListItem(ListItem listItem) {listItemRepository.save(listItem);}

}
