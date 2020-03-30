package hpr.logic;

import hpr.beans.ArqueoBean;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jxls.transformer.XLSTransformer;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author Humberto Pinelo Rivera
 */
public class Operations {

    public void creandoExcel() {
        System.out.println("Iniciando...");

        File plantilla = new File("plantilla\\Reporte_Tarjetas_Depuracion.xlsx");
        File archivoSalida = new File("plantilla\\Salida.xlsx");

        Map datos = new HashMap();
        datos.put("mensaje", fechaActual());
        datos.put("reporte", consulta());

        XLSTransformer transformer = new XLSTransformer();
        InputStream stream = null;
        Workbook workbook = null;

        try {
            stream = new FileInputStream(plantilla);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.err.println("Error al leer Plantilla " + ex.toString());
        }

        try {
            workbook = transformer.transformXLS(stream, datos);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.err.println("Error al pasar la informacion al excel" + ex.toString());
        }

        try {
            FileOutputStream salida = new FileOutputStream(archivoSalida);
            workbook.write(salida);
        } catch (IOException ex) {
            ex.printStackTrace();
            System.err.println("Error al escribir el archivo en memoria " + ex.getMessage());
            System.err.println("Error al generar el archivo " + ex.toString());
            return;
        }

    }

    public List<ArqueoBean> consulta() {
        List<ArqueoBean> resp = new ArrayList<>();

        ArqueoBean arq1 = new ArqueoBean("01/02/2020", "29/02/2020", 100, "Credito", 100, 99, 1, 99, "Autorizado");
        resp.add(arq1);
        ArqueoBean arq2 = new ArqueoBean("01/02/2020", "15/02/2020", 100, "Debito", 10, 10, 5, 10, "Pendiente");
        resp.add(arq2);
        ArqueoBean arq3 = new ArqueoBean("01/02/2020", "29/02/2020", 200, "Credito", 50, 15, 10, 1, "Cancelado");
        resp.add(arq3);

        return resp;
    }

    public String fechaActual() {
        Calendar fecha = Calendar.getInstance();
        String dia = fecha.get(Calendar.DAY_OF_MONTH) + "";
        String mes = fecha.get(Calendar.MONTH) + 1 + "";
        String año = fecha.get(Calendar.YEAR) + "";

        return dia + "/" + mes + "/" + año;
    }
}
