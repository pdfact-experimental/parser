package pdfact;

import pdfact.model.Document;
import pdfact.parser.PdfParser;

public class PdfParserMain {
  public static void main(String[] args) {
    System.out.println("Running the PDF parser ...");
    Document doc = new PdfParser().parse();
    System.out.println("Parsed document: " + doc.id);
  }
}
