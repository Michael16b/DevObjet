fun main() {
    var alpha : Double
    var beta : Int = 42
    var delta = 42.0
    beta--
    println(delta)
    alpha = delta
    println(alpha)
    delta+=3
    println("$delta,$alpha")
    var test : Boolean = (alpha==delta)
    println(test)
    alpha = dec2(delta,beta)
    println("$delta , $alpha")
}

fun dec2(epsilon : Double, gamma : Int) : Double {
    return (epsilon-gamma) - 2
}
