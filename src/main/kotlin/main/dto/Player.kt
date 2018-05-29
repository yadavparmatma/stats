package main.dto

data class Player (
        val name: String,
        val matchPlayed: Int= 0 ,
        val battingDetail: BattingDetail? = null,
        val bowlingDetail: BowlingDetail? = null

)
