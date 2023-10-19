package leetCode;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] wealth = {{1,5},{7,3},{3,5}};
        System.out.println(findMaxWealth(wealth));
    }

    public static int findMaxWealth(int[][] wealth) {
        int mawWealth = wealth[0][0];


        for (int person = 0; person < wealth.length; person++) {
            int accountBalance = 0;
            for (int account = 0; account < wealth[person].length; account++) {
                accountBalance += wealth[person][account];
            }
            if (accountBalance > mawWealth){
                mawWealth = accountBalance;
            }
        }
        return mawWealth;
    }
}
