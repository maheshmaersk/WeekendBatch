package kotlinsamples.scopessam

data class Person(var name: String, var age: Int=0, var city: String="") {
    fun moveTo(newCity: String) {
        city = newCity
    }

    fun renameName(newName: String) {
        name = newName
    }

    fun incrementAge() {
        age++
    }
}

fun main() {
    Person("Alice", 20, "Amsterdam").let {p->
        println(p)
        p.moveTo("London")
        p.renameName("Harsha")
        p.incrementAge()
        println(p)
    }

    val adam = Person("Adam").apply {
        age = 20                       // same as this.age = 20
        city = "London"
    }
    println(adam)



//    var numbers = mutableListOf("one", "two", "three", "four")
//    numbers.add("five")   // this is OK
//    println(numbers)
//    numbers = mutableListOf("six", "seven")
//    println(numbers)

    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5)
    numbers.removeAt(1)
    numbers[0] = 0
    numbers.shuffle()
    println(numbers)


//    val numbers1 = arrayListOf<Int>(1, 2, 3, 4)
    val numbers1 = listOf(1, 2, 3, 4)
//    numbers1.add(5)
//    numbers1.removeAt(1)
//    numbers1[0] = 0
//    numbers1.shuffle()
    println(numbers1)
}