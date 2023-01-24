/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class Address {
    
    String preSt;
    int preApt;
    String preCity;
    long preZip;
    String perSt;
    int perApt;
    String perCity;
    long perZip;
    
    public Address(){
    
        this.preSt="";
        this.preApt=0;
        this.preCity="";
        this.preZip=0;
        this.perSt="";
        this.perApt=0;
        this.perCity="";
        this.perZip=0;
        
    }

    public String getPreSt() {
        return preSt;
    }

    public void setPreSt(String preSt) {
        this.preSt = preSt;
    }

    public int getPreApt() {
        return preApt;
    }

    public void setPreApt(int preApt) {
        this.preApt = preApt;
    }

    public String getPreCity() {
        return preCity;
    }

    public void setPreCity(String preCity) {
        this.preCity = preCity;
    }

    public long getPreZip() {
        return preZip;
    }

    public void setPreZip(long preZip) {
        this.preZip = preZip;
    }

    public String getPerSt() {
        return perSt;
    }

    public void setPerSt(String perSt) {
        this.perSt = perSt;
    }

    public int getPerApt() {
        return perApt;
    }

    public void setPerApt(int perApt) {
        this.perApt = perApt;
    }

    public String getPerCity() {
        return perCity;
    }

    public void setPerCity(String perCity) {
        this.perCity = perCity;
    }

    public long getPerZip() {
        return perZip;
    }

    public void setPerZip(long perZip) {
        this.perZip = perZip;
    }
    
    
}
