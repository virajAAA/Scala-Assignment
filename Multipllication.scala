import scala.io.StdIn

object Multipllication {

  def main(args: Array[String]) : Unit = {

    println("Enter the first number")
    val fNumber =  StdIn.readInt();

    println("Enter the second number")
    val sNumber = StdIn.readInt();

    val multi = fNumber * sNumber;
    print(multi);

  }

}
