object Scribble {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r)
      1
    else
      pascal(c, r - 1) + pascal(c - 1, r - 1)
  }                                               //> pascal: (c: Int, r: Int)Int
  pascal(2, 4)                                    //> res0: Int = 6
  pascal(0, 0)                                    //> res1: Int = 1
  pascal(4, 6)                                    //> res2: Int = 15
  pascal(6, 6)                                    //> res3: Int = 1
  pascal(1, 4)                                    //> res4: Int = 4
  pascal(0, 5)                                    //> res5: Int = 1
  pascal(3, 6)                                    //> res6: Int = 20

  def balance(chars: List[Char]): Boolean = {
    def countParethesis(chars: List[Char], count: Int): Int = {

      if (chars.isEmpty || count < 0)
        count
      else if (chars.head.toString == "(")
        countParethesis(chars.tail, count + 1)
      else if (chars.head.toString == ")")
        countParethesis(chars.tail, count - 1)
      else
        countParethesis(chars.tail, count)
    }

    countParethesis(chars, 0) == 0

  }                                               //> balance: (chars: List[Char])Boolean

  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0)
      1
    else if (money < 0 || coins.isEmpty)
      0
    else
      countChange(money, coins.tail) + countChange(money - coins.head, coins)
  }                                               //> countChange: (money: Int, coins: List[Int])Int

  countChange(300,List(5,10,20,50,100,200,500))   //> res7: Int = 1022
}