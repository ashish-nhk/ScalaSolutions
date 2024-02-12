object Solution {
    def isPalindrome(s: String): Boolean = {
        var p ="[a-zA-Z0-9]*".r   //w
        var st = (p findAllIn s).mkString.map(_.toLower)
        var n = st.length
        for(i<-0 until n/2
            if st(i)!= st(n-i-1)
        ) return false

        true
    }
}
