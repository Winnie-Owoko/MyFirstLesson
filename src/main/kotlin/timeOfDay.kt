import java.sql.Time
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.LocalDateTime.*
import java.util.*



fun main(){
    val timeOfDay = LocalDateTime.now()
    //val message = " ${ if (timeOfDay.toInt < 12)"Good Morning " else "Goodnight"},Kotlin"
    //println(message)
    println("The current date and time is $timeOfDay")
    val simpleDate = SimpleDateFormat("HH")
    val currentTime = simpleDate.format(Date())
    println(" ${ if (currentTime.toInt() < 12)"Good Morning " else "Goodnight"}, Kotlin")
   // println(currentTime.toInt())
}