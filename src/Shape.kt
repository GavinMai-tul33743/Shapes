abstract class Shape (_name : String) : Dimensionable{
    var name = _name

    override fun getArea() : Double {
        return 0.0;
    }
    open fun setDimensions(a:Double, b:Double, c:Double){}
}