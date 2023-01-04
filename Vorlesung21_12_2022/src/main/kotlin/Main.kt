fun main() {

    var lieblingsTier: MutableList<String> = mutableListOf("Hund", "Katze", "Delfin")
    lieblingsTier.add("Maus")
    lieblingsTier.add("Löwe")

    println(lieblingsTier.first())
    lieblingsTier.remove(lieblingsTier.first())

    println(lieblingsTier)


    var lieblingsFilme: MutableList<String> = mutableListOf("Titanic","Wolkig mit Aussicht auf Fleischbällchen","Das Sams")
    var filmeBewertungen: MutableList<Int> = mutableListOf(4,5,2)

    var indexAllerLieblingsfilm = filmeBewertungen.indexOf(filmeBewertungen.max())
    var allerLieblingsfilm = lieblingsFilme[indexAllerLieblingsfilm]
    println(allerLieblingsfilm)

    



}
