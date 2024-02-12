/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
import scala.collection.mutable._
object Solution {
    def averageOfLevels(root: TreeNode): Array[Double] = {
        var mp = Map[Int, ListBuffer[Long]]()
        def rec(root: TreeNode, level: Int){
            if(root != null){
               // println(level+ " "+ root.value )
                if(!mp.contains(level)) mp(level) = ListBuffer[Long]()
                mp(level) +=  root.value
                rec(root.left, level +1)
                rec(root.right, level +1) 
            }
        }
        rec(root, 0)
        println(mp.keys.toArray.length)
        var avge= Array.fill(mp.keys.toArray.length )(0.0) 
        mp.keys.foreach(k=>{
           avge(k) = mp(k).sum.toDouble/mp(k).length 
        })
        avge
    }
}
