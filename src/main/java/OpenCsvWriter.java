import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OpenCsvWriter {
    private static final String CSV_FILE_LOCATION="D:\\ThirdPartyLibrary\\csvSample2.cvs";
    public void writeSample() throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
        try (
                BufferedWriter writer = Files.newBufferedWriter(Paths.get(CSV_FILE_LOCATION));
                ){
            StatefulBeanToCsv<MyUser> beanToCsv = new StatefulBeanToCsvBuilder(writer)
                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER).build();
            List<MyUser> myUser=new ArrayList<>();
            myUser.add(new MyUser("Sunder Pichai","sunder@email.com","991919191","jcsdfcsjdc"));
            myUser.add(new MyUser("Pichai","sunder@email.com","991919191","jcsdfcsjdc"));
            beanToCsv.write(myUser);
        }
    }
}
