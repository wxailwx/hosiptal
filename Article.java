package cn.sfturing.entity;

public class Article {
    private int id;
    private String article_id;
    private String author_order;
    private String DID;

    public void setId(int id){
        id = this.id;
    }

    public int getId(){
        return id;
    }

    public void setArticle_id(String article_id){
        article_id = this.article_id;
    }

    public String getArticle_id(){
        return article_id;
    }

    public void setAuthor_order(String author_order){
        author_order = this.author_order;
    }

    public String getAuthor_order(){
        return author_order;
    }

    public void setDID(String DID) {
        this.DID = DID;
    }

    public String getDID() {
        return DID;
    }
}
