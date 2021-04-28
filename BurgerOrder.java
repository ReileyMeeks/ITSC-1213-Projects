/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author ReileyMeeks
 */
class BurgerOrder {

    private int orderNum = 1;
    private int numSodas;
    private int numVeggieburgers = 0;
    private int numCheeseburgers = 0;
    private int numHamburgers = 0;

    private boolean isOrderTogo = false;

    public BurgerOrder(int _numSodas, int _numVeggieburgers, int _numCheeseburgers,
            int _numHamburgers, int _orderNum, boolean _isOrderTogo) {
        this.numSodas = _numSodas;
        this.numVeggieburgers = _numVeggieburgers;
        this.numCheeseburgers = _numCheeseburgers;
        this.numHamburgers = _numHamburgers;
        this.orderNum = _orderNum;
        this.isOrderTogo = _isOrderTogo;

    }

    /**
     * Get the value of orderNum
     *
     * @return the value of orderNum
     */
    public int getOrderNum() {
        return orderNum;
    }

    /**
     * Set the value of orderNum
     *
     * @param orderNum new value of orderNum
     */
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * Get the value of isOrderTogo
     *
     * @return the value of isOrderTogo
     */
    public boolean isIsOrderTogo() {
        return isOrderTogo;
    }

    /**
     * Set the value of isOrderTogo
     *
     * @param isOrderTogo new value of isOrderTogo
     */
    public void setIsOrderTogo(boolean isOrderTogo) {
        this.isOrderTogo = isOrderTogo;
    }

    /**
     * Get the value of numSodas
     *
     * @return the value of numSodas
     */
    public int getNumSodas() {
        return numSodas;
    }

    /**
     * Set the value of numSodas
     *
     * @param numSodas new value of numSodas
     */
    public void setNumSodas(int numSodas) {
        if (numSodas >= 0) {
            this.numSodas = numSodas;
        } else if (numSodas < 0) {
            System.out.println("Error");
        }
    }

    /**
     * Get the value of numVeggieburgers
     *
     * @return the value of numVeggieburgers
     */
    public int getNumVeggieburgers() {
        return numVeggieburgers;
    }

    /**
     * Set the value of numVeggieburgers
     *
     * @param numVeggieburgers new value of numVeggieburgers
     */
    public void setNumVeggieburgers(int numVeggieburgers) {
        if (numVeggieburgers >= 0) {
            this.numVeggieburgers = numVeggieburgers;
        } else if (numVeggieburgers < 0) {
            System.out.println("Error");
        }
    }

    /**
     * Get the value of numCheeseburgers
     *
     * @return the value of numCheeseburgers
     */
    public int getNumCheeseburgers() {
        return numCheeseburgers;
    }

    /**
     * Set the value of numCheeseburgers
     *
     * @param numCheeseburgers new value of numCheeseburgers
     */
    public void setNumCheeseburgers(int numCheeseburgers) {
        if (numCheeseburgers >= 0) {
            this.numCheeseburgers = numCheeseburgers;
        } else if (numCheeseburgers < 0) {
            System.out.println("Error");
        }
    }

    /**
     * Get the value of numHamburgers
     *
     * @return the value of numHamburgers
     */
    public int getNumHamburgers() {
        return numHamburgers;
    }

    /**
     * Set the value of numHamburgers
     *
     * @param numHamburgers new value of numHamburgers
     */
    public void setNumHamburgers(int numHamburgers) {
        if (numHamburgers >= 0) {
            this.numHamburgers = numHamburgers;
        } else if (numHamburgers < 0) {
            System.out.println("Error");
        }
    }

    @Override
    public String toString() {
        return "BurgerOrder{" + "orderNum=" + orderNum + ", numSodas=" + numSodas
                + ", numVeggieburgers=" + numVeggieburgers + ", numCheeseburgers=" + numCheeseburgers
                + ", numHamburgers=" + numHamburgers + ", isOrderTogo=" + isOrderTogo + '}';
    }

}
