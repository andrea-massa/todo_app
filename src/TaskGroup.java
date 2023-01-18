
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrea
 */
public class TaskGroup extends Category{
    private ArrayList <Task> taskList;
    
    
    //CONSTRUCTOR
    /**
     * Construct a TaskGroup Object which contains an arrayList of Tasks.
     * Parameters taken both originally belong to the Category Abstract class.
     * @param categoryName The name that the user wishes to call the taskGroup, to what category can the tasks be classified under.
     * @param categoryDescription A description of that category.
     */
    public TaskGroup(String categoryName, String categoryDescription){       
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.taskList = new ArrayList<Task>();    
    }

    
    //GETTERS AND SETTERS  
    /**
     * Getter for the taskList arrayList component of the TaskGroup class.
     * @return taskList. The arrayList containing the task of this TaskGroup.
     */
    public ArrayList getTaskList() {
        return taskList;
    }

    /**
     * Setter for the taskList arrayList component of the TaskGroup class.
     * @param taskList The arrayList containing the task of this TaskGroup.
     */
    public void setTaskList(ArrayList taskList) {
        this.taskList = taskList;
    }   
    
    /**
     * Getter for the task, used to get a task within an TaskList from outside the TaskGroup class
     * @param index The location integer of the task component in the taskList
     * @return Task. The task present in the taskList at the index given by the user.
     */
    public Task getTask(int index){
        return this.taskList.get(index);        
    }
    
    /**
     * Allows user to get a task in TaskGRoup by name
     * @param taskName The name of the task the user is looking for
     * @return The task that corresponds to that taskName
     */
    public Task getTaskByName(String taskName){
        for (int i = 0; i < this.taskList.size(); i++)
            if(this.taskList.get(i).getTaskName().equals(taskName)){
                return taskList.get(i);
            }
            else{                
            }
        return null;
    }
    
    
    //FUNCTION METHODS
    /**
     * This method creates a new task into the TaskList, it will be called after
     * prompting the user with a new task and a new task is constructed. 
     * @param newTask The task that will be added to the the TaskList arrayList
     */
    public void addTask(Task newTask){
        this.taskList.add(newTask);
    }
    
    //this method will later be throwing an exception if the task is not found
    /**
     * This method will be called when the user decides to totally remove a task
     * from the Task Group's taskList. Program searches for the task by taskName 
     * given by the user. If found removes the task from the arrayList
     * @param taskName The taskName given by the user for search
     */
    public void removeTask(String taskName){        
        for(int i = 0; i < this.taskList.size(); i++){
            if(taskName.equals(this.taskList.get(i).getTaskName())){
                this.taskList.remove(i);                
            }
            else{                
            }           
        }                
    }
    
    //this method will later be throwing an exception if the task is not found
    /**
     * This method will be called when the user wishes to change the name of a task
     * it sorts through the arrayList in order to find the task by the user inserted
     * name and then changes it the the second parameter (the new task name).
     * @param taskName The taskName of the Task that the user wishes to change the name to
     * @param newTaskName  The new taskName that the user wishes to call the task
     */
    public void editTaskName(String taskName, String newTaskName){
        for(int i = 0; i < this.taskList.size(); i++){
            if(taskName.equals(this.taskList.get(i).getTaskName())){
                this.taskList.get(i).setTaskName(newTaskName);                
            }
            else{                
            }           
        }                       
    }
    
    //this method will later be throwing an exception if the task is not found
    /**
     * Similarly to TaskName this method will be called when the user wishes to 
     * change the description of a task, it uses the taskName parameter to sort
     * throughout the TaskGroup's TaskList in order to find it and changes the 
     * task's description compontent of that Task to the parameter newTaskDescription
     * given by the user
     * @param taskName The taskName of the Task user wishes to change the description of
     * @param newTaskDescription  The new description of the Task
     */
    public void editTaskDescription(String taskName, String newTaskDescription){
        for(int i = 0; i < this.taskList.size(); i++){
            if(taskName.equals(this.taskList.get(i).getTaskName())){
                this.taskList.get(i).setTaskDescription(newTaskDescription);                
            }
            else{                
            }           
        }     
    }            
      
    //this method will later be throwing an exception if the task is not found
    /**
     * This method will be called when the user is done with a task and wishes to
     * mark it as complete. It is important to keep in mind that it differs completely
     * from the method removeTask because it does not remove the task from the arrayList,
     * the task will still be there but it will be marked as completed by changing
     * internal components of the object.
     * @param taskName The name of the task the user wishes to mark as complete.
     */
    public void markTaskComplete(String taskName){
        for(int i = 0; i < this.taskList.size(); i++){
            if(taskName.equals(this.taskList.get(i).getTaskName())){
                this.taskList.get(i).setIsComplete(true);                
            }
            else{                
            }           
        }     
    }
       
    /**
     * This method allows the user to sort the task in the task group by the most
     * important (ex. priority = 10) to the least important (ex priority = 1). Prior
     * to the user taking advantage of this method the task would simply be in the order
     * in which they were added to the tasklist.
     */
    public void sortTaskByPriority(){
        Collections.sort(taskList, new Comparator<Task>()
        {
          @Override
          public int compare(Task t1, Task t2){
              return Integer.valueOf(t1.getTaskPriority()).compareTo(t2.getTaskPriority());              
          }  
        });                                    
    }            
    
    /**
     * Prints all tasks
     * @return String containing to Strings for all taks
     */
    public String printTask(){
        String tasks = ("");
        for(int i = 0; i < this.taskList.size(); i++)
        {
            if(this.taskList.get(i).isIsComplete()){
                tasks = tasks + this.taskList.get(i).toString() + "\t[x] " + "\n\n";
            }                        
            else{
                tasks = tasks + this.taskList.get(i).toString() + "\t[ ] " + "\n\n";
            }
        }
        return tasks;
    }
    
    /**
     * This method returns a String version of the TaskGroup object
     * @return toString. String component of the Task Group
     */
    @Override
    public String toString(){
       String s = ("Category: " + this.categoryName + "\tDescription: " + this.categoryDescription);
        return s;
    }
    
       
    
}
