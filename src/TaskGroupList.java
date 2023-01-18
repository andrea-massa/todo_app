
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrea
 */
public class TaskGroupList {
    private ArrayList <TaskGroup> taskGroupList;
    
    
    //CONSTRUCTOR
    /**
     * Constructs a TaskGroupList object containing an arrayList of taskGroups objects
     */
    public TaskGroupList(){
        this.taskGroupList = new ArrayList <TaskGroup>();
    }

    
    //GETTERS AND SETTERS
    /**
     * Returns an arrayList of taskGroups elements
     * @return taskGroupList. An arrayList of taskGroup objects
     */
    public ArrayList getTaskGroupList() {
        return taskGroupList;
    }

    /**
     * Allows user to set the taskGroupList of elements 
     * @param taskGroupList. An arrayList of taskGroup objects 
     */
    public void setTaskGroupList(ArrayList taskGroupList) {
        this.taskGroupList = taskGroupList;
    }
    
    /**
     * Allows the user to get a taskGroup object withing a taskGroupList arrayList with a given index
     * @param index. The location index where the taskGroup element can be found.
     * @return taskGroup. The taskGroup element at the given index.
     */
    public TaskGroup getTaskGroup(int index){
        return this.taskGroupList.get(index);
    }            
        
    /**
     * Allows the usert to get a taskGroup by knowing its name
     * @param categoryName The name that will be used for search
     * @return the taskGroup that corresponde to that categoryName
     */
    public TaskGroup getTaskGroupByName(String categoryName){
        for(int i = 0; i < this.taskGroupList.size(); i++){
            if(categoryName.equals(this.taskGroupList.get(i).getCategoryName())){
                return this.getTaskGroup(i);                                
            }
            else{                    
            }                 
        }                 
        return null;
    }
    
    
    
    //FUNCTION METHODS
    /**
     * Allows the user to create a new TaskGroup object in the arrayList of taskGroups present in the TaskGroupList Class
     * @param newTaskGroup The taskGroup the the user wishes to add to this TaskGroupList
     */
    public void addTaskGroup(TaskGroup newTaskGroup){
        this.taskGroupList.add(newTaskGroup);
    }
    
    //this method will later be throwing an exception if the task is not found
    /**
     * This method will be called when the user decides to totally remove a taskGroup
     * from the taskGroupList arrayList. Program searches for the taskGroup by categoryName
     * given by the user. If found removes the taskGroup from the arrayList
     * @param categoryName. The categoryName of the taskGroup object the user wishes to delete.
     */
    public void removeTaskGoup(String categoryName){
        for(int i = 0; i < this.taskGroupList.size(); i++){
            if(categoryName.equals(this.taskGroupList.get(i).getCategoryName())){
                this.taskGroupList.remove(i);              
            }
            else{                
            }           
        }                    
    }
    
    //this method will be throwing an exception if the task is not found
    /**
     * This method will be called when the user wishes to change the name of a taskGroup category,
     * it sorts through the arrayList in order to find the taskGroup by the user inserted
     * name and then changes it the the second parameter (the new taskGroup categoryName).
     * @param categoryName. The name of the category belonging to the taskGrop that the user wants to change.
     * @param newCategoryName. The new name of the category that the user wishes to implement.
     */
    public void editTaskGroupName(String categoryName, String newCategoryName){    
         for(int i = 0; i < this.taskGroupList.size(); i++){
            if(categoryName.equals(this.taskGroupList.get(i).getCategoryName())){
                this.taskGroupList.get(i).setCategoryName(newCategoryName);
            }
            else{                                
            }           
        }         
    }
    
    //this method will be throwing an exception if the task is not found
    /**
     * This method will be called when the user wishes to change the name of a taskGroup's categoryDesscription,
     * it sorts through the arrayList in order to find the taskGroup by the user inserted categoryName
     * and then changes that taskGroup's categoryDescriprion to the second parameter given by the user.
     * @param categoryName The category name by which the taskGoup is identified.
     * @param newCategoryDescription. The new categoryDescription that the user wishes to implement.
     */
    public void editTaskGroupDescription(String categoryName, String newCategoryDescription){
        for(int i = 0; i < this.taskGroupList.size(); i++){
            if(categoryName.equals(this.taskGroupList.get(i).getCategoryName())){
                this.taskGroupList.get(i).setCategoryDescription(newCategoryDescription);
            }
            else{                                
            }           
        }      
    }
    
    public String printTaskGroups(){
        String s = "";
        for (int i = 0; i < this.taskGroupList.size(); i++){
            s = s + this.taskGroupList.get(i).toString() + "\n";
        }
        return s;
    }
        
}
