package kotlinsamples.inter

class CricketTeam : InternationalPlayers, NationalPlayers, StatePlayers {
    override fun trainingCamps(international: String) {
        println("Player is from $international Team")
    }

    override fun countriesRecords(): String {
        TODO("Not yet implemented")
    }

    override fun worldCups(): Int {
        TODO("Not yet implemented")
    }

    override fun trophiesPlayed() {
        TODO("Not yet implemented")
    }

    override fun salary() {
        TODO("Not yet implemented")
    }

    override fun trainingCamps() {
        println("Player is from Local Gully Team")
    }

    override fun basicStipend() {
        TODO("Not yet implemented")
    }

}

fun main() {
    val obj = CricketTeam()
    obj.trainingCamps("Australia")
    obj.trainingCamps()
}