package dad.javafx.mvc.utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class Persistencia {
	
	private static final File FICHERO = new File(System.getProperty("user.home"), "mvc");
	
	public static void guardar(int dato) throws IOException {
		System.out.println("guardando " + dato);
		FileUtils.writeStringToFile(
				FICHERO, 
				"" + dato, 
				Charset.forName("UTF-8"), 
				false
			);
	}
	
	public static int cargar() throws IOException {
		System.out.println("cargando");
		if (!FICHERO.exists()) return 0;
		String content = FileUtils.readFileToString(
				FICHERO, 
				Charset.forName("UTF-8")
			);
		return Integer.parseInt(content);
	}

}
