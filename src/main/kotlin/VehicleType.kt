// The VehicleType is the class in charge of the create vehicles types and their rates
enum class VehicleType(val rate: Int) {
    CAR(20),
    MOTORCYCLE(15),
    MINIBUS(25),
    BUS(30)
}