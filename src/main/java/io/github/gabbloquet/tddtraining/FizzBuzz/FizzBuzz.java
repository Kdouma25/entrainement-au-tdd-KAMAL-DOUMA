package io.github.gabbloquet.tddtraining.FizzBuzz;

public class FizzBuzz {
  public String convert(int number) {
      String toReturn = "";

      if (number % 3==0 || number % 5==0) {
          if (number % 3==0) {
              toReturn += "Fizz";
          }
          if (number % 5 ==0){
              toReturn +=  "Buzz";
          }
       }else{ //  not divisible by either 3 nor 5
          toReturn += String.valueOf(number);
      }

      return toReturn;
  }


  public String compute(int number) throws NonCompliantNumberException {
      if(number <= 0){
          throw new NonCompliantNumberException();
      }
      String output = "";
      for (int i=1;i<=number;i++){
            output += convert(i);
      }
      return output;
  }

}
