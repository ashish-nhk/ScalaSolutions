object Solution {
    def searchInsert(nums: Array[Int], target: Int): Int = {
        var (low, high) = (0, nums.length)
        while(low < high){
            var mid = (low+ high)/2
            if(nums(mid) < target)
               low = mid + 1
            else
               high = mid
        }
        low
    }
}
