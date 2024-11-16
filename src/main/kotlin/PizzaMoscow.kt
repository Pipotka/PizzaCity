class PizzaMoscow(
    neapolitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, tyroleanPizzaPrice: Double,
    checkDiscount: Double
) : PizzaCity(
    neapolitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice
), CheckPhoto {
    override fun neapolitanPizzaSale() {
        neapolitanPizzaCount++
        println("Спасибо за покупку неополитанской пиццы в Москве")
    }

    override fun romanPizzaSale() {
        romanPizzaCount++
        println("Спасибо за покупку римской пиццы в Москве")
    }

    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        println("Спасибо за покупку сицилийской пиццы в Москве")
    }

    override fun tyroleanPizzaSale() {
        tyroleanPizzaCount++
        println("Спасибо за покупку тирольской пиццы в Москве")
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
}