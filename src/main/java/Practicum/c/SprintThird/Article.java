package Practicum.c.SprintThird;

import java.util.ArrayList;
import java.util.List;

class Article {

    final String getArticle;

    Article(final String getArticle) {
        this.getArticle = getArticle;
    }
}

// создайте интерфейс Subscriber
// интерфейс должен иметь всего один метод `void send()`, который принимает на вход объект класса `Article`
interface Subscriber {
    void send(Article article);
}

class OfflineSubscriber implements Subscriber/* класс должен реализовывать интерфейс Subscriber */ {

    private final String address;

    public OfflineSubscriber(final String address) {
        this.address = address;
    }

    // метод send интерфейса Subscriber должен выводить текст "{article.getArticle} была доставлена по адресу: {address}"
    @Override
    public void send(Article article) {
        System.out.println(article.getArticle + " была доставлена по адресу: " + address);
    }
}

class WebSite implements Subscriber/* класс должен реализовывать интерфейс Subscriber */ {

    private final String url;

    public WebSite(final String url) {
        this.url = url;
    }

    // метод send интерфейса Subscriber должен выводить текст "{article.getArticle} опубликована на страничке: {address}"

    @Override
    public void send(Article article) {
        System.out.println(article.getArticle + " опубликована на страничке: " + url);
    }
}

class NewspaperPublisher {

    private final List<Article> articles;

    // для отправки статей подписчикам, вам необходимо хранить их в списке
    // создайте пустой список подписчиков List<Subscriber>
    private final List<Subscriber> subscribers = new ArrayList<>();

    public NewspaperPublisher(final List<Article> articles) {
        this.articles = articles;
    }

    // Создайте метод subscribe() принимающий на вход любой объект, реализующий интерфейс Subscriber.
    // При вызове метода subscribe() новый подписчик должен добавляться в список подписчиков.
    // В списке подписчиков не должно быть дубликатов! Вы можете проеверить, есть ли данный подписчик в списке методом List.contains().
    public void subscribe(Subscriber subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
        }
    }

    // Создайте метод unsubscribe() принимающий на вход любой объект, реализующий интерфейс Subscriber.
    // При вызове данного метода подписчик должен удаляться из списка подписчиков.
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    // Создайте метод startWork().
    // Метод должен отправлять все статьи, которые хранятся в данный момент в списке articles, всем подписчикам из списка.
    // Для отправки используйте метод send() класса Subscriber.
    public void startWork() {
        for (Subscriber subscriber : subscribers) {
            for (Article article : articles) {
                subscriber.send(article);
            }
        }
    }

    // Создайте метод publishNewArticle(). Метод принимает на вход объект класса Article.
    // Метод должен добавлять новую статью в список статей articles, а затем рассылать её всем подписчикам из списка.
    public void publishNewArticle(final Article article) {
        articles.add(article);
        for (Subscriber subscriber : subscribers) {
            subscriber.send(article);
        }
    }
}

