package camp.scala.intro

object Intro {

	var capital = Map("US" -> "Washington", "France" -> "Paris")
                                                  //> capital  : scala.collection.immutable.Map[String,String] = Map(US -> Washing
                                                  //| ton, France -> Paris)
  capital += ("Korea" -> "Seoul")
  println(capital)                                //> Map(US -> Washington, France -> Paris, Korea -> Seoul)

	def factorial(x: BigInt): BigInt =  if(x == 0) 1 else x * factorial(x-1)
                                                  //> factorial: (x: BigInt)BigInt
	
	factorial(30)                             //> res0: BigInt = 265252859812191058636308480000000
}