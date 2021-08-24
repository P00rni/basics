package selenium;

public class shoefinder {


@Test
public void tc1() {
 driver.get("https://www.sportsshoes.com/");
 driver.manage().window().setSize(new Dimension(1050, 708));
 driver.findElement(By.id("menu-Advice-main")).click();
 driver.findElement(By.cssSelector(".shoe-popup .vanilla-lazyload")).click();
 driver.findElement(By.cssSelector("#q_s > button")).click();
 driver.findElement(By.cssSelector(".bounding:nth-child(2) img")).click();
 driver.findElement(By.cssSelector(".surface_select:nth-child(1) > img")).click();
 driver.findElement(By.cssSelector(".pronation_select:nth-child(2) > img:nth-child(1)")).click();
 driver.findElement(By.cssSelector(".price-button")).click();
 driver.findElement(By.cssSelector(".milage_select:nth-child(10)")).click();
 driver.findElement(By.id("shoe_result_page")).click();
}
}
