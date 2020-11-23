package pdfact.parser;

import pdfact.model.Document;

public class PdfParser {
    public PdfParser() {
    }

    public Document parse() {
      Document doc = new Document();
      doc.id = "123";
      return doc;
    }
}
