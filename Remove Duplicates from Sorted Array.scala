object Solution {
    def removeDuplicates(nums: Array[Int]): Int = {
        var (n, ind)= (nums.length, 1)
        for(i<-1 until n
           if nums(i) != nums(i-1)
        )
        {nums(ind) = nums(i)
        ind+=1
        }
        ind
    }
}
