package iut.collections

class ListeChainee<E>: PileChainee<E>(),Liste<E> {
    override fun index(element: E): Int {
        var parcours = debut
        var index : Int = 0
        while(parcours != null) {
            if (parcours.valeur() == element) {
                return index
            } else {
                parcours.suivant()
                index++
            }
        }
        throw IndexOutOfBoundsException()
    }

    override fun inserer(index: Int, element: E) {
        if (index < 0 || index > taille()) {
            throw IndexOutOfBoundsException()
        }
        if (index==0 || estVide()) {
            debut = Cellule(element, debut)
        } else {
            var tmp : Cellule<E>? = debut
            var cpt : Int = 0
            while (cpt != index-1) {
                if (tmp != null) {
                    tmp.suivant()
                    cpt++
                } else {
                    throw IndexOutOfBoundsException()
                }
            }
            tmp!!.modifieSuivant(Cellule(element, tmp.suivant()))
        }
        taille++
    }
    override fun supprimer(index: Int) {
        if (index < 0 || index > taille()) {
            throw IndexOutOfBoundsException()
        }
        if (index == 0 || estVide()) {
            depiler()
            taille--
        } else {
            var tmp: Cellule<E>? = debut
            var cpt: Int = 0
            while (cpt != index-1) {
                if (tmp != null) {
                    tmp.suivant()
                    cpt++
                } else {
                    throw IndexOutOfBoundsException()
                }
            }
            tmp!!.modifieSuivant(tmp.suivant()!!.suivant())
        }
        taille--
    }


    override fun consulter(index: Int): E {
        if (index < 0 || index > taille() || estVide()) {
            throw IndexOutOfBoundsException()
        }
        var parcours = debut
        var cpt = 0
        while(cpt != index){
            if (parcours != null) {
                parcours.suivant()
                cpt++
            }else {
                throw IndexOutOfBoundsException()
            }
        }
        return parcours!!.valeur()
    }

    override fun insererEnQueue(element: E) {
        inserer(taille(),element)
    }

    override fun consulterEnQueue(): E {
        return consulter(taille())
    }

    override fun supprimerEnQueue() {
        supprimer(taille())
    }


}