package camp.scala.flowabstract

object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles
  
  /*
  def filesEnding(query: String) =
    for(file <- filesHere; if file.getName.endsWith(query))
      yield file
      
  def filesContaining(query: String) = 
    for(file <- filesHere; if file.getName.contains(query))
      yield file
      
      
  def filesRegex(query: String) = 
    for(file <- filesHere; if file.getName.matches(query))
      yield file
	*/
  
  /*
  def fileMatching(query: String, matcher: (String, String) => Boolean) = {
    for(file <- filesHere; if matcher(file.getName, query))
      yield file
  }
  
  def filesEnding(query: String) = fileMatching(query, _.endsWith(_))
  
  def filesContaining(query: String) = fileMatching(query, _.contains(_))
  
  def filesRegex(query: String) = fileMatching(query, _.matches(_))
  */  
  
  def fileMatching(matcher: String => Boolean) = {
    for(file <- filesHere; if matcher(file.getName))
      yield file
  }
  
    
  def filesEnding(query: String) = fileMatching(_.endsWith(query))
  
  def filesContaining(query: String) = fileMatching(_.contains(query))
  
  def filesRegex(query: String) = fileMatching(_.matches(query))

}