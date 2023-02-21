import kotlin.math.*

fun main(){

    print("Enter amount of principal originally deposited into the account: ")
    var p = readln()
    var pp: Double = p.toDouble()

    print("Enter annual interest rate paid by the account: ")
    var r = readln()
    var rr: Double = r.toDouble()

    print("Enter number of times per year that the interest is compounded: ")
    var n = readln()
    var nn: Double = n.toDouble()

    print("Enter the number of years the account will be left to earn interest: ")
    var t = readln()
    var tt: Double = t.toDouble()

    var exponent = nn * tt
    var calcBeforeExponent = (1+((rr/100)/nn))
    var result = pp*Math.pow(calcBeforeExponent,exponent.toDouble())

    var result2 = String.format("%.2f", result)
    println(result2)
}
