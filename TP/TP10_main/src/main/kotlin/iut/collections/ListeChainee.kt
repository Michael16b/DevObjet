package iut.collections

class ListeChainee<E> : PileChainee<E>(),Liste<E> {
    override fun index(element : E) : Int {
        var cpt : Int = 0
        var parcours = debut
        while (parcours != null) {
            if (parcours.valeur() == element) {
                return cpt
            }
            cpt++
            parcours = parcours.suivant()
        }
        return -1
    }
    override fun consulter(index : Int) : E {
        if (estVide()) {
            throw NoSuchElementException()
        }
        var tmp : Cellule<E>? = debut

       for (i in 0 until index) {
           if (tmp != null) {
               tmp = tmp.suivant()
           } else {
               throw IndexOutOfBoundsException()
           }
       }
        return tmp!!.valeur()
    }
    override fun inserer(index : Int, element : E) {
        if (index < 0 || index > taille()) {
            throw IndexOutOfBoundsException()
        }
        if (index == 0) {
            debut = Cellule(element, null)
            taille++
        } else {
            var tmp: Cellule<E>? = debut
            for (i in 0 until index - 1) {
                if (tmp != null) {
                    tmp = tmp.suivant()
                } else {
                    throw IndexOutOfBoundsException()
                }
            }
            tmp!!.modifieSuivant(Cellule(element, tmp.suivant()))
            taille++
        }
    }
    override fun supprimer(index : Int) {
        if (index < 0 || index > taille()) {
            throw IndexOutOfBoundsException()
        } else if (estVide()){
            throw NoSuchElementException()
        }
        if (index == 0) {
            depiler()
            taille--
        } else {
            var tmp : Cellule<E>? = debut
            for (i in 0 until index-1) {
                if (tmp != null) {
                    tmp = tmp.suivant()
                } else {
                    throw IndexOutOfBoundsException()
                }
            }
            tmp!!.modifieSuivant(tmp.suivant()!!.suivant())
            taille--
        }
    }
    override fun insererEnQueue(element: E){
        inserer(taille(),element)
    }
    override fun consulterEnQueue() : E {
        return consulter(taille())
    }
    override fun supprimerEnQueue() {
        supprimer(taille())
    }
}