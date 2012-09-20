object Scribble {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  println("Welcome to the Scala worksheet");$skip(131); 
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r)
      1
    else
      pascal(c, r - 1) + pascal(c - 1, r - 1)
  };System.out.println("""pascal: (c: Int, r: Int)Int""");$skip(15); val res$0 = 
  pascal(2, 4);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); val res$1 = 
  pascal(0, 0);System.out.println("""res1: Int = """ + $show(res$1));$skip(15); val res$2 = 
  pascal(4, 6);System.out.println("""res2: Int = """ + $show(res$2));$skip(15); val res$3 = 
  pascal(6, 6);System.out.println("""res3: Int = """ + $show(res$3));$skip(15); val res$4 = 
  pascal(1, 4);System.out.println("""res4: Int = """ + $show(res$4));$skip(15); val res$5 = 
  pascal(0, 5);System.out.println("""res5: Int = """ + $show(res$5));$skip(15); val res$6 = 
  pascal(3, 6);System.out.println("""res6: Int = """ + $show(res$6));$skip(445); 

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

  };System.out.println("""balance: (chars: List[Char])Boolean""");$skip(226); 

  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0)
      1
    else if (money < 0 || coins.isEmpty)
      0
    else
      countChange(money, coins.tail) + countChange(money - coins.head, coins)
  };System.out.println("""countChange: (money: Int, coins: List[Int])Int""");$skip(49); val res$7 = 

  countChange(300,List(5,10,20,50,100,200,500));System.out.println("""res7: Int = """ + $show(res$7))}
}