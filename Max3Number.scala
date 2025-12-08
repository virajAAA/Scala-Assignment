package DowhileLoop

import scala.io.StdIn

object Max3Number {

  def main(args: Array[String]): Unit ={

    print("Enter the first number")
    val number1 = StdIn.readInt()

    print("Enter the second number")
    val number2 = StdIn.readInt()

    print("Enter the Thrid number")
    val number3 = StdIn.readInt()

    if(number1 > number2 && number1 > number3)
      {
        print("Number 1 is max" + number1)
      }
    else if(number2 > number1 && number2 >number3) {
      print("Number 2 is max" + number2)
    }
      else
      {
        print("Number 3 is max" + number3)
      }
    }



}
