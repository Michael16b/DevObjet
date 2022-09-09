abstract class Cargaison(distance : Int) {
    private var distance : Int
    private var encombrementActuel : Double = 0.0
    private var marchandise : Array<Marchandise?>

    init {
        this.distance = distance
        this.marchandise = arrayOfNulls(100)
    }
    fun ajouter(marchandiseAjoutee: Marchandise) : Boolean {
        if(encombrementActuel + encombrement(marchandiseAjoutee) <= limite()) {
            for (i in marchandise.indices) {
                if (marchandise[i] == null) {
                    marchandise[i] = marchandiseAjoutee
                    encombrementActuel += encombrement(marchandiseAjoutee)
                    return true
                }
            }
        }
        return false
    }
    fun cout() : Double {
        return encombrementActuel * distance * facteur()
    }
    fun rechercher(marchandiseRecherchee : Marchandise) : Int {
        for (i in marchandise.indices) {
            if (marchandise[i] == marchandiseRecherchee) {
                return i
            }
        }
        return -1
    }
    open fun encombrement(marchandise: Marchandise) : Double{
        return marchandise.donnePoids()
    }
    abstract fun limite() : Double

    open fun facteur() : Int{
        return 1
    }
    fun supprimer(marchandiseEnlevee: Marchandise) : Boolean {
        for (i in marchandise.indices) {
            if (marchandise[i] == marchandiseEnlevee) {
                encombrementActuel -= encombrement(marchandiseEnlevee)
                marchandise[i] = null
                return true
            }
        }
        return false
    }
    fun transferer(cargaisonTransf: Cargaison) : Boolean {
        if (cargaisonTransf.encombrementActuel <= limite()) {
            for (i in marchandise.indices) {
                if (marchandise[i] == null) {
                    cargaisonTransf.marchandise[i] = marchandise[i]
                }
            }
        }
        return false
    }
}