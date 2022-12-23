package Pre_Project.example.demo.ArticleComments.Entity;

import Pre_Project.example.demo.User.Entity.UserAccount;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "ArticleComments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ArticleComments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private BigInteger ArticleCommentsID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_account")
    private UserAccount userAccounts=new UserAccount();


    @Column
    private Long Content;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "yy-MM-dd HH:mm:ss")
    LocalDateTime createdAt;

    //만든 사람
    @Column(nullable = false)
    private String createdBy;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "yy-MM-dd HH:mm:ss")
    LocalDateTime modifiedAt;

    //만든 사람
    @Column(nullable = false)
    private String modifiedBy;
}
