open class CargaisonAerienne(distance : Int) : Cargaison(distance) {
    var distance : Int
    init {
        this.distance = distance
    }
    override fun encombrement(marchandise: Marchandise) : Double {
        return  marchandise.donneVolume()
    }
    override fun limite() : Double {
        return 80000.0
    }
    override fun facteur() : Int{
        return 10
    }
}