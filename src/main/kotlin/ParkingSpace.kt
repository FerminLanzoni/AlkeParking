import sun.rmi.runtime.Log
import java.util.*
import kotlin.math.ceil

data class ParkingSpace(var vehicle: Vehicle, val checkInTime: Calendar){

    val plate = vehicle.plate
//    val parkedTime: Long
//        get() = (Calendar.getInstance().timeInMillis - 2646937592965) / MINUTES_IN_MILISECONDS
    val parkedTime: Long = 150L

    fun checkOutVehicle(plate: String, vehicleInParked: Boolean): Int {
        val hasDiscountCard = vehicle.discountCard?.let { true } ?: run { false }
        var rateTotal: Int = 0
        if (vehicleInParked) {
            rateTotal = calculateFee(vehicle.type, parkedTime.toInt(), hasDiscountCard)
            onSuccess(rateTotal)
        } else {
            onError()
        }
        return rateTotal
    }

    private fun calculateFee(type: VehicleType, time: Int, hasDiscountCard: Boolean): Int {
        var rate: Int

        if (time <= 120){
            rate = type.rate
        } else {
            val timeExceed = time - 120
            val block = ceil((timeExceed / 15).toDouble())
            rate = (type.rate + (block * 5)).toInt()
        }
        println(rate)

        if (hasDiscountCard) {
            return rate - ((rate * 15) / 100)
        }else {
            return rate
        }
    }

    fun onSuccess(totalPay: Int) {
        println("Your fee is $$totalPay. Come back soon.")
    }

    fun onError() {
        println("Sorry, the check-out failed")
    }

    companion object{
        const val MINUTES_IN_MILISECONDS = 60000
    }

}
