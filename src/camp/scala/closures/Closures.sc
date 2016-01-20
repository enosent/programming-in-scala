package camp.scala.closures

object Closures {
  var increase = (x: Int) => x+1                  //> increase  : Int => Int = <function1>
  increase(10)                                    //> res0: Int = 11
  
  val someNumbers = List(-11, -10, -5, 0, 5, 10)  //> someNumbers  : List[Int] = List(-11, -10, -5, 0, 5, 10)
  
  someNumbers.foreach((x: Int) => println(x))     //> -11
                                                  //| -10
                                                  //| -5
                                                  //| 0
                                                  //| 5
                                                  //| 10
  
  someNumbers.filter((x: Int) => x > 0)           //> res1: List[Int] = List(5, 10)
  
  someNumbers.filter(x => x > 0)                  //> res2: List[Int] = List(5, 10)
  
  someNumbers.filter(_ > 0)                       //> res3: List[Int] = List(5, 10)
  
  someNumbers.foreach( println _ )                //> -11
                                                  //| -10
                                                  //| -5
                                                  //| 0
                                                  //| 5
                                                  //| 10
	
	def sum(a: Int, b: Int, c: Int) = a+b+c   //> sum: (a: Int, b: Int, c: Int)Int
	
	sum(1,2,3)                                //> res4: Int = 6
	
	val a = sum _                             //> a  : (Int, Int, Int) => Int = <function3>
	a(1, 2, 3)                                //> res5: Int = 6
	a.apply(1,2,3)                            //> res6: Int = 6
	
	val b = sum(1, _: Int, 3)                 //> b  : Int => Int = <function1>
	
	b(2)                                      //> res7: Int = 6
	b(5)                                      //> res8: Int = 9
	
	def echo(txt: String*) = for(x <- txt) println(x)
                                                  //> echo: (txt: String*)Unit
	
	echo()
	
	echo("one")                               //> one
	
	echo("hello", "world!")                   //> hello
                                                  //| world!
}