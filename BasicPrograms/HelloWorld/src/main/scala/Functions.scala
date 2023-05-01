object Functions {
  def summation ( a : Int , b : Int) : Int =
    {
      return a+b
    }
  def main(args: Array[String]): Unit = {
    var a = 10
    var b = 20
    println("Addition of Variables "+ a + " and " + b +  " is = " + summation(a,b))
  }
}
