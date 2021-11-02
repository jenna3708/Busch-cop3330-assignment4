/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Jenna Busch
 */

package ucf.assignments.assignment40;

import org.testng.annotations.Test;

public class methodTesters {

    //TESTING SECTION LIST CONTROLLER
    //#6-8
    @Test
    void addList() {
        //create a new list
        //call the add list function
        //check to see if the number of lists has increased by 1
    }
    @Test
    void deleteList() {
        //create a new array of lists
        //add some lists to the array
        //call the delete list function
        //check to see if the number of lists has decreased by 1
    }
    @Test
    void renameList() {
        //create a new list
        //call the rename function
        //check to see if the name of the list is the new name
    }
    @Test
    void showLists(){
        //create a new array of lists
        //fill the array with lists that contain items
        //call the show lists function
        //check to see if all lists have been printed out
    }


    //TESTING SECTION ITEM CONTROLLER
    //#9-16
    @Test
    void showIncompleteItems() {
        //create a new list of items
        //complete some of the items
        //call the show complete items function
        //check if the displayed list = the incomplete items
    }

    @Test
    void markComplete(){
        //create a new list of items
        //check some of the items complete
        //call the mark complete function
        //check if the boolean variables of the complete ones are set to true
    }

    @Test
    void showCompleteItems(){
        //create a new list of items
        //complete some of the items
        //call the show complete items function
        //check if the displayed list = the complete items
    }

    @Test
    void showAllItems(){
        //create a new list of items
        //complete some items
        //call the show all items function
        //check if the displayed items include every item
    }

    @Test
    void createItem(){
        //create a list that contains a few items
        //get the size of the list
        //call the create item function
        //check to see if the size is one larger than the size before the function is called
    }

    @Test
    void removeItem(){
        //create a list that contains a few items
        //get the size of the list
        //call the remove item function
        //check to see if the size is one less than the size before the function is called
    }

    @Test
    void editDescription(){
        //create an item object
        //initialize the object with information
        //call the edit description function
        //check to see if the description is set to the new provided description
    }

    @Test
    void editDueDate(){
        //create an item object
        //initialize the object with information
        //call the edit date function
        //check to see if the date is set to the new provided date
    }

    //TESTING SECTION EXTERNAL STORAGE
    //#17-20
    @Test
    void loadOneList(){
        //create a new list
        //fill the list with the items from the list being loaded
        //call the load list function
        //check to see if the two lists are equal
    }

    @Test
    void loadMultipleLists(){
        //create a new array list of lists
        //fill the array list of lists with the lists being loaded in
        //call the load multiple lists function
        //check to see if they both contain the same amount of lists and items
    }

    @Test
    void saveAll(){
        //create a new array list of lists
        //create lists with items and add them to the array list
        //call the save all method
        //check to see if a new file has been created and the prior lists are stored in it
    }

    @Test
    void saveOneList(){
        //create a new list
        //create items and fill the list
        //call the save one list method
        //check to see if a new file has been created and the prior list is stored in it
    }


}
