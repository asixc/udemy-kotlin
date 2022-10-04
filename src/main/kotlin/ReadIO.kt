class ReadIO {

    companion object {
        fun readStringWithPrompt(args: Array<String>) {
            println("Me llamo ${args[0]} y soy  ${args[1]} ")


            println("Escribe tu nombre")
            val nombre = readLine()

            println("¿A qué te dedicas?")
            val job = readLine()

            println("Me llamo $nombre y soy $job")


        }

    }
}