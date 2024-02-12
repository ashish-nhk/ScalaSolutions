object Solution {
    def decodeString(s: String): String = {
        val st = scala.collection.mutable.Stack[(Int, String)]()
    var ans = ""
    var curS = ""
    var curNum = 0
    s.foreach {
      case '[' =>
        st.push((curNum, ""))
        curNum = 0
      case ']' => {
        var newS = st.top._2 * st.top._1
        st.pop
        if (st.size == 0) {
          ans += newS
        } else {
          var (num, lastStr) = st.pop
          lastStr += newS
          st.push((num, lastStr))
        }

      }
      case d if d.isDigit => curNum = curNum * 10 + d.asDigit
      case ch => {
        if (st.size != 0) {
          var (num, t) = st.pop
          t += ch
          st.push((num, t))
        } else {
          ans += ch
        }
      }
    }
    ans
        
        
    }
}
