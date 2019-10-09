package Traits

trait GeometricShape {
  /**
   *
   * @return Value of area
   */
  def area(): Int

  /**
   *
   * @return Number of edges
   */
  def edges(): Int

  /**
   *
   * @return Number of dimensions
   */
  def dimensions(): Int

  /**
   * Print the shape
   */
  def show(): Unit
}
