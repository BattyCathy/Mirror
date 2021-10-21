// Name: Susan Uland
// CS 141
// Core Topics: Creating a java
// program with static methods, constants and for loops
//
// This program will draw ASCII art using nested for loops
public class MirrorReflection1 {

    public static void main(String[] args ){

        drawBorder();

        drawPyramidUp();


        drawPyramidDown();

        drawBorder();
    }// end of main

    public static void drawPyramidUp(){
        System.out.println("|      <><>      |");
        System.out.println("|    <>....<>    |");
        System.out.println("|  <>........<>  |");
        System.out.println("|<>............<>|");

    } // end of method

    public static void drawPyramidDown(){
        System.out.println("|<>............<>|");
        System.out.println("|  <>........<>  |");
        System.out.println("|    <>....<>    |");
        System.out.println("|      <><>      |");
    } // end of method

    public static void drawBorder(){
        System.out.print("#");
        for (int i = 1; i <= 16; i++) {
          System.out.print("=");
        }
        System.out.println("#");

    }

} // end of class
