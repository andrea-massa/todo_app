/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrea
 */
public abstract class Category {
    protected String categoryName;
    protected String categoryDescription;        
    
    /**
     * Returns the name of a category
     * @return categoryName. A string representing a name of a certain category
     */    
    public String getCategoryName(){
        return categoryName;
    }
    
    /**
     * Allows the user to set the category name of a certain category
     * @param categoryName. The name of the category that the user wishes to use
     */
    public void setCategoryName(String categoryName){
        this.categoryName = categoryName;
    }

    /**
     * Returns the description of a category    
     * @return categoryDescription. A string representing the description of a category     
     */
    public String getCategoryDescription() {
        return categoryDescription;
    }

    /**
     * Allows the user to set the category name of a certain category
     * @param categoryDescription. The description of a category the user wishes to use
     */
    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }
        
}
