//        Brute force password cracker 1.0
//        Copyright (C) 2020  Henrik Riskær

//        This program was written for the Essential Programming course at Roskilde
//        University as part of the curricular coding assignments.

//        This program is free software; you can redistribute it and/or
//        modify it under the terms of the GNU General Public License
//        as published by the Free Software Foundation; either version 2
//        of the License, or (at your option) any later version.

//        This program is distributed in the hope that it will be useful,
//        but WITHOUT ANY WARRANTY; without even the implied warranty of
//        MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//        GNU General Public License for more details.

//        You should have received a copy of the GNU General Public License
//        along with this program; if not, write to the Free Software
//        Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
//      The program is broken down into several methods to make debugging easier.

//      Change the value below to change the number of digits in the passcode.
        int[] pw = pwGen(4);
        System.out.println("Starting bruteforce of array...");
        int solution = attack(pw);
        System.out.println("Password Successfully brute forced. password is: " + solution);
        System.out.println("For good measure, this is the generated password. It should match:");
        printArray(pw);
    }

    public static int[] pwGen(int digits){
//      Randomly generate password with the provided number of digits
        Random rand = new Random();
        int[] pw = new int[digits];
        for(int i = 0; i < digits; i++){
            pw[i] = rand.nextInt(10);
        }
        return pw;

    }
    public static void printArray(int[] arr){
//      Print pretty version of the password. Not currently in use, but if I find the time I will implement it.
        for (int j : arr) {
            System.out.print("["+j+"]");
        }
    }

    public static int arrayToInt(int[] intKassen){
//      Iterate through passcode array and convert it to an int.
        int res = 0;
        for (int j : intKassen) {
            res = res * 10;
            res = res + j;
        }
        return res;
    }
    public static int attack(int[] pw){
//      This was the easiest way to do this, but far from the most effective.
        int n = arrayToInt(pw);
        int i = 0;
        for (i = 0; i < n; i++){
            if(i != n){
                System.out.println("it wasn't " + i);
            }
        }
        return i;
    }
}
