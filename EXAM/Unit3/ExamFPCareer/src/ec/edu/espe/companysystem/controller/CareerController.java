/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.companysystem.controller;


import ec.edu.espe.companysystem.model.Career;




/**
 *
 * @author HP
 */
public class CareerController {
     public void save(Career career){
         
          String data = career.getName() + "," + career.getDuationSemester() + "," + career.getStartPeriod()  + "," + career.isModalily() + "," + career.isStatus();
          FileManager.read("career");
     }
    
}
