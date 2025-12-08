import scala.io.StdIn

object Areaofcircle {

  def main(args: Array[String]) : Unit ={

    println("Enter the redius of circle")
    val redius = StdIn.readInt()

    val areaofcircle = 3.14 * redius * redius;

    print(areaofcircle);

  }

}
