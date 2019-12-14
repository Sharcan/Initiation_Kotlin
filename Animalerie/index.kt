fun main(){

    /*var jeSuisUnChien: Animal = Chien()
    jeSuisUnChien.parler()
    jeSuisUnChien.quiSuisJe()*/


    var animalerie = Animalerie()
    /*animalerie.add("Chat", "Spyro")
    animalerie.add("Chien", "Rex")*/
    var salope  = Chat()
    var nicolas = Chien()
    animalerie.add2(salope)
    animalerie.add2(nicolas)

    animalerie.affiche()

}
