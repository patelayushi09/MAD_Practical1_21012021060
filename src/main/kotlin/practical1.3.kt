fun main(){
   print("Enter student Enrollment no.:");
    var a:Long?= readLine()!!.toLong()
    print("Enter student Name:");
    var b:String?= readLine()
    print("Enter student Branch:");
    var c:String?= readLine()
    print("Enter student Class:");
    var d:String?= readLine()
    print("Enter student Age:");
    var e:Int= readLine()!!.toInt()
    print("Enter student Batch:");
    var g:String?= readLine()
    print("Enter student College Name:");
    var f:String?= readLine()
    print("Enter student University Name:");
    var h:String?= readLine()

    println("STUDENT`S INFORMATION")
    println("Enrollment no:$a, \nName:$b, \nBranch:$c, \nClass:$d, \nBatch:$g, \nAge:$e, \nCollege Name:$f, \nUniversity Name:$h")
}