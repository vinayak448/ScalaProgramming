
class SetVariables {
  private var a : Int = 0
  private var b : Int = 0

  def setVariables(input1:Int,input2:Int) = {
    a = input1;
    b = input2;
  }

  def getVariables()= println("Variable value are :"+a+" "+b)
}
object DemoClasses {
  def main(args: Array[String]): Unit = {
    val myclass = new SetVariables;

    myclass.setVariables(10,20);
    myclass.getVariables()
  }
}
