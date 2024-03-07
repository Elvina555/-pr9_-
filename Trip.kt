open class Trip(var nomer: Int, var pnaz: String, var day:Int, var timep: Double, var times: Double)
{
    open fun SetInfo() {
        try {
            do {
                println("Введите номер поезда:")
                nomer = readLine()!!.toInt()
            } while (nomer < 0)
            println("Введите пункт назначения:")
            pnaz = readLine()!!.toString()
            do {
                println("Введите сколько дней длилось иследование:")
                day = readLine()!!.toInt()
            } while (day < 0)
            do {
                println("Введите время прибытия")
                timep = readLine()!!.toDouble()
            } while (timep < 0)
            do {
                println("Введите время стоянки")
                times = readLine()!!.toDouble()
            } while (times < 0)
        } catch (e: Exception) {
            println("Введен символ")
        }
    }
    open fun GetInfo()
    {
        println("Номер поезда: $nomer \nПункт назначения: $pnaz \nДни иследования: $day \nВремя прибытия: $timep \nВремя стоянки: $times \n")
    }
    open fun Time()
    {
        var a:Double
        a = timep - times
        println("Время поездки $a")
    }

}