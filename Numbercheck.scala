package DowhileLoop

import scala.io.StdIn

object Numbercheck {

  def main(args: Array[String]): Unit ={

    println("Enter the number")
    val number = StdIn.readInt();

    if(number == 0)
      {
        println("Number is zero")
      }
    else if(number > 0)
      {
        println("Number is postive")
      }
    else
      {
        println("Number is negative")
      }


  }

}
