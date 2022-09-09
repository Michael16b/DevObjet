class Parking(places : Int) {
    private var places : Int
    private var stationnement : Array<Voiture?>
    init {
        this.places = places
        stationnement = arrayOfNulls(places)

    }

    fun stationner(numeroPlace : Int, voitureStationnee : Voiture) : Boolean {
        if (placeLibre(numeroPlace) == true && !stationnement.contains(voitureStationnee)) {
            stationnement[numeroPlace] = voitureStationnee
            return true
        } else {
            return false
        }
    }
    fun nombreDePlacesLibres() : Int {
        var count : Int = 0
        for (i in stationnement.indices) {
            if (stationnement[i] == null) {
                count++
            }
        }
        return count
    }
    fun nombreDePlacesTotales() : Int {
        return stationnement.size
    }
    fun placeLibre(numeroPlace : Int) : Boolean {
        if (numeroPlace >= stationnement.size || numeroPlace < 0) {
            return false
        }
        return (stationnement[numeroPlace] == null)
    }
}