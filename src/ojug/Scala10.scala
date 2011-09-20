package ojug

object Scala10 {
  def main(args: Array[String]) {
    abstract class Person
    case class Employee(id: Int, name: String) extends Person
    case class Employer(name: String) extends Person

    val people = List(Employee(1, "bob"), Employer("er1"), Employer("er2"))
    people.foreach { _ match {
      case Employee(id, _) => println("ee" + id)
      case Employer(name) if name == "er1" => println("special er")
      case Employer(_) => println("non-special er")
    }}
  }

}