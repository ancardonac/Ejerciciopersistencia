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
public class Fulltime extends Professor{
    private float salary;
    
    public Fulltime(String id, String name, Date hiringDate,String school,String departmen, float salary ) {
        super(id, name, hiringDate,  school, departmen);
        this.salary=salary;
    }

    @Override
    public float paySalary() {
        return this.salary;
    }
    
}
