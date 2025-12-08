package DowhileLoop

import scala.io.StdIn

object MaximumNumber {

  def main (args: Array [String]): Unit ={

    println("We will check which is big number")

    println("Enter the first number")
    val number1 = StdIn.readInt();

    println("Enter the second number")
    val number2 = StdIn.readInt();

    if(number1 > number2)
      {
        print("Max number is" + number1)
      }
    else
      {
        println("Max number is" + number2)
      }
  }

}
