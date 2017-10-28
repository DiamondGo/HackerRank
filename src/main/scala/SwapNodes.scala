object SwapNodes {

    import scala.collection.mutable
    import scala.io.StdIn._

    trait Tree
    case class Node(var left: Tree, var id: Int, var right: Tree) extends Tree
    case object NullPoint extends Tree

    def buildTree(children: Seq[(Int, Int)]) : Tree = {
        if (children == Nil)
            return NullPoint

        val root = Node(NullPoint, 1, NullPoint)
        val nodeQ = mutable.Queue[Node]()
        nodeQ.enqueue(root)

        for ((l, r) <- children) {
            val node = nodeQ.dequeue()
            if (l != -1) {
                val lchild = Node(NullPoint, l, NullPoint)
                node.left = lchild
                nodeQ.enqueue(lchild)
            }
            if (r != -1) {
                val rchild = Node(NullPoint, r, NullPoint)
                node.right = rchild
                nodeQ.enqueue(rchild)
            }
        }

        root
    }

    def swap(tree: Tree, rootDepth: Int, swapDepth: Int): Unit = {
        tree match {
            case NullPoint =>
            case n: Node => {
                if (rootDepth % swapDepth == 0) {
                    val tmp = n.left
                    n.left = n.right
                    n.right = tmp
                }
                swap(n.left, rootDepth+1, swapDepth)
                swap(n.right, rootDepth+1, swapDepth)
            }
        }
    }

    def inorder(tree: Tree): Seq[Int] = {
        tree match {
            case NullPoint => Nil
            case n: Node => (inorder(n.left) :+ n.id) ++ inorder(n.right)
        }
    }


    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        val N = readInt()
        val nodes:Seq[(Int, Int)] = (1 to N).map(_=>readLine.split(" ").map(_.toInt)).map(a => (a(0), a(1)))

        val tree = buildTree(nodes)

        val T = readInt()
        for (_ <- 1 to T) {
            val K = readInt
            swap(tree, 1, K)
            println(inorder(tree).mkString(" "))
        }
    }
}
