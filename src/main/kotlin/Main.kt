import java.util.Calendar

fun main(args: Array<String>) {
    val car = Vehicle("AA111AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val moto = Vehicle("B222BBB", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val minibus = Vehicle("CC333CC", VehicleType.MINIBUS, Calendar.getInstance())
    val bus = Vehicle("DD444DD", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")

    val parking = Parking(mutableSetOf(car, moto, minibus, bus))

    val car2 =  Vehicle("AA111AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val isCar2Inserted = parking.addVehicle(car2)
    println(parking.vehicles.size)


    val car3 =  Vehicle("AA111BA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    parking.addVehicle(car3)
    println(parking.vehicles.size)

    parking.vehicles.forEach{
        println(it.type)
    }


    /*
    val car = Vehicle("AA111AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val moto = Vehicle("B222BBB", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val minibus = Vehicle("CC333CC", VehicleType.MINIBUS, Calendar.getInstance())
    val bus = Vehicle("DD444DD", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")
    val parking = Parking(mutableSetOf(car, moto, minibus, bus))
    val car2 =  Vehicle("AA111AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val isCar2Inserted = parking.vehicles.add(car2)
    println(isCar2Inserted)
    println(parking.vehicles.contains(car))
    println(parking.vehicles.contains(moto))
    println(parking.vehicles.contains(minibus))
    println(parking.vehicles.contains(bus))

    parking.vehicles.remove(moto)
    println(parking.vehicles)

     */
}
