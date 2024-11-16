class PizzaMinsk(
    neapolitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, tyroleanPizzaPrice: Double,
    checkDiscount: Double, drinkSalePrice: Double,
    sauceOneSalePrice: Double, sauceTwoSalePrice: Double
) : PizzaCity(
    neapolitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice
), CheckPhoto , Drink, Sauce {
    override fun neapolitanPizzaSale() {
        neapolitanPizzaCount++
        println("Спасибо за покупку неополитанской пиццы в Минске")
    }

    override fun romanPizzaSale() {
        romanPizzaCount++
        println("Спасибо за покупку римской пиццы в Минске")
    }

    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        println("Спасибо за покупку сицилийской пиццы в Минске")
    }

    override fun tyroleanPizzaSale() {
        tyroleanPizzaCount++
        println("Спасибо за покупку тирольской пиццы в Минске")
    }

    override var checkCount: Int = 0
        get() = field
        set(value) {
            field = value
        }
    override var checkDiscount: Double = checkDiscount
        get() = field
        set(value) {
            field = value
        }

    override fun showCheckPhoto() {
        println("У вас есть фотография чека?")
        println("1. Да\n2. Нет")
        if(readln() == "1") {
            println("Вам будет скидка 50 рублей с покупки")
            checkCount++
        }
    }

    override var drinkSaleCount: Int = 0
        get() = field
        set(value) {
            field = value
        }
    override var drinkSalePrice: Double = drinkSalePrice
        get() = field
        set(value) {
            field = value
        }

    override fun drinkSale() {
        println("Вы будете кофе?")
        println("1. Да\n2. Нет")
        if(readln() == "1") {
            println("С вас 200 рублей")
            drinkSaleCount++
        }
    }
    override var sauceOneSaleCount: Int = 0
        get() = field
        set(value) {
            field = value
        }

    override var sauceOneSalePrice: Double = sauceOneSalePrice
        get() = field
        set(value) {
            field = value
        }
    override var sauceTwoSaleCount: Int = 0
        get() = field
        set(value) {
            field = value
        }
    override var sauceTwoSalePrice: Double = sauceTwoSalePrice
        get() = field
        set(value) {
            field = value
        }

    override fun sauceSale() {
        println("Какой соус выберите:\n1. Кетчуп\n2. Горчица")
        when (readln()) {
            "1" ->{
                println("С вас 10 рублей")
                sauceOneSaleCount++
            }
            "2" ->{
                println("С вас 30 рублей")
                sauceTwoSaleCount++
            }
            else ->{
                println("ERROR")
            }
        }
    }
}