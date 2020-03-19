package com.example.task;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class Springboot04TaskApplicationTests {

    @Resource
    JavaMailSenderImpl mailSender;

    @Test
    void contextLoads() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("通知-今晚上号");
        simpleMailMessage.setText("五排走起！");
        simpleMailMessage.setTo("kahenlee@163.com");
        simpleMailMessage.setFrom("1593487606@qq.com");
        mailSender.send(simpleMailMessage);
    }

    @Test
    void test02() throws MessagingException {
        //1、创建一个复杂的消息邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        // SimpleMailMessage helper = new SimpleMailMessage();
        helper.setSubject("通知-今晚上号");
        helper.setText("<b style='color:red'>五排走起！</b>", true);
        helper.setTo("***@163.com");
        helper.setFrom("***@qq.com");
        //上传文件
        helper.addAttachment("1.jpg", new File("D:\\桌面3840X2160.jpg"));
        helper.addAttachment("2.png", new File("D:\\windowsS.png"));
        mailSender.send(mimeMessage);
    }

}
