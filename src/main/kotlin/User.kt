open class User(
    private var email: String,
    private var password: String
) {
    init {
        println("je suis le constructeur avec deux parametres")
    }

    constructor() : this("johndoe@gmail.com","123456"){
        println("je suis le constructeur avec sans parametres")
    }

    override fun toString(): String {
        return "hey my email is $email"
    }
    open fun display(){
        println(this)
    }
}