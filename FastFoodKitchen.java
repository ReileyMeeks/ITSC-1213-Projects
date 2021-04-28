/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;

/**
 *
 * @author ReileyMeeks
 */
public class FastFoodKitchen {
    private ArrayList<BurgerOrder> orderList = new ArrayList<BurgerOrder>();
    
    private static int nextOrderNum;

    /**
     * Get the value of nextOrderNum
     *
     * @return the value of nextOrderNum
     */
    public static int getNextOrderNum() {
        return nextOrderNum;
    }
    
    private static void incrementNextOrderNum(){
        nextOrderNum++;
    }
    
    public FastFoodKitchen() {
        orderList.add(new BurgerOrder(3, 5, 4, 10, getNextOrderNum(), false));
        incrementNextOrderNum();
        
        orderList.add(new BurgerOrder(0, 2, 4, 9, getNextOrderNum(), true));
        incrementNextOrderNum();
        
        orderList.add(new BurgerOrder(1, 2, 3, 4, getNextOrderNum(), false));
        incrementNextOrderNum();
    }
    
    /**
     * 
     * @param ham
     * @param cheese
     * @param veggie
     * @param soda
     * @param TOGO
     * @return 
     */
    public int addOrder(int ham, int cheese, int veggie, int soda, boolean TOGO){
        BurgerOrder order = new BurgerOrder(soda, veggie, cheese, ham, nextOrderNum, TOGO);
        orderList.add(order);
        incrementNextOrderNum();
        return getNextOrderNum();
    }
    
    /**
     * 
     * @param orderID
     * @return 
     */
    public boolean isOrderDone(int orderID){
        if(orderList.contains(orderID)){
            return false;
        } else {
            return true;
        }
    }
    
    /**
     * 
     * @param order 
     */
    private void orderCallOut(BurgerOrder order){
        System.out.println(order.getNumHamburgers() + " Hamburgers");
        System.out.println(order.getNumCheeseburgers() + " Cheese Burgers");
        System.out.println(order.getNumVeggieburgers() + " Veg Burgers");
        System.out.println(order.getNumSodas() + " Sodas");
    }
    
    /**
     * 
     * @param orderID 
     */
    private void completeSpecificOrder(int orderID){
        for(int i = 0; i < orderList.size(); i++){
            if((orderID) == orderList.get(i).getOrderNum()){
                System.out.println("Order " + orderList.get(i).getOrderNum() + " is complete.");
                
                if(orderList.get(i).isIsOrderTogo()){
                    orderCallOut(orderList.get(i));
                }
                orderList.remove(i);
            }
        }
    }
    
    /**
     * 
     */
    private void completeNextOrder(){
        for(int i = 0; i < orderList.size(); i++){
            if(orderList.get(0) == orderList.get(i)){
                System.out.println("Order " + orderList.get(i) + " is complete.");
                
                if(orderList.get(i).isIsOrderTogo()){
                    orderCallOut(orderList.get(i));
                }
                orderList.remove(i);
            }
        }
    }
    
    /**
     * 
     * @return 
     */
    public int getNumOrdersPending(){
        int i = orderList.size();
        
        return i;
    }
    
    /**
     * 
     */
    public void simulateKitchenActivity(){
        if(orderList.size() == 0) return;
        
        int num = (int)(Math.random()*100);
        if(num < 90){
            completeNextOrder();
        } else {
            int size = orderList.size();
            int id = (int)(Math.random()*size);
            completeSpecificOrder(id);
        }
    }
    
    public boolean cancelOrder(int orderID){
        boolean cancel = false;
        for(int i = 0; i < orderList.size(); i++){
            if((orderID - 1) == orderList.get(i).getOrderNum()){   
                orderList.remove(i);
                cancel = true;
            }
        } 
        return cancel;
    }

    @Override
    public String toString() {
        return "FastFoodKitchen{" + "orderList=" + orderList + '}';
    }
    
}
