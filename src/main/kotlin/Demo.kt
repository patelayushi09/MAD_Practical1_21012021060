class Student(var enrollment:Long,var name:String="AYUSHI"){

    constructor():this(21012021060){
        println("Enrollment number: $enrollment")
    }

  init{
        println("Your Enrollment number is $enrollment and name is $name")
    }

}
fun main(){
    val s1=Student()
    val s2=Student(60)
    // if we donot send any parameter in s then it will call constructor
    val s=Student(60,"ayushi")

}