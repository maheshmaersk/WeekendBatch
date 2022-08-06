package kotlinsamples

import java.util.*

fun main() {
    println("Akshay")

    var clasSoc = 10
    val rooms = 30

    val scanner = Scanner(System.`in`)
    var isConti = true
//    scanner.use { scanner ->
//        while (isConti) {
//            println("Enter Student Name")
//            val name = scanner.next()
//            println("Enter Student Marks")
//            val marks = scanner.nextInt()
//            getStudentPercentage(name, marks)
//            println("Do you want to continue Y yes N No")
//            val isd = scanner.next()
//            if (isd.equals("Y", true)) {
//                println("Thanks")
//            } else if (isd.equals("N", true)) {
//                println("Exiting Thanks")
//                isConti = false
//            } else {
//                println("Invalid Input")
//            }
//        }
//    }

//    for (i in 1..10){
////        println(i)
////    }

//    for (i in 10 until 20 step 2){
//        println(i)
//    }

    for (i in 10 downTo 1) {
        println(i)
    }

    when ("wedn") {
        "Monday" -> {

        }
        "Tuesday" -> {

        }
        else -> {

        }
    }

}

fun getStudentPercentage(studentName: String, marks: Int) {
    println("$studentName has got ${(marks * 100) / 600}")
}