package camp.scala.firststep

object FirstStep {
	1 + 2                                     //> res0: Int(3) = 3
	
	1.+(2)                                    //> res1: Int(3) = 3
	
	println("Hello, world!")                  //> Hello, world!
	
	val msg = "Hello, World"                  //> msg  : String = Hello, World
	
	val msg2: java.lang.String = "Hello again, world!"
                                                  //> msg2  : String = Hello again, world!
	val msg3 : String = "Hello yet againg, world!"
                                                  //> msg3  : String = Hello yet againg, world!
	
	println(msg)                              //> Hello, World
	
	var greeting = "Hello, world"             //> greeting  : String = Hello, world
	
	greeting = "Leave me alone, world!"
	println(greeting)                         //> Leave me alone, world!
	
	def max(x: Int, y: Int): Int = {
		if(x > y) x
		else y
	}                                         //> max: (x: Int, y: Int)Int
	
	max(3, 2)                                 //> res2: Int = 3

	def max2(x: Int, y: Int) = if(x>y) x else y
                                                  //> max2: (x: Int, y: Int)Int
	
	max2(3, 4)                                //> res3: Int = 4
	
	def greet() = println("Hello, world!")    //> greet: ()Unit
	greet()                                   //> Hello, world!
	println(greet())                          //> Hello, world!
                                                  //| ()
  
}