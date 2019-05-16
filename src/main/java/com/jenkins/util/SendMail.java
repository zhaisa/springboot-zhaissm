package com.jenkins.util;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class SendMail {
public static void sendMail() {
	HtmlEmail email=new HtmlEmail();
	try {
		 // 这里是SMTP发送服务器的名字：163的如下："smtp.163.com"
        email.setHostName("smtp.163.com");
        // 字符编码集的设置
        email.setCharset("utf-8");
        // 收件人的邮箱
        email.addTo("1606678081@qq.com");
        // 发送人的邮箱2
        email.setFrom("13618045931@163.com", "13618045931@163.com");
        // 如果需要认证信息的话，设置认证：用户名-密码     ***是你开启POP3服务时的授权码，不是登录密码
        email.setAuthentication("13618045931@163.com", "***");
        // 要发送的邮件主题
        email.setSubject("Test");
        // 要发送的信息，由于使用了HtmlEmail，可以在邮件内容中使用HTML标签
        email.setMsg("测试发送邮件");
        // 发送
        email.send();
        System.out.println("发送成功");

	}catch(EmailException e){
		e.printStackTrace();
		System.out.println("发送失败");
		
	}
}
}
