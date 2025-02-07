import java.util.HashMap;
import java.util.Map;

public class ProductRatingAnalyzer {

    public static Integer findMostFrequentRating(int[] ratings) {
        if (ratings == null || ratings.length == 0) {
            return null;
        }

        Map<Integer, Integer> ratingCounts = new HashMap<>();
        int mostFrequent = ratings[0];
        int maxCount = 1;

        for (int rating : ratings) {
            int count = ratingCounts.getOrDefault(rating, 0) + 1;
            ratingCounts.put(rating, count);

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = rating;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        int[] ratings1 = {4, 5, 4, 4, 3, 5, 4};
        System.out.println(findMostFrequentRating(ratings1));

        int[] ratings2 = {5, 5, 5, 4, 4, 3};
        System.out.println(findMostFrequentRating(ratings2));

        int[] ratings3 = {1, 2, 3, 4, 5};
        System.out.println(findMostFrequentRating(ratings3));

        int[] ratings4 = {};
        System.out.println(findMostFrequentRating(ratings4));

        int[] ratings5 = null;
        System.out.println(findMostFrequentRating(ratings5));

        int[] ratings6 = {4,4,5,5,4};
        System.out.println(findMostFrequentRating(ratings6));
    }
}