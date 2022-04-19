import org.junit.jupiter.api.*

class MainTest {

    @Test
    fun provocateur() {
        Assertions.assertNotNull(countXO("xxooo"))
        Assertions.assertNotNull(countXO("xsadfsdfxooo"))
        Assertions.assertNotNull(countXO("xxxooo"))
    }

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
    @Test
    @Disabled
    fun naoImplementado(){

    }

    // metodo que é obrigatoriamente executado
    @Test

    fun vaiFalhar(){
        // vai falhar idependentemente do valor
        fail("Nao posso terminar os teste sem esses metodos")
    }

    // rodar diferentes funçoes no mesmo metodo
    @Test
    fun assunption(){
        Assumptions.assumeTrue(countXO("oooxxx"))

        // essa parte so e exe3cutada se o de cima for verdade
        Assertions.assertTrue(abc())
    }

    @Test
    fun exception(){
        assertThrows<NullPointerException> { abcd() }
    }

}