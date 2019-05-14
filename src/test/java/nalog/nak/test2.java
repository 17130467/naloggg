package nalog.nak; 
/*Подключение библиотеки. JUnit - это библиотека, позволяющая
 * проводить модульное тестирование Java приложений. Класс Assert 
 * содержит набор утверждений, которые облегачют процесс тестирования. */
import static org.junit.Assert.*;
/*Аннтоация @Test указывает JUnit, что метод является тестовым методом*/
import org.junit.Test;
/*Импортирует из пакета NalogC класс tax*/
import nalog.nak.tax;
/*Объявляем новый класс test2*/
public class test2 {
	/*Обозначает новую переменную из класса tax*/
	tax tax = new tax();
	/*InterruptedException это проверяемое исключение, генерируемый многими методами стандартной библиотеки, которые блокируют поток исполнения*/
	@Test
	public void testTax() throws InterruptedException
	 {
		/*Подставляет значения в метод calcTax2,
		 * где высчитывают деньги полученные на руки после вычета налога */
	 double res= tax.calcTax2(1000, 13);
		/*Заданное полученное значение*/
	 double toch=870.0;
		/*Сравнивают высчитанное методом calcTax2 и заранее заданное значение */
	 assertEquals(Double.toString(res),Double.toString(toch));
	 }	
} 