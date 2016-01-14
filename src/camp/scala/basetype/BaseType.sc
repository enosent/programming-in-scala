package camp.scala.basetype

object BaseType {
  println("""Welcome to Ultamix 3000.
  					 Type "HELP" for help.""")
                                                  //> Welcome to Ultamix 3000.
                                                  //|   					 Type "HELP" for help.
  					 
	println("""|Welcome to Ultamix 3000
						 |Type "HELP" for help.""".stripMargin)
                                                  //> Welcome to Ultamix 3000
                                                  //| Type "HELP" for help.
	
	val s = 'aSymbol                          //> s  : Symbol = 'aSymbol
	
	val m = "Hello, world!"                   //> m  : String = Hello, world!
	
	m indexOf 'o'                             //> res0: Int = 4
	m indexOf ('o', 5)                        //> res1: Int = 8
}