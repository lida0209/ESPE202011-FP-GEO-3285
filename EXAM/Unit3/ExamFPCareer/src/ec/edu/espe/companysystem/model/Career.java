/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.companysystem.model;

/**
 *
 * @author HP
 */
public class Career {

    public Career(String name, int duationSemester, String startPeriod, boolean status, boolean modalily) {
        this.name = name;
        this.duationSemester = duationSemester;
        this.startPeriod = startPeriod;
        this.status = status;
        this.modalily = modalily;
    }
    
    private String name;
    private int  duationSemester;
    private String startPeriod;
    private boolean status;
    private boolean modalily;

    public Career(String name, int durationSemester, boolean modality, String startPeriod, boolean status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     * @return the duationSemester
     */
    public int getDuationSemester() {
        return duationSemester;
    }

    /**
     * @param duationSemester the duationSemester to set
     */
    public void setDuationSemester(int duationSemester) {
        this.duationSemester = duationSemester;
    }

    /**
     * @return the startPeriod
     */
    public String getStartPeriod() {
        return startPeriod;
    }

    /**
     * @param startPeriod the startPeriod to set
     */
    public void setStartPeriod(String startPeriod) {
        this.startPeriod = startPeriod;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the modalily
     */
    public boolean isModalily() {
        return modalily;
    }

    /**
     * @param modalily the modalily to set
     */
    public void setModalily(boolean modalily) {
        this.modalily = modalily;
    }
  
}
