object Solution {
  def fillSet(s: scala.collection.mutable.Set[String], v: List[String]): Unit = {
    v.foreach(s += _)
  }
  def help(s: String, wordset: scala.collection.mutable.Set[String], start: Int, dp: Array[Int]): Int = {
    if (start == s.length) return 1
    if (dp(start) != -1) return dp(start)
    for (i <- start until s.length) {
      if (wordset.contains(s.substring(start, i + 1))) {
        if (help(s, wordset, i + 1, dp) == 1) return { dp(start) = 1; 1 }
      }
    }
    dp(start) = 0
    0
  }
  def wordBreak(s: String, wordDict: List[String]): Boolean = {
    val wordset = scala.collection.mutable.Set[String]()
    val dp = Array.fill(s.length)(-1)
    fillSet(wordset, wordDict)
    val a = help(s, wordset, 0, dp)
    a == 1
 
  }
}
