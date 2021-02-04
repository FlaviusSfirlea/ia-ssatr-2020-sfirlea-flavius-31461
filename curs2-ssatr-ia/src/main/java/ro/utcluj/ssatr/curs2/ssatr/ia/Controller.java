/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.ssatr.curs2.ssatr.ia;

/**
 *
 * @author flavi
 */
public class Controller 
{
    private Sensor sensor;
    
    Controller(sensor s)
    {
        this.sensor = s;
    }
    
    public void control(Sensor s)
    {
        if(sensor.value > 25)
        {
            Sistem.out.println
        }
    }
}
