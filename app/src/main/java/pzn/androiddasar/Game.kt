package pzn.androiddasar

import kotlin.random.Random

object Game {
    // data yang digunakan
    private val options = listOf("PAPER","ROCK","SCISSORS")

    private val optionDrawable = mapOf(
        "ROCK" to R.drawable.rock,
        "PAPER" to R.drawable.paper,
        "SCISSORS" to R.drawable.scissors
    )

    // rule game
    private val rules = mapOf(
        "ROCK-SCISSORS" to true,
        "ROCK-PAPER" to false,
        "PAPER-ROCK" to true,
        "PAPER-SCISSORS" to false,
        "SCISSORS-PAPER" to true,
        "SCISSORS-ROCK" to false,
    )

    //logic
    fun pickRandomOption():String = options[Random.nextInt(0,3)]

    fun pickDrawable(option:String):Int = optionDrawable[option]!!

    fun isDraw(from:String, to:String):Boolean = from == to

    fun isWin(from: String, to: String):Boolean = rules["$from-$to"]!!

}