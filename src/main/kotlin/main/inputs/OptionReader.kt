package main.inputs

import java.util.*

class OptionReader {
    companion object {
        fun read(): Int {
            val option = Scanner(System.`in`).nextInt()
            if (option !in 1..5) {
                println("Enter valid question number:")
                read()
            }
            return option
        }
    }
}