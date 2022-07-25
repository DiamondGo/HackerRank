object CompareTheTriplets {
    implicit class TuppleAdd(t: (Int, Int)) {
        def +(p: (Int, Int)) = (p._1 + t._1, p._2 + t._2)
    }

    def score(a:Int, b:Int): (Int, Int) = {
        if (a > b)
            (1, 0)
        else if (a < b)
            (0, 1)
        else
            (0, 0)
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var a0 = sc.nextInt();
        var a1 = sc.nextInt();
        var a2 = sc.nextInt();
        var b0 = sc.nextInt();
        var b1 = sc.nextInt();
        var b2 = sc.nextInt();

        println((score(a0, b0) + score(a1, b1) + score(a2, b2)).productIterator.mkString(" "))
    }
}
