object Solution {
    def coinChange(coins: Array[Int], amount: Int): Int = {
        val memo = Array.fill(amount+1)(100000000)
        memo(0) = 0
        for(currAmount <- 1 to amount; coin <- coins; if (currAmount- coin) >= 0
        ){
            memo(currAmount) = math.min(memo(currAmount), 1+ memo(currAmount- coin))
        }
        var ans= if(memo(amount) < 100000000)  memo(amount) else -1
        ans
    }
}
