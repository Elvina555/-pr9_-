class Cinema_Grin(var zena:Double,var kolm:Int, var skid:Double, cnazv:String, csession:Double, cmani:Double, czal:Int, ckolz:Int):Cinema(cnazv,csession,cmani,czal,ckolz)
{
    override fun GetInfo()
    {
        println("Название кинофильма: $nazv")
    }
    fun Zena()
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
            zena=b*a
        }while(a>kolm || a<0 || b<0)
        println("Количество мест в зале:$kolm \nСтоимость билета:$zena")
    }
    fun Skid()
    {
        println("Вы студент или пенсионер? Да или Нет")
        var a= readLine()!!.toString()
        if(a=="Да")
        {
            skid=zena*0.8
            println("Цена со скидкой:$skid")
        }
        else if (a=="Нет")
        {
            println("Скидки нет")
        }
    }
}