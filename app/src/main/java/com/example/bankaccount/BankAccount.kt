package com.example.bankaccount

class BankAccount(var accountHolder: String, var balance: Double) {
    private val transactionHistory = mutableListOf<String>()


    fun deposit(amount: Double){
        balance+=amount
        println("$accountHolder Deposit this $ $amount")

    }
    fun withdraw(amount: Double) {
        if(amount<=balance){
            balance-=amount
            println("$accountHolder withdrew this $ $amount")
        }else {
            println("you lack funds")
        }

    }
    fun displayTransactionHistory(){
        println("Transaction history for $accountHolder")
        for(transaction in transactionHistory){
            println(transaction)
        }

    }

}