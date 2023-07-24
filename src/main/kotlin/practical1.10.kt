//For more info see demo.kt file
class Car(var car_info:String, var owner:String, var milesDrive:Int, var original_price:Double, var current_price:Double)
{

    constructor():this("BMW, 2018", "Ayushi", 105, 100000.0, 98950.0)

    init {
        println("Object of class is created and Init is called")
    }

    fun displayCarInfo()
    {
        println("Car Information: $car_info \nCar Owner: $owner \nMiles Drive: $milesDrive")
    }

    fun getOriginalCarPrice()
    {
        println("Original Car Price: $original_price")
    }

    fun getCurrentCarPrice()
    {
        println("Current Car Price: $current_price")
    }
}

fun main() {
    //called first init and then constructor
    val obj1 = Car()
    obj1.displayCarInfo()
    obj1.getOriginalCarPrice()
    obj1.getCurrentCarPrice()


    //called init and
    val obj2 = Car("TOYOTA, 2017", "Kavan", 100, 100800.0, 86950.0)
    obj2.displayCarInfo()
    obj2.getOriginalCarPrice()
    obj2.getCurrentCarPrice()


    println("ArrayList of Car:")
    val cars = ArrayList<Car>()
    val obj3 = Car()
    val obj4 = Car("Honda, 2015", "Dharmi", 110, 90000.0, 70500.50)
    val obj5 = Car("Maruti, 2020", "Hetvi", 200, 4000000.0, 3998000.0)

//    cars.add(obj3)
//    cars.add(obj4)
//    cars.add(obj5)
    cars.addAll(listOf(obj3, obj4, obj5))

    for (car in cars) {
        car.displayCarInfo()
        car.getOriginalCarPrice()
        car.getCurrentCarPrice()
    }
}
