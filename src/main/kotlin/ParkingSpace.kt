import java.util.*
import kotlin.math.ceil

data class ParkingSpace(var vehicle: Vehicle, val checkInTime: Calendar) {

    val plate = vehicle.plate

    val parkedTime: Long
        get() = (Calendar.getInstance().timeInMillis - checkInTime.timeInMillis) / MINUTES_IN_MILISECONDS

    //val parkedTime: Long = 150L

    fun checkOutVehicle(): Int {
        val hasDiscountCard = vehicle.discountCard?.let { true } ?: run { false }

        return calculateFee(vehicle.type, parkedTime.toInt(), hasDiscountCard)
    }


    private fun calculateFee(type: VehicleType, time: Int, hasDiscountCard: Boolean): Int {
        var rate: Int

        if (time <= LIMIT_TIME_BASIC_RATE) {
            rate = type.rate
        } else {
            val timeExceed = time - LIMIT_TIME_BASIC_RATE
            val block = ceil((timeExceed / BLOCK_MINUTES).toDouble())
            rate = (type.rate + (block * BLOCK_PRICE)).toInt()
        }
        println(rate)

        if (hasDiscountCard) {
            return rate - ((rate * DISCOUNT) / 100)
        } else {
            return rate
        }
    }

    companion object {
        const val MINUTES_IN_MILISECONDS = 60000
        const val BLOCK_MINUTES = 15
        const val DISCOUNT = 15
        const val BLOCK_PRICE = 5
        const val LIMIT_TIME_BASIC_RATE = 120
    }

}
