
var MAX = 10000
var x : Double = 0.0
var y = 12.0
var z : Boolean = true

fun main() {
    MAX = 10
    x = 2.0
    y++
    truc(y)
    z = (x == 2.0)
    if (inc(x) == 3.0)
        print("ok")
}

fun truc(a : Double) {
    println(a)
}

fun inc(a : Double) : Double{
    var s : Double = a+ 1
    return s
}


