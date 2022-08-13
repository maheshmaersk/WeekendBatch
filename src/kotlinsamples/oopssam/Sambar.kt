package kotlinsamples.oopssam

class Sambar : Onion() {

    fun usedVegetables() {
        println("User All Vegies")
    }

    fun masala() {
        println("Added Garm Masala")
    }


    override fun disAdvantages(){
        println("Have all the Differences")
    }
}

fun main() {
    val sambar= Sambar()
    sambar.masala()
    sambar.getBenefits()
    sambar.disAdvantages()
    sambar.usedVegetables()
}