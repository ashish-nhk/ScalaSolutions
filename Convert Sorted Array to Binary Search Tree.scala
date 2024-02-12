/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def sortedArrayToBST(nums: Array[Int]): TreeNode = {  
        var n = nums.length
        var mid = n /2
        if (n == 0)
         return null
        var node = new TreeNode(nums(mid), null, null)
        node.left = sortedArrayToBST(nums.take(n/2))
        node.right = sortedArrayToBST(nums.takeRight(n - n/2 -1))
        node
    }
}
