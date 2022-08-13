package kotlinsamples.oopssam

class KotSap {

    fun getTotalStudentCount() {
        println("Students Needs to be Filled")
    }

    fun getTotalStudentCount(name: String): Int {
        println("$name Needs to be Filled")
        return 45
    }

    fun getTotalStudentCount(college: String, classRooms: Int): String {
        println("Students Needs to be Filled")
        return "$college has so many $classRooms"
    }

}


fun main() {

    val obh = KotSap()
    obh.getTotalStudentCount()
    obh.getTotalStudentCount("Harsha")
    val op = obh.getTotalStudentCount("VTU", 4)
    println(op)

    val obj = Student("Harsha",3,"Male")
    val obj1 = Student("Sindhu",2,"FeMale")
    obj.gender="Female"

}