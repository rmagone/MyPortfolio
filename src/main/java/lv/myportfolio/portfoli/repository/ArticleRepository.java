package lv.myportfolio.portfoli.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import lv.myportfolio.portfoli.model.Articles;

public interface ArticleRepository extends JpaRepository<Articles, Long> {
}
