// Compare the Java and Scala programming languages
// • Java is an object oriented language | Scala is both OO and FP
// • Java doesn't support operator overloading | Scala does
// • Java doesn't suport lazy evaluation | Scala does
// • Java is backward compatibel | Scala isn't (code written in new version may not run in older version error-free)


// Use the following declaration and initialization to convert them to acceptable 
// Scala statements. 
// int a = 2, b = 3, c = 4, d = 5;
// float k = 4.3f; 

object tute01{
    def main(args: Array[String]) = {
        
        var (a, b, c, d, k) = (2, 3, 4, 5, 4.3f)

        // println(--b * a + c * d--)   Scala does not support prefix operation
        // println(a++)     Scala does not support postfix
        println(-2 * (g - k) + c)   // Generates error as g is not declared
        // println(c = c++)   Scala does not support postfix
        // println(c = ++c * a++)      Scala does not support prefix and postfix operations

    }
}