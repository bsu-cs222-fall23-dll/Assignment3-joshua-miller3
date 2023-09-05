package edu.bsu.cs222;

public class SillyMethods {
    public static void main(String[] args) {

    }

    public boolean didGuess42(int numGuessed){
        return numGuessed == 42;
    }


    public String countTo(int highestNum) {
        String countString = "0";
        for(int count = 1; count <= highestNum; count++){
            countString = (countString + " " + count);
        }

        return countString;
    }
}