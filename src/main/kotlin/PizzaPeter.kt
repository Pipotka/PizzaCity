class PizzaPeter(
    neapolitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, tyroleanPizzaPrice: Double,
    drinkSalePrice: Double
) : PizzaCity(
    neapolitanPizzaPrice, romanPizzaPrice,
sicilianPizzaPrice, tyroleanPizzaPrice
), Drink {
    override fun neapolitanPizzaSale() {
        neapolitanPizzaCount++
        println("Спасибо за покупку неополитанской пиццы в Санкт-Петербурге")
    }

    override fun romanPizzaSale() {
        romanPizzaCount++
        println("Спасибо за покупку римской пиццы в Санкт-Петербурге")
    }

    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        println("Спасибо за покупку сицилийской пиццы в Санкт-Петербурге")
    }

    override fun tyroleanPizzaSale() {
        tyroleanPizzaCount++
        println("Спасибо за покупку тирольской пиццы в Санкт-Петербурге")
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
}