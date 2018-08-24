package com.example.chaitanyadeshpande.vachan;


public class PDFNameUtility {
    private static final String LOG_TAG = "PDFNameUtility";
    private static PDFNameUtility instance;

    String pdf_name;

    private PDFNameUtility() {
    }

    public static PDFNameUtility getInstance() {
        if (instance == null) {
            instance = new PDFNameUtility();
        }
        return instance;
    }

    public String getPdf_name() {
        return pdf_name;
    }

    public void setPdf_name(String pdf_name) {
        this.pdf_name = pdf_name;
    }
}
