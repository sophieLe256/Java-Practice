package jgrasp;

/**
 Ch9. Inheritance
 */
import java.util.*;
import java.io.*;
public class Parent  //superclass
{
    private String parent_name;
    private String car; //share the same car
    public Parent(String parent_name, String car)
    {
        this.parent_name = parent_name;
        this.car = car;
    }
    /**
     getCar: fetch the car name
     @param na
     @return the car name
     */
    public String getCar(){ return this.car;}

    /**
     getParent_name: fetch the parent name
     @param na
     @return the parent_name
     */
    public String getParent_name(){ return this.parent_name;}
    /**
     setParent_name
     @param String parent name
     @return NA
     */
    public void setParent_name(String parent_name)
    {
        this.parent_name = parent_name;
    }
}
