package stringTest;

public class StringTest01 {
    public static void main(String[] args) {
        int kinds = 34;       // 34종류의 패
        int maxCount = 4;     // 각 패는 최대 4장
        int totalTiles = 14;  // 총 선택할 패 수

        long result = countMahjongHands(kinds, maxCount, totalTiles);
        System.out.println("가능한 조합 수: " + result);
    }

    public static long countMahjongHands(int kinds, int maxCount, int totalTiles) {
        // dp[i][j] = i번째 종류까지 고려해서 j개의 패를 고르는 경우의 수
        long[][] dp = new long[kinds + 1][totalTiles + 1];
        dp[0][0] = 1; // 0종류, 0개 고르는 경우는 1가지

        for (int i = 1; i <= kinds; i++) {
            for (int j = 0; j <= totalTiles; j++) {
                for (int k = 0; k <= maxCount && j - k >= 0; k++) {
                    dp[i][j] += dp[i - 1][j - k];
                }
            }
        }

        return dp[kinds][totalTiles];
    }
}
