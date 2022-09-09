open class Feuille() : ObjetGraphique(),Redimensionnable {
    private var objetsContenus : Array<ObjetGraphique?> = arrayOfNulls(100)
    var hauteur : Int = 200
    var largeur : Int = 100

    override fun redimensionner(nouvelleHauteur : Int, nouvelleLargeur : Int) {
        hauteur = nouvelleHauteur
        largeur = nouvelleLargeur
    }

    fun inserer(nouvelObjet : ObjetGraphique) {
        for (i in objetsContenus.indices) {
            if (objetsContenus[i] != null) {
                objetsContenus[i] = nouvelObjet
            }
        }
    }




}