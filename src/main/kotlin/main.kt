



fun calculatePay(prevPay:Double=0.00,cardT:String,currAmount:Double):Double{
    val commision:Double = when(cardT){
        "Vk Pay" -> 0.00
        "MasterCard","Maestro" -> {
            when {
                (currAmount + prevPay) < 75000 -> 0.0
                else -> 0.06
            }
        }
        "Visa","Mir" -> 0.075
        else -> 0.00
    }
    if(commision>0.0)
        return commision
    else
        return 0.0
}
