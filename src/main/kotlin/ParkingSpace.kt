import java.util.*

data class ParkingSpace(var vehicle: Vehicle, val checkInTime: Calendar){
    val plate = vehicle.plate
    val parkedTime: Long
        get() = (Calendar.getInstance().timeInMillis - checkInTime.timeInMillis) / MINUTES_IN_MILISECONDS

    fun checkOutVehicle(plate: String) {

    }

    fun onSuccess(pago: Int) {

    }

    fun onError() {

    }

    companion object{
        const val MINUTES_IN_MILISECONDS = 1000
    }

}
