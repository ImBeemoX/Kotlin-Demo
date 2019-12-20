package com.example.helloworld

class Player(val name: String, var lives: Int = 3, var level: Int = 1, var score: Int = 0){


    override fun toString(): String {
        return ("""
            name: ${name.toLowerCase()}
            lives: $lives
            level: $level
            score: $score
            """)
    }

    fun test(): Boolean{
        return if (1 > 2){
            println("haha")
            true
        }else{
            false
        }
    }
}