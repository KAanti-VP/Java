public class EnumJegyek {

    enum jegyek {ELEGTELEN, ELGSEGES, KOZEPES, JO, JELES}

    public static void main(String[] args) {

        int[][] scores = new int[][] {{3, 4, 5}, {4, 4, 5}, {3, 2, 3}, {5, 5, 5}, {1, 3, 2}};

        for (int[] studentScores: scores) {
            double score = getScore(studentScores);
            System.out.println(getEvaluation(score));
        }
    }

    public static double getScore(int[] scores) {
        int sum = 0;
        for (int score: scores) {
            sum += score;
        }
        return 1. * sum / scores.length;
    }

    public static jegyek getEvaluation(double score) {
        if (score < 1.8)
            return jegyek.ELEGTELEN;
        else if (score < 2.6)
            return jegyek.ELGSEGES;
        else if (score < 3.6)
            return jegyek.KOZEPES;
        else if (score < 4.6)
            return jegyek.JO;
        else
        return jegyek.JELES;
    }
}
