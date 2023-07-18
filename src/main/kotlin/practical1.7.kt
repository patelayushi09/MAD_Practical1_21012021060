fun main(){
    print("Enter any number to find its factorial: ")
    var n:Int= readLine()!!.toInt()
    var res=factorial(n)
    print("Factorial of $n is $res")
}
fun factorial(a:Int):Long{
    if(a>1){
        return a*factorial(a-1)
    }
    else{
        return 1
    }
}