fun main(){
    println("Enter any number:")
    var a= readLine()!!.toInt()
    var s=if(a  % 2 == 0){
        println("$a is an even number")
    }
    else{
        println("$a is an odd number")
    }
}