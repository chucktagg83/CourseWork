package com.example.a101c11a3

import android.content.om.OverlayManager

fun main () {
    val fruits = listOf("Apple", "Orange", "Banana", "Orange")

    println("------- LIST EXAMPLE --------")
    println(fruits)
    println("First fruit: ${fruits[0]}")
    println("Second fruit: ${fruits[1]}")

    println("------- SET EXAMPLE -------")

    val subjects = setOf("Math", "English", "Math", "Kotlin", "Programming", "Kotlin")

    println(subjects)

    val colors = setOf("Red", "Orange", "Yellow", "Green", "Red", "Blue", "Yellow")

    println("Unique colors: $colors")
    println("Total unique colors: ${colors.size}")

    println("------- CHALLENGE 1 --------")
    val hobby = setOf("Football", "Basketball", "Fishing", "Football", "Binging", "Fishing")

    println(hobby)
    println("Total number of hobbies: ${hobby.size}")
    // A set is helpful here because it removes duplicate data

    println("-------- MAP EXAMPLE -------")
    val student = mapOf(
        "name" to "Claudia",
        "age" to 32,
        "major" to "Computer Engineering"
    )

    println(student)
    println("Name: ${student["name"]}")
    println("Major: ${student["major"]}")

    println("------- CHALLENGE 2 -------")
    val countries = mapOf(
        "Oman" to "Muscat",
        "Japan" to "Tokyo",
        "Philippines" to "Manila",
        "Australia" to "Canberra"
    )

    println("Countries and Capitals: $countries")
    println("Capital of Japan: ${countries["Japan"]}")
    // LOOP Through The Map
    println("List of countries and capitals:")
    for ((country, capital) in countries) {
        println("$country -> $capital")
    }

    println("------- CHALLENGE 3 ---------")
    val apps = listOf("ESPN", "MLB", "Ugreen", "Amazon", "betMGM")
    val movies = setOf(
        "Their Eyes were Watching God",
        "Major Payne",
        "Nothing to Lose",
        "Major Payne",
        "Flight",
        "Nothing to Lose"
    )
    val personalInfo = mapOf(
        "name" to "Chuck Taggart",
        "age" to "43",
        "city" to "Aurora",
        "major" to "Information Tech"
    )
    // PRINT EVERYTHING
    println("\n----- Favorite Apps -----")
    for (apps in apps) {
        println(apps)
    }
    println("\n----- Favorite Movies -----")
    for (movies in movies) {
        println(movies)
    }
    println("\n----- Personal Info ------")
    for ((key, value) in personalInfo) {
        println("$key: $value")
    }

    println("\n------- IMMUTABLE VS MUTABLE --------")
    val fruits2 = listOf("Apple", "Banana", "Cherry")
    println(fruits2)
    println("First fruit: ${fruits[0]}")

    val cars = listOf("Honda", "BMW", "KIA")

    for (car in cars) {
        println(car)
    }

    println("\n------- CHALLENGE 4 --------")
    val movies2 = listOf(
        "Their Eyes were Watching God",
        "Major Payne",
        "Nothing to Lose",
        "Flight",
        "The Hunger Games"
    )

    println("All movies: $movies2")
    println("First movie: ${movies2[0]}")
    println("Last movie: ${movies2[movies2.size - 1]}")
    println("All movies using a for loop:")
    for (movie in movies2) {
        println(movie)
    }

    println("\n-------- MUTABLE LIST --------")
    val months = mutableListOf("January", "February", "March")
    println(months)
    months.add("April")
    println(months)

    months.remove(element = "February")
    println(months)

    months[0] = "June"
    println(months)

    println("\n-------- CHALLENGE 5 --------")

    val favFoods = mutableListOf("Salmon", "Catfish", "Crab Legs")

    println("All favorite foods: $favFoods")
    favFoods.add("Lobster")
    println("List with added items: $favFoods")
    favFoods.remove(element = "Lobster")
    println("List with item removed: $favFoods")
    favFoods[1] = "Pizza"
    println("List with a changed item: $favFoods")

    println("\n------- FUNCTIONS --------")
    sayHello()
    sayHello()
    sayHello()
    greetUser( name = "Ainy")
    greetUser( name = "Freysy")
    val result = addNumbers( number1 = 2, number2 = 32)
    println(result)
    println(addNumbers( number1 = 14, number2 = 32))

    println("\n------- CHALLENGE 6--------")

    favoriteMovie()
    val result2 = multiplyNumbers(number1 = 2, number2 = 3, number3 = 4)
    println("Result: $result2")
}

fun sayHello() {
    println("Hello!")
}

fun greetUser(name: String) {
    println("Hello $name!")
}

fun addNumbers (number1: Int, number2: Int): Int {
    return number1 + number2
}

fun favoriteMovie() {
    println("My favorite movie is Remember the Titans")
}

fun multiplyNumbers (number1: Int, number2: Int, number3: Int): Int {
    return number1 * number2 * number3
}
