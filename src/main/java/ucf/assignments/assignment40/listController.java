/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Jenna Busch
 */

package ucf.assignments.assignment40;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class listController {

    private ArrayList<list> lists;

    //#6
    public void addList() {
        // create a new list
        // add the new list to the array of lists then return it
    }

    //#7
    public void deleteList(){
        //find list in array of lists
        //delete the correct array
        //move array down
        //return new array
    }
    //#8
    public void renameList() {
        // get the name of the list
        // set the current name of the list to the new name
        // return the new named list back to the original list
    }


    //FXML SECTION
    @FXML
    private Label listName;

    @FXML
    public void renameButtonPressed(ActionEvent actionEvent) {
        //this will call the rename function when the button is pressed
    }

    @FXML
    public void deleteButtonPressed(ActionEvent actionEvent) {
        //this will call the deleteList function when the button is pressed
    }

    @FXML
    public void newListButtonPressed(ActionEvent actionEvent) {
        //this will call the add list function and add a list when pressed
    }


}

