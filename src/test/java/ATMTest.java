import com.juaracoding.ujianjf.ujian2.ATM;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class ATMTest {
    private ATM atm;

    // Inisialisasi objek ATM dengan saldo awal sebesar 1000 sebelum setiap metode pengujian
    @BeforeMethod
    public void setUp() {
        atm = new ATM(1000);
    }

    @Test
    public void testLihatSaldo(){
        Assert.assertEquals(atm.lihatSaldo(), 1000.0, "Saldo awal harus 1000");
    }

    @Test
    public void testSetorUang(){
        atm.setorUang(10000);
        Assert.assertEquals(atm.lihatSaldo(), 11000.0, "Saldo setelah setor 10000 harus 11000");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetorUangNegatif(){
        atm.setorUang(-1000);
    }

    @Test
    public void testTarikUang(){
        atm.tarikUang(900);
        Assert.assertEquals(atm.lihatSaldo(), 100.0, "Saldo setelah tarik 900 harus 100");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangLebihDariSaldo() {
            atm.tarikUang(20000);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangNegatif() {
            atm.tarikUang(-1000);
    }
}
