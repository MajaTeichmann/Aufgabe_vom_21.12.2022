fun main(){

    var lieblingsTier: MutableList<String> = mutableList("Hund","Katze","Delfin")
    lieblingsTier.add("Maus")
    lieblingsTier.add("Löwe")

    println(lieblingsTier.first())
    lieblingsTier.remove(lieblingsTier.first)

    println(lieblingsTier)


}