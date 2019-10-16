package com.week8battleshiphw;

public class SimpleDotCom {

  int[] locationCells;
  int numOfHits = 0;

  public void setLocationCells(int[] locs){
    locationCells=locs;
  }

  public String checkYourself(String stringGuess){
    int guess = Integer.parseInt(stringGuess);
    String result = "missed hoe";
    for (int cell : locationCells){
      if (guess == cell){
        result = "hit dat thang";
        numOfHits++;
        break;
      }
    }

    if (numOfHits == locationCells.length){
      result = "kill moe";
    }
    System.out.println(result);
    return result;
  }
}
