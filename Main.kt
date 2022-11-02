import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    val list : MutableList<String> = mutableListOf<String>()
    println("please enter the no of iteration")
    var noofiteration : Int = scan.nextInt()
    println("please enter the string you want")
    scan.nextLine()
    while (noofiteration > 0)
    {
        val input : String = scan.nextLine()
        list.add(input)
        noofiteration--
    }
    for (item in list)
        if(item.contains("a") || item.contains("m")) {
            println(item.uppercase())
        }

}