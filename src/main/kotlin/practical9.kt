fun main() {
    print("Enter Elements : ")
    val n:Int = readLine()!!.toInt()
    val nums = ArrayList<Int>()
    var maxnum = 0
    for (i:Int in 0 until n){
        print("nums[$i] = ")
        nums.add(i,readLine()!!.toInt())
        if (maxnum<nums[i]){
            maxnum = nums[i]
        }
    }
    println("\nMaximum Element from Array is : $maxnum")

}