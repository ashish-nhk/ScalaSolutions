object Solution {
    def myPow(x: Double, n: Int): Double = {
       if(n==0) return 1        
       var res=1.0
       var base=if(n<0) 1/x.toDouble else x.toDouble
       var exponent=math.abs(n.toLong)
       while(exponent>0){
           if(exponent%2!=0) res*=base
            exponent/=2
            base*=base
 
       }
       res
    }
}
