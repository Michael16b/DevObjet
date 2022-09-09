fun main() {
    val anti = "anticonstitutionnellement"
    println(anti.length)
    println(anti[4])
    println(anti[19])
    for (i in anti.length-1 downTo 0) {
        println(anti[i])
    }
    println(anti.substring(1,3))
}
