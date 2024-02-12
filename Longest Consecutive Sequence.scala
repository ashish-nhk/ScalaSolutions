import scala.collection.mutable._
object Solution {
    def longestConsecutive(nums: Array[Int]): Int = {
       var set = nums.toSet
       var ans=0
       for(i <- set){
           if(!set.contains(i-1)){
               var cnt= 1
               var vl= i
               while(set.contains(vl+1)){
                   cnt+=1
                   vl+=1
               }
               ans =math.max(ans, cnt)
           }
       }
       ans
    }
}
