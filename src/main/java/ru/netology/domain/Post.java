package ru.netology.domain;

public class Post {
    private int id;
    private int owner_id; //из документации
    private int from_id; //из документации
    private int created_by; //из документации
    private int reply_owner_id; //из документации
    private int reply_post_id; //из документации
    private int friends_only; //из документации
    private int date;
    private String postContents; //text в документации

    private Copyright copyright;
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private Geo geo;
    private PostSource postSource;
    private Donut donut;

    private String post_type; //из документации
    private int signer_id; //из документации
    private int can_pin; //из документации
    private int can_delete; //из документации
    private int can_edit; //из документации
    private int is_pinned; //из документации
    private int marked_as_ads; //из документации
    private boolean is_favorite; //из документации
    private int postponed_id; //из документации


// + getters/setters

}
