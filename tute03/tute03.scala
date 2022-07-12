import scala.compiletime.ops.float
object tute01{
    def main(args: Array[String]) = {

// Question 01
        println("Question 01\n")

        val a = -100
        val absVal = if(a<0) -a else a
        
        println(absVal)

        
// Question 02
        println("\n\nQuestion 02")

        def largestof2 (a:Int, b:Int) = {
            if(a>b) a
            else b
        }

        println("\nUsing if statement\nlargestof2(4,5): " + largestof2(4,5))

        //2. b. Scala does not have a ternary operator 

// Question 03
        println("\n\nQuestion 03")
        
        def largestof3 (a:Int, b:Int, c:Int) = {
            largestof2(largestof2(a,b), c)
        }

        println("\nUsing if statement\nlargestof3(4,5,6): " + largestof3(4,5,6))
        
        //3. b. Scala does not have a ternary operator 

// Question 04
        println("\n\nQuestion 04")

        def oddeven (x:Int) = {
            if(x%2 == 0) "Even" else "Odd"
        }

        println("\noddeven(3): " + oddeven(3))
        println("oddeven(20): " + oddeven(20))

// Question 05
        println("\n\nQuestion 05\n")

        def newfunc (a:Int, b:Int) = {
            if (a==1)
            if (b==1)
            System.out.println("***")
            else
            System.out.println("###")
            System.out.println("===")            
        }

        newfunc(1,2)    // 3 - #, 3 - =
        newfunc(1,3)    // 3 - #, 3 - =
        newfunc(2,3)    // 3 - =
        newfunc(2,2)    // 3 - =

// Question 06
        println("\n\nQuestion 06")

        def gradesbyif (a:Float, b:Float, c:Float) = {
            val avg = (a+b+c)/3.0
            if(avg < 0)   println("Invalid Marks")
            else if(avg <= 54)   println("Pass")
            else if(avg <= 69)   println("Good")
            else if(avg > 69)   println("Very Good")
            else    println("Fail")
        }
        printf("\nUsing if-else: gradesbyif(69, 70, 85): ")
        gradesbyif(69, 70, 85)
        printf("Using if-else: gradesbyif(-5, -10, -1): ")
        gradesbyif(-5, -10, -1)
        printf("Using if-else: gradesbyif(54, 40, 45): ")
        gradesbyif(54, 40, 45)

        def gradesbynestedif (a:Float, b:Float, c:Float) = {
            val avg = (a+b+c)/3.0
            if(avg >= 0){
                if(avg > 39){
                    if(avg > 54){
                        if(avg > 69)    println("Very Good")
                        else    println("Good")
                    }
                    else    println("Pass")
                }
                else    println("Fail")
            }
            else    println("Invalid Marks")
        }
        printf("\nUsing nested if: gradesbynestedif(69, 70, 85): ")
        gradesbynestedif(69, 70, 85)
        printf("Using if-else: gradesbynestedif(-5, -10, -1): ")
        gradesbynestedif(-5, -10, -1)
        printf("Using if-else: gradesbynestedif(54, 40, 45): ")
        gradesbynestedif(54, 40, 45)

        def gradesbyternary (a:Float, b:Float, c:Float) = {
            val avg = (a+b+c)/3.0
            if(avg>0) (if(avg>39) (if(avg>54) (if(avg>69) println("Very Good") else println("Good")) else println("Pass")) else println("Fail")) else println("Invalid Marks")
        }
        printf("\nUsing nested if: gradesbyternary(69, 70, 85): ")
        gradesbyternary(69, 70, 85)
        printf("Using if-else: gradesbyternary(-5, -10, -1): ")
        gradesbyternary(-5, -10, -1)
        printf("Using if-else: gradesbyternary(54, 40, 45): ")
        gradesbyternary(54, 40, 45)

// Question 07
        println("\n\nQuestion 07\n")

        def season (x:Int) = {
            if(Array(12,1,2) contains x) println("Season=Winter")
            else if(Array(3,4,5) contains x) println("Season=Spring")
            else if(Array(6,7,8) contains x) println("Season=Summer")
            else if(Array(9,10,11) contains x) println("Season=Autumn")
            else    println("Bogus month")
        }
        printf("2: ")
        season(2)
        printf("6: ")
        season(6)
        printf("13: ")
        season(13)

// Question 08
        println("\n\nQuestion 08")
        
        def converttemp (temp:Float, scale:Char) = {
            if(scale == 'c')    temp*9/5 + 32
            else    5/9*(temp - 32)
        }
        println("\n32F to celcius: "+converttemp(32, 'f'))
//         println("0 celcius to F: "+converttemp(0, 'c'))

// Question 09
        println("\n\nQuestion 09")

        def calc (a:Float, b:Float, operator:Char) = {
            if (operator == '+')    println(a+b)
            else if (operator == '-')    println(a-b)
            else if (operator == '*')    println(a*b)
            else if (operator == '/')    println(a/b)
            else    println("Invalid operation")
        }
        printf("\n2+3 = ")
        calc(2,3,'+')
        printf("2-3 = ")
        calc(2,3,'-')
        printf("2*3 = ")
        calc(2,3,'*')
        printf("2/3 = ")
        calc(2,3,'/')
        printf("2^3 = ")
        calc(2,3,'^')
    }
}