object Solution {
    def maxArea(height: Array[Int]): Int = {
        var (start,end) = (0, height.length -1)
        var ans=0
        while( start< end){
            ans= math.max(ans, math.min(height(start), height(end))*(end-start))
            if(height(start) <= height(end))
                start+=1
            else
                end-=1
        }
        ans
    }
}
