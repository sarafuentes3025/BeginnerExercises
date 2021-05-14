package com.sfuentes;

public class Zoo {

  public String calculatePercentage(int[] agesAnimals){
    double countBetweenZeroAndOne = 0;
    double countLessThanThree =0;
    double countGreaterThanOrEqualToThree=0;

    for(int ageAnimal:agesAnimals){
      if(ageAnimal<=1){
        countBetweenZeroAndOne++;
      }else if(ageAnimal<3){
        countLessThanThree++;
      }else {
        countGreaterThanOrEqualToThree++;
      }
    }

    int percentageBetweenZeroAndOne = (int)Math.round((countBetweenZeroAndOne/ agesAnimals.length)*100);
    int percentageLessThanThree = (int)Math.round((countLessThanThree/ agesAnimals.length)*100);
    int percentageGreaterThanOrEqualToThree = (int)Math.round((countGreaterThanOrEqualToThree/ agesAnimals.length)*100);

    return "1.Category 0-1: " + percentageBetweenZeroAndOne + "%, 2.Category 1-3: " + percentageLessThanThree + "%, 3.Category 3 or more: " + percentageGreaterThanOrEqualToThree + "%";
  }

}
