package GeometricShapes

import Traits.GeometricShape

class Circle(radius: Int) extends GeometricShape {
  /**
   *
   * @return Value of area
   */
  override def area(): Int = (Math.PI * Math.pow(radius, 2)).toInt

  /**
   *
   * @return Number of edges
   */
  override def edges(): Int = 1

  /**
   *
   * @return Number of dimensions
   */
  override def dimensions(): Int = 2

  /**
   * Print the shape
   */
  override def show(): Unit = println("●")
}