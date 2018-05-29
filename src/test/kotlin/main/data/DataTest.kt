package main.data

import org.junit.Assert.*
import org.junit.Test

class DataTest{
    @Test
    fun shouldReturnPlayersData(){
        val playerData = Data.getPlayerData()
        assertEquals(3, playerData.size)
    }
}