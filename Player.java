/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ReileyMeeks
 */
public class Player implements Comparable<Player>{
    //Fields
    private String name;
    private int age;
    private int jerseyNumber;
    private Position position;
    
    //Constructor
    Player(String name, int age, int number, Position position){
        this.name = name;
        this.age = age;
        this.jerseyNumber = number;
        this.position = position;
    }

    //Getters/Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    
    /*toString
    "   " tab between outputs
    */

    @Override
    public String toString() {
        return '\n' + name + "    " +
                age + "    " +
                jerseyNumber + "    "  +
                position;
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Player o) {
        if(this.position != o.position){
            return -1;
        } else if(this.jerseyNumber != o.jerseyNumber){
            return -1;
        } else {
            return 1;
        }
    } 
}
