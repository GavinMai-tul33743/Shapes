import java.util.Scanner
fun main(){

    val reader = Scanner(System.`in`)
    val tri:Shape = Triangle("Triangle")
    val eqtri:Shape = EquilateralTriangle("EquiTriangle")
    val cir:Shape = Circle("Circle")
    val sq:Shape = Square("Square")

    println("Enter length")
    val l = reader.nextDouble()
    println("Enter length")
    val h = reader.nextDouble()
    sq.setDimensions(l,h, 0.0)

    println("Enter side")
    val s1 = reader.nextDouble()
    println("Enter side")
    val s2 = reader.nextDouble()
    println("Enter side")
    val s3 = reader.nextDouble()
    tri.setDimensions(s1, s2, s3)

    println("Enter side")
    val s = reader.nextDouble()
    eqtri.setDimensions(s1, 0.0, 0.0)

    println("Enter radius")
    val r = reader.nextDouble()
    cir.setDimensions(r, 0.0, 0.0)

    getAll(sq)
    getAll(tri)
    getAll(eqtri)
    getAll(cir)

}

fun getAll(item:Shape){

    print("${item.name} is a shape with area ${item.getArea()} and dimensions ")
    item.printDimensions()
}