object Solution {
    def rob(nums: Array[Int]): Int = {
        for(i<-0 until nums.length){
            i match {
                case i if i == 0 => nums(0)
                case i if i==1 => nums(1)= math.max(nums(0), nums(1))
                case _ => nums(i)= math.max(nums(i)+ nums(i-2), nums(i-1))
            }
        }  
        nums.last
    }
 
}
