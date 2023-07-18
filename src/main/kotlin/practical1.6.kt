
fun main(){
    print("Enter first number:")
    var c:Int= readLine()!!.toInt()
    print("Enter second number:")
    var d:Int= readLine()!!.toInt()
    arithmetic(c,d)
}
fun arithmetic(a:Int,b:Int){
    println("Sum of $a & $b is ${a+b}")
    println("Difference of $a & $b is ${a-b}")
    println("Multiplication of $a & $b is ${a*b}")
    println("Division of $a & $b is ${a/b}")
    println("Modulo of $a & $b is ${a%b}")

}