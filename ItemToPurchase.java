/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcartprinter;

/**
 *
 * @author ReileyMeeks
 */
public class ItemToPurchase {
    private String itemName = "none";
    private int itemPrice = 0;
    private int itemQuantity = 0;
    
    ItemToPurchase(){
        
    }
    //Getters
    public String getItemName(){
        return itemName;
    }
    
    public int getItemPrice(){
        return itemPrice;
    }
    
    public int getItemQuantity(){
        return itemQuantity;
    }
    
    //Setters
    public void setItemName(String myItem){
        this.itemName = myItem;
    }
    
    public void setItemPrice(int price){
        this.itemPrice = price;
    }
    
    public void setItemQuantity(int numItems){
        this.itemQuantity = numItems;
    }
}
