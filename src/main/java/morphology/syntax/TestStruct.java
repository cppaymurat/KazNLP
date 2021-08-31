package morphology.syntax;

import java.io.FileNotFoundException;

public class TestStruct {
    public static void main(String[] args) throws FileNotFoundException {
        SentenceStruct struct=new SentenceStruct();

        String []str={ "жаңа","жылдан","бастап", "телефон","қымбат","болады"};

        struct.init_versions(str);
        struct.printVersions();
        int adq=struct.getAdequate();
        SyntaxRelationship relationship=new SyntaxRelationship(struct.versionList.get(adq));
        relationship.print();
        System.out.println(relationship.phrases());
    }
}
