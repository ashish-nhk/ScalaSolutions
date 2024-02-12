object Solution {
    def groupAnagrams(strs: Array[String]): List[List[String]] = {
        strs.groupBy(_.sorted).toList.map(_._2.toList)
    }
}
