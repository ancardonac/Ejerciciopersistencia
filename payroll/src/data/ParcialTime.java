/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class ParcialTime extends Professor{
    
    private String category;
    private int classHours;
    
    
    public ParcialTime(String id, String name, Date hiringDate, String school,String departmen,String category,int classHours ) {
        super(id, name, hiringDate,  school, departmen);
        this.category=category;
        this.classHours=classHours;
    }

    @Override
    public float paySalary() {
        if(this.category=="A"){
        
        return this.classHours*60000;
        
        }
        if(this.category=="B"){
        
        return this.classHours*80000;
        
        }
        if(this.category=="C"){
        
        return this.classHours*100000;
        
        }
        return 0;
    }
    
}
