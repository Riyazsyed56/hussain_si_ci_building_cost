package com.sibd.sibd;
import java.io.*;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	PrintStream myout=new PrintStream(new FileOutputStream(FileDescriptor.out));
        SimpleInterest si=new SimpleInterest(1000,1,10f);
        System.out.println("Simple Interest: "+si.getSimpleInterest());
        System.out.println("Compound Interes "+si.getCompoundInterest());
        BuildingCost b1=new BuildingCost("standard",50,false);
        BuildingCost b2=new BuildingCost("above standard",50,false);
        BuildingCost b3=new BuildingCost("high standard",50,false);
        BuildingCost b4=new BuildingCost("high standard",50,true);
        
        myout.print("Building cost :"+b1.getConstructionCost()+"\n");
        myout.print("Building cost :"+b2.getConstructionCost()+"\n");
        myout.print("Building cost :"+b3.getConstructionCost()+"\n");
        myout.print("Building cost :"+b4.getConstructionCost()+"\n");
       
    }
}
