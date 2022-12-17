package kotlinsamples.excep

import java.util.Scanner

class RunTestExce {


    fun addStudent(scanner: Scanner){
        println("Enter the Name")
        var name: String = scanner.next()
        println("Enter the Age")
        var age: Int = scanner.nextInt()
        println("Enter the Marks")
        var marks: Double = scanner.nextDouble()
    }
}


fun main() {
    val scanner = Scanner(System.`in`)
    val obj= RunTestExce()
    println("Enter Students Count")
    val studentsCount  = scanner.nextInt()


    for (i in 0..studentsCount) {
        obj.addStudent(scanner)
    }

    // For While Do while When if else if 


}