/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Lab Informatika
 */
public class Web {
    private double writing,coding,interview;
    String nik,name;
    
    public Web(String nik, String name, double writing, double coding, double interview)
    {
        this.nik=nik;
        this.name=name;
        this.writing=writing;
        this.coding=coding;
        this.interview=interview;
    }
    public void setWriting(double writing)
    {
        this.writing=writing;
    }
    public void setCoding(double coding)
    {
        this.coding=coding;
    }
    public void setInterview(double interview)
    {
        this.interview=interview;
    }
    public double getWriting()
    {
        return writing;
    }
    public double getCoding()
    {
        return coding;
    }
    public double getInterview()
    {
        return interview;
    }
}
