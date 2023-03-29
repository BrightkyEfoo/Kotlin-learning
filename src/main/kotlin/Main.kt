fun main(args: Array<String>) {
    val user1 = User()
    val user2 = User("brightefoo@gmail.com" , "azerty")
    user2.display()
    val admin1 = Admin("admin@gmail.com","1234567890",1)
    admin1.display()
}