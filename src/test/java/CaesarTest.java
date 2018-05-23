import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CaesarTest {

    private CaesarEncrypter caesarEncrypter;

    @Before
    public void setUp() throws Exception {
        caesarEncrypter = new CaesarEncrypterImpl();
    }
    @Test
    public void shouldEncryptCorrectly() {
        // given
        String message = "caesar decipher rules";

        // when
        message = caesarEncrypter.encrypt(message, 4);

        // then
        Assert.assertEquals("geiwev higmtliv vypiw", message);
    }
}
