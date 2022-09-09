class Camion(places : Int) {
    private var placesOccupees : Int
    private var remorque : Array<Voiture?>

    init {
        placesOccupees = 0
        remorque = arrayOfNulls(places)
    }
    fun estPlein() : Boolean {
        return (placesOccupees == remorque.size)
    }
    fun estVide() : Boolean {
        return (placesOccupees == 0)
    }
    fun charger(voitureTransportee : Voiture) : Boolean {
        if (!estPlein() && !voitureTransportee.estEnMarche() && !remorque.contains(voitureTransportee)) {
            for (i in remorque.indices) {
                if (remorque[i] == null) {
                    remorque[i] = voitureTransportee
                    placesOccupees++
                    return true
                }
            }
        }
        return false
    }
    fun decharger() : Voiture? {
        if (!estVide()) {
            var tmp : Voiture = remorque[placesOccupees-1]!!
            remorque[placesOccupees-1] = null
            placesOccupees--
            return tmp
        }
        return null
    }
}