class VoitureTurbo(mod : String,coul : String, vitMax : Double) : Voiture(mod,coul,vitMax)  {
    private var turbo : Boolean
    private var mod : String
    private var coul : String
    private var vitMax : Double

    init {
        this.mod = mod
        this.coul = coul
        this.vitMax = vitMax
        this.turbo = false
    }
    fun changeTurbo(etat : Boolean) {
        turbo = etat
    }
    override fun accelerer(acceleration : Double) : Double {
        if (turbo) {
            return super.accelerer(acceleration*3)
        }
        return  super.accelerer(acceleration)
    }

}