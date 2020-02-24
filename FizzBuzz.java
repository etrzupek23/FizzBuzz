/*
This program prints out the numbers 1-100 and replaces multiples of 3 with Fizz,
multiples of 5 with Buzz, and multiples of both with FizzBuzz
Created by Emma on Feb. 24th, 2020
Intermediate Programming - Block 8
*/
class FizzBuzz {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++){
      if (i%3 == 0 && i%5 == 0) {
        System.out.println("FizzBuzz");
      } else if (i%3 == 0 && i%5 != 0) {
        System.out.println("Fizz");
      } else if (i%5 == 0 && i%3 != 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
  }
}
