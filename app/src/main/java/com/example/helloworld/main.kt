package layout

import com.example.helloworld.Player

fun main(args: Array<String>){
   val player = Player("Ez", level = 999)
    println(player.toString())
    var lol = ArrayList<Player>()
    lol.add(player)

    for (i in 5 downTo 1 step 4){
        println(i)
    }

}