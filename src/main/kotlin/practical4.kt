fun main(){
    print("Enter a number: ")
    var num:Int = readLine()!!.toInt()

    if(num % 2 == 0)
    {
        println("$num is an Even Number")
    }
    else
    {
        println("$num is a odd number")
    }
}