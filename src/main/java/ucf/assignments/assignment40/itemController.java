/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Jenna Busch
 */

package ucf.assignments.assignment40;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.testng.annotations.Test;

//this class deals with the controls done on the item-view screen
public class itemController {

    //#14
    public static void showToDoLists() {
        //set new scene
    }

    //#15
    public static void showIncompleteItems() {
        //loop through each item
        //check if item is not complete
        //if item is not complete output it to incomplete table
    }

    //#13
    public static void markComplete(){
        //if box is checked change boolean to true
    }

    //#16
    public static void showCompleteItems() {
        //loop through each item
        //check if item is complete
        //if item is complete output it to complete table
    }

    //#14
    public static void showAllItems() {
        //loop through each task
        //check if task is complete
        //output task to taskTable
    }

    //#9
    public void createItem() {
        //create new item object
        //initialize item object
        //add item object to ToDoList
        //return ToDoList
    }

    //#10
    public void removeItem(){
        //find item in list
        //remove the item object
        //return new list with item removed
    }

    //#11
    public void editDescription(){
        //find item in list
        //take in new description
        //set old description equal to new
        //return new item object updated
    }

    //#12
    public void editDueDate(){
        //find item in list
        //take in new date
        //set old date equal to new
        //return new item object updated
    }


    //FXML SECTION
    @FXML
    public void showButtonClicked(ActionEvent actionEvent) {
        //show all the items in the list
    }

    @FXML
    public void showListButtonClicked(ActionEvent actionEvent) {
        //show all the to do lists currently
    }

    @FXML
    public void addItemButtonClicked(ActionEvent actionEvent) {
        //this will add an item to a list
    }

    @FXML
    public void incompleteButtonClicked(ActionEvent actionEvent) {
        //show all the incomplete items in the list
    }

    @FXML
    public void completeButtonClicked(ActionEvent actionEvent) {
        //show all the complete items in the list
    }

    @FXML
    public void markedButtonClicked(ActionEvent actionEvent) {
        //will change the boolean of the complete/incomplete variable
    }

    @FXML
    public void removeButtonClicked(ActionEvent actionEvent) {
        //will remove the item from the to do list
    }

    @FXML
    public void editDescriptionButtonClicked(ActionEvent actionEvent) {
        //will edit the description of the item
    }

    @FXML
    public void editDateButtonClicked(ActionEvent actionEvent) {
        //will edit the date of the item
    }


}
