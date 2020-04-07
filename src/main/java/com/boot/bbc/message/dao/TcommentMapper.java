package com.boot.bbc.message.dao;




import com.boot.bbc.message.domain.Tcomment;

import java.util.List;

public interface TcommentMapper {
    int addTcomment(Tcomment tcomment);
    int updateTcommentById(Tcomment tcomment);
    int deleteTcommentById(int commentId);
    List<Tcomment> queryTcommentByPage(int messageId);
    Tcomment queryTcommentById(int commentId);
}
