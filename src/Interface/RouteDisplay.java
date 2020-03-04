/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.ArrayList;

/**
 *
 * @author paolovargas1
 */
public class RouteDisplay {
    public static final int[] TA = {3,7};
    public static final int[] TB = {4,7};
    
    public static ArrayList<Integer> GetRoute(int StopF ,int StopT){
        
        int s;
        ArrayList<Integer> R = new ArrayList<Integer>();
        s = StopT - StopF + 1 ; 
       
        for (int i = 0 ; i<s ; i++){
            R.add(StopF);
            StopF = StopF + 1;
        }
        
        return R;
    }
    
    public static ArrayList<Integer> GetRoute2(int StopF,int StopT){ // Check
        
        int s;
        ArrayList<Integer> R = new ArrayList<Integer>();
        s = StopT - StopF + 1 ; 
        for (int i = 0 ; i<s ; i++){
            R.add(StopT);
            StopT = StopT - 1;
        }
        return R;
    }
    public static ArrayList<Integer> GetRouteTA(int StopF){ // This Methods defines which Transfer Point is closer. Using Line A
        
        ArrayList<Integer> R = new ArrayList<Integer>();
        // The Difference indicates how far is the transfer form the Departure point 
        int D1 = StopF - TA[0]; // 'Departure' stop - Transfer A[1]
        int D2 = StopF - TA[1]; // 'Departure' stop - Transfer A[2]
        
        if (D1<0) { // If D is negative 
            D1 = D1*-1;
        }
        if (D2<0){
            D2 = D2*-1;
        }
        int s;
        if (D1<D2){ // IF WE ARE USING TRANSFER A[1] = (A3)
               s = D1 + 1;
                if (StopF < TA[0]) { // if my Departure point is for ex: (A1) Is BEFORE Transfer (A3)
                    for (int i = 0; i < s; i++) {
                        R.add(StopF);
                        StopF = StopF + 1;
                    }
                }else { // if my Departure point is for ex: (A6) Is AFTER Transfer (A3)
                    for (int i = 0; i < s; i++) {
                        R.add(StopF);
                        StopF = StopF - 1;
                    }
                }
        }else { // IF WE ARE USING TRANSFER A[2] = (A7)
                s = D2 + 1;
                if (StopF < TA[1]) { // if my Departure point is for ex: (A5) Is BEFORE Transfer (A7)
                    for (int i = 0; i < s; i++) {
                        R.add(StopF);
                        StopF = StopF + 1;
                    }
                }else { // if my Departure point is for ex: (A1) Is AFTER Transfer (A3)
                    for (int i = 0; i < s; i++) {
                        R.add(StopF);
                        StopF = StopF - 1;
                    }
                }
        }
        return R;
    }
    public static ArrayList<Integer> GetRouteTB(int StopF){ // This Methods defines which Transfer Point is closer. Using Line B
        ArrayList<Integer> R = new ArrayList<Integer>(); // Same as the previous Method
        // The Difference indicates how far is the transfer form the Departure point 
        int D1 = StopF - TB[0];
        int D2 = StopF - TB[1];
         
        if (D1<0) {
            D1 = D1*-1;
        }
        if (D2<0){
            D2 = D2*-1;
        }
        int s;
        if (D1<D2){ // IF WE ARE USING TRANSFER B4
               s = D1 + 1;
                if (StopF < TB[0]) {

                    for (int i = 0; i < s; i++) {
                        R.add(StopF);
                        StopF = StopF + 1;
                    }
                }else {
                    for (int i = 0; i < s; i++) {
                        R.add(StopF);
                        StopF = StopF - 1;
                    }
                }
        }else { // IF WE ARE USING TRANSFER B7
                s = D2 + 1;
                if (StopF < TB[1]) {

                    for (int i = 0; i < s; i++) {
                        R.add(StopF);
                        StopF = StopF + 1;
                    }
                }else {
                    for (int i = 0; i < s; i++) {
                        R.add(StopF);
                        StopF = StopF - 1;
                    }
                }
        }
        return R;
    }
    public static ArrayList<Integer> GetRouteT(int Stop,int e){ // this method Defines the Route based on the Transfer Point.
        ArrayList<Integer> R = new ArrayList<>(); //  Evaluates the 4 Transfer possibilities. Also based on the Destination Point.
        int s;
        if (e == TA[0]){ // if the transfer point is (A3)
            if (Stop < TB[0]){ // when the Destination point is before (B4) , ex: (B1)
                s = TB[0] - Stop + 1; 
               for (int i = 0 ; i<s ; i++){
                   R.add(Stop);
                   Stop = Stop + 1;
                }
            }else {
                s = Stop - TB[0] + 1;
                for (int i = 0 ; i<s ; i++){
                   R.add(Stop);
                   Stop = Stop - 1;
                }
            }
        }else if ( e == TB[0]){ // if the transfer point is (B4)
            if (Stop < TA[0]){ // when the Destination point is before (B4) , ex: (B1)
                s = TA[0] - Stop + 1 ;
                for (int i = 0 ; i<s ; i++){
                   R.add(Stop);
                   Stop = Stop + 1;
                } 
            }else {
                s = Stop - TA[0] + 1;
                for (int i = 0 ; i<s ; i++){
                   R.add(Stop);
                   Stop = Stop - 1;
                }
            }
        }else if (e == TA[1]){ // since Transfers (A7) & (B7) are on the same Stop number.
         // We use the same Process for both Lines A & B 
            if (Stop < TA[1]){
                s = TA[1] - Stop + 1 ;
                for (int i = 0 ; i<s ; i++){
                   R.add(Stop);
                   Stop = Stop + 1;
                } 
            }else {
                s = Stop - TA[1] + 1;
                for (int i = 0 ; i<s ; i++){
                   R.add(Stop);
                   Stop = Stop - 1;
                }
            }
        }
    
        return R;
    }
}
