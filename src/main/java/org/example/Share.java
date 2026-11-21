package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Share {
    public void run(String url, WebDriver driver) {
        try {
            // 打开网页
            driver.get(url);
            Thread.sleep(1000); // 2分钟等待时间
            //开始
            WebElement vCardTitle = driver.findElement(By.className("bg-green"));
            vCardTitle.click();
            //自动
            Thread.sleep(1000); // 2分钟等待时间
            List<WebElement> elements = driver.findElements(By.cssSelector(".v-btn.v-btn--stacked.v-theme--light.v-btn--density-default.v-btn--size-default.v-btn--variant-text"));
            elements.get(2).click();
            //军团
            Thread.sleep(1000); // 2分钟等待时间
            WebElement corps = driver.findElement(By.id("tab-5"));
            corps.click();
            //军团番号
            Thread.sleep(1000); // 2分钟等待时间
            List<WebElement> corpsNumber = driver.findElements(By.className("el-input__inner"));
            WebElement input1 = corpsNumber.get(6);
            input1.click();
            input1.clear();
            input1.sendKeys("169671");//摸鱼 169671  //小号：162017
            //申请加入
            WebElement join = driver.findElement(By.xpath("//button[contains(., '申请加入军团')]"));
            //List<WebElement> join = driver.findElements(By.cssSelector(".v-btn.v-btn--elevated.v-theme--light.v-btn--density-default.v-btn--size-large.v-btn--variant-elevated"));
            //join.get(6).click();
            join.click();
            Thread.sleep(8000); // 2分钟等待时间
        } catch (Exception e) {
            System.out.println("运行URL时出错: " + url + ", 错误: " + e.getMessage());
        } finally {

        }
    }
}
