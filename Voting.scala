package DowhileLoop

import scala.io.StdIn

object Voting {

  def main (args: Array [String]) : Unit = {
 var age=0;
    do {
      println("Enter your age:")
      var age = StdIn.readInt()

      if (age < 0) {
        println("Age cannot be negative. Try again.")
      } else if (age >= 18) {
        println("You are eligible to vote.")
      } else {
        println("You are not eligible to vote yet.")
      }

    } while (age < 0)

  }

}






