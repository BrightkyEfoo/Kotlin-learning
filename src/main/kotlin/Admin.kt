class Admin(
    email : String,
    password : String,
    private var accessLevel : Int
):User(email , password) {
//    init {
//        this.accessLevel
//    }
    override fun toString(): String {
        return "${super.toString()} and I'm the ${
            when(accessLevel){
                0->"subadmin"
                1->"admin"
                else -> "nothing"
            }
        }"
    }
    override fun display (){
        println(this)
    }
}