import scala.collection.mutable.ListBuffer

object TransformTheExpression extends App {
    // your code goes here
    //val N = readInt

    def rpn(exp : String) : String =
        exp match {
            case "" => ""
            case exp: String if exp.charAt(0) == '(' => rpn(exp.substring(1))
            case exp: String if exp.charAt(0) == ')' => rpn(exp.substring(1))

            case exp: String if exp.charAt(0) == '+' => rpn(exp.substring(1)) + exp.charAt(0)
            case exp: String if exp.charAt(0) == '-' => rpn(exp.substring(1)) + exp.charAt(0)
            case exp: String if exp.charAt(0) == '*' => rpn(exp.substring(1)) + exp.charAt(0)
            case exp: String if exp.charAt(0) == '/' => rpn(exp.substring(1)) + exp.charAt(0)
            case exp: String if exp.charAt(0) == '^' => rpn(exp.substring(1)) + exp.charAt(0)

            case _ => exp.charAt(0) + rpn(exp.substring(1))
        }

    //(1 to N).map(_ => readLine).foreach({case l : String => println(rpn(l))})

    //val l = readLine
    //println(rpn(l))
    println(rpn("((a+t)*((b+(a+c))^(c+d)))"))
}
