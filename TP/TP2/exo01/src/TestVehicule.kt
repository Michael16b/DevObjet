
fun main() {
    var maSaxo = Vehicule("Saxo","rouge",4,180.0)
    println(maSaxo)
    maSaxo.demarrer()
    maSaxo.accelerer(50.0)
    println(maSaxo)
    maSaxo.accelerer(40.0)
    println(maSaxo)
    var clio = Vehicule("Clio","vert",4,130.0)
    println(clio)
    clio.demarrer()
    clio.accelerer(40.0)
    println(clio)
    println("----------------------------------------------------------")
    var maPeugeot = Vehicule("208","noir",4,210.0)
    var maFerrari = Vehicule("Ferrari","rouge",4,450.0)
    var maPorsche = Vehicule("Porshe","noir",4,310.0)
    var maLambo = Vehicule("Lambo","vert",4,410.0)
    var camion : Array<Vehicule?> = arrayOf(maSaxo,clio,maPeugeot,maFerrari,maPorsche,maLambo)
    afficherC(camion)
    println("----------------------------------------------------------")
    var parking = arrayOfNulls<Vehicule>(100)
    decharger(camion,parking)
    afficherP(parking)
    println("----------------------------------------------------------")
    parking[0]= null
    afficherP(parking)
 }

fun afficherC(camion : Array<Vehicule?>) {
    for (indice in 0 until camion.size) {
        println(camion[indice])
    }
}
fun decharger(camion : Array<Vehicule?>, parking : Array<Vehicule?>) {
    for (indice in 0 until camion.size) {
        parking[indice] = camion[indice]
        camion[indice] = null
    }
}

fun afficherP(parking : Array<Vehicule?>) {
    for (indice in 0 until parking.size) {
        println(parking[indice])
    }
}
