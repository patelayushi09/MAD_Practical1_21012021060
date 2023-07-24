
fun main(){
    val a=ArrayList<Int>()
    a.add(9)
    a.add(2)
    a.add(11)
    a.add(5)
    a.add(13)
    a.add(7)
    a.add(51)
    var max:Int=a.get(0)


    for(i in 1 .. a.size-1){
        println(a[i])
        if(max<a.get(i)){
            max=a.get(i)
        }
    }
    print("Maximum number in array list is $max")
}




