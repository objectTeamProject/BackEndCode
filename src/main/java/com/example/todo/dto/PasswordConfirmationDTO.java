package com.example.todo.dto;
//우선 가지고 있던 파일에 있어서 추가는 했는데 사용한 기억은 없음(?)

public class PasswordConfirmationDTO {
    private Long userId;
    private String password;

    // Default constructor
    public PasswordConfirmationDTO() {
    }

    // Parameterized constructor
    public PasswordConfirmationDTO(Long userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    // Getters and Setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}