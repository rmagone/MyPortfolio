package lv.myportfolio.portfoli.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import lv.myportfolio.portfoli.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
