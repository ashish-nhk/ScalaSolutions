import scala.collection.mutable._
 
object Solution {
    def maxProfit(prices: Array[Int], fee: Int): Int = {
        var n = prices.size
        var buyatday = ArrayBuffer[Int]()
        var sellatday = ArrayBuffer[Int]()
        buyatday.append((-1*prices(0)) - fee)
        sellatday.append(0)
        for(index<- 1 until n){
            var currbuy = math.max(buyatday(index-1), sellatday(index-1) - prices(index) - fee )
            var currsel = math.max(sellatday(index-1) , buyatday(index-1) + prices(index))
            buyatday.append(currbuy)
            sellatday.append(currsel)
        }
        sellatday(n-1)
    }
}
