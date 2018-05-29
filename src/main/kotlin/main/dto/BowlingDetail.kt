package main.dto

data class BowlingDetail(
        val bowledOvers: Int = 0,
        val runsSpend: Int = 0,
        val wickets: List<WicketDetail>? = null
)

data class WicketDetail(
        val playerName: String? = null,
        val outType: String? = null
)