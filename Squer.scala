import scala.io.StdIn

object Squer {

  def main(args: Array[String]) : Unit = {


    println("Enter the number to do Squer")

    val  number  = StdIn.readInt();

    val squre = number * number;

    print(squre)
  }
}
