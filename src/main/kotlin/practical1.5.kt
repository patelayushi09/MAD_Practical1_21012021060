fun main()
{
    print("Enter number: ")
    var mon: Int = readLine()!!.toInt()
    var result = month(mon)
    println(result)
}
fun month(obj:Any):String=
        when (obj){
            1-> "January"
            2->"February"
            3->"March"
            4->"April"
            5->"May"
            6->"June"
            7->"July"
            8->"August"
            9->"September"
            10->"October"
            11->"November"
            else->"December"
        }

