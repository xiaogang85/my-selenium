package org.example;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    // 正确的main方法入口
    public static void main(String[] args) {
        try {
        	LogManager.getLogManager().reset();
        	Logger.getLogger("org.openqa.selenium.devtools").setLevel(Level.SEVERE);
        	Logger.getLogger("org.openqa.selenium.chromium").setLevel(Level.SEVERE);
            System.out.println("正在设置驱动");
            //System.setProperty("webdriver.edge.driver", "D:\\workspace\\edgedriver_win32\\msedgedriver.exe");
            System.setProperty("SE_MSEDGEDRIVER_MIRROR_URL", "https://msedgedriver.microsoft.com");
            System.out.println("驱动设置已完成");
            HashMap<Integer, String> urlMap = new LinkedHashMap<Integer, String>();
            System.out.println("==========================================");
            System.out.println("请输入需要运行的用户和实现的功能，用空格隔开");
            System.out.println("用户选择：  1：稳赢 其他：花开富贵");
            System.out.println("功能选择：  1：每日任务 其他：共享申请");
            Scanner scan = new Scanner(System.in);
            String str2 = scan.nextLine();
           String[] words= str2.trim().split(" ");
         System.out.println("==========================================");
       	 if( "1".equals(words[0])) {
           System.out.println("当前用户：稳赢");
           urlMap.put(221,"http://8.145.49.193/?ch=vx&uid=46254468&id=5003447656&key=01hrkw8jzv3h6pdj36sxwcdzc4#/");
           urlMap.put(222,"http://8.145.49.193/?ch=vx&uid=46254468&id=5003665368&key=01hrkw8jzv3h6pdj36sxwcdzc4#/");
           urlMap.put(223,"http://8.145.49.193/?ch=vx&uid=46254468&id=5003665371&key=01hrkw8jzv3h6pdj36sxwcdzc4#/");
           urlMap.put(224,"http://8.145.49.193/?ch=vx&uid=46254468&id=5003665375&key=01hrkw8jzv3h6pdj36sxwcdzc4#/");
           urlMap.put(225,"http://8.145.49.193/?ch=vx&uid=46254468&id=5003399683&key=01hrkw8jzv3h6pdj36sxwcdzc4#/");
           urlMap.put(226,"http://8.145.49.193/?ch=vx&uid=46254468&id=5003372445&key=01hrkw8jzv3h6pdj36sxwcdzc4#/");
           urlMap.put(227,"http://8.145.49.193/?ch=vx&uid=46254468&id=5003491148&key=01hrkw8jzv3h6pdj36sxwcdzc4#/");
           urlMap.put(228,"http://8.145.49.193/?ch=vx&uid=46254468&id=5003372442&key=01hrkw8jzv3h6pdj36sxwcdzc4#/");
           urlMap.put(229,"http://8.145.49.193/?ch=vx&uid=46254468&id=5003372448&key=01hrkw8jzv3h6pdj36sxwcdzc4#/");
           urlMap.put(230,"http://8.145.49.193/?ch=vx&uid=46254468&id=5003629424&key=01hrkw8jzv3h6pdj36sxwcdzc4#/");
           urlMap.put(231,"http://8.145.49.193/?ch=vx&uid=46254468&id=5003447666&key=01hrkw8jzv3h6pdj36sxwcdzc4#/");
           urlMap.put(232,"http://8.145.49.193/?ch=vx&uid=46254468&id=5003629444&key=01hrkw8jzv3h6pdj36sxwcdzc4#/");
           urlMap.put(233,"http://8.145.49.193/?ch=vx&uid=46254468&id=5003447669&key=01hrkw8jzv3h6pdj36sxwcdzc4#/");
           urlMap.put(234,"http://8.145.49.193/?ch=vx&uid=46254468&id=5003640403&key=01hrkw8jzv3h6pdj36sxwcdzc4#/");
           urlMap.put(235,"http://8.145.49.193/?ch=vx&uid=46254468&id=5003447667&key=01hrkw8jzv3h6pdj36sxwcdzc4#/");
           urlMap.put(236,"http://8.145.49.193/?ch=vx&uid=46254468&id=5003665376&key=01hrkw8jzv3h6pdj36sxwcdzc4#/");
           urlMap.put(237,"http://8.145.49.193/?ch=vx&uid=46254468&id=5003665378&key=01hrkw8jzv3h6pdj36sxwcdzc4#/");
           urlMap.put(238,"http://8.145.49.193/?ch=vx&uid=46254468&id=5003665380&key=01hrkw8jzv3h6pdj36sxwcdzc4#/");
           urlMap.put(240,"http://8.145.49.193/?ch=vx&uid=46254468&id=5003665383&key=01hrkw8jzv3h6pdj36sxwcdzc4#/");
           urlMap.put(239,"http://8.145.49.193/?ch=vx&uid=46254468&id=46254468&key=01hrkw8jzv3h6pdj36sxwcdzc4#/"); 
       	 }else {
             System.out.println("当前用户：花开富贵");
             urlMap.put(221,"http://8.145.49.193/?ch=vx&uid=46257156&id=5003683822&key=01ja4ehtz645zxqd6dvka2p09e#/");
             urlMap.put(222,"http://8.145.49.193/?ch=vx&uid=46257156&id=5003683823&key=01ja4ehtz645zxqd6dvka2p09e#/");
             urlMap.put(223,"http://8.145.49.193/?ch=vx&uid=46257156&id=5003683825&key=01ja4ehtz645zxqd6dvka2p09e#/");
             urlMap.put(224,"http://8.145.49.193/?ch=vx&uid=46257156&id=5003683828&key=01ja4ehtz645zxqd6dvka2p09e#/");
             urlMap.put(225,"http://8.145.49.193/?ch=vx&uid=46257156&id=5003372974&key=01ja4ehtz645zxqd6dvka2p09e#/");
             urlMap.put(226,"http://8.145.49.193/?ch=vx&uid=46257156&id=5003367264&key=01ja4ehtz645zxqd6dvka2p09e#/");
             urlMap.put(227,"http://8.145.49.193/?ch=vx&uid=46257156&id=5003491170&key=01ja4ehtz645zxqd6dvka2p09e#/");
             urlMap.put(228,"http://8.145.49.193/?ch=vx&uid=46257156&id=5003363268&key=01ja4ehtz645zxqd6dvka2p09e#/");
             urlMap.put(229,"http://8.145.49.193/?ch=vx&uid=46257156&id=5003789907&key=01ja4ehtz645zxqd6dvka2p09e#/");
             urlMap.put(230,"http://8.145.49.193/?ch=vx&uid=46257156&id=5003789908&key=01ja4ehtz645zxqd6dvka2p09e#/");
             urlMap.put(231,"http://8.145.49.193/?ch=vx&uid=46257156&id=5003789909&key=01ja4ehtz645zxqd6dvka2p09e#/");
             urlMap.put(232,"http://8.145.49.193/?ch=vx&uid=46257156&id=5003934080&key=01ja4ehtz645zxqd6dvka2p09e#/");
             urlMap.put(233,"http://8.145.49.193/?ch=vx&uid=46257156&id=5003449679&key=01ja4ehtz645zxqd6dvka2p09e#/");
             urlMap.put(234,"http://8.145.49.193/?ch=vx&uid=46257156&id=5003955872&key=01ja4ehtz645zxqd6dvka2p09e#/");
             urlMap.put(235,"http://8.145.49.193/?ch=vx&uid=46257156&id=5003449369&key=01ja4ehtz645zxqd6dvka2p09e#/");
             urlMap.put(239,"http://8.145.49.193/?ch=vx&uid=46257156&id=46257156&key=01ja4ehtz645zxqd6dvka2p09e#/");
       	 }
         WebDriver driver = null;
         // 设置 Edge 选项
         EdgeOptions options = new EdgeOptions();
         // ✅ 开启无头模式（后台运行）
         options.addArguments("--headless");
         driver = new EdgeDriver(options);
         //driver.manage().window().minimize();
         System.out.println("浏览器配置完成，进入无头模式");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       	for (Map.Entry<Integer, String> entry : urlMap.entrySet()) {
              	 if( "1".equals(words[1])) {
                    //每天
                	System.out.println(entry.getKey()+":每日任务运行开始");
                    Everyday everyday =new Everyday();
                    everyday.run(entry.getValue(),driver);
                    System.out.println(entry.getKey()+":每日任务运行结束");
                    System.out.println("");
                }else {
                    //共享
                	if(entry.getKey().equals(239) || (entry.getKey().equals(221) && "1".equals(words[0]) ) ) {
                		continue;
                	}
                	System.out.println(entry.getKey()+":共享运行开始");
                    Share share =new Share();
                    share.run(entry.getValue(),driver);
                    System.out.println(entry.getKey()+":共享运行结束");
                    System.out.println("");
                }
            }
            System.out.println("全部登录完成");
            scan.close();
            if (driver != null) {
                try {
                    driver.quit();  // 关闭整个浏览器并且清空缓存
                } catch (Exception e) {
                    System.out.println("关闭浏览器时出错: " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println("初始化失败: " + e.getMessage());
            // 这里不应该再创建driver，应该处理异常
        } 
    }

}