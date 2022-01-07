package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId; //из документации
    private int fromId; //из документации
    private int createdBy; //из документации
    private int replyOwnerId; //из документации
    private int replyPostId; //из документации
    private int friendsOnly; //из документации
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

    private String postType; //из документации
    private int signerId; //из документации
    private int canPin; //из документации
    private int canDelete; //из документации
    private int canEdit; //из документации
    private int isPinned; //из документации
    private int markedAsAds; //из документации
    private boolean isFavorite; //из документации
    private int postponedId; //из документации


// + getters/setters

}
