package ucf.assignments.assignment40;


import java.util.ArrayList;
import java.util.Date;

public class list {
    private String title;
    private ArrayList<item> items;

    //this will return the title of our ToDoList
    public String getTitle(){
        return title;
    }

    //this sets our title to equal the title
    public void setTitle(String title){
        this.title = title;
    }

    //this will add an item to our ToDoList
    public void addItem(String description, Date date, boolean complete){
        //create a new item
        //initialize the new item with the info required
        //add the item to the array list of items
    }

    //this will delete an item from our ToDoList
    public void deleteItem(item item, ArrayList items){
        //take in the array list and the specified item
        //search through the array list for the item
        //delete the item
        //move the array list down
    }
}
