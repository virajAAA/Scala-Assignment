package DowhileLoop

import scala.io.StdIn

object EvenODD {

  def main (args: Array [String]): Unit ={

    println("Enter the number to check even or odd")
    var number = StdIn.readInt();

    if(number%2==0)
      {
        print("Number is even")
      }
    else
      {
        print("Number is odd")
      }

  }

}
