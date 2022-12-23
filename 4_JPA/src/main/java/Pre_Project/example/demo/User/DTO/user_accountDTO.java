package Pre_Project.example.demo.User.DTO;

import java.time.LocalDateTime;

public record user_accountDTO(
        Long user_id,
        String email,
        String nickName,
        LocalDateTime createdAt,
        String createdBy,
        String modifiedBy,
        LocalDateTime modifier

) {
}
