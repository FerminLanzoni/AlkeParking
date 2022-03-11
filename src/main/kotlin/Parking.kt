import java.util.*

data class Parking(val vehicles: MutableSet<Vehicle>) {

    val parkingLimit = 20
    var summary: Pair<Int,Int> = Pair(0,0)

    fun addVehicle(vehicle: Vehicle): Boolean =
        if (vehicles.size >= parkingLimit) false else {
            vehicles.add(vehicle)
            true
        }

    fun checkIn(newVehicle: Vehicle) {
        when {
            vehicles.contains(newVehicle) -> println("Sorry, the has check-in failed")
            addVehicle(newVehicle) -> println("Welcome to AlkeParking!")
            else -> println("Sorry, the check-in failed")
        }
    }

    fun removeVehicle(vehicle: Vehicle) {
        val parkingSpace = ParkingSpace(vehicle, vehicle.checkInTime)
        val checkoutVehicle = parkingSpace.checkOutVehicle(vehicle.plate, true)
        if (vehicles.contains(vehicle)) {
            summary = summary.copy(first = summary.first + 1, second = summary.second + checkoutVehicle)
            println(summary)
            vehicles.remove(vehicle)
        }else {
            parkingSpace.checkOutVehicle(vehicle.plate, false)
        }
    }

    fun earningsInfo() {
        println("${summary.first} vehicles have checked out and have earnings of $${summary.second}")
    }

    fun listVehicles() {
        vehicles.forEach {
            println(it.plate)
        }
    }

}
