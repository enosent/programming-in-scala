package camp.scala.classandobject

object ClassAndObject {

	val accm = new ChecksumAccumulator        //> accm  : camp.scala.classandobject.ChecksumAccumulator = camp.scala.classandob
                                                  //| ject.ChecksumAccumulator@deb6432
	
	accm.add(2.toByte)
	accm.add(2.toByte)

	println( accm.checksum )                  //> -4
	
	ChecksumAccumulator.calculate("Every value is an object")
                                                  //> res0: Int = -202
                                                  
	FallWinterSpringSummer.main(Array())      //> fall: -159
                                                  //| winter: -153
                                                  //| spring: -147
}