package com.dafiti.interactions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class Swipe implements Interaction {
    private String swipeType;
    private double startX;
    private double startY;
    private double endX;
    private double endY;

    public Swipe(String swipeType) {
        this.swipeType = swipeType;
    }

    public Swipe(String swipeType, double startX, double startY) {
        this.swipeType = swipeType;
        this.startX = startX;
        this.startY = startY;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver webDriver = BrowseTheWeb.as(actor).getDriver();
        TouchAction action = new TouchAction((AppiumDriver) webDriver);
        Dimension size = webDriver.manage().window().getSize();

        int x0 = (int) (size.getWidth() * 0.5);
        int y0 = (int) (size.getHeight() * 0.5);
        int x1 = x0;
        int y1 = y0;

        switch (swipeType) {
            case "scrollDown":
                y0 = (int) (y0 * 2 * 0.2);
                y1 = (int) (y1 * 2 * 0.3);
                break;
            case "scrollUp":
                y0 = (int) (y0 * 2 * 0.5);
                y1 = (int) (y1 * 2 * 0.2);
                break;
            case "swipeLeft":
                x0 = (int) (x0 * 2 * 0.8);
                x1 = (int) (x1 * 2 * 0.2);
                break;
            case "swipeRight":
                x0 = (int) (x0 * 2 * 0.2);
                x1 = (int) (x1 * 2 * 0.8);
                break;
            default:
                x0 = (int) (x0 * 2 * startX);
                y0 = (int) (y0 * 2 * startY);
                x1 = (int) (x1 * 2 * endX);
                y1 = (int) (y1 * 2 * endY);
        }
        action.longPress(PointOption.point(x0, y0))
                .moveTo(PointOption.point(x1, y1))
                .release().perform();
    }

    public static Swipe scrollDown() {
        return new Swipe("scrollDown");
    }

    public static Swipe scrollUp() {
        return new Swipe("scrollUp");
    }

    public static Swipe left() {
        return new Swipe("swipeLeft");
    }

    public static Swipe right() {
        return new Swipe("swipeRight");
    }

    public static Swipe fromPoint(double startX, double startY) {
        return new Swipe("swipe", startX, startY);
    }

    public Swipe toPoint(double endX, double endY) {
        this.endX = endX;
        this.endY = endY;
        return this;
    }
}