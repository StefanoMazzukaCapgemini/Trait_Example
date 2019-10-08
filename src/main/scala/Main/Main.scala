package Main

import GeometricShapes.{Circle, Square}

object Main {
  /**
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {

    print("Introduce radius: ")
    val radius = scala.io.StdIn.readInt()

    val circle = new Circle(radius)
    val square = new Square(6, 4)

    circle.show()
    square.show()
  }
}