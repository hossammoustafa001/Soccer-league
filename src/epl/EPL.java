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
public class EPL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       

        invalue();
        admin a = new admin();
        int y;
        do {
            System.out.println("\t\t\t\t\tEgyptian league managment system");
            System.out.println("Do you want to Login or Sign up?1-Login  2-Sign up");
            Scanner in3 = new Scanner(System.in);
            int Choice = in3.nextInt();
            switch (Choice) {

                case 1:
                  a.login();
                   
                 
                    break;
                case 2:
                    a.signup();
                    break;
                default:
                    System.out.println("Invalid Input");

            }
            System.out.println("Do you want to exist?1-yes 2-no");
            Scanner in0 = new Scanner(System.in);
            y = in0.nextInt();
        } while (y != 1);

    }

    public static void invalue() {

        Team t = new Team("Al Ahly");
        dataBase.db_teams.add(t);
        t = new Team("Zamalek");
        dataBase.db_teams.add(t);
        t = new Team("Isamily");
        dataBase.db_teams.add(t);
        t = new Team("El Makkasa");
        dataBase.db_teams.add(t);
        t = new Team("Enppi");
        dataBase.db_teams.add(t);
        t = new Team("Al Masry");
        dataBase.db_teams.add(t);
        t = new Team("Pyramids");
        dataBase.db_teams.add(t);
        t = new Team("Smouha");
        dataBase.db_teams.add(t);
        t = new Team("El Gouna");
        dataBase.db_teams.add(t);
        t = new Team("Wadi Degla");
        dataBase.db_teams.add(t);

        // dataBase Refree
        Refree r = new Refree("Ahmad Abo Grasha", 82.0f, 175.0f);
        dataBase.db_Refree.add(r);
        r = new Refree("Mohamed Farouk", 82.0f, 175.0f);
        dataBase.db_Refree.add(r);
        r = new Refree("Ahmad Mohamed", 82.0f, 175.0f);
        dataBase.db_Refree.add(r);
        r = new Refree("Hossam Mostafa", 82.0f, 175.0f);
        dataBase.db_Refree.add(r);
        r = new Refree("Ahmad Khaled", 82.0f, 175.0f);
        dataBase.db_Refree.add(r);

        //database staduim
        Staduim s = new Staduim("Qhara", "Nasr City", 32000);
        dataBase.db_Staduim.add(s);
        s = new Staduim("Burg El Arab", "Alexandria", 50000);
        dataBase.db_Staduim.add(s);
        s = new Staduim("EL Salam", "El Salam", 35000);
        dataBase.db_Staduim.add(s);
        s = new Staduim("Kolya El Harbya", "Salah Salem", 40000);
        dataBase.db_Staduim.add(s);
        s = new Staduim("Aswan", "Aswan", 30000);
        dataBase.db_Staduim.add(s);

        //dataBase players
        Player p = new Player("Hussein El Shahat", "FW", 171.0f, 80.0f, "Al Ahly");
        dataBase.db_Players.add(p);
        p = new Player("Kahraba", "MF", 182.0f, 80.0f, "Al Ahly");
        dataBase.db_Players.add(p);
        p = new Player("Ali Maaloul", "DF", 175.0f, 80.0f, "Al Ahly");
        dataBase.db_Players.add(p);
        p = new Player("Saad Samir", "DF", 185.0f, 80.0f, "Al Ahly");
        dataBase.db_Players.add(p);
        p = new Player("Mohamed El Shenawy", "GK", 191.0f, 80.0f, "Al Ahly");
        dataBase.db_Players.add(p);
        p = new Player("Moustafa Mohamed", "FW", 185.0f, 79.0f, "Zamalek");
        dataBase.db_Players.add(p);
        p = new Player("Shikabala", "MF", 183.0f, 80.0f, "Zamalek");
        dataBase.db_Players.add(p);
        p = new Player("Abdallah Gomaa", "DF", 168.0f, 80.0f, "Zamalek");
        dataBase.db_Players.add(p);
        p = new Player("Mahmoud Alaa", "DF", 189.0f, 80.0f, "Zamalek");
        dataBase.db_Players.add(p);
        p = new Player("Mahmoud Ginesh", "GK", 188.0f, 80.0f, "Zamalek");
        dataBase.db_Players.add(p);
        p = new Player("Ary Papel", "FW", 170.0f, 80.0f, "Isamily");
        dataBase.db_Players.add(p);
        p = new Player("Ahmad Madbouli", "FW", 168.0f, 80.0f, "Isamily");
        dataBase.db_Players.add(p);
        p = new Player("Mohamed Sadek", "DF", 184.0f, 80.0f, "Isamily");
        dataBase.db_Players.add(p);
        p = new Player("Baher El Mohamady", "DF", 184.0f, 80.0f, "Isamily");
        dataBase.db_Players.add(p);
        p = new Player("Mohamed Sobhy", "GK", 182.0f, 80.0f, "Isamily");
        dataBase.db_Players.add(p);
        p = new Player("Hesham Mohamed", "MF", 170.0f, 80.0f, "El Makkasa");
        dataBase.db_Players.add(p);
        p = new Player("Ayman Hefny", "MF", 167.0f, 80.0f, "El Makkasa");
        dataBase.db_Players.add(p);
        p = new Player("Mody", "DF", 190.0f, 80.0f, "El Makkasa");
        dataBase.db_Players.add(p);
        p = new Player("Hosny Fathi", "DF", 180.0f, 80.0f, "El Makkasa");
        dataBase.db_Players.add(p);
        p = new Player("Mahmoud Hamdy", "GK", 185.0f, 80.0f, "El Makkasa");
        dataBase.db_Players.add(p);
        p = new Player("Karim Tarek", "FW", 173.0f, 80.0f, "Enppi");
        dataBase.db_Players.add(p);
        p = new Player("Ibrahim Galal", "FW", 178.0f, 80.0f, "Enppi");
        dataBase.db_Players.add(p);
        p = new Player("Salah Rico", "MF", 184.0f, 80.0f, "Enppi");
        dataBase.db_Players.add(p);
        p = new Player("Osama Galal", "DF", 184.0f, 80.0f, "Enppi");
        dataBase.db_Players.add(p);
        p = new Player("Mahmoud Gad", "GK", 191.0f, 80.0f, "Enppi");
        dataBase.db_Players.add(p);
        p = new Player("Mohamed Yehia", "DF", 185.0f, 80.0f, "Pyramids");
        dataBase.db_Players.add(p);
        p = new Player("Ramadan Sobhy", "FW", 188.0f, 80.0f, "Pyramids");
        dataBase.db_Players.add(p);
        p = new Player("Abdallah El Saeed", "FW", 191.0f, 80.0f, "Pyramids");
        dataBase.db_Players.add(p);
        p = new Player("Mahmoud Fathy", "DF", 191.0f, 80.0f, "Pyramids");
        dataBase.db_Players.add(p);
        p = new Player("Shreif Ekarmy", "GK", 191.0f, 80.0f, "Pyramids");
        dataBase.db_Players.add(p);
        p = new Player("Hussein Gad", "FW", 191.0f, 80.0f, "Al Masry");
        dataBase.db_Players.add(p);
        p = new Player("Youssef Sobhy", "FW", 184.0f, 80.0f, "Al Masry");
        dataBase.db_Players.add(p);
        p = new Player("Abdallah Gomaa", "DF", 181.0f, 80.0f, "Al Masry");
        dataBase.db_Players.add(p);
        p = new Player("Mohamed Yehia", "Df", 191.0f, 80.0f, "Al Masry");
        dataBase.db_Players.add(p);
        p = new Player("Ahmad Sobhy", "GK", 191.0f, 80.0f, "Al Masry");
        dataBase.db_Players.add(p);
        p = new Player("Ahmad Metwali", "FW", 175.0f, 80.0f, "Smouha");
        dataBase.db_Players.add(p);
        p = new Player("Marwan Sobhy", "FW", 191.0f, 80.0f, "Smouha");
        dataBase.db_Players.add(p);
        p = new Player("Weegz", "DF", 191.0f, 80.0f, "Smouha");
        dataBase.db_Players.add(p);
        p = new Player("Marwan Moussa", "DF", 191.0f, 80.0f, "Smouha");
        dataBase.db_Players.add(p);
        p = new Player("Abo Gabl", "GK", 191.0f, 80.0f, "Smouha");
        dataBase.db_Players.add(p);
        p = new Player("Seif Mohmad", "FW", 181.0f, 80.0f, "El Gouna");
        dataBase.db_Players.add(p);
        p = new Player("Seif Ehab", "DF", 171.0f, 80.0f, "El Gouna");
        dataBase.db_Players.add(p);
        p = new Player("Mostafa Hossam", "FW", 187.0f, 80.0f, "El Gouna");
        dataBase.db_Players.add(p);
        p = new Player("Mazen Messi", "DF", 182.0f, 80.0f, "El Gouna");
        dataBase.db_Players.add(p);
        p = new Player("seif Mahmoud", "GK", 191.0f, 80.0f, "El Gouna");
        dataBase.db_Players.add(p);
        p = new Player("Andrew Magdy", "FW", 184.0f, 80.0f, "Wadi Degla");
        dataBase.db_Players.add(p);
        p = new Player("Pierre Remon", "FW", 186.0f, 80.0f, "Wadi Degla");
        dataBase.db_Players.add(p);
        p = new Player("Hossam Mostafa", "DF", 185.0f, 80.0f, "Wadi Degla");
        dataBase.db_Players.add(p);
        p = new Player("Ahmad Khaled", "DF", 182.0f, 80.0f, "Wadi Degla");
        dataBase.db_Players.add(p);
        p = new Player("Olivar Fady", "GK", 181.0f, 80.0f, "Wadi Degla");
        dataBase.db_Players.add(p);

        // database matches
        Match m = new Match("7:30", "26/12/2020", "Burg El Arab", "Al Ahly", "Zamalek", "Ahmad Abo Grasha", 1);
        dataBase.db_matches.add(m);
        m = new Match("7:30", "27/12/2020", "Qhara", "Isamily", "El Makkasa", "Mohamed Farouk", 2);
        dataBase.db_matches.add(m);
        m = new Match("7:30", "29/12/2020", "Kolya El Harbya", "Pyramids", "Enppi", "Hossam Mostafa", 3);
        dataBase.db_matches.add(m);
        m = new Match("7:30", "30/12/2020", "Aswan", "Wadi Degla ", "Al Masry", "Ahmad Khaled", 4);
        dataBase.db_matches.add(m);
        m = new Match("7:30", "1/1/2021", "EL Salam", "El Gouna", "Smouha", "Ahmad Mohamed", 5);
        dataBase.db_matches.add(m);
        m = new Match("7:30", "2/1/2021", "Qhara", "Isamily", "Zamalek", "Ahmad Mohamed", 6);
        dataBase.db_matches.add(m);
        m = new Match("7:30", "3/1/2021", "Burg El Arab", "Enppi", "El Makkasa", "Mohamed Farouk", 7);
        dataBase.db_matches.add(m);
        m = new Match("7:30", "4/1/2021", "Kolya El Harbya", "Wadi Degla", "Al Masry", "Hossam Mostafa", 8);
        dataBase.db_matches.add(m);
        m = new Match("7:30", "5/1/2021", "Aswan", "Al Ahly", "Pyramids", "Ahmad Abo Grasha", 9);
        dataBase.db_matches.add(m);
        m = new Match("7:30", "6/1/2021", "EL Salam", "El Gouna", "Isamily", "Ahmad Khaled", 10);
        dataBase.db_matches.add(m);
        //Database Admin
        admin a = new admin("admin", "admin");
        dataBase.db_admin.add(a);

    }

}