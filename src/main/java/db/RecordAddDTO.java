package db;

// 받아와줄 레코드
public record RecordAddDTO(
        // id와 created_at은 주석처리 혹은 삭제
        String question,
        String answer) {


}
