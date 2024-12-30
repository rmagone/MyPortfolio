package lv.myportfolio.portfoli.service;

import lv.myportfolio.portfoli.model.Articles;
import lv.myportfolio.portfoli.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    @Autowired
    private ArticleRepository articleRepository;

    public List<Articles> getAllArticles() {
        return articleRepository.findAll();
    }
    public Articles addArticle(Articles article) {
        return articleRepository.save(article);
    }
    public Articles getArticleById(Long id) {
        return articleRepository.findById(id).orElse(null);
    }
    public void deleteArticle(Long id) {
        articleRepository.deleteById(id);
    }
}
