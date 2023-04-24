fun main() {
    for (i in 1..10) {
        val distance = fallingDistance(i.toDouble())
        println("The distance the object falls in $i seconds is $distance meters")
    }
}
fun fallingDistance(t: Double): Double {
    val g = 9.8
    val d = 0.5 * g * (t * t)
    return d
}
