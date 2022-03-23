fun main(){
    var details=Human("Rehema",30,30)
    println(details.name)
    println(details.age)
    details.eat(20)

    println(details.weight)

    (details.speak("swahili"))

    println(details.age)
    println(details.age+1)

   var data =User("Martha","Ephraim","martha@gmail.com","0757489872","071930930")
   println(data.firstName)
    println(data.lastName)

}
class Human(var name:String, var age: Int, var weight: Int){


    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")

        weight+=foodWeight




}

fun speak(speech:String){
    println(speech)

}
fun birthday(){

}


}
data class User( var firstName: String, var lastName: String, var email: String,var  phoneNumber: String, var PassWord: String)
{

}