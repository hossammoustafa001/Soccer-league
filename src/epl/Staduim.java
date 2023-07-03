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
public class Staduim {
 private String Stdname;
 private String location;
 private int seat_capacity;
    

    public String getName() {
        return Stdname;
    }

    public void setName(String name) {
        this.Stdname = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSeat_capacity() {
        return seat_capacity;
    }

    public void setSeat_capacity(int seat_capacity) {
        this.seat_capacity = seat_capacity;
    }
 
 public Staduim(String name,String location,int seatCapacity)
 {
     this.location=location;
     this.Stdname=name;
     this.seat_capacity=seatCapacity;
 }
 public Staduim()
 {
    
 }
 public void addStaduim()
 {
     System.out.println("Enter the Staduim's name");
     boolean found=false;
     String location;
     int SeatC;
     Scanner in= new Scanner(System.in);
     String sName=in.nextLine();
     for(int i =0;i<dataBase.db_Staduim.size();i++)
     {
         if(dataBase.db_Staduim.get(i).Stdname.equals(sName))
         {
             found=true;
             System.out.println("Already Exists");
         }
     }
     if(found==false)
     {
         System.out.println("Enter the Staduim's location");
         location=in.nextLine();
         System.out.println("Enter the Staduim's Capacity");
         SeatC=in.nextInt();
         Staduim s=new Staduim(sName,location,SeatC);
         dataBase.db_Staduim.add(s);
         
     }
 }
 
 public void removeStaduim()
 {
     System.out.println("Enter the Staduim's name you want to remove:");
     boolean found=false;
     
     Scanner in= new Scanner(System.in);
     String sName=in.nextLine();
     for(int i =0;i<dataBase.db_Staduim.size();i++)
     {
         if(dataBase.db_Staduim.get(i).Stdname.equals(sName))
         {
             found=true;
             dataBase.db_Staduim.remove(dataBase.db_Staduim.get(i));
         }
     }
     if(found==false)
     {
         System.out.println("Not Found");
     }
 }
        
 public void editStaduim()
 {
     System.out.println("Enter the Staduim's name you want to edit:");
     boolean found=false;
     
     Scanner in= new Scanner(System.in);
     String sName=in.nextLine();
     for(int i =0;i<dataBase.db_Staduim.size();i++)
     {
         if(dataBase.db_Staduim.get(i).Stdname.equals(sName))
         {
             found=true;
                  System.out.println("Staduim's details:");
               System.out.println("Staduim Name " + dataBase.db_Staduim.get(i).getName());
            System.out.println("location: " + dataBase.db_Staduim.get(i).getLocation() + "  Capacity:     " + dataBase.db_Staduim.get(i).getSeat_capacity());
            System.out.println("-------------------------------------------------------");
            System.out.println("select what to edit:"+" "+"1-Staduim's location"+" "+"2-Staduim's Seat Capacity");
            Scanner in1=new Scanner(System.in);
            int x=in1.nextInt();
            switch(x)
            {
                case 1:
                    System.out.println("Enter the new Staduim's location");
                    Scanner in2=new Scanner(System.in);
                    String newLocation=in2.nextLine();
                    dataBase.db_Staduim.get(i).setLocation(newLocation);
                    break;
                case 2:
                    System.out.println("Enter the new Staduim's Seat Capacity");
                    Scanner in3 =new Scanner(System.in);
                    int newCapacity=in3.nextInt();
                    dataBase.db_Staduim.get(i).setSeat_capacity(newCapacity);
                    break;
                default:
                   System.out.println("Invalid Choice"); 
                    
            }
         }
     }
     if(found==false)
     {
         System.out.println("Not Found");
     }
 }
}
