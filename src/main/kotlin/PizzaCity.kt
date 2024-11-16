abstract class PizzaCity(
    val neapolitanPizzaPrice: Double, val romanPizzaPrice: Double,
    val sicilianPizzaPrice: Double, val tyroleanPizzaPrice: Double
) {
    var neapolitanPizzaCount = 0
    var romanPizzaCount = 0
    var sicilianPizzaCount = 0
    var tyroleanPizzaCount = 0

    abstract fun neapolitanPizzaSale()
    abstract fun romanPizzaSale()
    abstract fun sicilianPizzaSale()
    abstract fun tyroleanPizzaSale()
    fun showStatistics(){
        println("Продано сицилийской пиццы: $sicilianPizzaCount")
        println("Продано неаполитанской пиццы: $neapolitanPizzaCount")
        println("Продано римской пиццы: $romanPizzaCount")
        println("Продано тирольской пиццы: $tyroleanPizzaCount")

        val countOfPeople = sicilianPizzaCount + neapolitanPizzaCount + romanPizzaCount + tyroleanPizzaCount

        val oneProcentOfPeople = countOfPeople / 100.0

        var money = neapolitanPizzaCount * neapolitanPizzaPrice + romanPizzaCount * romanPizzaPrice +
                sicilianPizzaCount * sicilianPizzaPrice + tyroleanPizzaCount * tyroleanPizzaPrice

        if(this is Drink)
        {
            println("Продано напитков: $drinkSaleCount")
            println("Процент людей, которые покупают кофе: ${drinkSaleCount / oneProcentOfPeople}%")
            println("Процент людей, которые не покупают кофе: ${countOfPeople - drinkSaleCount / oneProcentOfPeople}%")
            money += drinkSaleCount * drinkSalePrice
        }
        if(this is CheckPhoto)
        {
            println("Показано чеков: $checkCount")
            println("Общая сумма скидок по чекам: ${checkCount * checkDiscount}")
            println("Процент людей, которые предъявляют фотографию чека: ${checkCount / oneProcentOfPeople}%")
            println("Процент людей, которые не предъявляют фотографию чека: ${countOfPeople - checkCount / oneProcentOfPeople}%")

            money -= checkCount * checkDiscount
        }

        if(this is Sauce)
        {
            println("Продано кетчупов: $sauceOneSaleCount")
            println("С кетчупов заработано: ${sauceOneSaleCount * sauceOneSalePrice}")
            money += sauceOneSaleCount * sauceOneSalePrice
            println("Продано горчицы: $sauceTwoSaleCount")
            println("С горчицы заработано: ${sauceTwoSaleCount * sauceTwoSalePrice}")
            money += sauceTwoSaleCount * sauceTwoSalePrice
        }

        println("Всего заработано денег: $money")
    }
}