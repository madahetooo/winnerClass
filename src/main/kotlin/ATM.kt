class ATM {
    var pinCode:Int = 0
    var balance:Float = 0f
    var selectedOption:Int = 0
    var money:Float = 0f

    fun getCardInformation(){
        println("Welcome to our bank")
        println("Please enter your PIN Code")
        pinCode = readLine()!!.toInt()
        println("Please enter your balance")
        balance = readLine()!!.toFloat()
        selectOperation()
    }
    private fun selectOperation() {
        println("Please Select your operation")
        println("1: Deposit, 2: Withdraw, 3: Check Balance, 4: Exit")
//        selectedOption = readLine()!!.toInt()
        val option = readLine()?.toIntOrNull() ?: -1
        when(option){
            1 -> deposit()
            2 -> withdraw()
            3 -> checkBalance()
            4 -> {
                println("Thanks for using our bank")
                System.exit(0)
            }
        }

    }
    private fun checkBalance() {
        println("Your Current Balance is $balance")
        doYouNeedAnything()
    }
    private fun withdraw() {
        println("please enter the amount of money you want to withdraw")
        val money = readLine()?.toIntOrNull() ?: -1
           if (money <= balance){
               balance -= money
               println("Withdraw done successfully")
           }else{
               println("Sorry you don't have this amount of money")

           }
        checkBalance()
    }
    private fun deposit() {
        println("please enter the amount of money you want to deposit")
        val money = readLine()?.toIntOrNull() ?: -1
        balance += money
        println("Deposit Done Successfully")
        checkBalance()
    }
    fun doYouNeedAnything(){
        println("Do you need anything else")
        println("1: Yes, 2: NO")
        val option = readLine()?.toIntOrNull() ?: -1
        when(option){
            1 -> selectOperation()
            2 ->{
                println("Thanks for using our BANK")
                System.exit(0)
            }
        }
    }
}