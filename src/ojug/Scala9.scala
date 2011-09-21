package ojug

object Scala9 {
  case class Employee(id: Int)

  // instead of null, return Option[T]
  private def findEmployee(id: Int): Option[Employee] = {
    if (id == 1) Some(Employee(1)) else None
  }

  def main(args: Array[String]) {
    val ee1 = findEmployee(1)

    // ee1.id is a compile error, so forces caller to check
    
    // Java-style if
    if (ee1.isDefined) {
      println("found " + ee1.get)
    } else {
      println("none")
    }

    // Scala-style pattern matching
    ee1 match {
      case Some(ee) => println("found " + ee)
      case None => println("none")
    }
  }

}