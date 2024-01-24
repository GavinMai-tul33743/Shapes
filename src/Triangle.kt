import kotlin.math.sqrt

open class Triangle(_name:String) : Shape(_name) {
    var s1:Double = 0.0
    var s2:Double = 0.0
    var s3:Double = 0.0

    open override fun setDimensions(_s1:Double, _s2:Double, _s3:Double){
        s1 = _s1
        s2 = _s2
        s3 = _s3
    }

    override fun printDimensions() {
        println("Sides: ${s1}, ${s2}, ${s3}")
    }

    override fun getArea(): Double {
        var s = 0.5*(s1+s2+s3)
        return sqrt(s*(s-s1)*(s-s2)*(s-s3))
    }
}