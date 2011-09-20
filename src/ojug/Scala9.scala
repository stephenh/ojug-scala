package ojug

object Scala9 {
  case class Employee(id: Int)

  private def findEmployee(id: Int): Option[Employee] = {
    if (id == 1) Some(Employee(1)) else None
  }

  def main(args: Array[String]) {
    val ee1 = findEmployee(1)
    val ee2 = findEmployee(2)
    List(ee1, ee2).foreach { _ match {
      case Some(ee) => println("found " + ee)
      case None => println("none")
    }}

    // println(List(ee1, ee2).map(_.map(_.id)))
  }

}