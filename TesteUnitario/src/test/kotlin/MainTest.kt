import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    @DisplayName("Teste metodo xxoo")
    fun testCountXO(){
        Assertions.assertTrue(countXO("xxoo"))
        Assertions.assertTrue(countXO("xo"))
        Assertions.assertTrue(countXO("oooxx"))
        Assertions.assertTrue(countXO("oooxxx"))

        Assertions.assertAll(
            {Assertions.assertTrue(countXO("ooxoxxx"))},
            {Assertions.assertTrue(countXO("oooooxxx"))},
            {Assertions.assertTrue(countXO("ooooxxx"))},
            {Assertions.assertTrue(countXO("oooxxxx"))}
        )
    }

    // metodo que nao sera implementado
    fun naoImplementado(){

    }

}