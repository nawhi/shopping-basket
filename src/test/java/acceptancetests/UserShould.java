package acceptancetests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserShould {

    @Test
    public void sanityCheck() {
        assertThrows(AssertionError.class, () -> { assert false; });
    }
}
