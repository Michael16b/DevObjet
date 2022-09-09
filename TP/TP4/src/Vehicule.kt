abstract class Vehicule(mod : String, coul : String, vitMax : Double) : Propriete  {
    private var modele : String
    private var couleur : String
    private var vitesseCourante : Double
    private var vitesseMaximum : Double
    private var enMarche : Boolean
    private var conducteur : Personne?
    private var proprietaire : Proprietaire?
    init {
        modele = mod
        couleur = coul
        vitesseCourante = 0.0
        vitesseMaximum = vitMax
        enMarche = false
        conducteur = null
        proprietaire = null
    }
    fun devientConducteur(personne: Personne) {
        enMarche = true
        conducteur = personne
    }
    fun arreter() {
        enMarche = false
    }
    fun demarrer() {
        if (conducteur != null) {
            enMarche = true
        }
    }
    fun estEnMarche() : Boolean {
        return enMarche
    }
    fun repeindre(nouvelleCouleur : String) {
        couleur = nouvelleCouleur
    }
    open fun accelerer(acceleration : Double) : Double {
        if (vitesseCourante + acceleration < vitesseMaximum) {
            vitesseCourante += acceleration
        } else {
            vitesseCourante = vitesseMaximum
        }
        return vitesseCourante
    }
    fun decelerer(deceleration : Double) : Double {
        if (vitesseCourante - deceleration > 0) {
            vitesseCourante -= deceleration
        } else {
            vitesseCourante = 0.0
        }
        return vitesseCourante
    }
    override fun acheter(proprietaire : Proprietaire) {
        this.proprietaire = proprietaire
    }
}