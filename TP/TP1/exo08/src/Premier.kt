/*
La fonction estPremier doit indiquer par un booléen si un nombre est premier
ou pas

@author init.dev (L.Jezequel)

@ n un nombre entier
@return un booléen indiquant si n est premier ou pas
*/
fun estPremier(n : Int) : Boolean {
    if (n>1) {
    for (i in 2 until n) {
        if (n%i == 0) {
            return false
        }
    }
    return true
}
return false
}
