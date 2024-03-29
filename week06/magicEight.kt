import java.io.File
import java.io.InputStream
import kotlin.random.Random
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val inputStream: InputStream = File("/Users/aaronstrapbook/Downloads/8ball.txt").inputStream()
    val lineList = mutableListOf<String>()
    var quit = "quit"
    var out1 = "Ask anything to \"THE\" Magic 8 Ball!"
    var out2 = "Ask something else to \"THE\" Magic 8 Ball!"
    var bye = "Good bye!"
    println(out1)
    inputStream.bufferedReader().forEachLine { lineList.add(it) }
    var input=readLine().toString()
//    lineList.forEach{println(">  " + it)}

    while(input != quit){
        input=input.toLowerCase()
        if(input==quit){
            println(bye)
            exitProcess(0)
        }
        println(lineList[random()])
        println(out2)
        input= readLine().toString().toLowerCase()
    }
    println(bye)
}
fun random(): Int {
    return Random.nextInt(0, 10)
}
