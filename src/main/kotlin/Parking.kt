import java.util.*

data class Parking(val vehicles: MutableSet<Vehicle>) {

    private val parkingLimit = 20
    private var summary: Pair<Int, Int> = Pair(0, 0)
    var parkingSpaceList: MutableList<ParkingSpace> = mutableListOf()

    init {
        vehicles.forEach {
            parkingSpaceList.add(ParkingSpace(it, Calendar.getInstance()))
        }
    }

    fun addVehicle(newVehicle: Vehicle) {
        when {
            vehicles.contains(newVehicle) -> println("Sorry, the has check-in failed")
            vehicles.size > parkingLimit -> println("Sorry, the check-in failed")
            else -> {
                println("Welcome to AlkeParking!")
                vehicles.add(newVehicle)
                parkingSpaceList.add(ParkingSpace(newVehicle, Calendar.getInstance()))
            }
        }
    }

    fun removeVehicle(vehicle: Vehicle) {
        val parkingSpace = parkingSpaceList[searchVehicleInParkingSpace(vehicle.plate)]
        if (vehicles.contains(vehicle)) {
            val totalPay = parkingSpace.checkOutVehicle()
            summary = summary.copy(first = summary.first + 1, second = summary.second + totalPay)
            vehicles.remove(vehicle)
            parkingSpaceList.removeAt(searchVehicleInParkingSpace(vehicle.plate))
            onSuccess(totalPay)
        } else {
            onError()
        }
    }

    private fun onSuccess(totalPay: Int) {
        println("Your fee is $$totalPay. Come back soon.")
    }

    private fun onError() {
        println("Sorry, the check-out failed")
    }

    private fun searchVehicleInParkingSpace(searchPlate: String): Int {
        var index = 0
        for (space in parkingSpaceList) {
            if (space.plate == searchPlate) {
                return index
            }
            index++
        }
        return index
    }

    fun earningsInfo() {
        println("${summary.first} vehicles have checked out and have earnings of $${summary.second}")
    }

    fun listVehicles() {
        parkingSpaceList.forEach {
            println(it.plate)
        }
    }

}
