/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrea
 */

//WHAT DOES THIS APPLICATION DO
    /*
        1. Allows user to create new task groups
        2. User is able to modify existing taskgroup or even delete them
        3. Within each task group the user is able to create tasks
        4. User is able to marks tasks as done or delete them if he wishes
        5. User is able to sort the task in order of priority that he himself selected
    */
/*Press the run button and a GUI Should appear,
  the document contained in this submission contains
  instruction on the GUI, how it takes input and how
  it implements the functions mentioned above.
*/


public class TaskManager {
    public static void main(String[] args){       
        User newUser = new User();
        userFrame start = new userFrame(newUser);
        start.setVisible(true);                                                        
    }
}
