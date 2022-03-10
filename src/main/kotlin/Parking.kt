import java.util.*

data class Parking(val vehicles: MutableSet<Vehicle>) {

    val parkingLimit = 20
    var espacio = mutableListOf<ParkingSpace>()

    fun addVehicle(vehicle: Vehicle): Boolean =
        if (vehicles.size >= parkingLimit) false else {
            vehicles.add(vehicle)
            espacio.add(ParkingSpace(vehicle, Calendar.getInstance()))
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
        vehicles.remove(vehicle)
        var index = 0
        var result = -1
        espacio.forEach {
            index ++
            if (it.plate == vehicle.plate) {
                result = index
            }
        }
        if (result != -1) {
            espacio.get(result).checkOutVehicle(vehicle.plate)
            espacio.remove(espacio.get(result))
        }
    }

    init {
        vehicles.forEach {
            espacio.add(ParkingSpace(it, Calendar.getInstance()))
        }
    }

}
