fun main(args: Array<String>) {
    val gestor = GestorViajes()

    print("Introduce tu código de cliente:")
    val codcli = readLine()!!.toInt()

    do {
        println("1.- Salir del programa guradadndo los datos en el fichero.\n" +
                "2.- Mostrar los datos de los viajes con un origen dado.\n" +
                "3.- Reservar un viaje.\n" +
                "4.- Anular reserva.\n" +
                "5.- Ofertar un nuevo viaje\n" +
                "6.- Borrar un viaje ofertado.")
        val opcion = readLine()!!.toInt()

        when(opcion) {
            1 -> gestor.guardaDatos()
            2 -> gestor.consultaViajes("")
            3 -> gestor.reservaViaje("", "")
            4 -> gestor.anulaReserva("", "")
            //5 -> gestor.ofertaViaje()
            //6 -> gestor.borraViaje()
                else -> println("INTRODUCE UNA OPCIÓN VALIDA!!")
        }
    } while (opcion != 0)
}