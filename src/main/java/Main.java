import new_tokenizer.Tokenizer;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        for (FullInfo[] analysis : TextAnalysis.getAnalysis(text)) {
            System.out.println("==========================");
            for (FullInfo fullInfo : analysis) {
                System.out.println(fullInfo);
            }
        }
    }
}
