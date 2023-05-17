object Functions {
  def summation ( a : Int , b : Int)  =
    {
      a+b
    }

  def addition ( a:Int,b:Int) = a+b

  def main(args: Array[String]): Unit = {
    var a = 10
    var b = 20
    println("Addition of Variables "+ a + " and " + b +  " is = " + summation(a,b))
    println("Addition of Variables "+ a + " and " + b +  " is = " + addition(a,b))
  }
}
