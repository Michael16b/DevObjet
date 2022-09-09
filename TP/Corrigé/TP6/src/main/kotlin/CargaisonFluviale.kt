class CargaisonFluviale(distance : Int) : Cargaison(distance) {
    var distance : Int
    init {
        this.distance = distance
    }
    override fun limite() : Double {
        return 300000.0
    }
}