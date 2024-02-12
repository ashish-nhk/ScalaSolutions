object Solution {
    def findMin(nums: Array[Int]): Int = {
        var (beg,mid,end)=(0,0,nums.length-1)
        while(beg<end){
            mid=(beg+end)/2
           mid match{
            case mid  if nums(beg) <= nums(mid) && nums(beg) < nums(end) => end = beg
            case mid   if nums(beg) <= nums(mid) && nums(beg) >= nums(end) => beg = mid +1
            case mid => end = mid
           }
        }
       nums(beg)
    }
}
