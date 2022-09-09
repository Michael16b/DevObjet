class Document(nomDeFichier : String) : Feuille(), Editable{
    var nomDeFichier : String
    var FeuilleAssociees : Array<Feuille?>
    init {
        this.nomDeFichier = nomDeFichier
        this.FeuilleAssociees = arrayOfNulls(10)
        this.FeuilleAssociees[0] = Feuille()
    }
    override fun editer(nouveau : String) {
        nomDeFichier = nouveau
    }
     fun nouvelleFeuille() : Feuille? {
         if (FeuilleAssociees.size < 10) {
             for (i in FeuilleAssociees.indices) {
                 if (FeuilleAssociees[i] != null) {
                     FeuilleAssociees[i] = Feuille()
                 }
             }
         }
         return null
     }





}