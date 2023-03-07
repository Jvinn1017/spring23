fun main() {
    val restaurants = listOf(
        Restaurant("Joe's Gourmet Burgers", false, false, false),
        Restaurant("Main Street Pizza Company", true, false, true),
        Restaurant("Corner Café", true, true, true),
        Restaurant("Mama's Fine Italian", true, false, false),
        Restaurant("The Chef's Kitchen", true, true, true)
    )

    println("Is anyone in your party a vegetarian? (yes or no)")
    val vegetarian = readLine()?.equals("yes", ignoreCase = true) ?: false

    println("Is anyone in your party a vegan? (yes or no)")
    val vegan = readLine()?.equals("yes", ignoreCase = true) ?: false

    println("Is anyone in your party gluten-free? (yes or no)")
    val glutenFree = readLine()?.equals("yes", ignoreCase = true) ?: false

    val compatibleRestaurants = restaurants.filter { restaurant ->
        (!vegetarian || restaurant.isVegetarian) &&
        (!vegan || restaurant.isVegan) &&
        (!glutenFree || restaurant.isGlutenFree)
    }

    println("Here are your restaurant choices:")
    compatibleRestaurants.forEach { restaurant ->
        println(restaurant.name)
    }
}

data class Restaurant(val name: String, val isVegetarian: Boolean, val isVegan: Boolean, val isGlutenFree: Boolean)
