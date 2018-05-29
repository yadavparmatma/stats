package main.response

import Data
import main.constants.ActionConstants
import main.dto.WicketDetail
import sun.audio.AudioPlayer.player

class StatHelper {

    companion object {
        private val players = Data.getPlayerData()

        fun playerScored() {
            players.forEach { player ->
                System.out.println("Player: ${player.name} Run scored: ${player.battingDetail?.runScored}")
            }
        }

        fun bowlerRunThrown() {
            players.forEach { player ->
                System.out.println("Player: ${player.name} Run thrown: ${player.bowlingDetail?.runsSpend}")
            }
        }

        fun playerOutDetail() {
            players.forEach { player ->
                System.out.println("Player: ${player.name} Out: ${player.battingDetail?.outType}")
            }
        }

        fun getBowlerByWhoDid(wicketDetail: WicketDetail) {
            players.forEach { player ->
                val wickets = player.bowlingDetail!!.wickets
                wickets?.forEach { wicket ->
                    if (wicket.outType == wicketDetail.outType) {
                        System.out.println("${player.name}")
                    }
                }
            }
        }
    }

    fun getAnswerFor(option: Int): String {
        when (option) {
            1 -> playerScored()
            2 -> bowlerRunThrown()
            3 -> playerOutDetail()
            4 -> getBowlerByWhoDid(WicketDetail(outType = ActionConstants.BOWLED))
            5 -> getBowlerByWhoDid(WicketDetail(outType = ActionConstants.LBW))
            else -> System.out.println("This will not happen any time")
        }
        return "Player not found"
    }
}