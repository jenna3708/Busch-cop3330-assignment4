/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Jenna Busch
 */

package ucf.assignments.assignment40;

import java.util.Date;

public class item {
    private String description;
    private Date date;
    private boolean complete;

    public item(){
        //initialize the items values
    }

    //getters
    //this will return the description provided
    public String getDescription(){
        return description;
    }
    //this will return the date provided
    public Date getDate(){
        return date;
    }
    //this will return a true or false value to say if the item is complete or not
    public boolean isComplete(){
        return complete;
    }

    //setters
    //this will set the description to what is provided
    public void setDescription(String description){
        this.description = description;
    }
    //this will set the date to the Due Date provided
    public void setDate(Date date)
    {
        this.date = date;
    }
    //this will set the boolean complete based off of the clicks
    public void setComplete(boolean complete)
    {
        this.complete = complete;
    }


}
