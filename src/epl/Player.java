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
public class Player extends Person {

    private String P_position;

    private String teamName;
    Scanner in = new Scanner(System.in);

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getP_position() {
        return P_position;
    }

    public void setP_position(String P_position) {
        this.P_position = P_position;
    }

    public Player(String name, String position, float height, float weight, String teamname) {

        super(name, height, weight);

        this.P_position = position;

        this.teamName = teamname;
    }

    public Player() {

    }

    @Override
    public void add() {
        Player s = new Player();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Player's name:");
        String pname = in.nextLine();
        s.setName(pname);
        System.out.println("Enter Player's weight:");
        Float pweight = in.nextFloat();
        s.setWeight(pweight);
        System.out.println("Enter Player's height:");
        Float pheight = in.nextFloat();
        s.setHeight(pheight);
        System.out.println("Enter Player's position:");
        Scanner l = new Scanner(System.in);
        String pposition = l.nextLine();
        s.setP_position(pposition);
        System.out.println("Enter Player's team:");
        String pteam = l.nextLine();
        for (int j = 0; j < dataBase.db_teams.size(); j++) {
            if (dataBase.db_teams.get(j).getT_name().equals(pteam)) {
                s.setTeamName(pteam);
            }

            dataBase.db_Players.add(s);
        }
    }

    @Override
    public void remove() {
        boolean found = false;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Player's name to remove");
        String pname = r.nextLine();
        for (int i = 0; i < dataBase.db_Players.size(); i++) {
            if (dataBase.db_Players.get(i).getName().equals(pname)) {
                found = true;
                dataBase.db_Players.remove(dataBase.db_Players.get(i));
            }
        }
        if (found == false) {
            System.out.println("Not Found");
        }
    }

    @Override
    public void edit() {
        boolean found = false;
        Scanner o = new Scanner(System.in);
        System.out.println("Enter Player's name to edit");
        String pname = o.nextLine();
        for (int i = 0; i < dataBase.db_Players.size(); i++) {
            if (dataBase.db_Players.get(i).getName().equals(pname)) {
                found = true;
                System.out.println("Player's details:");
                System.out.println(dataBase.db_Players.get(i).getName() + " " + dataBase.db_Players.get(i).getWeight() + " " + dataBase.db_Players.get(i).getHeight() + " " + dataBase.db_Players.get(i).getP_position() + " " + dataBase.db_Players.get(i).getTeamName());
                System.out.println("select what to edit:" + "  " + "1-Player's name" + " " + "2-Player's weight" + " " + "3-Player's height" + " " + "4-Player's position" + " " + "5-Player's team");
                int choose = o.nextInt();
                switch (choose) {

                    case 1:
                        System.out.println("Enter the new Player's weight");
                        Scanner pf = new Scanner(System.in);
                        float newWeight = pf.nextFloat();
                        dataBase.db_Players.get(i).setWeight(newWeight);
                        break;
                    case 2:
                        System.out.println("Enter the new Player's height:");
                        Scanner pm = new Scanner(System.in);
                        float newheight = pm.nextFloat();
                        dataBase.db_Players.get(i).setHeight(newheight);
                        break;
                    case 3:
                        System.out.println("Enter the new Player's position:");
                        Scanner ps = new Scanner(System.in);
                        String newposition = ps.nextLine();
                        dataBase.db_Players.get(i).setP_position(newposition);
                        break;
                    case 4:
                        System.out.println("Enter the new Player's team:");
                        Scanner pk = new Scanner(System.in);
                        String newteam = pk.nextLine();
                        for (int j = 0; j < dataBase.db_teams.size(); j++) {
                            if (dataBase.db_teams.get(j).getT_name().equals(newteam)) {
                                dataBase.db_Players.get(i).setTeamName(newteam);
                            }
                        }
                        break;
                    default:
                        System.out.print("Invalid choice");
                }
            }

        }

        if (found == false) {
            System.out.println("Not Found");
        }

    }

}
