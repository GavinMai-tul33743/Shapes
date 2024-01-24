class Circle(_name:String) : Shape(_name) {
    var radius:Double = 0.0
    override fun setDimensions(_rad:Double, _hei:Double, _n:Double){
        radius = _rad
    }

    override fun printDimensions() {
        println("Radius: ${radius}")
    }

    override fun getArea(): Double {
        return (3.1415)*radius*radius
    }
}
