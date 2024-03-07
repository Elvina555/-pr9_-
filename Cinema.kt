open class Cinema (var nazv:String, var session:Double, var mani:Double, var zal:Int, var kolz:Int)
{
    open fun SetInfo()
    {
        try
        {
            println("Введите название кинофильма")
            nazv = readLine()!!.toString()
            do {
                println("Введите время сеанса")
                session= readLine()!!.toDouble()
            }while (session<0)
            do {
                println("Введите стоимость билета")
                mani=readLine()!!.toDouble()
            }while (mani<0)
            do {
                println("Введите зал")
                zal=readLine()!!.toInt()
            }while (zal<0)
            do {
                println("Введите количество зрителей")
                kolz=readLine()!!.toInt()
            }while (kolz<0)
        } catch (e: Exception)
        {
            println("Введен символ")
        }
    }
    open fun GetInfo()
    {
        println("Название кинофильма:$nazv \nДлительность сеанса:$session \nСтоимость билета:$mani руб. \nЗал:$zal \nКоличество зрителей:$kolz")
    }
    open fun Skidka()
    {
        println("Есть ли у вас скидочая карта? Да или Нет")
        var a= readLine()!!.toString()
        if(a=="Да")
        {
            mani=mani*0.8
        }
        else if (a=="Нет")
        {
            println("Скидки нет")
        }

    }
    open fun SetNazv()
    {
        println("Введите название кинофильма")
        nazv = readLine()!!.toString()
    }
}