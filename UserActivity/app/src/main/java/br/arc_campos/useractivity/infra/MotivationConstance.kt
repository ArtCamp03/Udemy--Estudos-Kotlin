package br.arc_campos.useractivity.infra

class MotivationConstance private constructor(){
    object  KEY {
        const val USER_NAME = "USER_NAME"
    }

    object FILTER{
        const val ALL = 1
        const val EMO = 2
        const val SUNNY = 3
    }

    object LANGUAGE{
        const val PORTUGUESE = "pt"
        const val ENGLISH = "en"
        const val FRENCH = "fr"
    }

}