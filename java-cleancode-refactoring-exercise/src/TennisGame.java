public class TennisGame {

    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
    public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";

    public static String getScore(String firstPlayerName, String secondPlayerName, int firstPlayerScore, int secondPlayerScore) {
        String result = "";
        int tempScore=0;
        if (firstPlayerScore==secondPlayerScore)
        {
            switch (firstPlayerScore)
            {
                case 0:
                    result = LOVE_ALL;
                    break;
                case 1:
                    result = FIFTEEN_ALL;
                    break;
                case 2:
                    result = THIRTY_ALL;
                    break;
                case 3:
                    result = FORTY_ALL;
                    break;
                default:
                    result = DEUCE;
                    break;

            }
        }
        else if (firstPlayerScore >= 4 || secondPlayerScore >= 4)
        {
            int minusResult = firstPlayerScore-secondPlayerScore;
            if (minusResult==1) result = ADVANTAGE_PLAYER_1;
            else if (minusResult ==-1) result = ADVANTAGE_PLAYER_2;
            else if (minusResult>=2) result = WIN_FOR_PLAYER_1;
            else result = WIN_FOR_PLAYER_2;
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = firstPlayerScore;
                else { result+="-"; tempScore = secondPlayerScore;}
                switch(tempScore)
                {
                    case 0:
                        result+= LOVE;
                        break;
                    case 1:
                        result+= FIFTEEN;
                        break;
                    case 2:
                        result+= THIRTY;
                        break;
                    case 3:
                        result+= FORTY;
                        break;
                }
            }
        }
        return result;
    }
}
