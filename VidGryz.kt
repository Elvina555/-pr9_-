class VidGryz(var vagon: String, var zenav: Double, snomer: Int, spnaz: String, sday:Int, stimep: Double, stimes: Double):Trip(snomer,spnaz,sday,stimep,stimes)
{
    override fun GetInfo()
    {
        println("Номер поезда $nomer")
    }
    fun Vagon()
    {
        do
        {
            println("Ввыберите вагон для грузового поезда:кратный,полувагон,вагон-ледник,вагон-термос")
            println("Полувагон в 2 раза дешевле, ледник и термос в 3 раза дороже, чем кратный")
            vagon=readLine()!!.toString()
        }while (vagon=="кратный вагон" || vagon=="полувагон" || vagon=="вагон-ледник"|| vagon=="вагон-термос")
    }
    fun Zen()
    {
        println("Введите стоимость кратного вагона")
        var a= readLine()!!.toDouble()
        if (vagon=="кратный")
        {
            zenav=a
        }
        else if(vagon=="полу")
        {
            zenav=a/2
        }
        else if(vagon=="ледник" || vagon=="термос")
        {
            zenav=a*3
        }
        println("Вы выбрали $vagon. Стоимость $zenav руб.")
    }
}