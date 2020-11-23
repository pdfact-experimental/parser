package pdfact;

import pdfact.model.Document;
import pdfact.parser.PdfParser;

public class PdfParserMain {
  public static void main(String[] args) {
    Document doc = new PdfParser().parse();
    System.out.println("Document: " + doc.id);
  }
}
