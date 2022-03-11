import java.util.Calendar
import java.util.logging.Handler

fun main(args: Array<String>) {

    val car = Vehicle("AA111AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val moto = Vehicle("B222BBB", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val minibus = Vehicle("CC333CC", VehicleType.MINIBUS, Calendar.getInstance())
    val bus = Vehicle("DD444DD", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")
    val car2 = Vehicle("AA111AAA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val moto2 = Vehicle("B222BBBB", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val minibus2 = Vehicle("CC333CCC", VehicleType.MINIBUS, Calendar.getInstance())
    val bus2 = Vehicle("DD444DDD", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")
    val car3 = Vehicle("AA111AA1", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val moto3 = Vehicle("B222BBB2", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val minibus3 = Vehicle("CC333CCC3", VehicleType.MINIBUS, Calendar.getInstance())
    val bus3 = Vehicle("DD444DDD4", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")
    val car4 = Vehicle("AA111AAA5", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val moto4 = Vehicle("B222BBBB6", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val minibus4 = Vehicle("CC333CCC7", VehicleType.MINIBUS, Calendar.getInstance())
    val bus4 = Vehicle("DD444DDD8", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")
    val car5 = Vehicle("AA111AAA9T", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val moto5 = Vehicle("B222BBB10", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val minibus5 = Vehicle("AA111AAYYT", VehicleType.MINIBUS, Calendar.getInstance())
    val bus5 = Vehicle("DD444D12", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")
    val bus6 = Vehicle("DD444D12GG", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")

    val parking = Parking(mutableSetOf())

    val listVehicles = listOf(car, moto, minibus, bus, car2, moto2, minibus2, bus2, car3, moto3, minibus3,
        bus3, car4, moto4, minibus4, bus4, car5, moto5, minibus5, bus5, bus6)

    for (item in listVehicles) {
        println(item.plate)
        parking.checkIn(item)
    }

//    println(parking.vehicles.size)

//    parking.vehicles.remove(moto)

    parking.earningsInfo()

    parking.removeVehicle(car)
    parking.removeVehicle(bus4)
    parking.removeVehicle(minibus5)

    parking.earningsInfo()

    parking.listVehicles()


//    parking.espacio.forEach{
//        println(it.plate)
//    }

//    println(parking.vehicles.size)
//    println(parking.espacio.size)


//    val car2 =  Vehicle("AA111AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
//    parking.addVehicle(car2)
//    println(parking.vehicles.size)
//
//
//    val car3 =  Vehicle("AA111BA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
//    parking.addVehicle(car3)
//    println(parking.vehicles.size)
//
//    val car4 =  Vehicle("B222BBB", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
//    parking.addVehicle(car4)
//    println(parking.vehicles.size)
//
//    parking.vehicles.forEach{
//        println(it.type)
//    }


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
