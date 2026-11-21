package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Everyday {
    public void run(String url, WebDriver driver){
        try {
            // 打开网页
            System.out.println("浏览器已经打开，进入无头模式");
            driver.get(url);
            //开始
            WebElement vCardTitle = driver.findElement(By.className("bg-green"));
            vCardTitle.click();
            Thread.sleep(120000); // 2分钟等待时间

        } catch (InterruptedException e) {
            System.out.println("执行失败，请重新尝试: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("运行URL时出错: " + url + ", 错误: " + e.getMessage());
        } finally {

        }
    }
}
