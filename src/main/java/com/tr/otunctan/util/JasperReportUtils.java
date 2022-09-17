package com.tr.otunctan.util;

import com.tr.otunctan.enums.ReportType;
import com.tr.otunctan.exception.JasperException;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashMap;

/**
 * @author ozay.tunctan
 */
public final class JasperReportUtils {
    public static byte[] createReportPdf(String reportName,
                                         Collection<?> data,
                                         HashMap<String, Object> parameters) {
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(data);
        byte[] reportValue = null;
        try {
            JasperReport jasperReport = JasperCompileManager.
                    compileReport(new FileInputStream("src/main/resources/report/" + reportName));

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);

            reportValue = JasperExportManager.exportReportToPdf(jasperPrint);


        } catch (FileNotFoundException ex) {
            throw new JasperException(ex.getMessage());

        } catch (JRException ex) {
            throw new JasperException(ex.getMessage());
        }

        return reportValue;


    }

}
