package exercises.codesignal.isipv4address;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class IsIpv4AddressTest {

    private IsIpv4Address isIpv4Address = new IsIpv4Address();

    @Test
    public void isIpv4Address_shouldReturnTrueFor127001() {
        final var IP_ADDRESS = "127.0.0.1";

        assertTrue(isIpv4Address.isIPv4Address(IP_ADDRESS));
    }

    @Test
    public void isIpv4Address_shouldReturnTrueFor2552552550() {
        final var IP_ADDRESS = "255.255.255.0";

        assertTrue(isIpv4Address.isIPv4Address(IP_ADDRESS));
    }

    @Test
    public void isIpv4Address_shouldReturnFalseFor2552552551() {
        final var IP_ADDRESS = "2552552551";

        assertFalse(isIpv4Address.isIPv4Address(IP_ADDRESS));
    }

    @Test
    public void isIpv4Address_shouldReturnTrueFor2552550() {
        final var IP_ADDRESS = ".255.255.0";

        assertFalse(isIpv4Address.isIPv4Address(IP_ADDRESS));
    }
}
