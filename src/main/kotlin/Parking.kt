data class Parking(val vehicles: MutableSet<Vehicle>) {
    val parkingLimit = 20

    fun addVehicle(vehicle: Vehicle): Boolean =
        when {
            vehicles.size == parkingLimit -> false
            vehicles.contains(vehicle) -> false
            else -> {
                vehicles.add(vehicle)
                true
            }
        }
}
