import main.constants.ActionConstants
import main.dto.BattingDetail
import main.dto.BowlingDetail
import main.dto.Player
import main.dto.WicketDetail

class Data {
    companion object {
        private val player1 = Player(
                name = "Kane",
                bowlingDetail = BowlingDetail(
                        bowledOvers = 5,
                        runsSpend = 45,
                        wickets = listOf(
                                WicketDetail(
                                        playerName = "RJ kaul",
                                        outType = ActionConstants.BOWLED
                                )
                        )

                ),
                battingDetail = BattingDetail(
                        runScored = 45,
                        playedBowls = 34,
                        outType = ActionConstants.BOWLED,
                        outBy = "RJ kaul"
                )

        )

        private val player2 = Player(
                name = "Mathew",
                bowlingDetail = BowlingDetail(
                        bowledOvers = 3,
                        runsSpend = 43,
                        wickets = listOf(
                                WicketDetail(
                                        playerName = "Kane",
                                        outType = ActionConstants.LBW
                                )
                        )

                ),
                battingDetail = BattingDetail(
                        runScored = 43,
                        playedBowls = 24,
                        outType = ActionConstants.LBW,
                        outBy = "RJ kaul"
                )
        )

        private val player3 = Player(
                name = "Thomas",
                bowlingDetail = BowlingDetail(
                        bowledOvers = 5,
                        runsSpend = 45,
                        wickets = listOf(
                                WicketDetail(
                                        playerName = "Kane",
                                        outType = ActionConstants.CATCH
                                )
                        )

                ),
                battingDetail = BattingDetail(
                        runScored = 45,
                        playedBowls = 34,
                        outType = ActionConstants.CATCH,
                        outBy = "RJ kaul"
                )
        )

        fun getPlayerData(): List<Player> {
            return listOf(player1, player2, player3)
        }
    }
}