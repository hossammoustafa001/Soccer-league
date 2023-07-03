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
public class menu {

    League lmenu = new League();
    Staduim smenu = new Staduim();
    Team tmenu = new Team();
    Player pmenu = new Player();
    Refree rmenu = new Refree();
    Match mmenu = new Match();
    admin amenu = new admin();

    pu
        System.out.println("\t\t\t\t\tEgyptian league managment system");
        System.out.blic void displaymenu() {

        System.out.println("\t\t\t\t\tEgyptian league managment system");
        System.out.println("Starting Date:  "+lmenu.getStart_date()+"           "+"Ending Date:  "+lmenu.getEnd_date());  
        System.out.println("1-Add\n2-Edit\n3-Remove\n4-Egyptian league details\nEnter your choice:");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice) {
            case 1:

                System.out.println("choose what to add\n 1-Team\n 2-player\n 3-match\n 4-stadium\n 5-refree\n Enter your choice:");
                Scanner f = new Scanner(System.in);
                int choose = f.nextInt();
                switch (choose) {
                    case 1:
                        tmenu.CreateTeam();
                        break;
                    case 2:
                        pmenu.add();
                        break;
                    case 3:
                        mmenu.addMatch();
                        break;
                    case 4:
                        smenu.addStaduim();
                        break;
                    case 5:
                        rmenu.add();
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                break;
            case 2:

                System.out.println("choose what to edit\n 1-Team\n 2-player\n 3-match\n 4-stadium\n 5-refree\n Enter your choice:");
                Scanner ok = new Scanner(System.in);
                int cin = ok.nextInt();
                switch (cin) {
                    case 1:
                        tmenu.EditTeam();
                        break;
                    case 2:
                        pmenu.edit();
                        break;
                    case 3:
                        mmenu.editMatch();
                        break;
                    case 4:
                        smenu.editStaduim();
                        break;
                    case 5:
                        rmenu.edit();
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                break;
            case 3:

                System.out.println("choose what to remove\n 1-Team\n 2-player\n 3-match\n 4-stadium\n 5-refree\n Enter your choice:");
                Scanner lo = new Scanner(System.in);
                int input = lo.nextInt();
                switch (input) {
                    case 1:
                        tmenu.RemoveTeam();
                        break;
                    case 2:
                        pmenu.remove();
                        break;
                    case 3:
                        mmenu.removeMatch();
                        break;
                    case 4:
                        smenu.removeStaduim();
                        break;
                    case 5:
                        rmenu.remove();
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                break;
            case 4:
                System.out.println("choose what to show\n 1-Team\n 2-player\n 3-match\n 4-stadium\n 5-refree\n Enter your choice:");
                Scanner lo1 = new Scanner(System.in);
                int t = lo1.nextInt();
                switch (t) {
                    case 1:
                        System.out.println("do you want to show the League teams or Specific team?1-teams   2-Specific team");
                        Scanner z1 = new Scanner(System.in);
                        int h = z1.nextInt();
                        switch (h) {
                            case 1:
                                lmenu.ShowTeams();
                                break;
                            case 2:
                                lmenu.ShowSpecificTeam();
                                break;
                            default:
                                System.out.println("Invalid Input");
                        }
                        break;
                    case 2:

                        System.out.println("do you want to show the League players or Specific player?1-players   2-Specific player");
                        Scanner z2 = new Scanner(System.in);
                        int j = z2.nextInt();
                        switch (j) {
                            case 1:
                                lmenu.ShowPlayers();
                                break;
                            case 2:
                                lmenu.SpecificPlayer();
                                break;
                            default:
                                System.out.println("Invalid Input");
                        }

                        break;
                    case 3:
                        System.out.println("do you want to show the League matches or Specific match?1-matches   2-Specific match");
                        Scanner z3 = new Scanner(System.in);
                        int k = z3.nextInt();
                        switch (k) {
                            case 1:
                                lmenu.ShowMatches();
                                break;
                            case 2:
                                lmenu.SpecificMatch();
                                break;
                            default:
                                System.out.println("Invalid Input");
                        }
                        break;
                    case 4:
                        System.out.println("do you want to show the League stadiums or Specific stadiumr?1-stadiums   2-Specific stadium");
                        Scanner z4 = new Scanner(System.in);
                        int l = z4.nextInt();
                        switch (l) {
                            case 1:
                                lmenu.ShowStaduims();
                                break;
                            case 2:
                                lmenu.SpecificStaduim();
                                break;
                            default:
                                System.out.println("Invalid Input");
                        }
                        break;
                    case 5:
                        System.out.println("do you want to show the League referees or Specific referee?1-Referees   2-Specific referee");
                        Scanner z5 = new Scanner(System.in);
                        int o = z5.nextInt();
                        switch (o) {
                            case 1:
                                lmenu.ShowReferees();
                                break;
                            case 2:
                                lmenu.SpecificReferee();
                                break;
                            default:
                                System.out.println("Invalid Input");
                        }
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

}
