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
public class Match {

    private String time;
    private String date;
    private String match_stadium;
    private String refree;
    private String team1, team2;
    private int matchNumber;

    public int getMatchNumber() {
        return matchNumber;
    }

    public void setMatchNumber(int matchNumber) {
        this.matchNumber = matchNumber;
    }

    public String getRefree() {
        return refree;
    }

    public void setRefree(String refree) {
        this.refree = refree;
    }

    public String getMatch_stadium() {
        return match_stadium;
    }

    public void setMatch_stadium(String match_stadium) {
        this.match_stadium = match_stadium;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Match(String time, String date, String match_stadium, String team1, String team2, String refree,int number) {
        this.time = time;
        this.date = date;
        this.match_stadium = match_stadium;
        this.team1 = team1;
        this.team2 = team2;
        this.refree = refree;
        this.matchNumber = number;
    }

    public Match() {

    }

    public void addMatch() {
        Match m = new Match();
        int number = dataBase.db_matches.size() + 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Match number:" + number);
        System.out.println("Enter First Team");
        String SecondT = null;
        String Staduim = null;
        String Referee = null;
        String Date = null;
        String Time = null;
        

        m.setMatchNumber(number);
        
        String FirstT = in.nextLine();
        boolean found = false;
        for (Team t : dataBase.db_teams) {

            if (t.getT_name().equals(FirstT)) {
                m.setTeam1(FirstT);
                found = true;
            }

        }
        if (found) {
            found = false;
            System.out.println("Enter Second Team");
            SecondT = in.nextLine();
            for (Team t : dataBase.db_teams) {

                if (t.getT_name().equals(SecondT) && !(m.getTeam1().equals(SecondT))) {
                    m.setTeam2(SecondT);
                    found = true;
                }

            }

        }
        if (found) {
            found = false;
            System.out.println("Enter Match Staduim");
            Staduim = in.nextLine();
            for (Staduim s : dataBase.db_Staduim) {

                if (s.getName().equals(Staduim)) {
                    m.setMatch_stadium(Staduim);
                    found = true;
                }

            }

        }
        if (found) {
            found = false;
            System.out.println("Enter Match Referee");
            Referee = in.nextLine();
            for (Refree r : dataBase.db_Refree) {
                

                if (r.getName().equals(Referee)) {
                    m.setRefree(Referee);
                    found = true;
                }

            }

        }
        if (found) {

            System.out.println("Enter Match Date");
            Date = in.nextLine();
            m.setDate(Date);
            System.out.println("Enter Match Time");
            Time = in.nextLine();
            m.setTime(Time);

        }

        if (found) {
            dataBase.db_matches.add(m);
        } else {
            System.out.println("Match is Not added");
        }

    }

    public void removeMatch() {
        boolean found=false;
        System.out.println("Enter the Match Number to the Match you want to remove");
        Scanner in = new Scanner(System.in);
        int matchnumber = in.nextInt();
        for (int i = 0; i < dataBase.db_matches.size(); i++) {
            if (dataBase.db_matches.get(i).matchNumber == matchnumber) {
                found=true;
               
                dataBase.db_matches.remove(dataBase.db_matches.get(i));
                for(int j=matchnumber-1;j<dataBase.db_matches.size();j++)
                {
                    dataBase.db_matches.get(j).matchNumber= dataBase.db_matches.get(j).matchNumber-1;
                }
                  

            } 
        }
           
     
        if(found==false)
        {
            System.out.println("Match is not found");
        }
    }


    public void editMatch() {
        System.out.println("Enter the Match Number to the Match you want to edit");
        Scanner in = new Scanner(System.in);
        int matchnumber = in.nextInt();
        for (int i = 0; i < dataBase.db_matches.size(); i++) {
            if (dataBase.db_matches.get(i).matchNumber == matchnumber) {
                System.out.println(dataBase.db_matches.get(i).getMatchNumber() + "    " + dataBase.db_matches.get(i).getTeam1() + "   vs   " + dataBase.db_matches.get(i).getTeam2());
                System.out.println("    Date:    " + dataBase.db_matches.get(i).getDate() + "     Time : " + dataBase.db_matches.get(i).getTime());
                System.out.println("   in Staduim :    " + dataBase.db_matches.get(i).getMatch_stadium() + "   Referee :   " + dataBase.db_matches.get(i).getRefree());
                System.out.println("----------------------------------------------------------");

                System.out.println("What do you want to edit?1-FirstTeam 2-SecondTeam 3-Staduim 4-Referee 5-Date 6-Time");
                Scanner in1 = new Scanner(System.in);
                int x = in1.nextInt();
                String newName;
                String newName2;
                switch (x) {
                    case 1:
                        System.out.println("Enter the new First team");
                        Scanner s = new Scanner(System.in);
                        newName = s.nextLine();
                        boolean changed =false;
                        for (int j = 0; j < dataBase.db_teams.size(); j++) {
                            if (dataBase.db_teams.get(j).getT_name().equals(newName) && !(dataBase.db_teams.get(j).getT_name().equals(dataBase.db_matches.get(i).getTeam2()))) {
                                dataBase.db_matches.get(i).setTeam1(newName);
                            }
                          
                        }
                                  if (changed==false) 
                            {
                                System.out.println("Match has not been changed");
                            }

                        break;
                    case 2:
                        System.out.println("Enter the new Second team");
                        s = new Scanner(System.in);
                        newName2 = s.nextLine();
                        boolean changed1=false;
                        for (int j = 0; j < dataBase.db_teams.size(); j++) {
                            if (dataBase.db_teams.get(j).getT_name().equals(newName2) && !(dataBase.db_teams.get(j).getT_name().equals(dataBase.db_matches.get(i).getTeam1()))) {
                                dataBase.db_matches.get(i).setTeam2(newName2);
                                changed1=true;
                            }
                        }
                        
                             if (changed1==false) 
                            {
                                System.out.println("Match has not been changed");
                            }

                        break;
                    case 3:
                        System.out.println("Enter the new Staduim");
                        s = new Scanner(System.in);
                        String newStaduim = s.nextLine();
                        for (int j = 0; j < dataBase.db_Staduim.size(); j++) {
                            if (dataBase.db_Staduim.get(j).getName().equals(newStaduim)) {
                                dataBase.db_matches.get(i).setMatch_stadium(newStaduim);
                            }
                        }

                        break;
                    case 4:
                        System.out.println("Enter the new Referee name");
                        s = new Scanner(System.in);
                        String newReferee = s.nextLine();
                        for (int j = 0; j < dataBase.db_Refree.size(); j++) {
                            if (dataBase.db_Refree.get(j).getName().equals(newReferee)) {
                                dataBase.db_matches.get(i).setRefree(newReferee);
                            }
                        }

                        break;
                    case 5:
                        System.out.println("Enter the new Date");
                        s = new Scanner(System.in);
                        String newDate = s.nextLine();
                        dataBase.db_matches.get(i).setDate(newDate);
                        break;
                    case 6:
                        System.out.println("Enter the new Time");
                        s = new Scanner(System.in);
                        String newTime = s.nextLine();
                        dataBase.db_matches.get(i).setTime(newTime);
                        break;
                    default:
                        System.out.println("INVALID INPUT");

                }

            }
        }
    }
}
