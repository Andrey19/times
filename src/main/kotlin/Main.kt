fun main(args: Array<String>) {
    agoToText(60*61)
}

fun agoToText(timeCount: Int) = when (timeCount) {
    in 0..60 -> println(" был(а) только что")
    in 61..60 * 60 -> println(" был(а) " + (timeCount / 60) + " минут назад ")
    in 60 * 60 ..24 * 60 * 60 -> println(" был(а) " + (timeCount / 3600) + " часов  назад ")
    in 86400..86400*2 -> println(" был(а) вчера")
    in 86400*2..86400*3 -> println(" был(а) позавчера")
    else -> println(" был(а) давно")
}
