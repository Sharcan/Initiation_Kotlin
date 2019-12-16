fun main(){

    /*var jeSuisUnChien: Animal = Chien()
    jeSuisUnChien.parler()
    jeSuisUnChien.quiSuisJe()*/


    var animalerie = Animalerie()
    /*animalerie.add("Chat", "Spyro")
    animalerie.add("Chien", "Rex")*/
    var poppy  = Chat()
    var rex = Chien()
    animalerie.add2(poppy)
    animalerie.add2(rex)

    animalerie.affiche()

}
