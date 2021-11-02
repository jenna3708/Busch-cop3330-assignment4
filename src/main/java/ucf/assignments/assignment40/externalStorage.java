/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Jenna Busch
 */

package ucf.assignments.assignment40;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class externalStorage {

    //#19
    public void loadOneList(){
        //initialize new list
        //loop through every item in the one to do list
        //create new item object
        //initialize item object with values read from file
        //add item object to list
        //after loop, return list Object
    }
    //#20
    public void loadMultipleLists(){
        //initialize new arraylist of lists
        //loop through every item in the one to do list
        //create new item object
        //initialize item object with values read from file
        //add item object to list
        //after loop, return the array list of lists
    }

    //#17
    public void saveOneList(){
        //create a new empty file
        //copy one list over to the file
        //return the file to the user
    }

    //#18
    public void saveAll(){
        //create a new empty file
        //copy all the lists to the file
        //return the file to the user
    }

    //FXML SECTION
    @FXML
    public void loadOneListButtonPressed(ActionEvent actionEvent) {
        //this will call the load single list function when pressed and load a single list
    }

    @FXML
    public void loadMultipleListsButtonPressed(ActionEvent actionEvent) {
        //this will call the load multiple lists function when pressed and load the lists

    }

    @FXML
    public void saveAllButtonPressed(ActionEvent actionEvent){
        //this will call the save all function when pressed and save all the lists (or one)
    }


}
