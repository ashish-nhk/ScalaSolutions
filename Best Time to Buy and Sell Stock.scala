object Solution {
    def maxProfit(prices: Array[Int]): Int = {
        var minValue= prices(0)
        var maxProfit = 0
        for(i<- 0 until prices.length){
            maxProfit = math.max(maxProfit, prices(i)- minValue)
            minValue= math.min(minValue, prices(i))
        }
        maxProfit
    }
}
