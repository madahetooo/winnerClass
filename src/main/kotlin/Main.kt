fun main(){
//    var name = "Eslam Medhat"
//    var age = 26
//    var newAge:Long = age.toLong()
//
//    println("Welcome $name your age is $age")

//    println("Hello World")
//    println("Hello \" World")
//    println("Hello \' World")
//    println("Hello \\ World")
//    println("Hello \n World")
//    println("Hello \r World")
//    println("Hello \b World")
//    println("Hello \t World")


//    var namesOfWinners = arrayOf("Laila","Said","Boutheina","Amr","Eslam")
//    println(namesOfWinners[1])




//
//    var x:Float = 5f
//    var y:Float =10f
//
//    println(x+y)
//    println(x-y)
//    println(x/y)
//    println(x*y)


//    var x = 4
//    var y = 6
//    if (x > y){
//        println("X is greater than  Y")
//    }
//    else if (x < y ){
//        println("X is smaller than  Y")
//    }
//    else{
//        println("X is equal to Y")
//    }


// Assignement Operator
//  var x = 5
//    x -= 1
//    println(x)


    //Unary Operator
//    var x = 5
//    println(x++) // printed the value first then increase the variable by one
//    println(x)
//    println(++x)
//    println(x--) // 7 , current value is = 6
//    println(x) // 6



    //Logical Operators
//    var x = 8
//    var y = 7
//    var z = 10
//
//    if (x > y || x > z){
//        println("X is the large number")
//    }
//    if (x != 7){
//        println("X is not equal to 7")
//    }
//    if (x == 8){
//        println("X is  equal to 8")
//
//    }


//    //Read Data from User
//    var name:String             //Declared a variable
//    var age:Int
//    println("Please enter your name")
//    name = readLine().toString()
//    println("Welcome $name")
//    println("And your age please")
//    age = Integer.valueOf(readLine().toString())
//    println("Ok $name, your age is $age")



//   var season = 2
//    when(season){
//
//        1,2,3 -> println("Winter season")
//        4,5,6 -> println("Autumn season")
//        7,8,9 -> println("Summer season")
//        10,11,12 -> println("Different season")
//
//    }


    println("Welcome to our college website")
    println("Please enter your degree to get your result")
    var degree:Int
    degree = Integer.valueOf(readLine().toString())
    when (degree){
        in 0..49 -> println("You Failed")
        in 50..70 -> println("You Got C")
        in 71..80 -> println("You Got B+")
        in 81..90 -> println("You A")
        in 91..100 -> println("You A+")
        else -> println("NOT VALID DEGREE")

    }








}