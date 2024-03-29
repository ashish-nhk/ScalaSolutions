/**
 * Definition for a Node.
 * class Node(var _value: Int) {
 *   var value: Int = _value
 *   var neighbors: List[Node] = List()
 * }
 */

object Solution {
    def dfs(node: Node, copy: Node,vis : Array[Node]): Unit = {
    vis(copy.value) = copy
    for (adj <- node.neighbors) {
      if (vis(adj.value) == null) {
        val newnode = new Node(adj.value)
        copy.neighbors = newnode :: copy.neighbors
        dfs(adj, newnode,vis)
      } else {
        copy.neighbors = vis(adj.value) :: copy.neighbors
      }
    }
  }
    def cloneGraph(graph: Node): Node = {
       val vis = new Array[Node](101)
       if (graph == null) return null
       val copy = new Node(graph.value)
       dfs(graph, copy,vis)
       copy
    }
}
