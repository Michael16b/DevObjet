abstract class FormeGeo(xx : Int, yy : Int, hauteur : Int, largeur: Int) : ObjetPositionnable(largeur,hauteur) {
    protected var hauteur : Int
    protected var largeur : Int

    init {
        this.hauteur = hauteur
        this.largeur = largeur
    }

    fun redimensionner(nouvelleHauteur : Int, nouvelleLargeur : Int) {
        hauteur = nouvelleHauteur
        largeur = nouvelleLargeur
    }

}