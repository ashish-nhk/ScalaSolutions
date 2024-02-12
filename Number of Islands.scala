object Solution {
    def numIslands(originalGrid: Array[Array[Char]]): Int = {
        var num = 2
        var grid = originalGrid
        var (m , n) = (grid.length, grid(0).length)
        
        for(i<- 0 until m ; j<-0 until n){
            if(grid(i)(j) == '1'){
                isSameLand(i, j, num)
                num += 1
            } 
        }

       def isSameLand(x: Int, y:Int, num: Int): Unit = {
            grid(x)(y) = '0'
            if(x+1 < m && grid(x+1)(y) == '1')  isSameLand(x+1, y, num)
            if(y+1 < n && grid(x)(y+1) == '1')  isSameLand(x, y+1, num)
            if(x > 0 && grid(x-1)(y) == '1')  isSameLand(x-1, y, num)
             if(y > 0 && grid(x)(y-1) == '1') isSameLand(x, y-1, num)
       }
       grid.foreach(p=> println(p.toList))
       num -2
    }
}
