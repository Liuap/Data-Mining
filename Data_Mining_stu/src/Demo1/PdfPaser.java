package Demo1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
public class PdfPaser {


    /**
     * 使用PdfBox API解析
     * @param filePath 待解析pdf文档路径
     * @return 解析得到的pdf文本字符串
     * @throws Exception
     */
    public String paserPDFFileByPdfBox(String filePath) throws Exception {
        File file = new File(filePath);

        PDDocument document = PDDocument.load(file);
        PDFTextStripper stripper = new PDFTextStripper();
        String result = stripper.getText(document);

        if(document != null){
            document.close();
        }
        return result;
    }

    public String split_buildList(String word){




        return "1";
    }

    public static void main(String args[]) throws Exception {
        String filePath2="E:\\codeFile\\Java\\InfoRetrieval_0.01\\src\\Demo1\\pdf\\Dec2.pdf";
        String filePath1="E:\\codeFile\\Java\\InfoRetrieval_0.01\\src\\Demo1\\pdf\\Dec1.pdf";
        String filePath3="E:\\codeFile\\Java\\InfoRetrieval_0.01\\src\\Demo1\\pdf\\Dec3.pdf";
        String filePath4="E:\\codeFile\\Java\\InfoRetrieval_0.01\\src\\Demo1\\pdf\\Dec4.pdf";

        PdfPaser read1=new PdfPaser();
        System.out.println(read1.paserPDFFileByPdfBox(filePath1));
        System.out.println(read1.paserPDFFileByPdfBox(filePath2));
        System.out.println(read1.paserPDFFileByPdfBox(filePath3));
        System.out.println(read1.paserPDFFileByPdfBox(filePath4));


    }
}
