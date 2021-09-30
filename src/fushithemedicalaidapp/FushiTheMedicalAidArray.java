/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fushithemedicalaidapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Gvdme17
 */
public class FushiTheMedicalAidArray
{
    private int size = 0, size2 = 0, size3 = 0;
    private FushiMedAidObject[] obj = new FushiMedAidObject[10];
    private String[] aboutTxtObj = new String[10];
    private String[] helpTxtObj = new String [15];
    private int calcAge;
    private double calcHeight, calcMass;
    
    public void FushiTheMedicalAidArray()
    {
        ///////////////////////////////////////////////////////////////////////
        try
       {
         Scanner scFile = new Scanner(new File("UserStats.txt"));
         String line, i,gen;
         int a;
         double m, bP, h, slp ,c, w, s,g;
         
         while (scFile.hasNext())
         {
            line = scFile.nextLine();
            Scanner sc = new Scanner(line).useDelimiter("#");
            i = sc.next();
            m = sc.nextDouble();
            calcMass = m;
            bP = sc.nextDouble();
            h = sc.nextDouble();
            calcHeight = h;
            slp = sc.nextDouble();
            c = sc.nextDouble();
            w = sc.nextDouble();
            s = sc.nextDouble();
            g = sc.nextDouble();
            gen = sc.next();
            a = sc.nextInt();
            calcAge = a;
            
            sc.close();
            obj[size] = new FushiMedAidObject(i, m, bP, h, slp, c, w, s, g, gen,a);
            //System.out.println(obj[size]);
            size++;
         }
         scFile.close();
       } 
       catch (FileNotFoundException f)
       {
            f.printStackTrace();
       }
       /////////////////////////////////////////////////////////////////////////
       try
       {
           Scanner scFile2 = new Scanner(new File("About.txt"));
           String line2, txt = "";
           
           while(scFile2.hasNext())
           {
               line2 = scFile2.nextLine();
               Scanner sc2 = new Scanner(line2).useDelimiter("#");
               
               txt = sc2.next();
               sc2.close();
               
               aboutTxtObj[size2] = txt;
               //System.out.println(aboutTxtObj[size2]);
               size2++;
           }
           scFile2.close();
       }
       catch(FileNotFoundException e)
       {
           e.printStackTrace();
       }
       /////////////////////////////////////////////////////////////////////////
       try
       {
           Scanner scFile3 = new Scanner(new File("Help.txt"));
           String line3, txt2 = "";
           
           while(scFile3.hasNext())
           {
               line3 = scFile3.nextLine();
               Scanner sc3 = new Scanner(line3).useDelimiter("#");
               
               txt2 = sc3.next();
               sc3.close();
               
               helpTxtObj[size3] = txt2;
               //System.out.println(aboutTxtObj[size2]);
               size3++;
           }
           scFile3.close();
       }
       catch(FileNotFoundException e)
       {
           e.printStackTrace();
       }
       /////////////////////////////////////////////////////////////////////////
    }
    ////////////////////////////////////////////////////////////////////////////
    public String calcBMI()
    {
        double bmi = 0.0;
        String temp = "";
        bmi = Math.round((((calcMass/calcHeight)/calcHeight)*1000)/1000);
        temp = temp + bmi;
        return temp;
    }
    ////////////////////////////////////////////////////////////////////////////
    public String calcBMR()
    {
        String temp = "";
        double bmr = 0.0;
        for (int i = 0; i < size; i++)
        {
            if(obj[i].equals("M"))
            {
                bmr = 66 + (13.8*calcMass) + (5*(calcHeight*10))-(6.8*calcAge);
            }
            else
            {
                bmr = 655 + (9.6*calcMass) + (1.8*(calcHeight*10))-(4.7*calcAge);
            }
        }
        temp = temp + bmr;
        return temp;
    }
    ////////////////////////////////////////////////////////////////////////////
    public String aboutTxt()
    {
        String temp = "";
        for(int i = 0; i < size2; i++)
        {
            temp = temp + aboutTxtObj[i] + "\n";
        }
        return temp;
    }
    ////////////////////////////////////////////////////////////////////////////
    public String helpTxt()
    {
        String temp = "";
        for(int i = 0; i < size3; i++)
        {
            temp = temp + helpTxtObj[i] + "\n";
        }
        return temp;
    }
    ////////////////////////////////////////////////////////////////////////////
    public String actFeed()
    {
        String temp = "";
        for(int i = 0; i < size; i++)
        {
            temp = temp + "Steps Today: " + obj[i].getSteps() + "\nGoal: " + obj[i].getGoal() + "\n";
            if(obj[i].getSteps() >= obj[i].getGoal())
            {
                temp = temp + "\nWell Done You Reached Your Goal!";
            }
            else
            {
                temp = temp + "\nGoal Not Reached.";
            }
        }
        return temp;
    }
    ////////////////////////////////////////////////////////////////////////////
    public String toString()//toString method for displaying user data scanned into object array.
    {
        String temp = "";
        for (int i = 0; i < size; i++)
        {
            temp = temp + obj[i] + "\t";
        }
        return temp;
    }
    ////////////////////////////////////////////////////////////////////////////
}
