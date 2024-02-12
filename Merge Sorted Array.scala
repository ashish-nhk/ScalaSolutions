object Solution {
    def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
        val newNums = (nums1.take(m) ++ nums2).sorted
        for(i <- 0 until m+n)
            nums1(i) = newNums(i) 
    }
}
