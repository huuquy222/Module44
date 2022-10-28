package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandWichController {
    @RequestMapping("/")
    public String loadIndex(){
        return "index";
    }
//    bước này sẽ sử dụng một requestmapping ánh xạ một cái index đến cái view để hiển thị các nootij dung sau đó nếu ta bấm một mình save thì nó sẽ chuyển đến một
//    getmapping sẽ dẫn chúng ta đến một đường dẫn có chứa mootj thẻ đó là thẻ save
//    sau đó nếu chúng ta ấn save bình thường mà không chọn các checkbox thì nó sẽ đi vào một cái phương thức có chứa cái thẻ save đó
//    sau đó nó sẽ đọc và trả về một danh sách nếu ta gửi yêu cầu sai khi chúng ta chỉ ấn save mà k chọn nó sẽ đọc một danh sách có chứa các dữ liệu đó nếu rỗng thì nó sẽ báo là mày chưa có gia vị nào hết
//    nó sẽ chuyển đến một đường dẫn chứa cái index mà trong index đó ta đã khai báo các dữ liệu muối ớt vv
//    ngược lại nếu nó sử dụng ánh xạ ra một cái phương thức tên là chọn danh sách gia vị thì khi ta chọn rồi và khi ta ấn save nó sẽ tar về một cái save.jsp trong đó chứa các danh sách muối ớt tiêu hành vv

    @GetMapping(path = "/save")
    public String save(
            @RequestParam(required = false, name = "condiment") String[] condiment,
            ModelMap modelMap
    ) {
        if (condiment == null){
            modelMap.addAttribute("message", "may chua co gia vi nao het");
            return "index";
        } else {
            modelMap.addAttribute("condiment",condiment);
            return "save";
        }
    }


}
