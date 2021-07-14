package client

data class Eddress(
    val description: String,
    val street:  String,
    val number: Int,
    val cep: String,
    val city: String,
    val uf: String,
) {
    init {
        require(description.trim().isBlank()) { "O Campo descrição não pode ser vazio."}
    }
}