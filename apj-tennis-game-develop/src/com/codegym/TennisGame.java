package com.codegym;

public class TennisGame {

    private static final int SCORE_LOVE = 0;
    private static final int SCORE_FIFTEEN = 1;
    private static final int SCORE_THIRTY = 2;
    private static final int SCORE_FORTY = 3;
    private static final int MIN_SCORE_FOR_ADVANTAGE = 4;

    public static String getScore(String firstPlayerName, String secondPlayerName, int firstPlayerScore, int secondPlayerScore) {
        if (firstPlayerScore == secondPlayerScore) {
            return getEqualScore(firstPlayerScore);
        }

        if (firstPlayerScore >= MIN_SCORE_FOR_ADVANTAGE || secondPlayerScore >= MIN_SCORE_FOR_ADVANTAGE) {
            return getAdvantageOrWin(firstPlayerScore, secondPlayerScore, firstPlayerName, secondPlayerName);
        }

        return getNormalScore(firstPlayerScore, secondPlayerScore);
    }

    private static String getEqualScore(int score) {
        switch (score) {
            case SCORE_LOVE:
                return "Love-All";
            case SCORE_FIFTEEN:
                return "Fifteen-All";
            case SCORE_THIRTY:
                return "Thirty-All";
            case SCORE_FORTY:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    private static String getAdvantageOrWin(int firstScore, int secondScore, String firstPlayerName, String secondPlayerName) {
        int scoreDifference = firstScore - secondScore;

        if (scoreDifference == 1) {
            return "Advantage " + firstPlayerName;
        } else if (scoreDifference == -1) {
            return "Advantage " + secondPlayerName;
        } else if (scoreDifference >= 2) {
            return "Win for " + firstPlayerName;
        } else {
            return "Win for " + secondPlayerName;
        }
    }

    private static String getNormalScore(int firstScore, int secondScore) {
        return convertScore(firstScore) + "-" + convertScore(secondScore);
    }

    private static String convertScore(int score) {
        switch (score) {
            case SCORE_LOVE:
                return "Love";
            case SCORE_FIFTEEN:
                return "Fifteen";
            case SCORE_THIRTY:
                return "Thirty";
            case SCORE_FORTY:
                return "Forty";
            default:
                return "Unknown";
        }
    }
}
