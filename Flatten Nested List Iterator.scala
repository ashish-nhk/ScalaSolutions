/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * trait NestedInteger {
 *
 *   // Return true if this NestedInteger holds a single integer, rather than a nested list.
 *   def isInteger: Boolean
 *
 *   // Return the single integer that this NestedInteger holds, if it holds a single integer.
 *   def getInteger: Int
 *
 *   // Set this NestedInteger to hold a single integer.
 *   def setInteger(i: Int): Unit
 *
 *   // Return the nested list that this NestedInteger holds, if it holds a nested list.
 *   def getList: Array[NestedInteger]
 *
 *   // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *   def add(ni: NestedInteger): Unit
 * }
 */

class NestedIterator(_nestedList: List[NestedInteger]) {
    private var res: List[Int] = Nil
    private var index: Int = 0
    private def help(nested: List[NestedInteger]): Unit = {
    for (ele <- nested.reverse) {
      if (ele.isInteger) res = ele.getInteger :: res
      else help(ele.getList.toList)
     }
  }
 
  help(_nestedList)
 
    def next(): Int = {
    val result = res(index)
    index += 1
    result
    }
    def hasNext(): Boolean = {
    index < res.length    
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * var obj = new NestedIterator(nestedList)
 * var param_1 = obj.next()
 * var param_2 = obj.hasNext()
 */
