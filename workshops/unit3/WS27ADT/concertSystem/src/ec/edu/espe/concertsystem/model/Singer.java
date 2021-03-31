/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.concertsystem.model;

/**
 *
 * @author HP
 */
public class Singer {
    private String name;
    private int  age;
    private float height;
    private String song;
    private int awardWond;
    private boolean isMan; 

    public Singer(String name, int age, float height, String song, int awardWond, boolean isMan) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.song = song;
        this.awardWond = awardWond;
        this.isMan = isMan;
    }

   
    
    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * @return the song
     */
    public String getSong() {
        return song;
    }

    /**
     * @param song the song to set
     */
    public void setSong(String song) {
        this.song = song;
    }

    /**
     * @return the awardWond
     */
    public int getAwardWond() {
        return awardWond;
    }

    /**
     * @param awardWond the awardWond to set
     */
    public void setAwardWond(int awardWond) {
        this.awardWond = awardWond;
    }

    /**
     * @return the isMan
     */
    public boolean isIsMan() {
        return isMan;
    }

    /**
     * @param isMan the isMan to set
     */
    public void setIsMan(boolean isMan) {
        this.isMan = isMan;
    }

   
   

}