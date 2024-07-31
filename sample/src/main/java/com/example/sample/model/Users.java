package com.example.sample.model;

public class Users {
    private Integer id;
    private String username;
    private String password;

    // デフォルトコンストラクタ
    public Users() {}

    // 全フィールドを含むコンストラクタ
    public Users(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    // IDフィールドのゲッター
    public Integer getId() {
        return id;
    }

    // IDフィールドのセッター
    public void setId(Integer id) {
        this.id = id;
    }

    // ユーザー名フィールドのゲッター
    public String getUsername() {
        return username;
    }

    // ユーザー名フィールドのセッター
    public void setUsername(String username) {
        this.username = username;
    }

    // パスワードフィールドのゲッター
    public String getPassword() {
        return password;
    }

    // パスワードフィールドのセッター
    public void setPassword(String password) {
        this.password = password;
    }
}
