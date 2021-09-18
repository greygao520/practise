/**
 * @class name Test
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/7/14 23:35
 * @Version 1.0
 **/
class Test {

    String file = "C:/Users/180454/Downloads/1.xlsx";
        // 根据Eccel获取OPCPackage对象
        OPCPackage pkg = OPCPackage.open(multipartFile.getInputStream());

        try{
        //创建XSSFReader XSSFReader xssfReader = new XSSFReader(pkg);
        // 获取SharedStringTable对象
        SharedStringsTable sharedStringsTable = xssfReader.getSharedStringsTable();
        //获取StylesTable对象
        StylesTable styles = xssfReader.getStylesTable();
        XMLReader xmlReader = XMLReaderFactory.createXMLReader();
        MesSheetHandler mesSheetHandler = new MesSheetHandler();
        xmlReader.setContentHandler(new XSSFSheetXMLHandler(styles, sharedStringsTable, mesSheetHandler, false));
        XSSFReader.SheetIterator sheets = (XSSFReader.SheetIterator) xssfReader.getSheetsData();
        //每一个Sheet
        while (sheets.hasNext()) {
            InputStream sheetstream = sheets.next();
            InputSource sheetSource = new InputSource(sheetstream);
            try {
                xmlReader.parse(sheetSource);
                LOGGER.info("row:" + "结束");
            } finally {
                sheetstream.close();
            }
        }
    }finally


    public void importExcelpoiSax(String name) throws Exception {

    }

    {
        pkg.close();
    }
        return CommonResult.success(ResultCode.SUCCESS);
}

