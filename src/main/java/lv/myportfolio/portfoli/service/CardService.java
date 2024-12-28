package lv.myportfolio.portfoli.service;

import lv.myportfolio.portfoli.model.Article;
import lv.myportfolio.portfoli.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }
    public Article addArticle(Article article) {
        return articleRepository.save(article);
    }
    public Article getArticleById(Long id) {
        return articleRepository.findById(id).orElse(null);
    }
    public void deleteArticle(Long id) {
        articleRepository.deleteById(id);
    }
}
