package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets:")
    var tickets:Int = scanner.nextInt()
    print("How many round-trip tickets:")
    var roundTripTickets:Int = scanner.nextInt()
    val ticket = TicketKotlin(tickets,roundTripTickets)
    ticket.totalPrint()
}

class TicketKotlin(var ticket:Int,var trip:Int) {

    val distCount: Float = 0.9f
    val TicketAmt: Int = 1000

    fun totalPrint() {
        var roundTripAmt:Float = trip * TicketAmt * 2 * distCount
        var tripAmt:Int = (ticket-trip) * TicketAmt
        var total:Float = roundTripAmt + tripAmt
        println("Total tickets:$ticket")
        println("Round-trip:$trip")
        println("Total:${total.toInt()}")
    }
}