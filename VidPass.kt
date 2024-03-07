class VidPass(var mecta: Int, var zenav: Int, snomer: Int, spnaz: String, sday:Int, stimep: Double, stimes: Double):Trip(snomer,spnaz,sday,stimep,stimes)
{
    override fun GetInfo()
    {
        println("Номер поезда $nomer")
    }
    fun Mesta()
    {
        do {
            println("Введите сколько всего мест в вагоне")
            mecta= readLine()!!.toInt()
            println("Введите сколько мест свободных")
            var b=readLine()!!.toInt()
            println("В вагоне $mecta мест, $b свободных")
            println("цена одного места 55 рублей")
            println("Введите сколько мест вы ходите купить")
            var c=readLine()!!.toInt()
            if (c<b)
            {
                var a=55
                zenav=a*c
            }
        }while (mecta<0 || b<0)
        println("Цена за места: $zenav")
    }
}