fun main()
{
    var i:Int = 10
    println("Integer Value: $i")
    var d:Double = i.toDouble()
    println("Double Value (From Integer): $d")
    var s:String = "10"
    println("String Value: $s")
    var value1:Int = s.toInt()
    println("Integer Value1 (From String): $value1")
    var value2:Int = s.toInt()
    println("Integer Value2 (From String): $value2")
    var d2:Double = s.toDouble()
    println("Double Value (From String): $d2")
}