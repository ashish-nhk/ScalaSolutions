/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def hasPathSum(root: TreeNode, targetSum: Int): Boolean = {
        root match{
            case null => false
            case root if root.left == null && root.right == null && root.value == targetSum => true
            case root => hasPathSum(root.left, targetSum - root.value) || hasPathSum(root.right, targetSum - root.value)
        }
    }
}
