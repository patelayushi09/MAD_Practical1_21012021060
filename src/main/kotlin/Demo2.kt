open class person(var name:String="Ayushi"){
    init {
        println("Name: $name")
    }
    fun display(){
        println("Your name is $name")
    }
}

class child(var enrollment:Long=21012021060):person(){
    init{
        println("Your enrollment is $enrollment")
    }
}

fun main(){
    // init of parent is called first and then of child
    val obj=child(60)
    val obj1=child()
    obj.display()
}