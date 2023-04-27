fun main(){
    print("Enter the number of shares purchased >> ")
    val ns:Int=readln().toInt()
    print("Enter the purchase price per each share >> ")
    val pp:Double=readln().toDouble()
    print("Enter the purchase commission paid >> ")
    val pc:Double=readln().toDouble()
    print("Enter sale price per share >> ")
    val sp:Double=readln().toDouble()
    print("Enter the sales commission paid >> ")
    val sc:Double=readln().toDouble()
    profits(ns,pp,pc,sp,sc)
}
fun profits(ns:Int,pp:Double,pc:Double,sp:Double, sc:Double){
    var profit=((ns*sp)-sc)-((ns*pp)+pc)
    println("Your profit is $$profit")
}
