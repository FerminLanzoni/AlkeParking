import java.util.*

fun main(args: Array<String>) {

    val car = Vehicle("AA111AA", VehicleType.CAR, Calendar.getInstance(),  "DISCOUNT_CARD_001")
    val moto = Vehicle("B222BBB", VehicleType.MOTORCYCLE, Calendar.getInstance() )
    val minibus = Vehicle("CC333CC", VehicleType.MINIBUS, Calendar.getInstance())
    val bus = Vehicle("DD444DD", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")

    val car2 = Vehicle("AA111AAA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_003")
    val moto2 = Vehicle("B222BBBB", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val minibus2 = Vehicle("CC333CCC", VehicleType.MINIBUS, Calendar.getInstance())
    val bus2 = Vehicle("DD444DDD", VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_004")

    val car3 = Vehicle("AA111AA1", VehicleType.CAR, Calendar.getInstance(),"DISCOUNT_CARD_005")
    val moto3 = Vehicle("B222BBB2", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val minibus3 = Vehicle("CC333CCC3", VehicleType.MINIBUS, Calendar.getInstance())
    val bus3 = Vehicle("DD444DDD4", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_006")

    val car4 = Vehicle("AA111AAA5", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_007")
    val moto4 = Vehicle("B222BBBB6", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val minibus4 = Vehicle("CC333CCC7", VehicleType.MINIBUS, Calendar.getInstance())
    val bus4 = Vehicle("DD444DDD8", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_008")

    val car5 = Vehicle("AA111AAA9T", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_009")
    val moto5 = Vehicle("B222BBB10", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val minibus5 = Vehicle("AA111AAYYT", VehicleType.MINIBUS, Calendar.getInstance())
    val bus5 = Vehicle("DD444D12", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_010")

    val bus6 = Vehicle("DD444D12GG", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_011")

    val parking = Parking(mutableSetOf())

    val listVehicles = listOf(car, moto, minibus, bus, car2, moto2, minibus2, bus2, car3, moto3, minibus3,
        bus3, car4, moto4, minibus4, bus4, car5, moto5, minibus5, bus5, bus6)

    for (item in listVehicles) {
        parking.addVehicle(item)
        println(item.plate)
    }

    parking.earningsInfo()
    println("------------------------------------RESULT THE ADD FIRST CAR ${car.plate}--------------------------------")
    parking.addVehicle(car)
    println("---------------------------------------------------------------------------------------------------------")
    println("------------------------------------RESULT THE REMOVE FIRST CAR ${car.plate}-----------------------------")
    parking.removeVehicle(car)
    println("---------------------------------------------------------------------------------------------------------")
    println("------------------------------------RESULT THE REMOVE BUS 4 ${bus4.plate}--------------------------------")
    parking.removeVehicle(bus4)
    println("---------------------------------------------------------------------------------------------------------")
    println("------------------------------------RESULT THE REMOVE MINUBUS 5 ${bus5.plate}----------------------------")
    parking.removeVehicle(minibus5)
    println("---------------------------------------------------------------------------------------------------------")

    println("------------------------------------EARNINGS INFO--------------------------------------------------------")
    parking.earningsInfo()
    println("---------------------------------------------------------------------------------------------------------")

    println("------------------------------------LIST VEHICLES ${parking.vehicles.size}-------------------------------")
    parking.listVehicles()

}