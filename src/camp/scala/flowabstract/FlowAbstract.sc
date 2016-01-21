package camp.scala.flowabstract

object FlowAbstract {

	val matcher = FileMatcher.filesEnding("scala")
                                                  //> matcher  : Array[java.io.File] = Array()
	
 	def containsNeg(nums: List[Int]): Boolean = {
 		var exists = false
 		
 		for( num <- nums)
 			if(num < 0)
 				exists = true
 		
 		exists
 	}                                         //> containsNeg: (nums: List[Int])Boolean
 	
	containsNeg(List(1,2,3,4))                //> res0: Boolean = false
	containsNeg(List(1,2,-3,4))               //> res1: Boolean = true
	
	def containsNegClosures(nums: List[Int]) = nums.exists(_ < 0)
                                                  //> containsNegClosures: (nums: List[Int])Boolean
 	
	containsNegClosures(List(1,2,3,4))        //> res2: Boolean = false
	containsNegClosures(List(1,2,-3,4))       //> res3: Boolean = true
	
	def containsOdd(nums: List[Int]): Boolean = {
		var exists = false
		for(num <- nums)
			if(num%2 == 1)
				exists = true
		exists
	}                                         //> containsOdd: (nums: List[Int])Boolean
	
	containsOdd(List(2,3,4))                  //> res4: Boolean = true
	
	def containsOddHigh(nums: List[Int]) = nums.exists( _%2 == 1 )
                                                  //> containsOddHigh: (nums: List[Int])Boolean
	
	containsOddHigh(List(2,3,4))              //> res5: Boolean = true
}