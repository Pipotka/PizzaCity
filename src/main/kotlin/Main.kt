import kotlin.system.exitProcess
fun main() {
    val pizzaPeter = PizzaPeter(
        175.3, 241.5,
        167.5, 215.0,
        200.0
    )
    val pizzaMoscow = PizzaMoscow(
        215.0, 250.5,
        180.5, 240.0,
        50.0
    )
    val pizzaMinsk = PizzaMinsk(
        199.99, 309.99,
        189.99, 219.99,
        50.0, 200.0,
        10.0, 30.0
    )
    var currentPizzaCity: PizzaCity = pizzaPeter

    while (true) {
        println("Добрый день! Выберите город")
        println("1. Москва\n2. Санкт-Петербург\n3. Минск\n0. Выход из программы")

        currentPizzaCity = when (readln()) {
            "1" -> pizzaMoscow
            "2" -> pizzaPeter
            "3" -> pizzaMinsk
            "0" -> break
            else -> {
                println("ERROR")
                continue
            }
        }

        selectPizza(currentPizzaCity)
    }
}

private fun selectPizza(currentPizzaCity: PizzaCity) {
    println("Выберите пиццу:")
    println("1. Неаполитанская пицца\n2. Римская пицца\n3. Сицилийская пицца\n4. Тирольская пицца\n0. Показать статистику")
    when (readln()) {
        "1" -> {
            currentPizzaCity.neapolitanPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "2" -> {
            currentPizzaCity.romanPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "3" -> {
            currentPizzaCity.sicilianPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "4" -> {
            currentPizzaCity.tyroleanPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "0" -> currentPizzaCity.showStatistics()
        else -> {
            println("ERROR")
            exitProcess(1)
        }
    }
}

fun selectAddService(currentPizzaCity: PizzaCity){
    if(currentPizzaCity is CheckPhoto)
    {
        currentPizzaCity.showCheckPhoto()
    }
    if(currentPizzaCity is Drink)
    {
        currentPizzaCity.drinkSale()
    }
    if(currentPizzaCity is Sauce)
    {
        currentPizzaCity.sauceSale()
    }
}