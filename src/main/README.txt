Ejercicio 1
Consigna 1 ¿Por qué se define vehicles como un Set ?
Respuesta Los definimos como un set porque no permite haber dos elementos repetidos, en este caso serian las patentes de
los vehiculos.Por ende no podran existir dos vehiculos con una misma patente pero si podra existe el mismo tipo de
vehiculo.

Ejercicio 2
Consigna 2 Para satisfacer el requerimiento, incluye una propiedad type en el funcionamiento que sea del tipo de lo
 enumerado. o ¿Puede cambiar el tipo de vehículo en el tiempo? ¿Debe definirse como variable o como constante en
 Vehicle?
 Respuesta No puede cambiar el tipo de vehiculo en el tiempo por ende conviene definirlo como una constante ya que un
 auto siempre va a ser un auto.

 Ejercicio 3
 Consigna 3 A) ¿Dónde deben agregarse las propiedades, en   ParkingSpace, Vehicle o en ambos?
 Consigna 3 B) La tarjeta de descuentos es opcional, es decir que un vehículo puede no tener una tarjeta
 y su valor será null. ¿Cómo indicamos que un tipo de datos puede adquirir esta característica en Kotlin?

 Respuesta 3 A) La propiedad checkInTime la agregamos en ParkingSpace ya que llevara la contabilidad del tiempo en el
 ingreso del vehiculo no la agregamos en Vehicle ya que el tiempo se calcula a partir de que el vehiculo estaciona en
 el ParkingSpace. La propiedad discountCard la agregamos a Vehicle ya que puede ingresar con un tarjeta de descuento.

 Respuesta 3 B) En kotlin un valor nullable lo indicamos con el simbolo de interrogacion(?) en el tipo de la variable
 en este caso: discountCard : String?

 TODO"TRADUCIR A INGLES"