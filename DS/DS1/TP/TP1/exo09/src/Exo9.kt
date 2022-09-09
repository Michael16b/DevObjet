
/*
La fonction somme doit calculer la somme des nombres contenus dans un tableau
d'entiers puis retourner cette somme. Il faudra bien penser à se demander ce
qu'est la somme d'un tableau vide.

@author init.dev (L.Jezequel)

@param tab : un tableau d'entiers complètement remplis

@return un entier correspondant à la somme des éléments de tab

*/

fun somme(tab : Array<Int>) : Int {
    var sum : Int = 0
    if (tab.size == 0) {
        return 0
    } else {
        for (i in tab.indices) {
            sum += tab[i]
        }
    }
    return sum
}

/*
La fonction recherche doit indiquer la premiere position d'une valeur v dans un tableau
tab. Si la valeur v n'est pas présente, elle indique -1

@author init.dev (L.Jezequel)

@param tab : le tableau dans lequel chercher
@param v : la valeur à chercher

@return  la position de v dans tab (si elle existe)

*/

fun recherche(tab : Array<Int>, v :Int) : Int {
    for (i in tab.indices) {
        if (tab[i] == v) {
            return i
        }
    }
    return -1
}

/*
Un ensemble d'entier est un paquet de plusieurs entiers, sans doublons.
La fonction estEnsemble doit indiquer si en tableau d'entiers correspond à un
ensemble ou non.

@author init.dev (L.Jezequel)

@param E : un tableau d'entiers

@return un booléen indiquant si E est bien un ensemble ou non 

*/
fun estEnsemble(tab : Array<Int>) : Boolean {
    for (i in tab.indices-1) {
        for (s in i+1 until tab.size) {
            if (tab[i] == tab[s]) {
                return false
            }
            
        }
    }
    return true
}

/*
Étant donné un tableau, la fonction envers doit l'inverser (en place), c'est à
dire que le premier élément du tableau doit devenir le dernier, le deuxième
élément doit devenir l'avant dernier, etc jusqu'au dernier élément qui doit
devenir le premier.

La fonction modifie le tableau d'entrée et n'a donc pas de sorties.

@author init.dev (L.Jezequel)

@param tab : le tableau à inverser

*/

fun envers(tab : Array<Int>) {
    var inverse : Int = 0
    var value_temp : Int
    for (i in tab.size-1 downTo tab.size/2) {
        value_temp = tab[i]
        tab[i] = tab[inverse]
        tab[inverse] = value_temp
        inverse++
    }
}


