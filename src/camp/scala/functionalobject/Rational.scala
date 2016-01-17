package camp.scala.functionalobject

class Rational(n: Int, d: Int) {
  
  require(d != 0)
  
  private val g = gcd(n.abs, d.abs)
  
  val numer: Int = n / g
  val denom: Int = d / g
  
  def this(n: Int) = this(n, 1) // 보조생성자
  
  //println("Created " + n + "/" + d)
  override def toString = numer +"/"+ denom
  
  def add(that: Rational): Rational = 
    new Rational(numer * that.denom + that.numer * d, d * that.denom)
  
  def lessThan(that: Rational) =
    this.numer * this.denom < that.numer * that.denom // = numer * denom < that.numer * that.denom
    
  def max(that: Rational) =
     if(this.lessThan(that)) that else this
     
     
  private def gcd(a: Int, b:Int): Int = 
    if(b == 0) a else gcd(b, a%b)
}