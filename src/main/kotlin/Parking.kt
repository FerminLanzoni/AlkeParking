data class Parking(val vehicles: MutableSet<Vehicle>) {

    val parkingLimit = 20

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
}
