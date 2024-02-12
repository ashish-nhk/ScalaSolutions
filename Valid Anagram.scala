import scala.collection.mutable._
object Solution {
    def isAnagram(source: String, target: String): Boolean = {
        val mapSource = Map[Char, Int]().withDefaultValue(0)
        source.foreach(mapSource(_) += 1)
        target.foreach(mapSource(_) -= 1)
        return mapSource.values.filter( _!= 0).isEmpty
    }
}
