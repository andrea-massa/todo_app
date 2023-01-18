
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
public class User {    
    private String userName;
    private TaskGroupList taskGroupsList;
    
    
    //CONSTRUCTORS
    /**
     * Constructs a new User object with user defined username parameter
     * @param username. The name of the user
     */
    public User (String username){
        this.userName = username;        
        this.taskGroupsList = new TaskGroupList();
    }
    
    /**
     * Default constructor for User Object
     */
    public User() {
        this.userName = "null";
        this.taskGroupsList = new TaskGroupList();
    }

    
    //GETTERS AND SETTERS
    /**
     * Returns the userName component of the user object.
     * @return userName. The userName component of User object
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Allows the user to set the userName component of the User Object.
     * @param userName. The name of the user
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Returns the taskGroupList component of this User object
     * @return taskGroupList. The list of taskGroups of this User
     */
    public TaskGroupList getTaskGroupList() {
        return taskGroupsList;
    }
    
    /**
     * Allows user to set the taskGroupList component of the User Object
     * @param taskGroupList. The list of taskGroups of this User.
     */
    public void setTaskGroupList(TaskGroupList taskGroupList){
        this.taskGroupsList = taskGroupList;
    }
    
}
