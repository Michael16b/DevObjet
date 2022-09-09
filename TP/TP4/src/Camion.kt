class Camion(mod : String, coul : String, places : Int) : Vehicule(mod,coul,90.0) {
    private var modele : String
    private var couleur : String
    private var places : Int
    private var placesOccupees : Int
    private var remorque : Array<Voiture?>

    init {
        this.modele = mod
        this.couleur = coul
        this.places = places
        this.placesOccupees = 0
        this.remorque = arrayOfNulls<Voiture?>(places)
    }
    fun estPlein() : Boolean {
        return this.placesOccupees == this.places
    }
    fun estVide() : Boolean {
        return this.placesOccupees == 0
    }
    fun charger(voitureTransportee : Voiture): Boolean {
        if (estPlein()) {
            return false
        }
        if (voitureTransportee.estEnMarche()) {
            return false
        }
        if (voitureTransportee in remorque) {
            return false
        }
        remorque[placesOccupees] = voitureTransportee
        placesOccupees++
        return true
    }
    fun decharger() : Voiture? {
        if (estVide())
            return null
        placesOccupees--
        val aDecharger = remorque[placesOccupees]
        remorque[placesOccupees] = null
        return aDecharger
    }
}
