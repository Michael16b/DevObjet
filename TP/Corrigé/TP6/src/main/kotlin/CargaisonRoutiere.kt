class CargaisonRoutiere(distance : Int) : Cargaison(distance){
    var distance : Int
    init {
        this.distance = distance
    }
    override fun limite() : Double {
        return 38000.0
    }
    override fun facteur() : Int {
        return 4
    }


}