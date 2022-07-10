// Question 4. a.

object tute01{
    def main(args: Array[String]) = {
        
        def normal(x:Int) : Int = {
            250*x
        }
        
        def ot(x:Int) : Int = {
            85*x
        }

        def taxed(x:Int, rate:Double) = {
            x*(1 - rate)
        }

        def salary(normalH:Int, otH:Int) : Double = {
            taxed(normal(normalH) + ot(otH), 0.12)
        }

        println("Take home salary = Rs. " + salary(40*4, 30*4))

    }
}