import scala.compiletime.ops.float
object tute01{
    def main(args: Array[String]) = {

// Question 01
        println("Question 01")

        val r = 5
        def diskarea (r:Double) = math.Pi*r*r
        println("Area of disk with radius 5: " + diskarea(r))

// Question 02
        println("\n\nQuestion 02")

        def converttemp (temp:Float) = temp*9/5 + 32
        println("0 celcius to F: " + converttemp(35) + "F")
        
// Question 03
        println("\n\nQuestion 03")
                    
        def volumesphere (r:Double) = (4.0/3.0)*math.Pi*r*r*r
        println("Volume of sphere with radius 5: " + volumesphere(r))

// Question 04
        println("\n\nQuestion 04")
        
        def bookcost (n:Int, discount:Double) = n*24.95*(1-discount)
        def shipping (n:Int) : Double = n<=50 match{
            case true => n83
            case _ => 50*3 + (n-50)*0.75
        }
        def wholesalecost (n:Int) : Double = bookcost(n, 0.4) + shipping(n)
        println("Total wholesale cost for 60 copies: " + wholesalecost(60))

// Question 05
        println("\n\nQuestion 05")

        def time (d:Int, pace:Int) : Double = pace*d
        println("Total running time (mins): " + (time(2, 8) + time(3, 7) + time(2, 8)) + " mins")
    }
}