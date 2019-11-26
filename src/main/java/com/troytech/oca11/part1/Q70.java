package com.troytech.oca11.part1;

/**
 *
 * What is the result?
 *
 *
 * A. Hello B. Default
 * C. Compilation fails
 * D. The program prints nothing
 * E. An exception is thrown at run time
 *
 * Answer: A
 *
 * Explanation:  The program compiles fine. The program runs fine. The output is: hell
 *
 * @author daniel.carvajal
 */


interface  Runnable {
    public void run();
}

public class Q70 {

    public static void main(String[] args) {
      Runnable run = x -> {System.out.print("Run");}

    }
}