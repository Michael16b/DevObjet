package iut.math

/**
 * renvoie le "Plus Grand Commun Diviseur" de deux entiers
 * @param aa un entier
 * @param bb un entier
 * @return le pgcd de aa et bb
 */
fun pgcd(aa : Int, bb : Int) : Int {
    if (bb==0) {
        return aa
    } else {
        var r = aa%bb
        return pgcd(bb,r)
    }
}