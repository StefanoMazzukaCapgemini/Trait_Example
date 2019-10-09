package Main

import GeometricShapes.{Circle, Square, Triangle}
import Traits.GeometricShape

object Utils {
  def menu(): Int = {
    println("╔════════════════════╗")
    println("║        MENU        ║")
    println("╠════════════════════╣")
    println("║ 1. Create circle   ║")
    println("║ 2. Create square   ║")
    println("║ 3. Create triangle ║")
    println("║ 0. Exit            ║")
    println("╚════════════════════╝")
    print("Select option: ")

    scala.io.StdIn.readInt()
  }

  def createCircle(): Unit = {
    print("Introduce radius: ")
    val circle = new Circle(scala.io.StdIn.readInt())

    showData(circle)
  }

  def createSquare(): Unit = {
    print("Introduce base: ")
    val square = new Square(scala.io.StdIn.readInt())

    showData(square)
  }

  def createTriangle(): Unit = {
    print("Introduce base: ")
    val base = scala.io.StdIn.readInt()
    print("Introduce height: ")
    val height = scala.io.StdIn.readInt()
    val triangle = new Triangle(base, height)

    showData(triangle)
  }

  def showData(geometricShapes: GeometricShape): Unit = {
    geometricShapes.show()
    println("Area: " + geometricShapes.area)
    println("Edges: " + geometricShapes.edges)
    println("Dimensions: " + geometricShapes.dimensions)
  }
}