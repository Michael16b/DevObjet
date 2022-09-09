import kotlin.random.*

fun main() {
	var p1 = Point()
	var p2 = Point(1,2)
	var points : Array<Point?> = arrayOfNulls(10)
	points[0] = p1
	print("------------------------")
	println(p1)
	println(p2)
	p2.setY(3)
	println(p2)
	p2.translater(1,1)
	println(p2)
	p1.deplacer(2,10)
	println(p1)
	p1.distance(p2)
	p1.translater(2,1)
	println(p1)
	println(p2)
	println("------------------------")
	afficher(points)
	println("------------------------")
	remplir(points)
	afficher(points)
	var fen = Fenetre("Dahak Max")
	fen.montrer()
	ajoutMax(points,fen)

}

fun afficher(points : Array<Point?>) {
	for (i in points.indices) {
		if (points[i] != null) {
		println(points[i])
	}
	}
}
fun remplir(points : Array<Point?>) {
	for (i in 1 until points.size) {
		points[i] = Point(points[i-1])
		points[i]?.translater(Random.nextInt(1,10),Random.nextInt(1,10))
	}
}


fun ajoutMax(points : Array<Point?>, fenetre : Fenetre) {
	for (i in points.indices) {
		if (points[i] != null) {
			fenetre.ajouter(points[i]!!)
	}
	}
}
