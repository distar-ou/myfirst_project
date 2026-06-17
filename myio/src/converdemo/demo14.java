package converdemo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class demo14 {
    public static void main(String[] args) throws IOException {
        File scr=new File("C:\\Users\\HP\\IdeaProjects\\myio\\aaa.txt");

        FileUtils.writeStringToFile(scr,"你好你好你好你好");

    }
}
