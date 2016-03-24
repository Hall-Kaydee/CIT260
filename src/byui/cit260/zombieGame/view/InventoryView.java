/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.control.InventoryControl;
import byui.cit260.zombieGame.exceptions.InventoryException;

/**
 *
 * @author Evanator
 * 
 * To run launch from the Help menu => inventory menu
 */
public class InventoryView extends View {
   
  public InventoryView(){ 
    super("\n"
            + "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
            + "\n+                      Inventory Menu                          +"               
            + "\n+      You collect items in different areas of the map         +"
            + "\n+     Here you can Look at what Items you currently have       +" 
            + "\n+     You can use these items to help you on your journey      +"
            + "\n+   You can also drop these items if you are carrying to much  +"                                        
            + "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
            + "\n+ V - View Your Inventory                                      +"
            + "\n+ U - Use Inventory Item                                       +"
            + "\n+ C - Calculate Inventory Item Weight                          +"
            + "\n+ D - Drop Inventory Item                                      +"
            + "\n+ Q - Quit                                                     +"   
            + "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
    );
  }
    //private boolean promptMessage;

/*    public void displayMenu(){
        
        String selection = " ";
        
        do {
            
            
            
            String input = this.getInput();// get the user selection
            
            
            this.doAction(selection);//do action based on selection
            
          }
        
        while (selection != "Q");//while selection is not exit
        
    }    

*/

   

    
    
  
   
    @Override
    public boolean doAction(String value) {
        
       
    
        // this is the help menu do action function
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value){
            
            case "V"://View inventory items?
                this.viewInventoryItems();
                break;
            
            case "U"://Use inventory item
                this.useInventoryItem();
               break;
               
            case "D"://Drop item
                this.dropInventoryItem();
                break;
                
            case "C"://calculate
                
                try {// Boyd adding this line
                    
                this.calcInventoryItem();
                
                } catch // Boyd adding this line
            
                    (InventoryException me) { // Boyd adding this line
                     System.out.println(me.getMessage()); // Boyd adding this line
         
                    }    // Boyd adding this line        
                        
                break;
 
                
              case "S"://testing the search
                this.searchArea();
                break;
                
                
                
            default:
                
                
            
        }
        return false;
    }

   

    private void viewInventoryItems() {
        System.out.println("\n*** viewInventoryItems()function called");
        
       
     
             String[ ] items = {"gun", "baseball bat", "axe"};
             InventoryControl viewSortedInventory = new InventoryControl();
             
             viewSortedInventory.inventorySort(items);
             
             for ( int i = 0;  i < items.length;  i++ )
                System.out.println( items [ i ] );
      

             
             
             
    }

    private void useInventoryItem() {
        System.out.println("\n*** useInventoryItem()function called");
    }

    private void dropInventoryItem() {
        //System.out.println("\n*** dropInventoryItem called");
        
         DropItemView dropItem = new DropItemView();

                    dropItem.dropInventoryItem(); 
    }

    private void calcInventoryItem() throws InventoryException { // Boyd adding "throws InventoryException" to this line

         InventoryControl calcItem = new InventoryControl();
 
                    calcItem.calcInventoryItem();
                    
                    
                    
    }
    
   private void searchArea() {
        SearchAreaView searchArea = new SearchAreaView();
                searchArea.searchArea();
                  }

        
    }

  

