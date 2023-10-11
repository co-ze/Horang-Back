//package hanghackaton.horanedu.domain.rank.controller;
//
//import hanghackaton.horanedu.common.dto.ResponseDto;
//import hanghackaton.horanedu.domain.rank.service.RankService;
//import hanghackaton.horanedu.domain.school.dto.SchoolRankDto;
//import hanghackaton.horanedu.domain.user.dto.UserRankDto;
//import hanghackaton.horanedu.domain.user.dto.UserRankInSchoolDto;
//import lombok.RequiredArgsConstructor;
//import org.springframework.data.domain.Page;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/api/rank")
//public class RankController {
//
//    private final RankService rankService;
//
//    @GetMapping
//    public ResponseDto<Page<UserRankDto>> getPersonalRankList(@RequestParam(name = "page") int page,
//                                                              @RequestParam(name = "size") int size) {
//        return rankService.getPersonalRankList(page - 1, size);
//    }
//
//    @GetMapping("/school")
//    public ResponseDto<Page<SchoolRankDto>> getSchoolRankList(@RequestParam(name = "page") int page,
//                                                              @RequestParam(name = "size") int size) {
//        return rankService.getSchoolRankList(page - 1, size);
//    }
//
//    @GetMapping("/in-school")
//    public ResponseDto<Page<UserRankInSchoolDto>> getPersonalRankInSchoolList(@RequestParam(name = "school") String school,
//                                                                              @RequestParam(name = "page") int page,
//                                                                              @RequestParam(name = "size") int size) {
//        return rankService.getPersonalRankInSchoolList(school, page - 1, size);
//    }
//
//}