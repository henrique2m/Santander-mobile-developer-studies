
import client.ClientIndividual
import client.ClientLegal
import client.Eddress
import account.SavingsAccount


fun main() {

    val savingsAccountOne = SavingsAccount(123, "123")
    savingsAccountOne.deposit(10.00)

    val userEdress = Eddress(
        "",
        "Rua Abc",
        1,
        "12345-678",
        "São Paulo",
        "São Paulo")

    val userOne = ClientIndividual("Carol", 18, userEdress, "001", savingsAccountOne)
    userOne.returnDataClient()

    val savingAccountTwo = SavingsAccount(321, "321")
    savingAccountTwo.deposit(5.00)


    val userEddressTwo = Eddress(
        description = "",
        street = "Rua Abc",
        number = 1,
        cep = "12345-678",
        city = "São Paulo",
        uf = "São Paulo")

    val userTwo = ClientLegal("Luis", userEddressTwo,"002", savingAccountTwo)
    userTwo.returnDataClient()



    println(userTwo.segment)
    userTwo.account.deposit(20.00)
    println(userTwo.segment)

}