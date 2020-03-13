package com.example.cour1;

import java.security.PublicKey;
import java.util.Random;

public class GuessNumber {
    private int currentNumber;
    private int maxNumber;

    public  enum guessState{
        BIGGER,
        EQUAL,
        SMALLER
    };

    public GuessNumber(int maxNumber) {
        this.maxNumber = maxNumber;
        generateNewNumber();
    }

    public guessState testNumber(int numberToTest){
        guessState numberState;
        if(numberToTest < currentNumber){
            numberState = guessState.SMALLER;
        }
        else if(numberToTest > currentNumber){
            numberState = guessState.BIGGER;
        }
        else {
            numberState = guessState.EQUAL;
        }
        return  numberState;
    }

    public  void generateNewNumber() {
        currentNumber = new Random().nextInt(maxNumber + 1);
    }

}
