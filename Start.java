
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ReileyMeeks
 */
public class Start {
    public static void main(String[] args){
        //Part A Text
        /*Player p1 = new Player("Miles Bridges", 21, 0, Position.FORWARD);
        Player p2 = new Player("Nicholas Batum", 24, 5, Position.FORWARD);
        Player p3 = new Player("Malik Monk", 21, 1, Position.GUARD);
        System.out.println(p1.compareTo(p2));
        System.out.println(p1.compareTo(p3));
        System.out.println(p2.compareTo(p3));*/
        
        //Part B Text
        /*Player p1 = new Player("Miles Bridges", 21, 0, Position.FORWARD);
        Player p2 = new Player("Nicholas Batum", 24, 5, Position.FORWARD);
        Player p3 = new Player("Malik Monk", 21, 1, Position.GUARD);
        Team team = new Team("Hornets", "Charlotte");
        team.addPlayer(p3);
        team.addPlayer(p1);
        team.addPlayer(p2);
        System.out.println(team);
        System.out.println("Sorting the players\n");
        team.sortPlayers();
        System.out.println(team);*/
       
       //Part C & D
       String inputFileName = "team.txt"; 
       Team team = loadTeamFromFile(inputFileName); 
       if(team != null){             
           System.out.println(team); 
           team.sortPlayers(); 
           String outputFileName = "sortedteam.txt"; 
           writeTeamToFile(team, outputFileName);
           
       } 
        
    }
    
    public static Team loadTeamFromFile(String fileName){
        //File, Scanner, team vars, and new team
        File inputFile = new File(fileName);
        Scanner input = null;
        String teamName = null;
        String city = null;
        Team newTeam = new Team(null, null);
        
        //Create team and player
        try {
            input = new Scanner(inputFile);
            
            teamName = input.nextLine();
            city = input.nextLine();
            
            newTeam.setName(teamName);
            newTeam.setCity(city);
            
            while(input.hasNext()){
                String line = input.nextLine();
                String playerData[] = line.split("\\t");
                int age = Integer.parseInt(playerData[1]);
                int jersNum = Integer.parseInt(playerData[2]);
                Position ps = (Position.valueOf(playerData[3]));
                
                Player player = new Player(playerData[0], age, jersNum, ps);
                newTeam.addPlayer(player);
                 
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        }
        input.close();
        return newTeam;
    }
    
    public static void writeTeamToFile(Team team, String fileName){
        //File and printwriter 
        FileOutputStream fileByteStream = null;
        PrintWriter output = null;

        //Write team and player objects to file
        try {
            fileByteStream = new FileOutputStream(fileName);
            output = new PrintWriter(fileByteStream);

            output.println(team.getName());
            output.println(team.getCity());
            output.println(team.getPlayers());
            
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        }
        output.close();
    }
    
}
