class Text(xx: Int, yy : Int, valeur : String) : ObjetPositionnable(xx,yy){
    private var valeur : String
    private var police : String = "Times"
    private var taille : Int = 10

    init {
        this.valeur = valeur
    }

    fun editer(nouveau : String) {
        valeur = nouveau
    }
    fun dessiner() : String {
        return "'$valeur': X=$xx, Y=$yy, P=$police, S=$taille"
    }

}