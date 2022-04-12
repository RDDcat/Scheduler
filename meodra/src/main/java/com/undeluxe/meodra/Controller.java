package com.undeluxe.meodra;

import com.undeluxe.meodra.Model.Dummy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String test(){
        return "흠!!!";
    }

    @GetMapping("/post/{pid}")
    public Dummy getPost(@PathVariable int pid){
        String content = "친구가 너 생일이라 케이크를 삼\n" +
                "\n" +
                "근데 친구가 케이크 사놓고 너 기다리고 있는데\n" +
                "배도 고프고 딱히 밥 먹을 곳도 없고 해서\n" +
                "케이크 5분의 1조각 정도 칼로 썰어서 덜어먹음\n" +
                "\n" +
                "너가 딱 케이크 받았을 땐 케이크가 잘려있길래 물어보니까\n" +
                "“내가 너 기다리다가 너무 배고파서 먹었어… 미안해….ㅜㅜㅜㅜ”\n" +
                "라고 하면 너네 기분 어떰?\n" +
                "\n" +
                "전자는 아니 아무리 그래도 나 줄 거라면서 그걸 먹냐\n" +
                "후자는 너무 배고팠으면 그럴 수 있지 받은 것만으로도 기분 좋다\n" +
                "\n" +
                "이거 의외로 갈림";
        return new Dummy("제목입니다", 12, 12, pid, content);
    }
}
