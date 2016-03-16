package camp.scala.secondstep

object SecondStep {

	val greetStrings = new Array[String](3)   //> greetStrings  : Array[String] = Array(null, null, null)
	
	greetStrings(0) = "Hello"
	greetStrings(1) = ", "
	greetStrings(2) = "world!\n"
	
	for( i <- 0 to 2 )
		print(greetStrings(i))            //> Hello, world!
	
	
	val greetStrings2 = new Array[String](3)  //> greetStrings2  : Array[String] = Array(null, null, null)
	
	greetStrings2.update(0, "Hello")
	greetStrings2.update(1, ", ")
	greetStrings2.update(2, "world!\n")
	
	for(i <- 0.to(2)) {
		print(greetStrings2.apply(i))     //> Hello, world!
	}
	
	val numNames = Array("zero", "one", "two")//> numNames  : Array[String] = Array(zero, one, two)
	val numNames2 = Array.apply("zero", "one", "two")
                                                  //> numNames2  : Array[String] = Array(zero, one, two)
                                                  
	val oneTwoThree = List(1, 2, 3)           //> oneTwoThree  : List[Int] = List(1, 2, 3)
	
	val oneTwo = List(1, 2)                   //> oneTwo  : List[Int] = List(1, 2)
	val threeFour = List(3, 4)                //> threeFour  : List[Int] = List(3, 4)
	val oneTwoThreeFour = oneTwo ::: threeFour//> oneTwoThreeFour  : List[Int] = List(1, 2, 3, 4)
	
	println(oneTwo +" and "+ threeFour +" were not mutated.")
                                                  //> List(1, 2) and List(3, 4) were not mutated.
	println("Thus, " + oneTwoThreeFour +" is a new list.")
                                                  //> Thus, List(1, 2, 3, 4) is a new list.
	
	val empty = Nil                           //> empty  : scala.collection.immutable.Nil.type = List()
	
	val list = List("Cool", "tools", "rule")  //> list  : List[String] = List(Cool, tools, rule)
	
	val thrill = "Will" :: "fill" :: "until" ::Nil
                                                  //> thrill  : List[String] = List(Will, fill, until)
	thrill(2)                                 //> res0: String = until
	
	thrill.count(s => s.length == 4)          //> res1: Int = 2
	
	thrill.drop(2)                            //> res2: List[String] = List(until)
	
	thrill.dropRight(2)                       //> res3: List[String] = List(Will)
	
	thrill.exists(s => s == "until")          //> res4: Boolean = true
	
	thrill.filter(s => s.length == 4)         //> res5: List[String] = List(Will, fill)
	
	thrill.forall(s => s.endsWith("l"))       //> res6: Boolean = true
	
	thrill.foreach(s => print(s))             //> Willfilluntil
	
	thrill.foreach(print)                     //> Willfilluntil
	
	thrill.head                               //> res7: String = Will
	
	thrill.init                               //> res8: List[String] = List(Will, fill)
	
	thrill.isEmpty                            //> res9: Boolean = false
	
	thrill.last                               //> res10: String = until
	
	thrill.length                             //> res11: Int = 3
	
	thrill.map(s => s+"y")                    //> res12: List[String] = List(Willy, filly, untily)
	
	thrill.mkString(",")                      //> res13: String = Will,fill,until
	
	thrill.reverse                            //> res14: List[String] = List(until, fill, Will)
	
	thrill.tail                               //> res15: List[String] = List(fill, until)
	
	var pair = (99, "Lufballons")             //> pair  : (Int, String) = (99,Lufballons)
	println(pair._1)                          //> 99
	println(pair._2)                          //> Lufballons
	
	var jetSet = Set("Boeing", "Airbus")      //> jetSet  : scala.collection.immutable.Set[String] = Set(Boeing, Airbus)
	jetSet += "Lear" // jetSet = jetSet + "Lear"
	println(jetSet)                           //> Set(Boeing, Airbus, Lear)
	println(jetSet.contains("Cessna"))        //> false
	
	val valSet = Set("a", "b")                //> valSet  : scala.collection.immutable.Set[String] = Set(a, b)
	//valSet += "c" // value += is not a member of scala.collection.immutable.Set[String]
	
	val movieSet = scala.collection.mutable.Set("Hitch", "Poltergeist")
                                                  //> movieSet  : scala.collection.mutable.Set[String] = Set(Poltergeist, Hitch)
	movieSet += "Shrek" // movieSet.+=("Shrek)//> res16: camp.scala.secondstep.SecondStep.movieSet.type = Set(Poltergeist, Sh
                                                  //| rek, Hitch)
	println(movieSet)                         //> Set(Poltergeist, Shrek, Hitch)
	
	val hashSet = scala.collection.immutable.HashSet("Tomatoes", "Chilies")
                                                  //> hashSet  : scala.collection.immutable.HashSet[String] = Set(Chilies, Tomato
                                                  //| es)
	println(hashSet + "Coriander")            //> Set(Chilies, Tomatoes, Coriander)
	
	val treasureMap = scala.collection.mutable.Map[Int, String]()
                                                  //> treasureMap  : scala.collection.mutable.Map[Int,String] = Map()
	treasureMap += ( 1 -> "Go to island" )    //> res17: camp.scala.secondstep.SecondStep.treasureMap.type = Map(1 -> Go to i
                                                  //| sland)
	treasureMap += ( 2 -> "Find big X on ground" )
                                                  //> res18: camp.scala.secondstep.SecondStep.treasureMap.type = Map(2 -> Find bi
                                                  //| g X on ground, 1 -> Go to island)
	treasureMap += ( 3 -> "Dig" )             //> res19: camp.scala.secondstep.SecondStep.treasureMap.type = Map(2 -> Find bi
                                                  //| g X on ground, 1 -> Go to island, 3 -> Dig)
	println(treasureMap(2))                   //> Find big X on ground
}