package com.qascript;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {
	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("disable-gpu");
		driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
		driver.get("http://2b3f7831f1ac.ngrok.io");
		System.out.println("Title of the page is: " );
	}
	
	@Test
	public void testCrearOrganizador() {
		WebElement nombre = driver.findElement(By.id("nombre"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement apellidoPaterno = driver.findElement(By.id("apellidoPaterno"));
		WebElement apellidoMaterno = driver.findElement(By.id("apellidoMaterno"));
		WebElement rut = driver.findElement(By.id("rut"));
		WebElement fechaNacimiento = driver.findElement(By.id("fechaNacimiento"));
		WebElement telefonoPersonal = driver.findElement(By.id("telefonoPersonal"));
		WebElement clubOrganizacion = driver.findElement(By.id("clubOrganizacion"));
		WebElement direccionOrganizacion = driver.findElement(By.id("direccionOrganizacion"));
		WebElement telefonoCorporativo = driver.findElement(By.id("telefonoCorporativo"));
		WebElement webOrganizacion = driver.findElement(By.id("webOrganizacion"));
		nombre.sendKeys("fabian");
		email.sendKeys("fabian.fernandeza@sansano.usm.cl");
		apellidoPaterno.sendKeys("fernandez");
		apellidoMaterno.sendKeys("alfaro");
		rut.sendKeys("19548707-3");
		fechaNacimiento.sendKeys("24031997");
		telefonoPersonal.sendKeys("972332692");
		clubOrganizacion.sendKeys("UTFSM");
		direccionOrganizacion.sendKeys("valparaiso");
		telefonoCorporativo.sendKeys("997142324");
		webOrganizacion.sendKeys("https://www.usm.cl/");
		nombre.submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement nombreListaOrganizadores = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/table/tbody/tr/th"));
		WebElement apellidoListaOrganizadores = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/table/tbody/tr/td[1]"));
		WebElement emailListaOrganizadores = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/table/tbody/tr/td[2]"));
		WebElement clubListaOrganizadores = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/table/tbody/tr/td[3]"));
		assertEquals("fabian",nombreListaOrganizadores.getText());
		assertEquals("fernandez",apellidoListaOrganizadores.getText());
		assertEquals("fabian.fernandeza@sansano.usm.cl",emailListaOrganizadores.getText());
		assertEquals("UTFSM",clubListaOrganizadores.getText());
		
	}
	
	
	@Test
	public void testEliminarOrganizador() {
		WebElement nombre = driver.findElement(By.id("nombre"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement apellidoPaterno = driver.findElement(By.id("apellidoPaterno"));
		WebElement apellidoMaterno = driver.findElement(By.id("apellidoMaterno"));
		WebElement rut = driver.findElement(By.id("rut"));
		WebElement fechaNacimiento = driver.findElement(By.id("fechaNacimiento"));
		WebElement telefonoPersonal = driver.findElement(By.id("telefonoPersonal"));
		WebElement clubOrganizacion = driver.findElement(By.id("clubOrganizacion"));
		WebElement direccionOrganizacion = driver.findElement(By.id("direccionOrganizacion"));
		WebElement telefonoCorporativo = driver.findElement(By.id("telefonoCorporativo"));
		WebElement webOrganizacion = driver.findElement(By.id("webOrganizacion"));
		nombre.sendKeys("fabian");
		email.sendKeys("fabian.fernandeza@sansano.usm.cl");
		apellidoPaterno.sendKeys("fernandez");
		apellidoMaterno.sendKeys("alfaro");
		rut.sendKeys("19548707-3");
		fechaNacimiento.sendKeys("24031997");
		telefonoPersonal.sendKeys("972332692");
		clubOrganizacion.sendKeys("UTFSM");
		direccionOrganizacion.sendKeys("valparaiso");
		telefonoCorporativo.sendKeys("997142324");
		webOrganizacion.sendKeys("https://www.usm.cl/");
		nombre.submit();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement botonEliminar = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/table/tbody/tr/td[4]/button[2]"));
		botonEliminar.click();
		List<WebElement> nombreListaOrganizadores = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[1]/div/table/tbody/tr/th"));
		assertEquals(0,nombreListaOrganizadores.size());
		
	}
	
	@Test
	public void testEditarOrganizador() {
		WebElement nombre = driver.findElement(By.id("nombre"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement apellidoPaterno = driver.findElement(By.id("apellidoPaterno"));
		WebElement apellidoMaterno = driver.findElement(By.id("apellidoMaterno"));
		WebElement rut = driver.findElement(By.id("rut"));
		WebElement fechaNacimiento = driver.findElement(By.id("fechaNacimiento"));
		WebElement telefonoPersonal = driver.findElement(By.id("telefonoPersonal"));
		WebElement clubOrganizacion = driver.findElement(By.id("clubOrganizacion"));
		WebElement direccionOrganizacion = driver.findElement(By.id("direccionOrganizacion"));
		WebElement telefonoCorporativo = driver.findElement(By.id("telefonoCorporativo"));
		WebElement webOrganizacion = driver.findElement(By.id("webOrganizacion"));
		nombre.sendKeys("fabian");
		email.sendKeys("fabian.fernandeza@sansano.usm.cl");
		apellidoPaterno.sendKeys("fernandez");
		apellidoMaterno.sendKeys("alfaro");
		rut.sendKeys("19548707-3");
		fechaNacimiento.sendKeys("24031997");
		telefonoPersonal.sendKeys("972332692");
		clubOrganizacion.sendKeys("UTFSM");
		direccionOrganizacion.sendKeys("valparaiso");
		telefonoCorporativo.sendKeys("997142324");
		webOrganizacion.sendKeys("https://www.usm.cl/");
		nombre.submit();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement botonEditar = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/table/tbody/tr/td[4]/button[1]"));
		botonEditar.click();
		nombre = driver.findElement(By.id("nombre1"));
		apellidoPaterno = driver.findElement(By.id("apellidoPaterno1"));
		apellidoMaterno = driver.findElement(By.id("apellidoMaterno1"));
		rut = driver.findElement(By.id("rut1"));
		fechaNacimiento = driver.findElement(By.id("fechaNacimiento1"));
		telefonoPersonal = driver.findElement(By.id("telefonoPersonal1"));
		clubOrganizacion = driver.findElement(By.id("clubOrganizacion1"));
		direccionOrganizacion = driver.findElement(By.id("direccionOrganizacion1"));
		telefonoCorporativo = driver.findElement(By.id("telefonoCorporativo1"));
		webOrganizacion = driver.findElement(By.id("webOrganizacion1"));
		
		nombre.sendKeys(Keys.chord(Keys.CONTROL, "a"),"fabianTester");
		apellidoPaterno.sendKeys(Keys.chord(Keys.CONTROL, "a"),"fernandezTester");
		clubOrganizacion.sendKeys(Keys.chord(Keys.CONTROL, "a"),"organizacionTesteadora");
		nombre.submit();
		WebElement nombreListaOrganizadores = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/table/tbody/tr/th"));
		WebElement apellidoListaOrganizadores = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/table/tbody/tr/td[1]"));
		WebElement clubListaOrganizadores = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/table/tbody/tr/td[3]"));
		assertEquals("fabianTester",nombreListaOrganizadores.getText());
		assertEquals("fernandezTester",apellidoListaOrganizadores.getText());
		assertEquals("organizacionTesteadora",clubListaOrganizadores.getText());
		
		
	}
	
	
	/*@After
	public void tearDown() {
		driver.quit();
	}
    */
}

