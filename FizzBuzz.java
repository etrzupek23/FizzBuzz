/*
This program prints out the numbers 1-100 and replaces multiples of 3 with Fizz,
multiples of 5 with Buzz, and multiples of both with FizzBuzz
Created by Emma on Feb. 24th, 2020
Intermediate Programming - Block 8
*/
class FizzBuzz {
  public static void main(String[] args) {
    //for loop
    for (int i = 1; i <= 100; i++){
      //if the variable i is both multiples of 5 and 3, it prints FizzBuzz
      if (i%3 == 0 && i%5 == 0) {
        System.out.println("FizzBuzz");
      //if the variable i is a multiple of 3 but not 5, it prints Fizz
      } else if (i%3 == 0 && i%5 != 0) {
        System.out.println("Fizz");
      //if the variable i is a multiple of 5 but not 3, it prints Buzz
      } else if (i%5 == 0 && i%3 != 0) {
        System.out.println("Buzz");
      //if the variable i is neither multiple of 3 or 5, it prints the number
      } else {
        System.out.println(i);
      }
    }
  }
}
