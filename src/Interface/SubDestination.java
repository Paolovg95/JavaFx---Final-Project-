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
public class SubDestination {
    public String ToLine;
    public int ToStop;

    public void setToLine(String ToL) {

        this.ToLine = ToL;
    }
    public void setToStop(int ToS) {
        this.ToStop = ToS;
    }
    public  String getToLine(){
        return this.ToLine;
    }
    public int getToStop() {
        return this.ToStop;
    }
}
