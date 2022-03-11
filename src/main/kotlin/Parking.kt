//The Parking is the class in charge of the vehicles administation

data class Parking(val vehicles: MutableSet<Vehicle>) {
    val parkingLimit = 20
    var summary: Pair<Int,Int> = Pair(0,0)

    //Function states that add new vehicle in the parking
    fun addVehicle(newVehicle: Vehicle) {
        when {
            vehicles.contains(newVehicle) -> println("Sorry, the has check-in failed")
            vehicles.size > parkingLimit -> println("Sorry, the check-in failed")
            else -> {
                println("Welcome to AlkeParking!")
                vehicles.add(newVehicle)
            }
        }
    }

    //Function states that remove vehicle in the parking
    fun removeVehicle(vehicle: Vehicle) {
        if (vehicles.contains(vehicle)) {
            val parkingSpace = ParkingSpace(vehicle, vehicle.checkInTime)
            val totalPay = parkingSpace.checkOutVehicle(vehicle.plate)
            summary = summary.copy(first = summary.first + 1, second = summary.second + totalPay)
            vehicles.remove(vehicle)
            onSuccess(totalPay)
        }else {
            onError()
        }
    }

    //Function states that checkout success
    private fun onSuccess(totalPay: Int) {
        println("Your fee is $$totalPay. Come back soon.")
    }

    //Function states that checkout error
    private fun onError() {
        println("Sorry, the check-out failed")
    }

    //Function states that information summary of the total pay and total checkouts
    fun earningsInfo() {
        println("${summary.first} vehicles have checked out and have earnings of $${summary.second}")
    }

    //Function states that show alls vehicles in parking
    fun listVehicles() {
        vehicles.forEach {
            println(it.plate)
        }
    }
}
