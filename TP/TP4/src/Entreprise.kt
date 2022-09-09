class Entreprise(raisonSociale : String, forme : String, gerant : Personne) : Proprietaire,Propriete  {
    private var raisonSociale : String
    private var forme : String
    private var gerant : Proprietaire
    init {
        this.raisonSociale = raisonSociale
        this.forme = if (forme == "SA" || forme == "EURL" || forme == "SCOP")
                        forme
                    else "SCOP"
        this.gerant = gerant
    }
    override fun donneNomComplet() : String{
        return "$raisonSociale $forme"
    }
    fun donneForme() : String {
        return forme
    }
    fun donneGerantActuel() : Proprietaire {
        return gerant
    }
    override fun acheter(acheteur : Proprietaire) {
        gerant =  acheteur
    }


}