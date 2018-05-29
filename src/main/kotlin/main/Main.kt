package main

import main.inputs.OptionReader
import main.inputs.QuestionReader
import main.helper.StatHelper


fun main(args: Array<String>) {
    QuestionReader.read("src/main/resources/question.txt")
    System.out.println("\nInput the no. to get answer-")
    val option = OptionReader.read()

    StatHelper().getAnswerFor(option)
}