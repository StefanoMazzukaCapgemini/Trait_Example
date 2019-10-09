package Main

object Main {
  def main(args: Array[String]): Unit = {
    var op = 0
    do {
       op = Utils.menu()
      if (op == 1) Utils.createCircle()
      else if (op == 2) Utils.createSquare()
      else if (op == 3) Utils.createTriangle()
      else if (op == -1) println("ERROR: Option have to be Int")
    } while (op != 0)
  }
}