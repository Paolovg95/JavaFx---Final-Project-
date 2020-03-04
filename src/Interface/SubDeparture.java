/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author paolovargas1
 */
public class SubDeparture {
    public String FromLine;
    public int FromStop;


    public void setFromLine(String FromL) {
        this.FromLine = FromL;
    }

    public void setFromStop(int FromS) {
        this.FromStop = FromS;
    }
    public  String getFromLine(){
        return this.FromLine;
    }
    public int getFromStop() {
        return this.FromStop;
    }
}
