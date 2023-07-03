/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epl;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andrew Magdy
 */
public class Team {

    private String T_name;

    public String getT_name() {
        return T_name;
    }

    public void setT_name(String T_name) {
        this.T_name = T_name;
    }

    public Team() {

    }

    public Team(String name) {
        T_name = name;
    }

    public void CreateTeam() {
        System.out.println("What is your team's name?");
        Scanner s = new Scanner(System.in);
        String teamname = s.nextLine();
        boolean found=false;
         Team t=new Team(); 
        for(int i=0;i<dataBase.db_teams.size();i++)
        {
            if(dataBase.db_teams.get(i).T_name.equals(teamname))
            {
                found=true;
            }
        }
        if(found==false)
        {
             t.setT_name(teamname);
               System.out.println("Add your Players please:");
        System.out.println("Enter name,position,hieght,wieght");
        for (int i = 0; i < 5; i++) {
            int x=i+1;
                System.out.println("Player no "+ x);
            Scanner in = new Scanner(System.in);

            String pname = in.nextLine();
            String Pposition = in.nextLine();
            Float phieght = in.nextFloat();
            Float Pwieght = in.nextFloat();
            Player p = new Player(pname, Pposition, phieght, Pwieght, teamname);
            dataBase.db_Players.add(p);
            
        }
           dataBase.db_teams.add(t);
           System.out.println("Team is added");
        }
        else if(found==true)
        {
            System.out.println("Team is already in the system");
        }
      
        
  }

    public void RemoveTeam() {
        System.out.println("Enter the name of the team you want to remove:");
        Scanner in = new Scanner(System.in);
        String teamname = in.nextLine();
        boolean foundnRemoved = false;
        for (int i = 0; i < dataBase.db_teams.size(); i++) {
            if (dataBase.db_teams.get(i).T_name.equals(teamname)) {
                dataBase.db_teams.remove(dataBase.db_teams.get(i));
                foundnRemoved = true;
            }

        }
        if (foundnRemoved) {
            System.out.println("Team has been Removed");
        } else {
            System.out.println("Team has been Removed before or doesn't exists");
        }
    }

    public void EditTeam() {
        System.out.println("Enter the Team Name you want to edit:");
        Scanner in1 = new Scanner(System.in);
        String name = in1.nextLine();
        boolean found = false;
        boolean found1=false;
        for (int i = 0; i < dataBase.db_teams.size(); i++) {
            if (dataBase.db_teams.get(i).T_name.equals(name)) {
                found = true;
                System.out.println("Enter the new Team Name:");
                String newName = in1.nextLine();
                dataBase.db_teams.get(i).setT_name(newName);
                for (int j = 0; j < dataBase.db_Players.size(); j++) {
                    
                    if (dataBase.db_Players.get(j).getTeamName().equals(name)) {
                        found1=true;
                        
                        dataBase.db_Players.get(j).setTeamName(newName);
                    }
                }

            }
        }

        if (found == false) {
            System.out.println("Team is not found");
        
        }
        if(found1==false)
        {
            System.out.println("players not changed");
        }

    }
}
