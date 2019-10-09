package GeometricShapes

import Traits.GeometricShape

class Triangle(base: Int, height: Int) extends GeometricShape {
  /**
   *
   * @return Value of area
   */
  override def area(): Int = (base * height) / 2

  /**
   *
   * @return Number of edges
   */
  override def edges(): Int = 3

  /**
   *
   * @return Number of dimensions
   */
  override def dimensions(): Int = 2

  /**
   * Print the shape
   */
  override def show(): Unit = println("▲")
}
