fun main()
{
    add(111, 2222, -222)
    sub(111, 2222, -222)
    mul(111, 2222, -222)
    division(2222, 111)
    mod(2222, 111)
}
// addition function
fun add(v1:Int, v2:Int, v3: Int)
{
    println("Addition of $v1, $v2, $v3 is ${v1 + v2 + v3}")
}
// subtraction function
fun sub(v1:Int, v2:Int, v3:Int)
{
   println("Subtraction of $v1, $v2, $v3 is ${v1 - v2 - v3}")
}
// multiplication function
fun mul(v1:Int, v2:Int, v3:Int)
{
    println("Multiplication of $v1, $v2, $v3 is ${v1 * v2 * v3}")
}
// division function
fun division(v1:Int, v2:Int)
{
    println("Divition of $v1, $v2 is ${v1 / v2}")
}
// modulo function
fun mod(v1:Int, v2:Int)
{
    println("Modulo of $v1, $v2 is ${v1 % v2}")
}

