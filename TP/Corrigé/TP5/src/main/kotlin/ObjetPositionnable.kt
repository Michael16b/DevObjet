abstract class ObjetPositionnable(xx : Int, yy : Int) : ObjetGraphique(), Manipulable{
    protected var xx : Int
    protected var yy : Int
    var selectionne : Boolean = false
    init {
        this.xx = xx
        this.yy = yy
    }
    override fun deplacer(nx : Int, ny : Int) {
        xx = nx
        yy = ny
    }
    fun selectionner(ok : Boolean) {

    }

}