package iut.collections

open class PileChainee<E>  {
    var taille : Int = 0
    protected var debut : Cellule<E>? = null

    fun taille() : Int {
        return this.taille
    }
    fun estVide() : Boolean {
        return taille == 0
    }
    fun empiler(element : E) {
        debut = Cellule(element,debut)
        this.taille++
    }
    fun depiler() : E {
        if (debut != null) {
            val valeur = debut!!.valeur()
            debut = debut!!.suivant()
            taille--
            return valeur
        } else {
            throw NoSuchElementException()
        }
    }
    fun consulter() : E {
        if (debut != null) {
            return debut!!.valeur()
        } else {
            throw NoSuchElementException()
        }
    }


}