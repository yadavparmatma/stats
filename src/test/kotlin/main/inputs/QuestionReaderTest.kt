package main.inputs

import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import org.junit.Before
import org.junit.After
import org.junit.Assert.assertEquals

class QuestionReaderTest {

    private val outputStream = ByteArrayOutputStream()

    @Before
    fun setUpStreams() {
        System.setOut(PrintStream(outputStream))
    }

    @After
    fun restoreStreams() {
        System.setOut(System.out)
    }

    @Test
    fun shouldReturnContentOfFile() {
        QuestionReader.read("src/test/kotlin/resources/question.txt")
        assertEquals("1: As a user I would like to know how much each player has scored", outputStream.toString());
    }
}