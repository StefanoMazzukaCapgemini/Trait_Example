package GeometricShapes

import Traits.GeometricShape

class Circle(radius: Double) extends GeometricShape {
  /**
   *
   * @return Value of area
   */
  override def area(): Double = Math.PI * Math.pow(radius, 2)

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
   *
   * @return Value of circumference
   */
  def circumference(): Double = 2 * Math.PI * radius

  /**
   * Print the shape
   */
  override def show(): Unit = {}
}