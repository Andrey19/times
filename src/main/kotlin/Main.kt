fun main(args: Array<String>) {
    agoToText(2 * 60 * 60)
}

fun agoToText(timeCount: Int) = when (timeCount) {
    in 0..60 -> println(" был(а) только что")
    in 61..3599 -> timeMinuts(timeCount / 60)
    in 60 * 60..24 * 60 * 60 -> timeHour(timeCount / 3600)
    in 86400..86400 * 2 -> println(" был(а) вчера")
    in 86400 * 2..86400 * 3 -> println(" был(а) позавчера")
    else -> println(" был(а) давно")
}

fun timeHour(timeCount: Int) = when (timeCount) {
    1, 21 -> println(" был(а) " + timeCount + " час назад ")
    in 2..4, in 22..24 -> println(" был(а) " + timeCount + " часа назад ")
    else -> println(" был(а) " + timeCount + " часов назад ")
}

fun timeMinuts(timeCount: Int) = when (timeCount) {
    1, 21, 31, 41, 51 -> println(" был(а) " + timeCount + " минуту назад ")
    in 5..20, in 25..30, in 35..40, in 45..50, in 55..60 -> println(" был(а) " + timeCount + " минут назад ")
    else -> println(" был(а) " + timeCount + " минуты назад ")
}
