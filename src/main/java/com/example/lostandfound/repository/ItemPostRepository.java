package com.example.lostandfound.repository;

import com.example.lostandfound.entity.ItemPost;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPostRepository extends JpaRepository<ItemPost,Long> {
    // tim bai dang trang thai
    Page<ItemPost> findByStatus(String status);
    // tim bai dang Loai Lost/Found dang o trang thai hoat dong
    Page<ItemPost> findByStatusAndPostType(String postType, String status);
    // tim bai viet cua mot user cu the
    Page<ItemPost> findByUserId (String userId);

}
