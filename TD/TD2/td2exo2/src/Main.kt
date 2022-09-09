fun main() {
    var xx : Double = 4.2
    var yy : Double = 42.0
    xx = yy
    println("${xx === yy}")
    yy = 0.42
    var ab = "abc"
    var cd = "cd"
    cd = ab
    var ef = "ABCDEF" 
    cd = ef.substring(2,4)
    /***** > garbage collector *****/
    println(cd)
    ef = ef.substring(0,3).lowercase()
    println("${ab == ef} et ${ab === ef}")
    /***** > garbage collector *****/
    var tab = arrayOf(20, 15, 2, 3)
    tab[3] = 4
    var sum = 1
    for (ii in tab) {
        sum += ii
    }
    println(sum)
    var tax : Array<Int>
    /***** > garbage collector *****/
    tax = tab
    tab[3] = 424242
    tax[0] = (ab+cd+ef).length
    tab[1] = yy.toInt()
    yy = tab[2].toDouble()
    /***** > garbage collector *****/
    tax[1] = mult(tab[0], tax[2])
    println("xx=$xx, yy=$yy, cd=$cd" 
                + "ef= $ef, sum=$sum")
    print("tab = ")
    for (ii in tab) {
        print("$ii ")
    }
    println("");
}
fun mult(xx : Int, yy :Int) : Int {
    var res = xx * yy
    return res
}