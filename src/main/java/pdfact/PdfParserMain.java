package pdfact;

import pdfact.parser.PdfParser;

public class PdfParserMain {
  public static void main(String[] args) {
    PdfParser parser = new PdfParser();
    System.out.println("Document: " + parser.parse().id);
  }
}
