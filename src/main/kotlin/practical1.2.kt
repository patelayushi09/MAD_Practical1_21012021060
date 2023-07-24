fun main(){
    var a=5
    var c="12550"
    println("Integer Value:$a,String Value: $c")
    var d=a.toDouble()
    println("Double value (from integer): $d")
    var e=c.toInt()
    println("Integer Value (from string): $e")
    var f=c.toDouble()
    println("Double Value (from string): $f")
    var m="Hello"
   try{
       println(m.toInt())
   }
   catch (e:Exception){
       println("Invalid format")
   }

}