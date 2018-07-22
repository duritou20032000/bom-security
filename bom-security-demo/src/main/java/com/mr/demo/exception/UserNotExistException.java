package com.mr.demo.exception;

public class UserNotExistException extends RuntimeException {
    static final long serialVersionUID = -7034897190745766939L;
    private Integer id;
    public UserNotExistException(Integer id){
         super("用户不存在");
         this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
