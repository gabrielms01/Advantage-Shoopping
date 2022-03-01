package br.advantageshopping.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	private FileInputStream fis;
	private FileOutputStream fileOut;
	private Workbook wb;
	private Sheet sh;
	private Cell cell;
	private Map<String, Integer> columns = new HashMap<String, Integer>();
	private Row row;

	public void getArquivoExcel() throws Exception {
		try {
			File file = new File("./Usuario_Cadastro.xlsx");
			fis = new FileInputStream(file);
			wb = WorkbookFactory.create(fis);
			sh = wb.getSheet("Usuario");

			for (Cell rows : sh.getRow(0)) {
				columns.put(rows.getStringCellValue(), rows.getColumnIndex());
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getCellData(int rownum, int colnum) throws Exception {
		try {
			cell = sh.getRow(rownum).getCell(colnum);
			String CellData = null;
			switch (cell.getCellType()) {
			case Cell.CELL_TYPE_STRING:
				CellData = cell.getStringCellValue();
				break;
			case Cell.CELL_TYPE_NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					CellData = String.valueOf(cell.getDateCellValue());
				} else {
					CellData = String.valueOf((long) cell.getNumericCellValue());
				}
				break;
			case Cell.CELL_TYPE_BOOLEAN:
				CellData = Boolean.toString(cell.getBooleanCellValue());
				break;
			case Cell.CELL_TYPE_BLANK:
				CellData = "";
				break;
			default:
				break;
			}
			return CellData;
		} catch (Exception e) {
			return "";
		}
	}

	public String getCellData(String columnName, int rownum) throws Exception {
		return getCellData(rownum, columns.get(columnName));
	}

	public void setCellData(String text, int rownum, int colnum) throws Exception {
		try {
			row = sh.getRow(rownum);
			if (row == null) {
				row = sh.createRow(rownum);
			}
			cell = row.getCell(colnum);

			if (cell == null) {
				cell = row.createCell(colnum);
			}
			cell.setCellValue(text);

			fileOut = new FileOutputStream("./Usuario_Cadastro.xlsx");
			wb.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (Exception e) {
			throw (e);
		}
	}
}
