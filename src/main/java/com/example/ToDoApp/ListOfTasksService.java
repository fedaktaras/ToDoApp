package com.example.ToDoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ListOfTasksService {
    @Autowired
    ListOfTasksRepository listOfTasksRepository;

    public ArrayList<ListOfTasks> getAllListOfTasks(){
        ArrayList<ListOfTasks> listOfTasks = new ArrayList<>();
        listOfTasksRepository.findAll().forEach(listOfTasks::add);
        return listOfTasks;
    }

    public void addListOfTasks(ListOfTasks listOfTasks){listOfTasksRepository.save(listOfTasks);}


    public ListOfTasks getListOfTasksById(long id){
        return listOfTasksRepository.findById(id).get();
    }
}
