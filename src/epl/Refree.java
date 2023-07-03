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
public class Refree extends Person {

    static Scanner cin = new Scanner(System.in);

    String new_name;
    float new_height, new_weight;

    public Refree() {

    }

    public Refree(String new_name, float new_height, float new_weight) {
        super(new_name, new_height, new_weight);
    }

    @Override
    public void add() {
        boolean found =false;

        float height =0;
        float weight=0; 
        System.out.println("Enter the Referee's name:");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        for (int i = 0; i < dataBase.db_Refree.size(); i++) {
            if (dataBase.db_Refree.get(i).getName().equals(name)) {
                found=true;

                System.out.println("Already exists");

            }
            
            
        }
       if(found==false)
           {
                
                System.out.println("Enter Referee's height:");
                  height = in.nextFloat();
        
        System.out.println("Enter Referee's weight:");
       weight = in.nextFloat();
        Refree r=new Refree(name,height,weight);
        dataBase.db_Refree.add(r);
            }


    }

    @Override
    public void edit() {
        boolean found=false;
Scanner o =new Scanner(System.in);
System.out.println("Enter Referee's name to edit");
String pname=o.nextLine();
 for(int i =0;i<dataBase.db_Refree.size();i++)
         {
             if(dataBase.db_Refree.get(i).getName().equals(pname))
             {
                 found=true;
               System.out.println("Referee's details:");
               System.out.println(dataBase.db_Refree.get(i).getName()+ " " +dataBase.db_Refree.get(i).getWeight()+" "+dataBase.db_Refree.get(i).getHeight());
            System.out.println("select what to edit:"+" "+"1-Referee's weight"+" "+"2-Referee's height");
         int choose=o.nextInt();
             switch(choose){
                 case 1:
                      System.out.println("Enter the new Referee's weight");
             Scanner pf = new Scanner(System.in);
             float newWeight= pf.nextFloat();
               dataBase.db_Refree.get(i).setWeight(newWeight);
             break;
                 case 2: 
                    
                    System.out.println("Enter the new Referee's height:");
                         Scanner pm= new Scanner(System.in);
                     float newheight= pm.nextFloat();
                      dataBase.db_Refree.get(i).setHeight(newheight);
                     break;
                 
                 default:
                     System.out.print("Invalid choice");
             }
             }
             
         }
 if(found==false)
 {
     System.out.println("not Found");
 }



    }

    @Override
    public void remove() {
        boolean found=false;

        Scanner r = new Scanner(System.in);
        System.out.println("Enter Referee's name to remove");
        String pname = r.nextLine();
        for (int i = 0; i < dataBase.db_Refree.size(); i++) {
            if (dataBase.db_Refree.get(i).getName().equals(pname)) {
                found=true;
                dataBase.db_Refree.remove(dataBase.db_Refree.get(i));
            }
        }
        if(found==false)
        {
            System.out.println("Not Found");
        }

    }

}
