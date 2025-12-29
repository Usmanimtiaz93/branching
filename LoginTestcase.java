@Test
public void validLoginTest() {
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.id("password")).sendKeys("admin123");
    driver.findElement(By.id("loginBtn")).click();

    String actualText = driver.findElement(By.id("welcomeMsg")).getText();
    Assert.assertEquals(actualText, "Welcome");
}
