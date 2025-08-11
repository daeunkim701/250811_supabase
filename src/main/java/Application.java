import db.RecordAddDTO;
import db.RecordRepository;

public class Application {
    public static void main(String[] args) {
        RecordRepository repository = new RecordRepository();
        System.out.println(repository.getRecords());
        repository.addRecord(new RecordAddDTO(
                "질문",
                "답변"
        ));
    }
}