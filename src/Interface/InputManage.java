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
public class InputManage {
     public static String SplitLine(String input) {
        int n = input.length();
        String A = null;
        if (n <= 3) {
            try {
                String Line = input.replaceAll("\\d", ""); // replace 1 or more digits of the input
                A = Line;
            } catch (Exception e) {
                A = null;
            }
            if (A.length() > 1) {
                A = null;
            }
        }
        return A;
    }
    public static int SplitStop(String input) {
        int n = input.length();
        int A = 0;
        boolean f;
        if (n <= 3) {
            try {
                String Stop = input.replaceAll("[a-zA-Z]","");
                A = Integer.parseInt(Stop);
            }catch (Exception e) {
                A = 0;
            }
        }
        return A;
    }
}
