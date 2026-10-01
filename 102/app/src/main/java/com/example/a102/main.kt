package com.example.a102

fun main() {
    val schoolName = "SDGKU"
    var myAge = 20

    println(schoolName)
    println(myAge)

    myAge = 43
    println(myAge)

    //Challenge 1 Session 2
    println("-------CHALLENGE 1--------")
    val myCountry = "USA"
    var myCurrentCourse = "MDI 102"

    println(myCountry)
    println(myCurrentCourse)

    val birthYear = 1983
    var favoriteFood = "Crabs"

    println(birthYear)
    println(favoriteFood)

    println ("--------DATATYPES-------")
    //THIS IS A STRING
    val fullName: String = "Chuck Taggart"
    val fullName2 = "Chuck Taggart"

    println(fullName)
    println(fullName2)

    //THIS IS AN INT NUMBER
    val age: Int = 39
    val age2 = 25

    println(age)
    println(age2)

    // THIS IS A BOOLEAN
    val isVerified: Boolean = true
    val isVerified2 = false

    println(isVerified)
    println(isVerified2)

    //FLOAT AND DOUBLE VARIABLES
    val productPrice: Float = 19.99f
    val productPrice2 = 24.99f

    val rating: Double = 4.8
    val rating2 = 3.5

    println(productPrice)
    println(productPrice2)
    println(rating)
    println(rating2)

    //THIS IS A LIST
    val colors: List<String> = listOf("Red", "Orange", "Yellow", "Green", "Blue")
    println(colors)
    println(colors[0])
    println(colors[2])

    //CHALLENGE 2
    ("--------CHALLENGE 2-------")
    val myName = "Charles"
    val myCohort = 11
    val isStudent: Boolean = true
    val myHeight = 6.1
    val favApps: List<String> = listOf("youtube", "googleHome", "ESPN")
    println(myName)
    println(myCohort)
    println(isStudent)
    println(myHeight)
    println(favApps)

    println("--------STRING TEMPLATES--------")
    println("My name is $myName, and I'm $myAge years old.")

    println("-------CHALLENGE 3--------")
    println("My name is $fullName, and I was born in $birthYear.")
    println("I'm taking $myCurrentCourse, my cohort is $myCohort.")
    println("I live in $myCountry, and my favorite food is $favoriteFood.")
    println("My student status $isVerified.")

    println("-------CONTROL STRUCTURES--------")
    if (myAge >= 21){
        println("Adult")
    } else {
        println("Minor")
    }

    val grade = "A"

    when (grade) {
        "A" -> println("Excellent")
        "B" -> println("Good")
        "C" -> println("Average")
        else -> println("Keep Improving")
    }

    for (i in 1..5){
        println("Number: $i")
    }

    for ( color in colors) {
        println(color)
    }

    println("--------CHALLENGE 4-------")
    var choosenNumber = 6
    var fruits: List<String> = listOf("apple", "orange", "cherry", "strawberry")

    if (choosenNumber >= 0) {
        println(" The number is Positive")
    } else if (choosenNumber < 0) {
        println("The number is Negative")
    }
    for (i in 1..10) {
        println("Number: $i")
    }
    for (fruits in fruits) {
        println(fruits)
    }

    ("-------CHALLENGE 5------")
    var gpa = 2.9

    if (gpa >= 2.0) {
        println("You have passed!")
    } else {
        println("Sorry, You've failed.")
    }

    when {
        gpa >= 3.5 -> println("Grade: A")
        gpa >= 3.0 -> println("Grade: B")
        gpa >= 2.5 -> println("Grade: C")
        gpa >= 2.0 -> println("Grade: D")
        else -> print("Grade: F")
    }
}