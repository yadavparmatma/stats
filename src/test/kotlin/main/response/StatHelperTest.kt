package main.response

import main.constants.ActionConstants
import main.dto.WicketDetail
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class StatHelperTest {
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
    fun shouldPrintScoredRun() {
        StatHelper.playerScored()
        assertEquals("Player: Kane Run scored: 45\n" +
                "Player: Mathew Run scored: 43\n" +
                "Player: Thomas Run scored: 45\n", outputStream.toString())
    }

    @Test
    fun shouldPrintBowlerRunThrown() {
        StatHelper.bowlerRunThrown()
        assertEquals("Player: Kane Run thrown: 45\n" +
                "Player: Mathew Run thrown: 43\n" +
                "Player: Thomas Run thrown: 45\n", outputStream.toString())
    }

    @Test
    fun shouldPlayerOutDetail() {
        StatHelper.playerOutDetail()
        assertEquals("Player: Kane Out: BOWLED\n" +
                "Player: Mathew Out: LBW\n" +
                "Player: Thomas Out: CATCH\n", outputStream.toString())
    }

    @Test
    fun shouldPrintTheBowlerNameWhoDidBowled() {
        StatHelper.getBowlerByWhoDid(WicketDetail(outType =  ActionConstants.BOWLED))
        assertEquals("Kane\n", outputStream.toString())
    }

    @Test
    fun shouldPrintTheBowlerNameWhoDidLBW() {
        StatHelper.getBowlerByWhoDid(WicketDetail(outType =  ActionConstants.LBW))
        assertEquals("Mathew\n", outputStream.toString())
    }
}