open class MarchandiseUltraEncombrante(poids : Double, volume : Double) :  Marchandise(poids,volume){
    private var poids : Double
    private var volume : Double
    init {
        this.poids = poids * 2
        this.volume = volume * 3
    }

}