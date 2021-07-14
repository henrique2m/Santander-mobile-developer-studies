package client

import account.Account

class ClientIndividual(
    val name: String,
    val age: Int,
    pEdress: Eddress,
    cpf: String,
    pAccount: Account
) : Client(pEdress, pAccount) {

    private val cpf = cpf

    override fun returnDataClient () {
        println("Cliente PF: ${this.name}, ${this.cpf} / Conta: ${this.account}")
    }
}