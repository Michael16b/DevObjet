package iut.collections

open class PileChainee<E>  {
    protected var debut : Cellule<E>? = null
    var taille : Int = 0

    fun taille() : Int {
        return this.taille
    }
    fun estVide() : Boolean {
        if (taille() == 0) {
            return true
        }
        return false
    }
    fun empiler(element: E) {
        debut = Cellule(element,debut)
        taille++
    }
    fun consulter() : E {
        if(estVide()) {
            throw NoSuchElementException()
        }
        return debut!!.valeur()
    }
    fun depiler() : E {
        if (estVide()) {
            throw NoSuchElementException()
        }
        var newDeb : E = debut!!.valeur()
        debut = debut!!.suivant()
        taille--
        return newDeb
    }

}