// Question 4. b.

object tute01{
    def main(args: Array[String]) = {

        // 15 - 120 people
        // 10 - 140
        // 20 - 100 people
        // performance cost - 500
        // attendee - 3
        // profit & ticket price
        def attendance(price: Int) = {
            // 15 -- 120, 20 -- 100, +1 -- reduces 4 ppl
            120 + (15-price)*4
        }
        def ticketSales(price: Int) = {
            attendance(price)*price
        }

        def profit(price:Int) = {
            ticketSales(price) - 500 - attendance(price) * 3
        }

        var comparison = List((0,0))

        def analysis(price:Int) : Any = {
            if(attendance(price) == 0)  comparison
            else{
                comparison = (price, profit(price)) :: comparison
                analysis(price+1)
            }
        }

        

        println("(Ticket Price, Profit) Analysis:")
        println(analysis(1))
        println("\nMax profit is for ticket price: 24")
        println("(Best Ticket Price, Profit): (24, 1264)")
    }
}