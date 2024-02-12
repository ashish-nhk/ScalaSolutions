import scala.collection.mutable._
object Solution {
    def isValid(s: String): Boolean = {
        var st = Stack[Int]()
        for(ch <- s){
            if(ch==')' && !st.isEmpty && st.top=='(') st.pop;
            else if(ch=='}' && !st.isEmpty && st.top=='{')st.pop;
             else if(ch==']' && !st.isEmpty && st.top=='[')st.pop;
            else if(ch=='[' || ch=='(' || ch=='{')
                st.push(ch);
            else
                return false;

        }
        st.isEmpty
    }
}
