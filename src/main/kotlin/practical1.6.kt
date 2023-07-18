
fun main(){
    print("Enter first number:")
    var a:Int= readLine()!!.toInt()
    print("Enter second number:")
    var b:Int= readLine()!!.toInt()
    println("Addition: ${add(a,b)}")
    println("Substraction: ${sub(a,b)}")
    println("Multiplication: ${mul(a,b)}")
    println("Division: ${div(a,b)}")
    println("Modulo: ${mod(a,b)}")

}
fun add(p:Int,q:Int):Int{
    return p+q
}

fun sub(p:Int,q:Int):Int{
    return p-q
}
fun mul(p:Int,q:Int):Int{
    return p*q
}
fun mod(p:Int,q:Int):Int{
    return p%q
}
fun div(p:Int,q:Int):Int{
    return p/q
}