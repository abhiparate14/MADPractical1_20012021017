fun main()
{
    println("Enrollment no.: ")
    val enrollmentnumber = readLine()!!.toDouble()
    println("Name: ")
    val name = readLine()!!.toString()
    println("Age: ")
    val age = readLine()!!.toInt()
    println("Branch: ")
    val branch = readLine()!!.toString()
    println("Class: ")
    val clas = readLine()!!.toString()
    println("Batch: ")
    val batch = readLine()!!.toString()
    println("College Name: ")
    val collegename = readLine()!!.toString()
    println("University Name: ")
    val universityname = readLine()!!.toString()
    println("**********\tStudent Data: ")
    println("Enrollment no.: $enrollmentnumber\nName: $name\nAge: $age\nBranch: $branch\nClass: $clas")
    println("Branch: $branch\nCollege Name: $collegename\nUniversity Name: $universityname")
}