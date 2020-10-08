import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class OpenCsvReadAndParseToBean {
    private static final String CSV_FILE_LOCATION="D:\\ThirdPartyLibrary\\csvSample";
    public void parseAndRead() throws IOException {
        try (Reader reader = Files.newBufferedReader(Paths.get(CSV_FILE_LOCATION))) {
            CsvToBean<CsvUser> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(CsvUser.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            Iterator<CsvUser> csvUserIterator= csvToBean.iterator();
            while (csvUserIterator.hasNext()){
                CsvUser csvUser = csvUserIterator.next();
                System.out.println("Name"+csvUser.getName());
                System.out.println("Email"+csvUser.getEmail());
                System.out.println("Country"+csvUser.getCountry());
                System.out.println("PhoneNo"+csvUser.getPhoneNo());
                System.out.println("=============================");
            }
            List<CsvUser> csvUsers = csvToBean.parse();
            for (CsvUser csvUser:csvUsers){
                System.out.println("Name"+csvUser.getName());
                System.out.println("Email"+csvUser.getEmail());
                System.out.println("Country"+csvUser.getCountry());
                System.out.println("PhoneNo"+csvUser.getPhoneNo());
                System.out.println("============================");
            }
        }
    }
}
