// #1
// Метод charAt() – возвращает символ, расположенный по указанному индексу
// строки.
// Индексы строк в Java начинаются с нуля.
// В Java charAt() возвращает символ из массива строки по указанному индексу.

// public class HomeWork2 {

// public static void main(String args[]) {
// String s = "Я буду хорошим программистом!";
// char result1 = s.charAt(5);
// char result2 = s.charAt(13);
// System.out.println("Восьмой символ строки - " + result1);
// System.out.println("Одиннадцатый символ строки - " + result2);
// }
// }

// #2
// Метод compareTo() в Java структурирован двумя вариантами. Первый: метод
// сравнивает строку с другим объектом,
// а второй: метод лексически сравнивает две строки. Как работает compareTo() с
// числовым объектом мы рассмотрели
// в прошлом уроке.
// Рассмотрим второй вариант: сравнение двух строк.
// В Java compareTo() получает значение 0, если аргумент является строкой
// лексически равной данной строке;
// значение меньше 0, если аргумент является строкой лексически большей, чем
// сравниваемая строка; и значение
// больше 0, если аргумент является строкой лексически меньшей этой строки.

// public class HomeWork2 {

// public static void main(String args[]) {
// String str1 = "Я программист!";
// String str2 = "Я начинающий программист!";
// String str3 = "Я не программист!";

// int result = str1.compareTo(str2);
// System.out.println(result);

// result = str2.compareTo(str3);
// System.out.println(result);

// result = str3.compareTo(str1);
// System.out.println(result);
// }
// }

// #4
// Метод compareToIgnoreCase() – в Java сравнивает лексически две строки,
// игнорируя регистр букв.
// В Java compareToIgnoreCase() возвращает отрицательное целое число, ноль или
// положительное целое число, если заданная строка меньше,
// равна или больше сравниваемой строки, игнорируя регистр.

// public class HomeWork2 {

// public static void main(String args[]) {
// String str1 = "Я начинающий программист!";
// String str2 = "Я программист!";
// String str3 = "Я не программист!";

// int result = str1.compareToIgnoreCase(str2);
// System.out.println(result);

// result = str2.compareToIgnoreCase(str3);
// System.out.println(result);

// result = str3.compareToIgnoreCase(str1);
// System.out.println(result);
// }
// }

// #5
// Метод concat() – возвращает строку со значением строки, переданной в метод и
// приложенной к концу строки,
// используемой для вызова этого метода. Проще говоря метод concat() в Java
// объединяет строки,
// путем добавления одной строки в конец к другой.
// В Java concat() возвращает строку, представляющую собой результат объединения
// символов этого объекта,
// за которым следует аргумент строки символов.
// public class HomeWork2 {

// public static void main(String args[]) {
// String s = "Я программист...";
// s = s.concat("В будущем!");

// System.out.println(s);
// }
// }

// #6
// Метод contentEquals() – возвращает значение true только в том случае, если
// эта строка представляет
// собой ту же последовательность символов, которая указана в строке буфера
// (StringBuffer).
// В Java contentEquals() возвращает значение true только в том случае, если эта
// строка представляет
// собой ту же последовательность символов как указано в строке буфера
// (StringBuffer), в противном случае
// возвращается false.
// public class HomeWork2 {

// public static void main(String args[]) {
// String str1 = "Добро пожаловать на ProgLang.su";
// String str2 = "Сайт для изучения программирования";
// StringBuffer str3 = new StringBuffer("Добро пожаловать на ProgLang.su");
// StringBuffer str4 = new StringBuffer("Добро пожаловать");

// boolean result = str1.contentEquals(str3);
// System.out.println(
// "Строка \"Добро пожаловать на ProgLang.su\" равна строке буфера \"Добро
// пожаловать на ProgLang.su\"? \n"
// + result);

// result = str2.contentEquals(str3);
// System.out.println(
// "Строка \"Сайт для изучения программирования\" равна строке буфера \"Добро
// пожаловать на ProgLang.su\"? \n"
// + result);

// result = str1.contentEquals(str4);
// System.out.println(
// "Строка \"Добро пожаловать на ProgLang.su\" равна строке буфера \"Добро
// пожаловать\"? \n" + result);
// }
// }

// #7
// Метод copyValueOf() в Java имеет две различные формы:
// public static String copyValueOf(char[] data) – возвращает строку, которая
// представляет собой
// последовательность символов в заданном массиве.
// public static String copyValueOf(char[] data, int offset, int count) –
// возвращает строку, которая
// представляет собой последовательность символов в заданном массиве.

// public class HomeWork2 {

// public static void main(String args[]) {
// char[] Str1 = { 'П', 'р', 'и', 'в', 'е', 'т', ' ', 'М', 'и', 'р' };
// String Str2 = "";

// Str2 = Str2.copyValueOf(Str1);
// System.out.println("Возвращаемая строка: " + Str2);

// Str2 = Str2.copyValueOf(Str1, 1, 1);
// System.out.println("Возвращаемая строка: " + Str2);
// }
// }

// #9
// Метод endsWith() – проверяет, заканчивается ли эта строка указанным
// окончанием.
// В Java endsWith() возвращает значение true, если последовательность символов,
// представленного аргумента является окончанием последовательности символов,
// представленного этим объектом;
// в противном случаи значение false. Обратите внимание, что результатом будет
// значение true, если аргумент
// является пустой строкой или равным строковому объекту, определено как методом
// equals(Object).

// public class HomeWork2 {

// public static void main(String args[]) {
// String Str = new String("Добро пожаловать на ProgLang.su");
// boolean retVal;

// retVal = Str.endsWith("ProgLang.su");
// System.out.println("Возвращаемое значение: " + retVal);

// retVal = Str.endsWith("ProgLang");
// System.out.println("Возвращаемое значение: " + retVal);
// }
// }

// #11
// Метод equalsIgnoreCase() – сравнивает данную строку с другой строкой,
// игнорируя регистр.
// Две строки считаются равными, если они имеют одинаковую длину и
// соответствующие символы у двух строк равны,
// игнорируя регистр букв.
// В Java equalsIgnoreCase() возвращает значение true, если аргумент не равен
// null и строки равны,
// без учета регистра букв; в противном случае значение false.

// public class HomeWork2 {

// public static void main(String args[]) {
// String Str1 = "Добро пожаловать на ProgLang.su";
// String Str2 = Str1;
// String Str3 = new String("Сайт для изучения программирования");
// String Str4 = new String("ДОБРО ПОЖАЛОВАТЬ НА PROGLANG.SU");
// boolean retVal;

// retVal = Str1.equalsIgnoreCase(Str2);
// System.out.println("Строка Str1 равна строке Str2? Ответ: " + retVal);

// retVal = Str1.equalsIgnoreCase(Str3);
// System.out.println("Строка Str1 равна строке Str3? Ответ: " + retVal);

// retVal = Str1.equalsIgnoreCase(Str4);
// System.out.println("Строка Str1 равна строке Str4? Ответ: " + retVal);
// }
// }

// #20
// Метод intern() – возвращает каноническое представление для строкового
// объекта.
// Отсюда следует, что для любых двух строк s и t, s.intern() == t.intern(),
// истинно тогда и только тогда,
// когда s.equals(t) имеет значение true.
// В Java intern() возвращает каноническое представление для строкового объекта.

// import java.io.*;

// public class HomeWork2 {
// public static void main(String args[]) {
// String Str1 = new String("Добро пожаловать на ProgLang.su");
// String Str2 = new String("ДОБРО ПОЖАЛОВАТЬ НА PROGLANG.SU");

// System.out.print("Каноническое представление Str1: ");
// System.out.println(Str1.intern());

// System.out.print("Каноническое представление Str2: ");
// System.out.println(Str2.intern());
// }
// }

// #25
// Метод length() – возвращает длину строки в Java. Длина равна числу
// 16-разрядных символов Юникода в строке.
// В Java length() возвращает длину последовательности символов, представленного
// этим объектом.
// import java.io.*;

// public class HomeWork2 {

// public static void main(String args[]) {
// String Str1 = new String("Добро пожаловать на ProgLang.su");
// String Str2 = new String("ProgLang.su");

// System.out.print("Длина строки \"Добро пожаловать на ProgLang.su\" - ");
// System.out.println(Str1.length());

// System.out.print("Длина строки \"ProgLang.su\" - ");
// System.out.println(Str2.length());
// }
// }

// #37
// Метод substring() в Java имеет два варианта и возвращает новую строку,
// которая является подстрокой данной строки.
// Подстрока начинается с символа, заданного индексом, и продолжается до конца
// данной строки или до endIndex-1,
// если введен второй аргумент.
// В Java substring() возвращаемое значение заданно подстрокой.

// import java.io.*;

// public class HomeWork2 {

// public static void main(String args[]) {
// String Str = new String("Добро пожаловать на ProgLang.su");

// System.out.print("Возвращаемое значение: ");
// System.out.println(Str.substring(5));

// System.out.print("Возвращаемое значение: ");
// System.out.println(Str.substring(6, 15));
// }
// }

// #39
// Метод toCharArray() – в Java преобразует данную строку в новый массив
// символов.
// В Java toCharArray() возвращает вновь распределённый символьный массив, длина
// которого равна длине
// данной строки и содержимое, которое инициализируются, содержит
// последовательность символов,
// представленных данной строкой.
// import java.io.*;

// public class HomeWork2 {

// public static void main(String args[]) {
// String Str = new String("Добро пожаловать на ProgLang.su");

// System.out.print("Возвращаемое значение: ");
// System.out.println(Str.toCharArray());
// }
// }

// #45
// Метод trim() – возвращает копию строки с пропущенными начальными и конечными
// пробелами,
// другими словами метод позволяет в Java удалить пробелы в начале и конце
// строки.
// В Java trim() возвращает копию данной строки, в которой удаляются начальные и
// конечные пробелы, или данную строку,
// если она не имеет начальных или конечных пробелов.
// import java.io.*;

// public class HomeWork2 {

// public static void main(String args[]) {
// String Str = new String(" Добро пожаловать на ProgLang.su ");

// System.out.print("Возвращаемое значение: ");
// System.out.println(Str.trim());
// }
// }
