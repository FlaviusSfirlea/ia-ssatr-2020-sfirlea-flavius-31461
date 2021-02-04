/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.ssatr.curs2.ssatr.ia;

import java.util.Objects;

/**
 *
 * @author flavi
 */
public class Sensor 
{
    private int value;
    public  String location;
    
    Sensor(int value, String location)
    {
        this.value = value;
        this.location = location;
    }
    
    public int getValue()
    {
        return value;
    }
    public void setValue(int val) 
    {
        this.value = val;
    }
    public String getLocation()
    {
        return location;
    }
    public void setLocation(String loc)
    {
        this.location = loc;
    }
    
    @Override
    public boolean equals (Object obj)
    {
        if(this == obj)
        {
            return true;
        }
        if(getClass() != obj.getClass())
        {
            return false;
        }
        final Sensor other = (Sensor) obj;
        if(!Objects.equals(this.location, other.location))
        {
            return false;
        }
        return true;
    }
}
