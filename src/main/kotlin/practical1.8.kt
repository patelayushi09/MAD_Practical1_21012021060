fun main()
{
    // var arr1: Array<Int> = arrayOf(10,90,60,80,100)
    var a = arrayOf(10,20,30,40)
    print("Create Array-1 by using arrayOf() method: ")
//    for(i in 0..arr1.size-1)
//    {
//        print("${arr1[i]} ")
//    }

    for(i in a)
    {
        print("$i ")
    }
    println()

    // var arr2 = Array(5){0}
    var b = Array<Int>(3){0}
    print("Create Array-2 by using Array<>(): ")

    for(i in b)
    {
        print("$i ")
    }

    println()
    //var arr3 = Array<Int>(5){i:Int->i+1}
    //i start with 0
    //var arr3 = Array<Int>(5){i->i}
    var c = Array<Int>(5){i:Int->i}
    print("Create Array-3 by using Array<>(): and lambda function: ")

    for(i in c)
    {
        print("$i ")
    }

    println()
    var d= IntArray(5){0}
    print("Create Array-4 by using IntArray(): ")
    for(i in d)
    {
        print("$i ")
    }

    println()
    var e = intArrayOf(19,18,5,1,10,12)
    print("Create Array-5 by using intArrayOf(): ")
    for(i in 5 downTo 0)
    {
        print("${e[i]} ")
    }

    println()
    var f = arrayOf(intArrayOf(1,3), intArrayOf(4,5), intArrayOf(6,7))
    println("Create 2D Array-6 by using arrayOf() and intArrayOf():")
    for(i in f)
    {
        println(i.contentToString())
    }
    println(f.contentDeepToString())
    println(java.util.Arrays.deepToString(f))

//    for(j in 0..2)
//    {
//        for (i in arr6[j])
//        {
//            print("$i ")
//        }
//        println()
//    }

    //It will be print 0 1 2 3
//    var arr7:Array<Int> = arrayOf(0)
//    for(i in 0..3)
//    {
//        println(i)
//    }

    var g:Array<Int> = arrayOf(0,0,0,0,0)
    println("Please enter Array value: ")
//    for (i in 0..4)
    val range=0..4
    for(i in range){
        print("a[$i]=")
        g[i]= readLine()?.toInt()!!
    }

    println("Entered Array: ")
    println(java.util.Arrays.deepToString(g))


    println("After sorting by built-in function:")
    g.sort()
    println(java.util.Arrays.deepToString(g))


    println("Elements of Array:")
    var h:Array<Int> = arrayOf(56,23,49,12,2)
    println(java.util.Arrays.deepToString(h))
    //we can use println(Arrays.deepToString(arr8)) directly by import java.util.*
    //for (i in 0..arr8.size-1)
    for (i in 0..h.size-2)
    {
        for (j in i+1..h.size-1)
        {
            if(h[i]>h[j])
            {
                var temp=h[i]
                h[i]=h[j]
               h[j]=temp
            }
        }
    }
    println("After sorting without built-in function:")
    println(h.contentDeepToString())

    var m = arrayOf(1,2,3,4,5)
    val result = m.joinToString(", ")
    print("result in string: [${result}]")
}
