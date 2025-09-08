package kr.ac.kopo.wnddjgld.springboot_jdbctest.controller;

import kr.ac.kopo.wnddjgld.springboot_jdbctest.domain.Member;
import kr.ac.kopo.wnddjgld.springboot_jdbctest.reoository.MemberRepository02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/exam02")
public class Example02Controller {

    @Autowired
    MemberRepository02 repository;

    @GetMapping
    public String viewHomePage(Model model) {
        Iterable<Member> memberList = repository.findAll(); //select * from member
        model.addAttribute("memberList", memberList);
        return "viewPage02";
    }
    @GetMapping("/new")
    public String newMethod(Model model) {
        Member member = new Member();
        model.addAttribute("member", member);
        return "viewPage02_new";
    }

    @PostMapping("/insert")
    public String insertMethod(@ModelAttribute("member") Member member) {
        repository.save(member);
        return "redirect:/exam02";
    }

    @GetMapping("/edit/{id}")
    public String editMethod(@PathVariable(name ="id") int id, Model model) {
        Optional<Member> member = repository.findById(id);
        model.addAttribute("member", member);
        return "viewPage02_edit";
    }
    @PostMapping("/update")
    public String updateMethod(@ModelAttribute("member") Member member) {
        repository.save(member);
        return "redirect:/exam02";
    }
    @GetMapping("/delete/{id}")
    public String deleteMethod(@PathVariable(name ="id") int id) {
        repository.deleteById(id);
        return "redirect:/exam02";
    }
}
