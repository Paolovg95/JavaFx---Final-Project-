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
public class SuperClassBus {
    public static final String[] Lines = {"A","B"};
    public static final int[] Stops = {1,2,3,4,5,6,7,8,9,10};
    
    public SuperClassBus(){
        
    }
    public boolean CheckLines(String that) {
        boolean A = false;
        for (int i = 0; i < Lines.length; i++) {
            if (that.equals(Lines[i])) {
                A = true;
                break;
            }
        }
        return A;
    }
    public boolean CheckStops(int that) {
        boolean A = false;
        for (int i = 0; i < Stops.length; i++) {
            if (that == Stops[i]) {
                A = true;
                break;
            }
        }
        return A;
    }
    
}
