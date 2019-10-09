package GeometricShapes

import Traits.GeometricShape

class Square(base: Int) extends GeometricShape {
  /**
   *
   * @return Value of area
   */
  override def area(): Int = base * base

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
  override def show(): Unit = println("■")
}
