package model.services;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import model.entities.Relatorio;

public class ExportXls {

    public static void exportarRelatorio(List<Relatorio> report, String filePath) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Relatório de Juros Compostos");

        // Criar cabeçalho
        String[] colunas = {"Ano", "Mês", "Total Investido", "Lucro Total", "Valor Total Final"};
        Row headerRow = sheet.createRow(0);

        for (int i = 0; i < colunas.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(colunas[i]);
        }

        // Adicionar os dados
        int rowNum = 1;
        for (Relatorio rel : report) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0).setCellValue(rel.getYear());
            row.createCell(1).setCellValue(rel.getMonth());
            row.createCell(2).setCellValue(rel.getTotalInvested());
            row.createCell(3).setCellValue(rel.getTotalInInterest());
            row.createCell(4).setCellValue(rel.getTotalValue());
        }

        // Ajustar tamanhos das colunas
        for (int i = 0; i < colunas.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Salvar arquivo
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
            System.out.println("Relatório exportado com sucesso para: " + filePath);
        } catch (IOException e) {
            System.out.println("Erro ao exportar o relatório: " + e.getMessage());
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

