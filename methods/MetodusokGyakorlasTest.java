import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MetodusokGyakorlasTest {

    @Test
    void szogElnevezesNegativszog() {
        assertEquals("negatín szög", MetodusokGyakorlas.szogElnevezes(-10.0));
    }

    @Test
    void szogElnevezesNullszog() {
        assertEquals("nullszög", MetodusokGyakorlas.szogElnevezes(0.0));
    }

    @Test
    void szogElnevezesHegyesszog() {
        assertEquals("hegyesszög", MetodusokGyakorlas.szogElnevezes(10.0));
    }

    @Test
    void szogElnevezesDerekszog() {
        assertEquals("derékszög", MetodusokGyakorlas.szogElnevezes(90.0));
    }

    @Test
    void szogElnevezesTompaszog() {
        assertEquals("tompaszög", MetodusokGyakorlas.szogElnevezes(100.0));
    }

    @Test
    void szogElnevezesEgyenesszog() {
        assertEquals("egyenesszög", MetodusokGyakorlas.szogElnevezes(180.0));
    }

    @Test
    void szogElnevezesHomoruszog() {
        assertEquals("homorúszög", MetodusokGyakorlas.szogElnevezes(210.0));
    }

    @Test
    void szogElnevezesTeljesszog() {
        assertEquals("teljesszög", MetodusokGyakorlas.szogElnevezes(360.0));
    }

    @Test
    void szogElnevezesNagyobbMintTeljesszog() {
        assertEquals("nagyobb, mint a teljes szög", MetodusokGyakorlas.szogElnevezes(380.0));
    }

    @Test
    void hasEightTheSqrtOf0() {
        assertFalse(MetodusokGyakorlas.hasEightTheSqrt(0));
    }

    @Test
    void hasEightTheSqrtOf2() {
        assertFalse(MetodusokGyakorlas.hasEightTheSqrt(2));
    }

    @Test
    void hasEightTheSqrtOf3() {
        assertTrue(MetodusokGyakorlas.hasEightTheSqrt(3));
    }

    @Test
    void isValidPasswordEmptyString() {
        assertFalse(MetodusokGyakorlas.isValidPassword(""));
    }

    @Test
    void isValidPasswordOneFromAll() {
        assertFalse(MetodusokGyakorlas.isValidPassword("aA4."));
    }

    @Test
    void isValidPasswordTwoLowerOneOhers() {
        assertFalse(MetodusokGyakorlas.isValidPassword("abC4-"));
    }

    @Test
    void isValidPasswordMissingLowerLetter() {
        assertFalse(MetodusokGyakorlas.isValidPassword("aABC4-"));
    }

    @Test
    void isValidPasswordMissingUpperLetter() {
        assertFalse(MetodusokGyakorlas.isValidPassword("abcA4-"));
    }

    @Test
    void isValidPasswordMissingNumber() {
        assertFalse(MetodusokGyakorlas.isValidPassword("abcAB-"));
    }

    @Test
    void isValidPasswordMissingSpecialCharacter() {
        assertFalse(MetodusokGyakorlas.isValidPassword("abcAB12"));
    }

    @Test
    void isValidPasswordIsValid() {
        assertTrue(MetodusokGyakorlas.isValidPassword("abcABC123-#"));
    }

    @Test
    void bodyMassIndexResultToLowBodyFat() {
        assertEquals("Alacsony testsúly alatti kategória", MetodusokGyakorlas.bodyMassIndexResult(59, 1.8));
    }

    @Test
    void bodyMassIndexResultIsNormal() {
        assertEquals("Normál testsúlyú kategória", MetodusokGyakorlas.bodyMassIndexResult(80, 1.8));
    }

    @Test
    void bodyMassIndexResultIsOveweightd() {
        assertEquals("Túlsúlyos kategória", MetodusokGyakorlas.bodyMassIndexResult(88, 1.8));
    }

    @Test
    void bodyMassIndexResultIsOveweightdCategory1() {
        assertEquals("Elhízás (I. fokú) kategória", MetodusokGyakorlas.bodyMassIndexResult(100, 1.8));
    }

    @Test
    void bodyMassIndexResultIsOveweightdCategory2() {
        assertEquals("Elhízás (II. fokú) kategória", MetodusokGyakorlas.bodyMassIndexResult(115, 1.8));
    }

    @Test
    void bodyMassIndexResultIsOveweightdCategory3() {
        assertEquals("Súlyos elhízás (III. fokú) kategória", MetodusokGyakorlas.bodyMassIndexResult(130, 1.8));
    }
}