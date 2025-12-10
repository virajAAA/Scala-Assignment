package DowhileLoop

import scala.io.StdIn.{readChar, readInt}

object Colorcode {
  def main (args: Array[String]): Unit ={

    val RED = "\u001b[31m"
    val GREEN = "\u001b[32m"
    val BLUE = "\u001b[34m"


    var continue = true

    println("Coose Letter will tell you the name")
    println("R.")
    println("B.")
    println("G.")
    println("Enter your choice")

    val choice = readChar()

//    println("Enter the Char")
//    val num1 = readChar(); println("Enter the Char")
//    val num1 = readChar();



    choice match {
      case 'R' => print(RED + "Red color" )
      case 'B' => print(BLUE + "Blue color")
      case 'G' => print(GREEN + "Green color")

      case _ =>
        println("Invalid choice. Please enter valid Alphabate")



    }


  }



}
