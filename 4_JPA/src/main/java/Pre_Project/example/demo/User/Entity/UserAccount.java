package Pre_Project.example.demo.User.Entity;

import Pre_Project.example.demo.Article.Entity.Article;
import Pre_Project.example.demo.ArticleComments.Entity.ArticleComments;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user_account")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String nickname;

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

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Article> articles=new ArrayList<>();

    @OneToMany(mappedBy = "user",cascade =CascadeType.ALL )
    private List<ArticleComments> articleComments=new ArrayList<>();








}
