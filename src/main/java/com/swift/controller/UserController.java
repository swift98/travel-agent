package com.swift.controller;

import com.alibaba.fastjson.JSONObject;
import com.swift.service.AgentService;
import com.swift.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * created by swift
 * 2019/11/29 14:58
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private AgentService agentService;
    @Autowired
    private VisitorService visitorService;

    @RequestMapping("/sock")
    @ResponseBody
    public Map socktest() {
        Socket socket = null;
        try {
            socket = new Socket("0.0.0.0", 8000);
            OutputStream os = socket.getOutputStream();
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));
            PrintStream out = new PrintStream(os);
            JSONObject obj = new JSONObject();
            obj.put("id", "123456");
            String content = obj.toString();
            out.print(content);
            out.flush();
            out.print("over");
            out.flush();
//            out.close();

            System.out.println("read data");
            try {
                String line = br.readLine();
                while(line != null) {
                    System.out.println(line);
                    line = br.readLine();
                }
            } catch (Exception e) {
                System.out.println("read error");
                e.printStackTrace();
            }

            is.close();
            br.close();
//            out.print("close");
//            out.flush();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(null != socket) socket.close();
                System.out.println("close socket");
            } catch(Exception e) {
                System.out.println("close socket error");
                e.printStackTrace();
            }
        }
        Map<Object, Object> res = new HashMap<>();
        res.put("hello", "world");
        return res;
    }

    @RequestMapping("/login")
    @ResponseBody
    public Map Login(String phone, String password, Integer flag) {
        Map<Object, Object> result = new HashMap<>();
        try {
            System.out.println(phone);
            System.out.println(password);
            System.out.println(flag);
            Object user = flag == 1 ? visitorService.login(phone, password) : agentService.login(phone, password);
//            if(1 == flag) user = visitorService.login(phone, password);
//            else if(0 == flag) user = agentService.login(phone, password);
//            else {
//                result.put("success", false);
//                return result;
//            }
            if(null != user) {
                result.put("user", user);
                result.put("success", true);
                result.put("msg", "登录成功！");
            } else {
                result.put("success", false);
                result.put("msg", "登录失败，请检查用户名或密码！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.put("success", false);
            result.put("msg", "登录失败，请稍后重试！");
        }
        return result;
    }

    @RequestMapping("/vRegister")
    @ResponseBody
    public Map vRegister(String name, String sex, String card, String phone, String password) {
        Map<Object, Object> map = new HashMap<>();
        try {
            if(-1 != visitorService.getUserByPhone(phone)) {
                map.put("success", false);
                map.put("msg", "此手机号已注册！");
            } else {
                visitorService.register(name, sex, card, phone, password);
                map.put("success", true);
                map.put("msg", "注册成功,请登录!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
            map.put("msg", "注册失败!");
        }
        return map;
    }

    @RequestMapping("/aRegister")
    @ResponseBody
    public Map aRegister(String name, String address, String phone, String password) {
        Map<Object, Object> map = new HashMap<>();
        try {
            if(-1 != agentService.getUserByPhone(phone)) {
                map.put("success", false);
                map.put("msg", "此手机号已注册！");
            } else {
                agentService.register(name, address, phone, password);
                map.put("success", true);
                map.put("msg", "注册成功，请登录!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
            map.put("msg", "注册失败!");
        }
        return map;
    }
}
