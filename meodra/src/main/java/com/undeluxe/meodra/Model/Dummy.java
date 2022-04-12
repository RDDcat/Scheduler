package com.undeluxe.meodra.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dummy {
    private String title;
    private int fireCount;
    private int viewCount;
    private int postID;
    private String content;
}
