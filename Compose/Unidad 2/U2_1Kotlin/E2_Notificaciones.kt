/* USO DE IF/ELSE
    You have 51 notifications.
    Your phone is blowing up! You have 99+ notifications.
*/

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages >= 100 ) {
        print("Your phone is blowing up! You have 99+ notifications.\n")
    }
    else{
        print("You have $numberOfMessages notifications.\n")
    }
}