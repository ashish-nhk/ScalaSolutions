/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def isSymmetric(root: TreeNode): Boolean = {
        def isMirror(first: TreeNode, second: TreeNode):Boolean ={
            (first, second) match {
                case (null, null) => true
                case (first, second) if first != null && second != null && first.value == second.value => isMirror(first.left, second.right) && isMirror(first.right, second.left)
                case _ => false
            }
        }
        isMirror(root, root)
    }
}
