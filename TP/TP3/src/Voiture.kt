class Voiture(mod: String, coul : String, vitMax : Double) {
    private var modele : String 
    private var couleur : String 
    private var vitesseMaximum  : Double
    private var VitesseCourante : Double = 0.0
    private var enMarche : Boolean = false
    private var proprietaire : Personne? = null
    private var parking : Parking? = null
    init {
        modele = mod
        couleur = coul 
        vitesseMaximum = vitMax
    }
    fun acheter(acheteur : Personne) {
        proprietaire = acheteur
    }
    fun demarrer() {
        enMarche = true
    }
    fun arreter() {
        enMarche = false
        VitesseCourante = 0.0
    }
    fun estEnMarche() : Boolean{
        return enMarche
    }
    fun repeindre(nouvelleCouleur : String) {
        if (!enMarche) {
            couleur = nouvelleCouleur

        }
    }
    fun accelerer(acceleration : Double) : Double {
        if (enMarche) {
            if (acceleration >= 0) {
                if (VitesseCourante+acceleration < vitesseMaximum) {
                    VitesseCourante += acceleration
                }
                else {
                    if (VitesseCourante+acceleration > vitesseMaximum) {
                        VitesseCourante = vitesseMaximum
                    }
                }
            }
        }

        return VitesseCourante
    }

    fun decelerer(deceleration: Double) : Double {
        if (enMarche) {
            if (deceleration >= 0) {
                if (VitesseCourante-deceleration < vitesseMaximum && VitesseCourante-deceleration >= 0.0) {
                    VitesseCourante -= deceleration
                }
                else {
                    if (VitesseCourante-deceleration < 0.0) {
                        VitesseCourante = 0.0
                    }
                }
            }
        }  
        return VitesseCourante
    }
    fun afficher() {
        var voitureAffichage : String = "Voiture $modele de couleur $couleur"
        if (proprietaire != null) {
            voitureAffichage += ", propriété de ${proprietaire!!.donneNomComplet()}"
        }
        if (enMarche) {
            voitureAffichage += ", roule à $VitesseCourante / $vitesseMaximum."
        }
        else {
            voitureAffichage += ", est à l'arrêt."
        }

    }

    fun estGaree() : Boolean {
        return (parking != null)
    }

    fun stationner(nouveauParking : Parking) {
        this.parking = nouveauParking
        VitesseCourante = 0.0
        enMarche = false
    }

    fun quitterStationnement() {
        this.parking = null
        enMarche = true

    }
}
