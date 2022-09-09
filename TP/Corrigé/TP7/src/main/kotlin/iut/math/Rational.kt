package iut.math
/**
 * Fabrique un rationnel à partir de deux entiers passés en paramètre ;
 * @param numerator le numérateur
 * @param denominator le dénominateur
 * Par convention, si le denominateur vaut 0, alors on le positionne à 1
 */
class Rational (numerator : Int, denominator :Int=1) {
    private val numerator : Int
    private val denominator : Int

    init {
        this.numerator = numerator
        this.denominator  = if (denominator == 0) 1 else denominator
    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }
    operator fun plus(a : Any) : Rational {
        if(a is Rational) {
            var num : Int = (this.numerator * a.denominator) + (a.numerator * this.denominator)
            var den : Int = this.denominator * a.denominator
            var pgcd : Int = pgcd(num,den)
            return Rational(
                num/ pgcd,den/pgcd)
        }
        if (a is Int) {
            return Rational(this.numerator + this.denominator * a, this.denominator)
        }
        return this
        }
    private fun opposite() : Rational {
        return Rational(this.denominator,this.numerator)
    }
    operator fun minus(a : Rational) : Rational {
        return a + a.opposite()
    }
}
