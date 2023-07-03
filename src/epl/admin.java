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
public class admin {
    private String userName;
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    
    public admin(String name,String password)
    {
        this.userName=name;
        this.passWord=password;
    }
    
    public admin()
    {
        
    }
    
    public void login()
    {
       System.out.println("Enter the Username:");
                    Scanner in = new Scanner(System.in);
                    String name = in.nextLine();
                    System.out.println("Enter the Password:");
                    String password = in.nextLine();
                    int flag=0;
        for(int i=0;i<dataBase.db_admin.size();i++)
        {
            if(dataBase.db_admin.get(i).getUserName().equals(name)&&dataBase.db_admin.get(i).getPassWord().equals(password))
            {
                flag++;
                int x;
                    
                        menu m = new menu();
                        do {
                            m.displaymenu();
                            System.out.println("Do you want to do another operation?1-yes 2-no");
                            Scanner in1 = new Scanner(System.in);
                            x = in1.nextInt();
                        } while (x == 1);
                    }
           
                
            }
             if(flag==0) {
                        System.out.println("Username or Password is not correct");
                    }
    }

  public void signup()
  {
      boolean found=false;
      System.out.println("Enter the UserName:");
      Scanner in=new Scanner(System.in);
      String name=in.nextLine();
      for(int i =0;i<dataBase.db_admin.size();i++)
      {
          if(dataBase.db_admin.get(i).getUserName().equals(name))
          {
              System.out.print("This Account already exists");
              found=true;
          }
      }
      if(found==false)
      {
          System.out.println("Enter the Password:");
          String password=in.nextLine();
          admin m=new admin(name,password);
          dataBase.db_admin.add(m);
      }
  }
    
}
