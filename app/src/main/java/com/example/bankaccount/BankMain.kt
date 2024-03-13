package com.example.bankaccount

fun main(){
    val amyBankAccount = BankAccount("amy", 3000.86)
    amyBankAccount.deposit(400.12)
    amyBankAccount.deposit(266.66)
    amyBankAccount.withdraw(346.77)

    amyBankAccount.displayTransactionHistory()
    println("${amyBankAccount.accountHolder}'s " +
        "balance is ${amyBankAccount.balance}")
     

}
