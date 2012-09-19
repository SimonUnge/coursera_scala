object Scribble {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  println("Welcome to the Scala worksheet");$skip(119); 
  def pascal(c: Int, r: Int): Int = {
  	if (c == 0 || c == r)
  		1
  	else
  		pascal(c, r-1) + pascal(c-1, r-1)
  };System.out.println("""pascal: (c: Int, r: Int)Int""");$skip(13); val res$0 = 
	pascal(2,4);System.out.println("""res0: Int = """ + $show(res$0));$skip(13); val res$1 = 
	pascal(0,0);System.out.println("""res1: Int = """ + $show(res$1));$skip(13); val res$2 = 
	pascal(4,6);System.out.println("""res2: Int = """ + $show(res$2));$skip(13); val res$3 = 
	pascal(6,6);System.out.println("""res3: Int = """ + $show(res$3));$skip(13); val res$4 = 
	pascal(1,4);System.out.println("""res4: Int = """ + $show(res$4));$skip(13); val res$5 = 
	pascal(0,5);System.out.println("""res5: Int = """ + $show(res$5));$skip(13); val res$6 = 
	pascal(3,6);System.out.println("""res6: Int = """ + $show(res$6))}
}