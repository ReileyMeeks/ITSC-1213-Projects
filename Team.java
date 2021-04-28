
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;


/**
 *
 * @author ReileyMeeks
 */
public class Team {
    private String name;
    private String city;
    private ArrayList<Player> players = new ArrayList<>();
    
    Team (String name, String city){
        this.name = name;
        this.city = city;
    }

    //Name & City Getters/Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    //ArrayList Getter/Methods
    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }
    
    public void sortPlayers(){
        Collections.shuffle(players);
    }
    
    @Override
    public String toString() {
        return name + '\n' +
               city + '\n' +
               "Players" + '\n' +
                players + '\n';
    }
    
    
   
}
