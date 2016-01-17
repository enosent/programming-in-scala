package camp.scala.functionalobject

object FunctionalObject {

	new Rational(1, 2)                        //> res0: camp.scala.functionalobject.Rational = 1/2

	// new Rational(5, 0) - java.lang.IllegalArgumentException: requirement failed
	
	val oneHalf = new Rational(1, 2)          //> oneHalf  : camp.scala.functionalobject.Rational = 1/2
	val twoThirds = new Rational(2, 3)        //> twoThirds  : camp.scala.functionalobject.Rational = 2/3
	
	oneHalf add twoThirds                     //> res1: camp.scala.functionalobject.Rational = 7/6
	
	val r = new Rational(1, 2)                //> r  : camp.scala.functionalobject.Rational = 1/2
	r.numer                                   //> res2: Int = 1
	r.denom                                   //> res3: Int = 2
	
	val y = new Rational(3)                   //> y  : camp.scala.functionalobject.Rational = 3/1
	
	new Rational(66, 42)                      //> res4: camp.scala.functionalobject.Rational = 11/7
	
}