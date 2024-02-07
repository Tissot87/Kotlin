fun main(args: Array<String>) {
    foo()
}


fun foo(){



    do {
        println("Введите команду:")
        val answer = readLine()
        if (answer != "exit") {
            if (answer != null) {
                toDo(answer)
            }
        }

    } while (answer != "exit")
}

fun toDo (answer: String) {
    val answerSplit = answer.split(" ")

    val request = answerSplit[2]

    val requestData = answerSplit[3]

    val name = answerSplit[1]

    when (request) {
        "phone" -> addPhone(requestData, name)
        "email" -> addEmail(requestData, name)
        else -> {}
    }

}

fun addEmail(request: String, name: String) {

    if (request.contains("@") && request.contains("."))
        println("add $name email $request")
    else println("Error")


}

fun addPhone(request: String, name: String){

    if (request.all{
            it.isDigit()
        })
        println("add $name phone $request")
    else println("Error")

}