/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrea
 */
public class Task {
    private String taskName;
    private String taskDescription;           
    private int taskPriority;
    private boolean isComplete;
    private String dueDate;

    
    //CONSTRUCTOR
    /**
     * Constructs a task object with user defined parameters. The isComplete property of the task is set as false by the constructor automatically
     * @param taskName The name of the task
     * @param taskDescription A description of the task
     * @param taskPriority An integer on a scale from 1 to 10 determining the priority of the task
     * @param dueDate The date by which the task must be completed
     */
    public Task(String taskName, String taskDescription, int taskPriority, String dueDate) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskPriority = taskPriority;
        this.dueDate = dueDate;
        this.isComplete = false;
    }

    
    //GETTERS AND SETTERS
    /**
     * Returns the name of a task 
     * @return taskName. The name of the task
     */
    public String getTaskName() {
        return taskName;
    }
    
    /**
     * Allows the user to set the name of a task
     * @param taskName The name of a task     
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * Returns the String description of a task
     * @return taskDescription. The description of the task
     */
    public String getTaskDescription() {
        return taskDescription;
    }
    
    /**
     * Allows the user to set a description to the task
     * @param taskDescription. A description of the task
     */
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    
    /**
     * Returns an integer representing the magnitude of task priority on a scale from 1 to 10
     * @return taskPriority. The priority of the task.
     */
    public int getTaskPriority() {
        return taskPriority;
    }
  
    /**
     * Allows the user to set a taskPriority on a scale from one to ten
     * @param taskPriority. How important the task is on a scale from one to ten.
     */
    public void setTaskPriority(int taskPriority) {        
        this.taskPriority = taskPriority;
    }

    /**
     * Returns true if the task was marked as complete, false if it was not
     * @return isComplete. A boolean that is marked true only if the user marked the current task as complete.
     */    
    public boolean isIsComplete() {
        return isComplete;
    }

    /**
     * Allows the user to set the isComplete variable to true or false only
     * @param isComplete. A boolean that is marked true only if the user marked the current task as complete.
     */
    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    /**
     * Returns the due date of a task in string format
     * @return dueDate. String containing the due date of a task
     */
    public String getDueDate() {
        return dueDate;
    }
    
    /**
     * Allows the user to set the due date of the current task
     * @param dueDate. String containing the due date of a task
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    
    /**
     * Return a String version of the task
     * @return string version of task
     */
    @Override
    public String toString(){              
       String ts = ("Title: " + taskName + "\t" + "Description: " + taskDescription + "\t" + "Due date: " + dueDate + "\t" + "Priority: " + taskPriority);
       return ts;
    }
    
    
    
    
            
}
