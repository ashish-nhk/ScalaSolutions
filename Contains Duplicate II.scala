import scala.collection.mutable._
object Solution {
    def containsNearbyDuplicate(nums: Array[Int], k: Int): Boolean = {
        var freq = Map[Int, Int]().withDefaultValue(0)
        for(i <- 0 until nums.length){
          freq(nums(i)) += 1
          if(i > k)
            freq(nums(i-k-1)) -= 1  
         if(freq(nums(i))>1) return true
        }
        false
    }
}
