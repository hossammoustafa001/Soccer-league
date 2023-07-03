/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epl;

import java.util.Scanner;

/**
 *
 * @author Andrew Magdy
 */
public class League {

    private final String start_date = "25/12/2020";
    private final String end_date = "25/9/2021";

    public String getStart_date() {
        return start_date;
    }

    public String getEnd_date() {
        return end_date;

    }

    public League() {

    }

    public void ShowTeams() {
        for (int i = 0; i < dataBase.db_teams.size(); i++) {
            System.out.println(dataBase.db_teams.get(i).getT_name());
        }

    }

    public void ShowStaduims() {
        for (int i = 0; i < dataBase.db_Staduim.size(); i++) {
            System.out.println("Staduim Name " + dataBase.db_Staduim.get(i).getName());
            System.out.println("location: " + dataBase.db_Staduim.get(i).getLocation() + "  Capacity:     " + dataBase.db_Staduim.get(i).getSeat_capacity());
            System.out.println("-------------------------------------------------------");

        }

    }
    public void SpecificStaduim()
    {
        
        System.out.println("Enter the Staduim's Name you want to show:");
        Scanner in1 = new Scanner(System.in);
        String sName = in1.nextLine();
        boolean found=false;
        for (int i = 0; i < dataBase.db_Staduim.size(); i++) {
            
        if(dataBase.db_Staduim.get(i).getName().equals(sName))
        {
            found=true;
            System.out.println("Staduim Name " + dataBase.db_Staduim.get(i).getName());
            System.out.println("location: " + dataBase.db_Staduim.get(i).getLocation() + "  Capacity:     " + dataBase.db_Staduim.get(i).getSeat_capacity());
            System.out.println("-------------------------------------------------------");
        }
        }
        if (found == false) 
        {
            System.out.println("not found");
        }
    }

    public void ShowReferees() {
        for (int i = 0; i < dataBase.db_Refree.size(); i++) {
            System.out.println(dataBase.db_Refree.get(i).getName() + "   Height:  " + dataBase.db_Refree.get(i).getHeight() + "   Weight:     " + dataBase.db_Refree.get(i).getWeight());
        }
    }
    
    public void SpecificReferee()
    {
        
        System.out.println("Enter the Referee's Name you want to show:");
        Scanner in1 = new Scanner(System.in);
        String rName = in1.nextLine();
        boolean found=false;
        for (int i = 0; i < dataBase.db_Refree.size(); i++) {
            if(dataBase.db_Refree.get(i).getName().equals(rName))
            {
               found=true;
                System.out.println(dataBase.db_Refree.get(i).getName() + "   Height:  " + dataBase.db_Refree.get(i).getHeight() + "   Weight:     " + dataBase.db_Refree.get(i).getWeight());
            }
        }
        if (found == false) {
            System.out.println("not found");
        }
            
    }

    public void ShowMatches() {

        for (int i = 0; i < dataBase.db_matches.size(); i++) {
            System.out.println(dataBase.db_matches.get(i).getMatchNumber() + "    " + dataBase.db_matches.get(i).getTeam1() + "   vs   " + dataBase.db_matches.get(i).getTeam2());
            System.out.println("    Date:    " + dataBase.db_matches.get(i).getDate() + "     Time : " + dataBase.db_matches.get(i).getTime());
            System.out.println("   in Staduim :    " + dataBase.db_matches.get(i).getMatch_stadium() + "   Referee :   " + dataBase.db_matches.get(i).getRefree());
            System.out.println("----------------------------------------------------------");
        }
    }
    
    public void SpecificMatch()
    {
        
        System.out.println("Enter the Match Number you want to show:");
        Scanner in1 = new Scanner(System.in);
        int mName = in1.nextInt();
        boolean found=false;
        for (int i = 0; i < dataBase.db_matches.size(); i++) {
            if(dataBase.db_matches.get(i).getMatchNumber()==mName)
            {
                found=true;
            System.out.println(dataBase.db_matches.get(i).getMatchNumber() + "    " + dataBase.db_matches.get(i).getTeam1() + "   vs   " + dataBase.db_matches.get(i).getTeam2());
            System.out.println("    Date:    " + dataBase.db_matches.get(i).getDate() + "     Time : " + dataBase.db_matches.get(i).getTime());
            System.out.println("   in Staduim :    " + dataBase.db_matches.get(i).getMatch_stadium() + "   Referee :   " + dataBase.db_matches.get(i).getRefree());
            System.out.println("----------------------------------------------------------");
            }
        }
        if (found == false) {
            System.out.println("not found");
        }
    }

    public void ShowPlayers() {

        for (int i = 0; i < dataBase.db_Players.size(); i++) {
            System.out.println("Name: " + dataBase.db_Players.get(i).getName() + "  Position:" + dataBase.db_Players.get(i).getP_position());
            System.out.println(" Height: " + dataBase.db_Players.get(i).getHeight() + " || " + "Weight:" + dataBase.db_Players.get(i).getWeight() + "|| " + "Team Name:" + dataBase.db_Players.get(i).getTeamName());
            System.out.println("-------------------------------------------");
        }
    }
    
    public void SpecificPlayer()
    {
        System.out.println("Enter the Player's Name you want to show:");
        Scanner in1 = new Scanner(System.in);
        String pName = in1.nextLine();
        boolean found=false;
        for (int i = 0; i < dataBase.db_Players.size(); i++) {
            if(dataBase.db_Players.get(i).getName().equals(pName))
            {
                found=true;
            System.out.println("Name: " + dataBase.db_Players.get(i).getName() + "  Position:" + dataBase.db_Players.get(i).getP_position());
            System.out.println(" Height: " + dataBase.db_Players.get(i).getHeight() + " || " + "Weight:" + dataBase.db_Players.get(i).getWeight() + "|| " + "Team Name:" + dataBase.db_Players.get(i).getTeamName());
            System.out.println("-------------------------------------------");
            }
        }
        if (found == false) {
            System.out.println("not found");
        }
    }

    public void ShowSpecificTeam() {
        System.out.println("Enter the Team's Name you want to show:");
        Scanner in1 = new Scanner(System.in);
        String tName = in1.nextLine();
        boolean found = false;
        for (int i = 0; i < dataBase.db_Players.size(); i++) {
            found = true;
            if (dataBase.db_Players.get(i).getTeamName().equals(tName)) {
                System.out.println("Name: " + dataBase.db_Players.get(i).getName() + "  Position:" + dataBase.db_Players.get(i).getP_position());
                System.out.println(" Height: " + dataBase.db_Players.get(i).getHeight() + " || " + "Weight:" + dataBase.db_Players.get(i).getWeight() + "|| " + "Team Name:" + dataBase.db_Players.get(i).getTeamName());
                System.out.println("-------------------------------------------");
            }
        }
        if (found == false) {
            System.out.println("not found");
        }
    }

        

}
