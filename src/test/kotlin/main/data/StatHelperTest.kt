package main.data

import main.helper.StatHelper
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class StatHelperTest {
    private val outputStream = ByteArrayOutputStream()

    private lateinit var statHelper: StatHelper

    @Before
    fun setup() {
        statHelper = StatHelper()
    }

    @Before
    fun setUpStreams() {
        System.setOut(PrintStream(outputStream))
    }

    @After
    fun restoreStreams() {
        System.setOut(System.out)
    }

    @Test
    fun shouldPrintScoredRun() {
        statHelper.getAnswerFor(1)
        assertEquals("Player: Kane Run scored: 45\n" +
                "Player: Mathew Run scored: 43\n" +
                "Player: Thomas Run scored: 45\n", outputStream.toString())
    }

    @Test
    fun shouldPrintBowlerRunThrown() {
        statHelper.getAnswerFor(2)
        assertEquals("Player: Kane Run thrown: 45\n" +
                "Player: Mathew Run thrown: 43\n" +
                "Player: Thomas Run thrown: 45\n", outputStream.toString())
    }

    @Test
    fun shouldPlayerOutDetail() {
        statHelper.getAnswerFor(3)
        assertEquals("Player: Kane Out: BOWLED\n" +
                "Player: Mathew Out: LBW\n" +
                "Player: Thomas Out: CATCH\n", outputStream.toString())
    }

    @Test
    fun shouldPrintTheBowlerNameWhoDidBowled() {
        statHelper.getAnswerFor(4)
        assertEquals("Kane\n", outputStream.toString())
    }

    @Test
    fun shouldPrintTheBowlerNameWhoDidLBW() {
        statHelper.getAnswerFor(5)
        assertEquals("Mathew\n", outputStream.toString())
    }
}