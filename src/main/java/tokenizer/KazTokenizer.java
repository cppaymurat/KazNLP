package tokenizer;

import opennlp.tools.tokenize.SimpleTokenizer;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

public class KazTokenizer {
    public static List<String> getSentences(String text){
        List<String>result=new ArrayList<>();
        BreakIterator bi = BreakIterator.getSentenceInstance();
        bi.setText(text);
        int index = 0;
        while (bi.next() != BreakIterator.DONE) {
            String sentence = text.substring(index, bi.current());
            result.add(sentence);
            index = bi.current();
        }
        return result;
    }

    public static String[]tokens(String sentence){
        //Instantiating SimpleTokenizer class
        SimpleTokenizer simpleTokenizer = SimpleTokenizer.INSTANCE;
        //Tokenizing the given sentence
        return simpleTokenizer.tokenize(sentence);
    }
}
