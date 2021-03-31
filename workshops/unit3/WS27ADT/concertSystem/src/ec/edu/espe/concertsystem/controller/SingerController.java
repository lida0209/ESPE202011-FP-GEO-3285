/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.concertsystem.controller;

import ec.edu.espe.concertsystem.model.Singer;

import utils.FileManager;

/**
 *
 * @author HP
 */
public class SingerController {
    public void save(Singer singer){
        
        String data = singer.getName()+ ","+ singer.getAge()+ "," + singer.getHeight() + "," + singer.getSong()+ "," + singer.getAwardWond()+ ","+singer.isIsMan();
        FileManager.save(data, "singer");
        
    }
    public String read() {
      String data;
      
       data = FileManager.read("singer");
    
        return data;
    }  
    
}
