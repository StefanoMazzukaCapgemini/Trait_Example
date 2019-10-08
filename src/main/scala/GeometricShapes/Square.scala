package GeometricShapes

import Traits.GeometricShape

class Square(width: Int, height: Int) extends GeometricShape {
  /**
   *
   * @return Value of area
   */
  override def area(): Double = width * height

  /**
   *
   * @return Number of edges
   */
  override def edges(): Int = 4

  /**
   *
   * @return Number of dimensions
   */
  override def dimensions(): Int = 2

  /**
   * Print the shape
   */
  override def show(): Unit = {
   println("╔" + "═"*width + "╗")

    for (i <- 0 to height)
      println("║" + " "*width + "║")

    println("╚" + "═"*width + "╝")
  }
}
