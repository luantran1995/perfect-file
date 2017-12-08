package nashtech.luan;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class PecfectfileTest {
	String filename="file.txt";
	
	@Test
	public void checkexitfile_return_false() throws IOException {
		boolean a = PecfectFile.checkFileEmpty();
		assertEquals(true, a);
	}
	@Test
	public void checkPecfectFile_return_true_whenfileispecfecfile() throws IOException {
		boolean b = PecfectFile.checkPefectfile();
		assertEquals(true, b);
	}
	@Test
	public void checkPecfectFile_return_false_whenfileisnotpecfecfile() throws IOException {
		boolean c = PecfectFile.checkPefectfile();
		assertEquals(false,c);
	}
	

}
