import java.util.*

data class ParkingSpace(var vehicle: Vehicle, val checkInTime: Calendar){
    val plate = vehicle.plate
    val parkedTime: Long
        get() = (Calendar.getInstance().timeInMillis - checkInTime.timeInMillis) / MINUTES_IN_MILISECONDS

    companion object{
        const val MINUTES_IN_MILISECONDS = 1000
    }
}
