package com.example.a101c11a4_final
class Student(
    val name: String,
    val program: String,
    val cohort: Int,
    val isActive: Boolean
)
class User(
    val username: String,
    val followers: Double,
    val isVerified: Boolean
){
    fun showProfile() {
        println("--------- USER ----------")
        println("USername: $username")
        println("Followers: $followers")
        println("Is Verified? $isVerified")
    }
}

// CHALLENGE 4
class Book(
    val title: String,
    val author: String,
    val year: Int
){
    fun showBookInfo() {
        println("------- BOOK DETAILS -------")
        println("Title: $title")
        println("Author: $author")
        println ("Year: $year")
    }
}
// CHALLENGE 5

class Employee(
    val name: String,
    val position: String,
    val salary: Double
) {
    fun showSummary() {
        println("Name: $name")
        println("Position: $position")
        println("Salary: $salary")
        println("-------")
    }


}
fun main () {
    println("\n------- CHALLENGE 1 --------")

    val originalPrice = 100.0
    val discountPercentage = 20.0
    val finalPrice = calculateDiscount(originalPrice, discountPercentage)

    println("Original price: $originalPrice")
    println("Discount percentage: $discountPercentage")
    println("----------------------------------------")
    println("Final price: $finalPrice")
    println("Final price: %.2f".format(finalPrice))

    println("\n--------- LAMBDA FUNCTIONS --------")
// BASIC LAMDA FUNCTION                                                                                                                      AMBDA EXAMPLE
 val sayHi = { println("Hello from a lambda function!") }

    sayHi()
    sayHi()
    sayHi()

// A LAMBDA WITH PARAMETER EXAMPLE
    val greet = { name: String -> println("Hello, $name") }
    greet("Freysy")
    greet("Ainy")

// A LAMBDA THAT RETURNS A VALUE
    val multiply = { number1: Int, number2: Int, number3: Int -> number1 * number2 * number3 }
    println(multiply(1, 2, 3))

    println("\n--------CHALLENGE 2 ---------")
    // A LAMBDA THAT PRINTS "WELCOME"
    val welcome = {println("Welcome")}
    welcome()

    // A LAMBDA THAT RECEIVES A CITY NAME AND PRINTS IT
    val printCity = {city: String -> println("City: $city")}
    printCity("San Diego")

    // A LAMBDA THAT ADDS 2 INTEGERS
    val addNumbers = { number1: Int, number2: Int -> number1 + number2}
    val result = addNumbers(18,9)
    println("Sum: $result")

    print("\n------- CHALLENGE 3 -------")

    // A LAMBDA THAT CHECKS IF A NUMBER IS EVEN OR NOT
    val isEven = { number: Int -> number % 2 == 0 }

    val result1 = isEven(4)
    val result2 = isEven(7)

    println("Is 4 even? $result1")
    println("Is 7 even? $result2")

    println("\n------- CLASSES and OBJECTS")

    //OBJECTS
    val student1 = Student(name="Ainy", program = "MDI2", cohort = 11, isActive = true)
    val student2 = Student(name = "Freysy", program = "MDI2", cohort = 11, isActive = true)

    println("\n------- OBJECT 1 -------")
    //OBJECT1
    println(student1.name)
    println(student1.program)
    println(student1.cohort)
    println(student1.isActive)

    println("------- OBJECT 2 --------")
    //OBJECT 2
    println(student2.name)
    println(student2.program)
    println(student2.cohort)
    println(student2.isActive)

    println("\n-------- CLASSES AND OBJECTS (EXAMPLE 2) --------")
    val user1 = User( username = "@ana_dev", followers = 1234.56, isVerified = true)
    user1.showProfile()

    println("\n-------- CHALLENGE 4 -------")
    val book1 = Book(title="Gone With The Wind", author ="Kurt Russell", year = 1975)
    book1.showBookInfo()

    println("\n -------- CHALLENGE 5 --------")
    // CREATE 2 EMPLOYEE OBJECTS
    val employee1 = Employee(name = "Ashley", position = "Software Engineer", salary = 90000.0)
    val employee2 = Employee(name = "Chelsea", position = "Project Manager", salary = 85000.0)

    employee1.showSummary()
    employee2.showSummary()

    println("\n ------- NULLABILITY EXAMPLE -------")
    //NULLABILITY
    var middleName: String? = null
    println(middleName)

    //SAFE CALL OPERATOR
    //var nickname: String? = "Johnny"
    val nickname: String? = null
    println(nickname?.length)

    // ELVIS OPERATOR
    val displayName = nickname ?: "Rocky"
    println(displayName)

    println("\n-------- CHALLENGE 6 ---------")
    // Nullable variables
    val gpa: Double? = null

    // Safe printing using Elvis operator
    println("Middle name: ${middleName ?: "Not provided"}")
    println("GPA: ${gpa ?: "No GPA available"}")



































}

//Challenge 1
fun calculateDiscount (price: Double, discount: Double): Double {
    val discountAmount = price * (discount / 100)
    val finalPrice = price - discountAmount

    return finalPrice
    }


//Challenge 2

// No parameter
var welcome = { println("Welcome") }

// One parameter
val printCity = { city: String ->
    println("City: $city")
}



