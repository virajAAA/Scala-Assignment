package forloop

import scala.io.StdIn.readInt

object Nnumber {

  def main (args: Array[String]): Unit ={

    println("Enter the number")
    var num = readInt();

    for(i <- 1 to num){
      println(i)
    }

  }

}
