fun main()
{
    print("Enrollment no.: ")
    val enrollmentnumber = readLine()!!
    print("Name: ")
    val name = readLine()!!.toString()
    print("Age: ")
    val age = readLine()!!.toInt()
    print("Branch: ")
    val branch = readLine()!!.toString()
    print("Class: ")
    val clas = readLine()!!.toString()
    print("Batch: ")
    val batch = readLine()!!.toString()
    print("College Name: ")
    val collegename = readLine()!!.toString()
    print("University Name: ")
    val universityname = readLine()!!.toString()
    println("**********\nStudent Data: ")
    println("Enrollment no.: $enrollmentnumber\nName: $name\nAge: $age\nBranch: $branch\nClass: $clas")
    println("Branch: $branch\nCollege Name: $collegename\nUniversity Name: $universityname")
}