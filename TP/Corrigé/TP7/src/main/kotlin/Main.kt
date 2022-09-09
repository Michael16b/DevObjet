import iut.math.*

fun main() {
    // usage toString()
    var r23 = Rational(2,3)
    var r12 = Rational(1,2)
    var r43 = Rational(4,3)
    println(r23)     // 2/3
    println(r12)     // 1/2
    println(r43)     // 4/3
    println(Rational(3))      // 3/1
    println(Rational(0,6))     // 0/6
    println(Rational(2,2))     // 2/2

    // usage "+"
    println("#####")
    var result : Rational
    result = r23 + r12  // on peut utiliser le + car il ya la fonction plus()
    println(result) // 7/6
    result = r23 + r43
    println(result) // 18/9 ou (mieux) 6/3

    // usage "+ (entier)"
    result = r43 + 2
    println(result) // 10/3
    result = r43 + 0
    println(result) // 4/3
}