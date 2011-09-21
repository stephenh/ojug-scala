package ojug

// equals, hashCode, cstr, getters, setters all done for you
case class EmployeeDto(id: Int, name: String) {
  def specialName = name.toUpperCase
}

class Scala5 {
  val employees = List(EmployeeDto(1, "bob"), EmployeeDto(2, "fred"))

  def haveName(name: String) = employees.exists(_.name == name)

  def haveEmp(other: EmployeeDto) = employees.contains(other)
}

object Scala5 {
  def main(args: Array[String]) {
    val s5 = new Scala5
    println(s5.haveName("bob"))
    println(s5.haveEmp(EmployeeDto(1, "bob")))

    val e1 = new EmployeeDto(1, "bob")
    val e2 = new EmployeeDto(1, "bob")
    println(e1.hashCode == e2.hashCode)
  }
}