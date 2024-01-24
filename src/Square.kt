class Square(_name:String) : Shape(_name) {
    var length:Double = 0.0
    var height:Double = 0.0
    override fun setDimensions(_len:Double, _hei:Double, _n:Double){
        length = _len
        height = _hei
    }

    override fun printDimensions() {
        println("Length:${length}, Height:${height}")
    }

    override fun getArea(): Double {
        return length*height
    }
}