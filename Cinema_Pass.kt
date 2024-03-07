class Cinema_Pass(var zena:Double,var kolm:Int, var skid:Double, cnazv:String, csession:Double, cmani:Double, czal:Int, ckolz:Int):Cinema(cnazv,csession,cmani,czal,ckolz)
{
    override fun GetInfo()
    {
        println("Название кинофильма: $nazv")
    }
    fun Zena()
    {
        println("Вы хотите 1-Vip-зал 2-обычный")
        var z= readLine()!!.toString()
        if (z=="1")
        {
            do{
                println("Введите кол-во мест в зале:")
                kolm= readLine()!!.toInt()
            }while (kolm<0)
            do{
                println("Сколько мест вы бы хотели купить?")
                var a=readLine()!!.toInt()
                println("Введите стоимость одного билета")
                var  b= readLine()!!.toDouble()
                zena=(b*a)*2
            }while(a>kolm || a<0 || b<0)
            println("Количество мест в зале:$kolm \nСтоимость билета:$zena")
        }
        else if(z=="2") {
            do {
                println("Введите кол-во мест в зале:")
                kolm = readLine()!!.toInt()
            } while (kolm < 0)
            do {
                println("Сколько мест вы бы хотели купить?")
                var a = readLine()!!.toInt()
                println("Введите стоимость одного билета")
                var b = readLine()!!.toDouble()
                zena = b * a
            } while (a > kolm || a < 0 || b < 0)
            println("Количество мест в зале:$kolm \nСтоимость билета:$zena")
        }
    }
    fun Skid()
    { println("Есть ли у вас Пушкинская карта?")
        println("1-Да 2-Нет")
        var z= readLine()!!.toString()
        if (z=="1")
        {
            println("Цена со скидкой: бессплатно по карте")
        }
        else if (z=="2") {
            println("Вы студент или пенсионер? Да или Нет")
            var a = readLine()!!.toString()
            if (a == "Да") {
                skid = zena * 0.8
            } else if (a == "Нет") {
                println("Скидки нет")
            }
            println("Цена со скидкой:$skid")
        }
    }
}