import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest {
    @Test
    @DisplayName("Testa Portaria")
    fun testaProatria(){
        Assertions.assertEquals(portaria(15, " ", " "), "Negado.")
        Assertions.assertEquals(portaria(20, " ", " "), "Negado.")
        Assertions.assertEquals(portaria(25, "VIP", " "), "Negado.")
        Assertions.assertEquals(portaria(25, "comum", "xt6745"), "Welcome.")
        Assertions.assertEquals(portaria(25, "comum", "6745"), "Negado")
    }

}