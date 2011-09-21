package ojug

object Scala11 {
  def main(args: Array[String]) {
    val l = List(1, 2, 3, 4)
    
    // parallel computations. will automatically
    // invoke "_ + 1" across a thread pool, but
    // only if your list is big enough to make it
    // worth while
    l.par.map(_ + 1)

    // doesn't keep you from doing things that are
    // not thread-safe, like not locking on shared
    // state:
    var accm = 0
    l.par.foreach(i => accm += i)
  }
}