import java.util.Random;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.regex.Pattern;

class Sample3
{
    public static void main(String[] args)
    {
        int number1 = 103;
        int number2 = 105;
        boolean isOddNumber = false;

        isOddNumber = (number1 + number2) % 2 == 1;

        System.out.println(isOddNumber);
    }
}

class Sample5
{
  public static void main(String[] args) {
    int[] nums = {1, 2, 3};

    System.out.println(nums[0]);
    System.out.println(nums[1]);
    System.out.println(nums[2]);
 }
}

class Sample6
{
  public static void main(String[] args) 
  {
    String[] fruits = {"りんご","いちご","みかん"};

    System.out.println(fruits[1]);
  }
}

class Sample7
{
  public static void main(String[] args) 
  {
    int[][] nums = new int[2][];
    nums[0] = new int[2];
    nums[1] = new int[3];

    nums[0][0] = 1;
    nums[0][1] = 2;
    nums[1][0] = 3;
    nums[1][1] = 4;
    nums[1][2] = 5;

    System.out.println(nums[0][0]);
    System.out.println(nums[0][1]);
    System.out.println(nums[1][0]);
    System.out.println(nums[1][1]);
    System.out.println(nums[1][2]);
  }
}

class Sample8
{
  public static void main(String[] args) 
  {
    String[][] text = {
      {"a","bc","!!"},
      {"He","l"},
      {"lo","!","def"}
    };

    System.out.println(text[1][0] + text[1][1] + text[2][0] + text[0][2]);
  }
}

class Sample9
{
  public static void main(String[] args) 
  {
    int number1 = 1;
    
    if (number1 == 1 || number1 == 5) {
      System.out.println("OK");
    }
  }
}

class Sample10
{
  public static void main(String[] args) 
  {
    int number2 = 5;
    
    if (number2 == 3 || number2 == 5) {
      System.out.println("OK");
    }
    else if (number2 >= 11 && number2 < 15) {
      System.out.println("GOOD");
    }
    else {
      System.out.println("BAD");
    }
  }
}

class Sample11 {
  public static void main(String[] args) {
    int number3 = 3;
    int number4 = 5;
    boolean isOddNumber = false;

    isOddNumber = (number3 + number4) % 2 == 1;

    if (isOddNumber) {
      System.out.println("奇数");
    } else {
      System.out.println("偶数");
    }
  }
}

class Sample12 {
  public static void main(String[] args) {
    int number5 = 5;
    int number6 = 6;

    if ((number5 * number6) % 3 == 0 && (number5 * number6) % 5 == 0) {
      System.out.println("3と5の倍数です");
    }
  }
}

class Sample13 {
  public static void main(String[] args) {
    int number7 = 7;
    int number8 = 8;

    int number78 = (number7 * number8);

    if (number78 % 2 == 0 || number78 % 3 == 0) {
      System.out.println("2か3の倍数です");
    }
  }
}

class Sample14 {

  public static void main(String[] args) {
    int number9 = 9;
    int number10 = 10;

    if ((number9 % 2 == 0 && number10 % 2 == 1) || (number9 % 2 == 1 && number10 % 2 == 0)) {
      System.out.println("偶数と奇数の組み合わせです");
    }
  }
}

class Sample15{
  public static void main(String[] args) {
    int number11 = 11;
    int number12 = 12;

    int differenceNumber = number11 - number12;

    if (differenceNumber % 2 == 0) {
      System.out.println("偶数です");
    }
    else if (differenceNumber % 2 == 1) {
      System.out.println("奇数です");
    }
    else if (differenceNumber < 0) {
      System.out.println("負の数です");
    }
     else {
      System.out.println("0です");
    }
  }
}

class Sample16{
  public static void main(String[] args) {
    int number13 = 6;
    int number14 = 5;

    int differenceNumber = number13 - number14;

    switch (differenceNumber % 2) {
      case 0:
      System.out.println("偶数か0です");
        break;
      default:
      System.out.println("奇数です");
        break;
    }
  }
}

class Sample17{
  public static void main(String[] args) {
    int speed = 120;
    int limit = 60;

    String str = speed > limit ? "スピード違反です": "法定速度内です。";
    System.out.println(str);
  }
}

class Sample18{
  public static void main(String[] args) {
    
  for (int i = 0; i < 10; i++) {
    System.out.print(i + " ");
    if (i % 3 != 0) {
        System.out.println(); // 改行
    }
  }
}
//0を除いて3で割り切れない数字になる度に、改行されていく
}

class Sample19 {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println("abc");
    }
  }
}

class Sample20 {
  public static void main(String[] args) {
    for (int num = 40; num <= 50; num++) {
      if (num % 2 != 0) {
        System.out.print(num + " ");
      }
    }
  }
}

class Sample21 {
  public static void main(String[] args) {
    for (int i =20; i <= 50; i++) {
      if (i % 2 == 0 && (i / 2) % 2 == 1) {
        System.out.print(i + " ");
      }
    }
  }
}

class Sample22 {
  public static void main(String[] args) {
    int num = 0;
    for (int i = 1; i < 30; i++) {
      if (i % 3 == 0) {
        num++;
      }
    }
    System.out.println(num + "個");
  }
}

class Sample23 {
  public static void main(String[] args) {
    int num = 0;
    for (int i = 1; i < 30; i++) {
      if (i % 3 == 0) {
        num +=i;
      }
    }
    System.out.println("合計:" + num);
  }
}

class Sample24{
  public static void main(String[] args){
    int num = 0;
        for (int i = 1; i < 100; i++) {
          if (i % 3 == 0 || i % 7 == 0) {
            num++;
          }
        }
    System.out.println(num + "個");
  }
}

class Sample25{
  public static void main(String[] args) {
    int num = 0;
    for (int i = 100; i > 0; i--){
      if (i % 3 == 0 || i % 7 == 0) {
        num ++;
        if (num == 5) {
          System.out.println("5番目に大き数字:" + i);
        }
      }
    }
  }
}

class Sample26{
  public static void main(String[] args) {
    int number = 0;

    while (number < 6) {
      System.out.println(number);
      number ++;
    }
  }
}

class Sample27 {
  public static void main(String[] args) {
    int[] nums = new int[3];
    nums[0] = 1;
    nums[1] = 2;
    nums[2] = 3;

    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
  }
}

class Sample28 {
  public static void main(String[] args) {
    int[] nums = new int[3];
    nums[0] = 2;
    nums[1] = 4;
    nums[2] = 6;

    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]*nums[i]);
    }
  }
}

class Sample29{
  public static void main(String[] args) {
    int[][][] numberList = {
       {
          {1,2,3},
          {4,5,6},
          {7,8,9}
      },
      {
          {10,11,12},
          {13,14,15}
      },
      {
          {16,17,18},
          {19,20,21}
      }
    };

    for (int i = 0; i < numberList.length; i++) {
      for (int j = 0; j < numberList[i].length; j++) {
        for (int k = 0; k < numberList[i][j].length; k++) {
          System.out.println(numberList[i][j][k] + " ");
        }
      }
    }
  }
}

class Sample30{
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 7) {
        break;
      }
      System.out.println(i);
    }
  }
}

class Sample31{
  public static void main(String[] args) {
    for (int i = 0; i <10; i++) {
      if (i == 7) {
        continue;
      }
      System.out.println(i);
    }
  }
}

class Sample32{
  public static void main(String[] args) {
    for (int i = 1000; i <= 2000; i++){
      if ((i - 7) % 10 != 0) {
        continue;
      }
      System.out.print(i + " ");
    }
  }
}

class Sample33 {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("0");
      }
      System.out.println();  // 改行
    }
  }
}


class class34 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            // 空白を出力
            for (int j = 0; j < 2 - i; j++) {
                System.out.print(" ");
            }

            // "0" を出力
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("0");
            }

            // 改行
            System.out.println();
        }
    }
}

class Sample35 {
  public static void main(String[] args) {
    int height = 5;
    int width = 5;
    int start = (width - 1) / 2;
    int end = start;

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        if (j >= start && j <= end) {
          System.out.print("0");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();

      if (i < height / 2) {
        start--;
        end++;
      } else {
        start++;
        end--;
      }
    }
  }
}

class Sample36 {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 3;
        String text = "あああああ";
        boolean boolValue = true;
        boolean result = isEven(number1, number2, boolValue);
        System.out.println(text);
        System.out.println(result);
    }

    public static boolean isEven(int minuend, int subtrahend, boolean boolValue) {
        return boolValue && (minuend - subtrahend) % 2 == 0;
    }
}



class Sample100 {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 3;
        String text = "あああああ";
        boolean boolValue = true;

        boolValue = isEven(number1, number2);
        System.out.print(boolValue);
    }

    /**
     * 仮引数1から仮引数2を引いた差が偶数かどうか判定する
     */
    public static boolean isEven(int minuend, int subtrahend) {
        return (minuend - subtrahend) % 2 == 0;
    }
}

class EvenNumberFinder {
    public static void main(String[] args) {
        // 以下の配列の中から偶数のみを出力する処理を実装してください。
        int[] numbers = {3, 8, 15, 20, 27, 32, 39, 44};

        //ここから解答
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}

class Sample38 {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 3;
        String text = "あああああ";
        boolean boolValue = true;

        boolValue = reverse(boolValue);
        System.out.print(boolValue);
    }

    public static boolean reverse(boolean value) {
        return !value;
    }
}

class Sample39 {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 3;
        String text = "あああああ";
        boolean boolValue = true;

        String word = contact(number1,text);
        System.out.print(word);
    }

    public static String contact(int firstValue, String  secondValue) {
        return firstValue + ":" + secondValue;
    }
}

class Sample40 {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 3;
        String text = "あああああ";
        boolean boolValue = true;

        int result = getResult(number1,boolValue);
        System.out.print(result);
    }

    public static int getResult(int number, boolean isAdd) {
      if(isAdd) {
        return ++number;
      }
      else {
        return --number;
      }
    }
}

class Sample41 {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 3;
        String text = "あああああ";
        boolean boolValue = true;

        repeat(number1, text);
    }

    public static void repeat(int loopCount, String text) {
         if (loopCount <= 0 || loopCount > 10) {
            System.out.print("範囲外の入力値です");
            return;
        }

        for (int i = 0; i < loopCount; i++) {
            System.out.println(text);
        }
    }
}

/* class Calculation {
    public String operator = "+";
    public int num1 = 10;
    public int num2 = 5;
} */

/* class Execution {
    public static void main(String[] args) {
    Application app = new Application();
    String result = app.calc.num1 + app.calc.operator + app.calc.num2 + "=" + (app.calc.num1 + app.calc.num2);
    System.out.println(app.msg);
    System.out.println(result);
    }
} */

/* 
class Application {
  public Calculation calc = new Calculation();
  public String msg = "計算結果表示";
} */

/* class Calculation {
    int num = 15;

    public Calculation() {
        // 処理追加
        System.out.println("コンストラクタの呼び出し");
    }
}

class Execution {
    public static void main(String[] args) {
        // 出力処理
        Calculation calc = new Calculation();
        System.out.println("num = " + calc.num);
    }
} */
/* 
class Polygon {
    public void introduction() {
        System.out.println("多角形です。");
    }
}

class Square extends Polygon {
    @Override
    public void introduction() {
        System.out.println("正方形です。");
    }
}

class Triangle extends Polygon {
    @Override
    public void introduction() {
        System.out.println("三角形です。");
    }
}

class Execution {
    public static void main(String[] args) {
        // 処理
    Shape pol = new Shape();
    pol.polygons = new Polygon[] { new Polygon(), new Square(), new Triangle() };
    for (int i = 0; i < pol.polygons.length; i++) {
      pol.polygons[i].introduction();
    }
  }
}

// Shape クラス
class Shape {
  public Polygon[] polygons;
}
*/

/* 
class Polygon {
    public String introduction() {
        return "多角形";
    }
}

class Square extends Polygon {
    @Override
    public String introduction() {
        return "正方形";
    }
    // 出力処理
    public String text() {
        return introduction() + "は" + super.introduction() + "です。";
    }
    public static void main(String[] args) {
      Square square = new Square();
      System.out.println(square.text());
    }
}
*/

class LunchBox {
    private String locationDish = "玉子焼き";
    private String locationRice = "鮭おにぎり";
    // 処理追加
        public void setDish (String dish) {
            this.locationDish = dish;
        }
        public void setRice (String rice) {
            this.locationRice = rice;
        }
        public String getDish () {
            return locationDish;
        }
        public String getRice () {
            return locationRice;
        }
}

class Execution {
    public static void main(String[] args) {
        // 出力処理
        LunchBox lunch = new LunchBox();
        lunch.setDish("鶏肉");
        lunch.setRice("五目ごはん");
        System.out.println("おかずには" + lunch.getDish() + "が入っていて、ごはんには" + lunch.getRice() + "が入っています。");
    }
}

class Question01 {
    public static void main(String[] args) {
        // Q1
        /* 
        Member member = new Member();
        // Q2
        member.name = "山田太郎";
        System.out.println("名前:" + member.name);
        // Q3
        member.age = 18;
        // Q7
        Member member = new Member("花子", 20);
        member.showProperties();
        */
        // Q11
        MemberDetails details = new MemberDetails("山田", 28, 178.5);

        details.setHeight(178.5);
        details.showProperties();
    }
}

class Member {
    // Q3
    private String name = "";
    private int age = -1;
    // Q9
    private static int member = 0;
    // Q4
    public void setName(String name) {
      this.name = name;
    }
    // Q5
    public void setAge(int age) {
      if (age > 0) {
        this.age = age;
      }
      else {
        System.out.println("不正な値です");
      }
    }
    public String getName() {
      return this.name;
    }
    public int getAge() {
      return this.age;
    }
    public void showProperties() {
      System.out.println("名前:" + getName());
      System.out.println("年齢:" + getAge() + "歳");
    }
    // Q7
    public Member() {
      System.out.println("インスタンスが生成されました");
      // Q9  
      member++;
    }
    // Q8
    public Member(String name, int age) {
      this();
      setName(name);
      setAge(age);
    }
    // Q10
    public static void showMember() {
      System.out.println("メンバーの人数は" + member + "人です");
    }
}
// Q11
class MemberDetails extends Member {
  private double height;
  public void setHeight(double height) {
    this.height = height;
  }
  public double getHeight() {
    return this.height;
  }
  public void showHeight() {
    System.out.println("身長は" + this.height + "cmです");
  }
  // Q12
  public MemberDetails(String name, int age, double height) {
    super(name, age);
    setHeight(height);
  }
  public void showProperties() {
    super.showProperties();
    System.out.println("身長は" + this.height + "cmです");
  }
}
class Execution1 {
    public static void main(String[] args) {
        int diameter = 5;
        System.out.println("円の直径：" + diameter + "cm");
        // 出力処理
        int result = Calculation.circumferenceLength(diameter);
        System.out.println("演習の長さ: 約" + result);
    }
}

// Calculation クラス
class Calculation {
  public static double pi = 3.14;
  public static int circumferenceLength(int diameter) {
    return (int) (pi * diameter);
  }
}

abstract class Store {
protected String name;
public abstract void Payment();
public Store (String name) {
  this.name = name;
 }
}

class ConvenienceStore extends Store {
  public ConvenienceStore(String name) {
    super(name);
  }
  public void Payment() {
    System.out.println(name + "のレジで支払います");
  }
}

class StoreName {
    public static void main(String[] args) {
        ConvenienceStore convenienceStore = new ConvenienceStore("セブンイレブン");
        convenienceStore.Payment();
    }
}

/*標準API
 * java.lang

https://docs.oracle.com/javase/jp/8/docs/api/java/lang/package-summary.html

java.util

https://docs.oracle.com/javase/jp/8/docs/api/java/util/package-summary.html

java.io

https://docs.oracle.com/javase/jp/8/docs/api/java/io/package-summary.html

java.time

https://docs.oracle.com/javase/jp/8/docs/api/java/time/package-summary.html

// メソッドの利用例⑴ 型変換
Integer.parseInt("1");     // String -> int
Float.parseFloat("1.1F");  // String -> float
Double.parseDouble("1.1"); // String -> double
Boolean.valueOf("true");   // String -> boolean

Integer.toString(1);       // int     -> String
Float.toString(1.1F);      // float   -> String
Double.toString(1.1);      // double  -> String
Boolean.toString(true);    // boolean -> String


// メソッドの利用例⑵ 値の比較
Boolean.compare(false, true);  // -1
Boolean.compare(false, false); //  0
Boolean.compare(true, false);  //  1
 */

 /**
  * Sample
  */
class SampleAPI {

    public static void main(String[] args) {
      String str2 = "abcdefg";
        System.out.println(str2.substring(3));
    }
}



class SampleAPI1 {
  public static void main(String[] args) {
      Random random = new Random();
  int randomNumber = random.nextInt(14);
  if (randomNumber == 0) {
    System.out.println("0です。");
  }
  if (randomNumber == 5) {
    System.out.println("5です。");
  }
  if (randomNumber == 13) {
    System.out.println("11以上です。");
  }
  }
}



class SampleAPI2 {
  public static void main(String[] args) {
    int[] numbers = {29, 4, 58, 13, 5, 2, 3, 33, 47, 11};
    Arrays.sort(numbers);
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
        
      }
    }
  }

  /*
  標準入力　java.io.BufferedReader

java.io.InputStreamReader

java.io.IOException

java.lang.System.in　　*/
/**
 * Sample
 */
class SubSample {
    /**
     * System.in ... 入力を受け付ける
     * InputStreamReader ... 入力値を文字列として受け取る(1文字づつ)
     * BufferedReader ... 入力した文字列を一行丸ごと読み込む
     */
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in)
    );
    System.out.println("入力してください");
    String line = br.readLine();
    System.out.println("入力完了");
    System.out.println("入力値:" + line);
    System.out.println("文字数:" + line.length());
}
}

/* 
日付の変更の仕方
LocalDateTime dateTime = LocalDateTime.of(2000, 1, 23, 1, 23, 45); // 2000-01-23T01:23:45
// 100日前のLocalDateTimeを返却します
LocalDateTime dateTime2 = dateTime.minusDays(100); // 1999-10-15T01:23:45
// 日付を15に変更しLocalDateTimeを返却します
LocalDateTime dateTime2 = dateTime.withDayOfMonth(15); // 2000-02-15T01:23:45

フォーマットを用意してオーバーロード
DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒");
// 保存されるフォーマットはあくまで「 年-月-日T時:分:秒 」です
LocalDateTime dateTime = LocalDateTime.parse("2000年01月23日 01時23分45秒", format); // 2000-01-23T01:23:45
*/
class Sample61 {
    public static void main(String[] args) {
        LocalDateTime datetime = LocalDateTime.now();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 h時mm分ss秒");
        // 指定フォーマットに合わせて現在日時を文字列に変換
        String formatDate = datetime.format(pattern);

        System.out.println(formatDate);
    }
}  
//*
/* 
 * String型の値を格納するArrayListのインスタンスを生成します。
 * List<参照型名> 変数名 = new ArrayList<参照型名>();

List<String> list = new ArrayList<String>();
List<Integer> numList = new ArrayList<Integer>();
numList.add(1);     // 0番目に追加
numList.set(0, 10); // 0番目の要素を10に変更する
numList.remove(1); // 2が削除される
numList.get(0); // 10
numList.size(); // 要素数
numList.indexOf(1); // 検出
List<String> strList = new ArrayList<String>();
strList.isEmpty(); // true
strList.add("a");
// 要素があるとfalse
strList.isEmpty(); // false
strList.clear();   // リストの要素をすべて削除します
strList.isEmpty(); // true
for (int i = 0; i < strList.size(); i++) {
    System.out.print(strList.get(i) + " ");
}  // sizeメソッドを用いて中身の出力繰り返しが可能
/**
 * ArrayList.forEach( 引数 -> {
 *     処理
 * });
 *
 * 出力結果) コアラ ラッパ パイナップル

strList.forEach( str -> {
    System.out.print(str + " ");
});  // for拡張に近い処理
// 処理が一行(return文なし)
num -> System.out.println(num)
// 処理が一行(return文あり)
num -> num * num
// 処理が複数行
num -> {
    int square = num * num;
    System.out.println("num * num = " + square);
} */
class Array {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    list.add(42);
    list.add(24);
    list.add(128);
    list.add(127);
    // Q2
    list.set(1, 22);
    /*  Q3
    list.forEach( num -> System.out.println(num)); 
    */
    // Q4
    /* 
    for (int list2 : list ) {
      System.out.println(list2 * 2);
    } */
    /* 
    int num =0;
    for (int list2 : list) {
      list.set(num, list2 * 2);
      num++;
    }
    list.forEach( element -> System.out.println(element));
    */
    /* 
    list.remove(3);
    System.out.println(list.get(3));
    */
    List<String> List = new ArrayList<String>();
    List.add("ニンジン");
    List.add("タマネギ");
    List.add("ジャガイモ");
    List.add("ニク");
        for (String str : List) {
            int length = str.length();
            System.out.println(length);
        }

  }
}

/*
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
// Setをインポートする



// 返り値は配列でいうところの[apple, grapes]のようになっています
Set<String> keys = map.keySet();
// 以下のような繰り返しも可能
for (String key : keys) {
    System.out.println(key);
    // 次のようにgetメソッドの引数としてkey指定を行い要素取得もできる
    // map.get(key);
}
Map<String, String> map = new HashMap<String, String>();
map.put("apple", "りんご");
map.put("bananas", "バナナ");
map.put("grapes", "ぶどう");
// key, valueはput()メソッドの第一引数、第二引数が入る
map.forEach((key, value) -> {
    System.out.println(key + ": " + value);
});
/**
 * 出力結果)
 * apple: りんご
 * bananas: バナナ
 * grapes: ぶどう
 */
class API7 {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<Integer, String>();
    // Q1
    map.put(1, "apple");
    map.put(10, "lemon");
    map.put(100, "pineapple");
    map.put(1000, "grape");
    map.put(10000, "banana");
    map.put(543210, "strawberry");
    // Q2
    /* 
    for (String value : map.values()) {
    System.out.println(value);
    } */
    // Q3
    map.replace(1, "orange");
    map.remove(543210);
    //Q5
    Set<Integer> keys = map.keySet();
    int num = keys.size(); 
    System.out.println("要素数は" + num + "です。");
  }
}

/*
 *
// HashSetとSetをimportする
import java.util.HashSet;
import java.util.Set;

class Sample {
    public static void main(String[] args) {
      /**
       * String型の要素を格納するHashSetのインスタンスを生成します。
       * Set<型> 変数名 = new HashSet<型>();
      Set<String> set = new HashSet<String>();
    }
}
Set<Integer> set = new HashSet<Integer>();
set.add(1); // [1]
set.add(2); // [1, 2]
set.add(3); // [1, 2, 3]
// 配列に変換して返却します
Integer[] array = set.toArray(new Integer[set.size()]); // {1, 2, 3}
 */

 class API8 {
  public static void main(String[] args) {
    Set<String> set = new HashSet<String>();
    // Q1
    set.add("うさぎ");
    set.add("トラ");
    set.add("うま");
    // Q2
    set.forEach( num -> System.out.println(num));
  }
}

/*  0 - 20のランダムな整数
int num = (int) (Math.random() * 20);
if (num >= 1 && num <= 10) {
    System.out.println("ok");
} else {
    // RuntimeExceptionというクラスの例外を発生させています
    throw new RuntimeException("3で割り切れないので不正な数字です");
} */
class Error1 {
  public static void main(String[] args) {
  int num = (int) (Math.random() * 10);
  if (num < 5) {
    System.out.println("ok");
  }
  else {
    throw new IllegalArgumentException("5以上の不正な値です");
  }
  }
}

class Error2 {
  public static void main(String[] args) {
    String name = null;
    System.out.print(name);
    throw new NullPointerException("nullです");
  }
}

/*
try {
    // 処理
} catch (例外クラス 変数名) {
    // 例外クラスの例外が発生した時に実行される処理
} catch (例外クラス2 変数名) {
    // 他の例外も発生しうる場合はcatchブロックが増える
} finally {
    // 最終的に実行したい処理があれば記述、省略可

// コンパイルエラー
// RuntimeExceptionを基にしたクラスとRuntimeExceptionを同時に捕捉できません
} catch (NumberFormatException | RuntimeException e) {
    // 例外処理
}
}
 */

class Error3 {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3};
    try {
      for (int i = 0; i < 4; i++) {
          System.out.println(numbers[i]);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("要素数を超えました");
    }
  }
}
class Error4 {
  public static void main(String[] args) {
    try {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String inputStr = br.readLine();
    int inputNum = Integer.parseInt(inputStr);
    System.out.println(inputNum + "が入力されました");
    } catch (IOException e) {
      System.out.println("不正な値が入力されました");
    } catch (NumberFormatException e) {
      System.out.println("数字を入力してください");
    }
  }
}
/*
 * public static void main(String[] args) {
    try {
        method1();
    } catch (NumberFormatException e) {
        e.printStackTrace();
    }
}

// NumberFormatExceptionが発生した場合、呼び出し元に例外処理を任せます
public static int method1() throws NumberFormatException, IOException, SQLException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int ret = 0;
    try {
        String line = br.readLine();
        // lineの値によってはint型に変換できず例外発生
        ret = Integer.parseInt(line);
    } catch(IOException e) {
        e.printStackTrace();
    }
    return ret;

}

class Server {
    public static String takeOrder(String menu) throws ServiceException {
        try {
            Food orderedFood = Chef.cook(menu);
            return orderedFood;
        } catch(KitchenException e) {
            // コンストラクタの第２引数に「１つ目に発生した例外」のオブジェクト(e)を渡す。
            throw new ServiceException("本日はラーメンの注文をお受けできません", e);
        }
    }
}
例外チェーン

 */

class Error5 {
  public static void main(String[] args) {
    try { 
        method5();
        } catch (IOException e) {
          e.printStackTrace();
        } catch (NumberFormatException e) {
          System.out.println("例外が発生しました");
        }
     }
    public static int method5() throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = br.readLine();
        int inputNum = Integer.parseInt(inputStr);
        return inputNum;
    }
}


/* 
public class Teacher {
  public static void main(String[] args) {
    String issue = "動画作成課題";
    Student student = new Student();
    try {
    Homework homework = student.doHomework(issue);

    if (checkHomework(homework)) {
      System.out.println(homework.getContent() + "を採点します。");
     }
   } catch (SpecException e) {
    e.getMessage();
    System.out.println("PCを見せてください。");
   }
  }

  private static boolean checkHomework(Homework homework) {
    if (homework == null || homework.getContent().isEmpty()) {
      return false;
     }
    return true;
   }
}

public class Student {
  public Homework doHomework(String title) {
    NotePc pc = new NotePc();
    Homework homework = pc.createHomework(title);
    return homework;
   }
}

public class NotePc {
  public Homework createHomework(String title) {
      if (title.equals("動画作成課題")) {
        throw new SpecException("容量が足りません。");
       }
    return new Homework(title);
   }
}

public class Homework {
  private String content = "";

  public Homework() {}

  public Homework(String content) {
    this.content = content;
   }

  public String getContent() {
    return this.content;
   }
}

public class SpecException extends Exception {
  public SpecException(String message) {
    super(message);
   }
}


public class Teacher {
    public static void main(String[] args) {
        String issue = "動画作成課題";
        Student student = new Student();
        Homework homework = null;
​
        try {
            homework = student.doHomework(issue);
            if (checkHomework(homework)) {
                System.out.println(homework.getContent() + "を採点します。");
            }
        } catch (SpecException e) {
            System.out.println(e.getMessage());
            System.out.println("PCを見せてください。");
        }
    }
​
    private static boolean checkHomework(Homework homework) {
        if (homework == null || homework.getContent().isEmpty()) {
            return false;
        }
        return true;
    }
}

public class Student {
    public Homework doHomework(String title) throws SpecException {
        NotePc pc = new NotePc();
        Homework homework = pc.createHomework(title);
        return homework;
    }
}

public class NotePc {
    public Homework createHomework(String title) throws SpecException {
    try {
        if (title.equals("動画作成課題")) {
            throw new SpecException("容量が足りません。"e);
        }
        } catch (StudentException e) {

        }
        return new Homework(title);
    }
}
*/


class GameUtils {
  private static final String REGEX_ALPHABET = "^[A-Za-z]{4,12}$";
  private  GameUtils() {
  }
  public static int getInputInt() {
    int num = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
    String str = br.readLine();
    num = Integer.parseInt(str);
    return num;
    } catch (IOException e) {
      System.out.println("Please enter an integer!");
      return getInputInt();
    }
  }
  public static String getInputString() {
    String inputStr = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      inputStr = br.readLine();
    } catch (IOException e) {
      System.out.println("Input error...Please retype!");
      return getInputString();
    }
    return inputStr;
  }
  public static int getRandomInt(int maxValue) {
    Random random = new Random();
    return random.nextInt(maxValue);
  }
  public static boolean checkPattern(String targetStr) {
    if (targetStr == null || targetStr.isEmpty()) {
      return false;
    }
    else {
        String regex_alphabet = "^[A-Za-z]+{4,12}$";
        return Pattern.matches(regex_alphabet, targetStr);
    }
  }
}
class CardPickGame {
    private int maxBetCoin = 100;
    private int deckSetCount = 2;
    private int possessionCoin;

    public CardPickGame(int possessionCoin) {
        this.possessionCoin = possessionCoin;
    }

    public int execute() {
      while (true) {
        if (this.possessionCoin == 0) {
            return this.possessionCoin;
        }
        while (true) {
            System.out.println("You have " + this.possessionCoin + " Coin, Start the game? y / n");

            String line = GameUtils.getInputString();


                if (line.equals("y")) {
                  break;
                } else if (line.equals("n")) {
                  return this.possessionCoin;
                } else {
                  System.out.println("Please enter y or n.");
                }
              }
            int ableBetCoin = Math.min(this.maxBetCoin, this.possessionCoin);
            System.out.println("Please bet Coin 1 ~ " + ableBetCoin);

            int userBetCoin = 0;
            while (true) {
            userBetCoin = GameUtils.getInputInt();
            if (userBetCoin > 0 && userBetCoin <= ableBetCoin) {
                break;
              }
            }
            this.possessionCoin -= userBetCoin;

            int cardResult = this.getCard();
            boolean isWin = this.judgeCard(cardResult);
            int getCoin = 0;
            if (isWin) {
            getCoin = userBetCoin * 2;
            System.out.println("You Win! Get " + getCoin + " Coin!");
            this.possessionCoin += getCoin;
            } 
            if (getCoin == 0) {
              System.out.println("You lose");
            }
            if (getCoin >= 1) {
              System.out.println("You got " + getCoin + "Coin !!");
            }
        }
    }

  private int getCard() {
    List<List<Integer>> setDeck = new ArrayList<List<Integer>>();
    List<Integer> onePair = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 ,10));
    for (int i = 0; i < this.deckSetCount; i++) {
      setDeck.add(i, onePair);
     }
         int randNumA1;
    int randNumA2;
    int randNumB1;
    int randNumB2;
    while (true) {
      randNumA1 = GameUtils.getRandomInt(2);
      randNumA2 = GameUtils.getRandomInt(10);
      randNumB1 = GameUtils.getRandomInt(2);
      randNumB2 = GameUtils.getRandomInt(10);
            if (!(randNumA1 == randNumB1 && randNumA2 == randNumB2)) {
       break;
       }
     }
    int cardA = setDeck.get(randNumA1).get(randNumA2);
    int cardB = setDeck.get(randNumB1).get(randNumB2);
    int userNumSum = cardA + cardB;
    System.out.println("Cards drawn are " + cardA + " and " + cardB + ", total is " + userNumSum + ".");
    return userNumSum;
  }
  private boolean judgeCard(int getCardResult) {
    return (getCardResult >= 11) ? true : false;
  }
}
class Playing {
  public static void main(String[] args) {
    String username = "";
    int possessionCoin = 1000;
    int maxWinCoin = 1000;
    System.out.println("Welcome !");
    System.out.println("Enter your username");

    while (true) {
      username = GameUtils.getInputString();
      if (GameUtils.checkPattern(username)) {
       break; 
      }
        System.out.println("Does not match condition of the username");
    }
    System.out.println("Hello" + username);
    HighAndLowGame Game = new HighAndLowGame();
    int resultCoin = Game.execute();
    possessionCoin += resultCoin;
    CardPickGame userCoin = new CardPickGame(possessionCoin);
    possessionCoin = userCoin.execute();
    System.out.println(username+ "Possession : " + resultCoin + "Coin");
  }
}
class HighAndLowGame {
  private int earnedCoinCount;
  private int maxWinCoin = 1000;
  private int deckSetCount;
  public void HighAndLowGame(int earnedCoinCount,int deckSetCount) {
    this.earnedCoinCount = earnedCoinCount;
    this.deckSetCount = deckSetCount;
  }
  private List<Integer> getCard(List<Integer> cardList) {
    List<List<Integer>> setDeck = new ArrayList<List<Integer>>();
    List<Integer> onePair = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 ,10));
    for (int i = 0; i < deckSetCount; i++) {
      setDeck.add(i, onePair);
    }
    int cardA;
    while (true) {
      int randNumA1 = GameUtils.getRandomInt(2);
      int randNumA2 = GameUtils.getRandomInt(10);
      cardA = setDeck.get(randNumA1).get(randNumA2);

      int count = 0;
      for (int value : cardList) {
        if (cardA == value) {
          count++;
        }
      }
      if (count < this.deckSetCount) {
        break;
      }
    }
    cardList.add(cardA);
    int lastIdx = cardList.size() - 1;
    int showValue = cardList.get(lastIdx);
    System.out.println("pick card --" + showValue + "--");
    return cardList;
  }
  private boolean judgeCard(List<Integer> cardList,boolean pickChoice) {
    int num = cardList.size() - 1;
    int cardA = cardList.get(num);
    int cardB = cardList.get(num - 1);

    if (cardA == cardB) {
        return false;
    }

    boolean flg = (cardA > cardB) ? true : false;
    if (pickChoice == flg) {
      return true;
     }
    return false;
   }
   public int execute() {
    List<Integer> cardList = new ArrayList<Integer>();
    cardList = this.getCard(cardList);
    while (true) {
      if (this.earnedCoinCount > this.maxWinCoin) {
        return this.earnedCoinCount;
      } 
      System.out.println("Your winCoin is" + this.earnedCoinCount);
      while (true) {
      System.out.println("Playing High And Low ? y / n");
      String choice = GameUtils.getInputString();

        if (choice.equals("n")) {
          return this.earnedCoinCount;
        } else if (choice.equals("y")) {
          break;
        } else {
        System.out.println("Input error...Please retype!");
        }
      }
      boolean pickChoice = true;
      while (true) {
        System.out.println("High or Low ? h / l");
        String userChoice = GameUtils.getInputString();
        if (userChoice.equals("h")) {
          break;
        } else if (userChoice.equals("l")) {
          pickChoice = false;
          break;
        } else {
        System.out.println("Input error...Please retype!");
        }
      }
      cardList = this.getCard(cardList);
      boolean isWinner = this.judgeCard(cardList, pickChoice);
      if (isWinner) {
        this.earnedCoinCount *= 2;
      } else {
        this.earnedCoinCount = 0;
      }
      if (this.earnedCoinCount == 0) {
        return this.earnedCoinCount;
      }
      System.out.println("You got " + this.earnedCoinCount + "Coin !!");
    }
  }
}
// 動作確認
class ExeTest {
  public static void main(String[] args) {
    String inputString = GameUtils.getInputString();
    int inputInt = GameUtils.getInputInt();
    int randomInt = GameUtils.getRandomInt(5);
    boolean result = GameUtils.checkPattern("test");
    System.out.println(inputString);
    System.out.println(inputInt);
    System.out.println(randomInt);
    System.out.println(result);
    CardPickGame cardPickGame = new CardPickGame(10);
   }
}

class SampleQ1 {
  public static void main(String[] args) {
      int num1 = 8;
      int num2 = 13;
      boolean isMultiple = num2 % num1 == 0;
    /*if (isMultiple) {
      System.out.println(num2 + "は" + num1 + "の倍数です");
    else {
      System.out.println(num2 + "は" + num1 + "の倍数ではありません");
    }*/
    //if ((num1 + num2) % 7 == 0 && num1>10 | num1 % 2 == 0 && num2 >= 100 | !num2 % 6 == 0) {
      
    //}
    if ((num1 + num2) % 7 == 0) {
      if (num1>10 || num1 % 2 == 0) {
        if (num2 <= 100 && !(num2 % 6 == 0)) {
          System.out.println("すべての条件を満たしました");
        }
      }
    }
  }
}
class SampleQ3 {
  public static void main(String[] args) {
    int checkTarget = 6;
    switch (checkTarget) {
      case 1:
        System.out.println("条件にヒットしました");
        break;
    
      case 6:
        System.out.println("条件にヒットしました");
        break;

      default:
        System.out.println("条件に合いませんでした");
        break;
    }
  }
}

class SampleQ456 {
  public static void main(String[] args) {
    int age = 12;
    String gender = "male";
    String status = "";

    if (0 <= age && age <= 5) {
      if (gender.equals("female")) {
        status = "A";
      } else if (gender.equals("male")) {
        status = "A";
      }
    } else if (6 <= age && age <= 10) {
      if (gender.equals("male")) {
        status = "A";
      }
    } else if (age > 10) {
      if (!gender.equals("male")) {
        status = "B";
      } else {
        status = "C";
      }
    } else {
      System.out.println("判定対象外");
      return;
    }

    System.out.println(status);
  }
}

class SampleQ7 {
  public static void main(String[] args) {
    for (int num = 1; num <= 10; num++){
      if (num % 2 ==0) {
        System.out.println("処理をスキップします。");
        continue;
      }
      System.out.println(num + "回目の出力です。");
      if (num == 7) {
        System.out.println("処理を終了します。");
        break;
      }
    }
  }
}
class SampleQ8 {
  public static void main(String[] args) {
    for (int i = 1; i <= 20; i++) {
      if (i % 3 == 0 && i % 4 ==0) {
        System.out.println(i + " Oh!Yes!!");
      }
      else if (i % 3 == 0) {
        System.out.println(i + " Oh!");
      }
      else if (i % 4 == 0) {
        System.out.println(i + " Yes!!");
      }
      else {
        System.out.println(i);
      }
    }
  }
}

class SampleQ10 {
  public static void main(String[] args) {
    String[] products = {
    "水",
    "コーラ",
    "オレンジジュース",
    "カフェオレ"
};

String productsStr = "";
String[] teamList = {
    "A",
    "B",
    "C",
    "D",
    "E"
};
int[] numberArray = {10, 3, 22, 9, 2, 18};
int[] arrayA = {1, 2, 3, 4, 5, 6, 7};
int[] arrayB = {11, 21, 31, 41, 51, 61, 71};

System.out.println("入れ替え前");
System.out.print("配列Aの要素は ");
for (int element : arrayA) {
    System.out.print(element + " ");
}
System.out.print("\n");
System.out.print("配列Bの要素は ");
for (int element : arrayB) {
    System.out.print(element + " ");
}

for (int i = 0; i < arrayA.length; i++) {
    /** ここから追記可 */
    int temp = arrayA[i];
    arrayA[i] = arrayB[i];
    arrayB[i] = temp;
}

System.out.println("入れ替え後");
System.out.print("配列Aの要素は ");
for (int element : arrayA) {
    System.out.print(element + " ");
}
System.out.print("\n");
System.out.print("配列Bの要素は ");
for (int element : arrayB) {
    System.out.print(element + " ");
}

/*     for (int i = 0; i < products.length; i++) {
        productsStr += (i + 1) + ":" + products[i] + " ";
    }
        System.out.println(productsStr);*/
        /*for (int i = 0; i < teamList.length; i++) {
          for (int j = 0; j < teamList.length; j++) {
            if (i == j) {
              System.out.print("|NoBattle");
              continue;
            }
            System.out.print("| " + teamList[i] + "vs" + teamList[j] + " ");
          }
          System.out.print("|");
        System.out.println();
        }*/
   int maxNumber = numberArray[0];
   int miniNumber = numberArray[5];
   for (int i = 1; i < numberArray.length; i++) {
    if (numberArray[i] > maxNumber) {
      maxNumber = numberArray[i];
    }
    if (numberArray[i] < miniNumber) {
      miniNumber = numberArray[i];
    }
   }
   System.out.println("最大値は" + maxNumber);
   System.out.println("最小値は" + miniNumber);
  }
}

class SampleQQ {
  public static void main(String[] args) {
    String[][][][] fonts = {
    {
        {
            {"T", "h", "e", " "},
            {"q", "u"}
        },
        {
            {"i"},
            {"c", "k", " ", "b", "r"},
            {"o", "w", "n"}
        },
        {
            {" ", "f"}
        }
    },
    {
        {
            {"o", "x" ," ", "j"},
            {"u"}
        },
        {
            {"m", "p"},
            {"s", " ", "o", "v"}
        }
    },
    {
        {
            {"e", "r"},
            {" ", "t", "h"},
            {"e", " ", "l"}
        },
        {
            {"a", "z", "y", " ", "d"},
            {"o", "g", "."}
        }
    }
};
for (int i = 0; i < fonts.length; i++) {
  for (int j = 0; j < fonts[i].length; j++) {
    for (int k = 0; k < fonts[i][j].length; k++) {
      for (int l = 0; l < fonts[i][j][k].length; l++) {
        System.out.println(fonts[i][j][k][l]);
      }
    }
  }
}
  }
}

class SampleQQQ {
  public static void main(String[] args) {
    List<String> wagashi = new ArrayList<String>();
    wagashi.add("みたらし団子");
    wagashi.add("ういろう");
    wagashi.add("せんべい");
    wagashi.add("羊羹");

    List<String> yogashi = new ArrayList<String>();
    yogashi.add("ショートケーキ");
    yogashi.add("プリン");
    yogashi.add("シュークリーム");
    yogashi.add("クッキー");
    yogashi.add("マシュマロ");
    yogashi.add("チョコレート");

    Map<String, List<String>> sweets = new HashMap<String, List<String>>();
    sweets.put("和菓子", wagashi);
    sweets.put("洋菓子", yogashi);
    System.out.println(sweets.get("洋菓子").get(3));
        sweets.forEach((category, sweetsList) -> {
            System.out.println(category + ":" + sweetsList.size());
        });
  }
}

class SampleQQQQ {
  public static void main(String[] args) {

    ArrayList<String> animaList = new ArrayList<String>();
    animaList.add("dog");
    animaList.add("cat");
    animaList.add("mouse");
    String firstAnimal = animaList.get(0);
    animaList.set(2, "hamster");
    System.out.println(firstAnimal);
    for (int i = 0; i < animaList.size(); i++) {
      System.out.println("No." + (i + 1) + ":" +animaList.get(i));
    }
    Map<String, String> dogDetails = new HashMap<String, String>();
    Map<String, String> catDetails = new HashMap<String, String>();
    Map<String, String> hamsterDetails = new HashMap<String, String>();
    Map<String, Map<String, String>> animalDetails = new HashMap<String, Map<String, String>>();
    dogDetails.put("name", "コタロー");
    dogDetails.put("type", "ブルテリア");
    dogDetails.replace("type", "ボルゾイ");
    catDetails.put("name", "コジロー");
    catDetails.put("type", "マンチカン");
    hamsterDetails.put("name", "ハムタロー");
    hamsterDetails.put("type", "キンクマ");
    System.out.println(dogDetails.get("name") + "(" + dogDetails.get("type") + ")");
    animalDetails.put(animaList.get(0), dogDetails);
    animalDetails.put(animaList.get(1), catDetails);
    animalDetails.put(animaList.get(2), hamsterDetails);
    System.out.print(animalDetails);
    animalDetails.forEach((key, animalDetail) -> {            
      System.out.println("[" + key + "]");
    System.out.println("名前：" + animalDetail.get("name"));
    System.out.println("種類：" + animalDetail.get("type"));
    System.out.println();
      });
  }
}

class ClassKadai {
    public static void main(String[] args) {
       ClassRoom classRoom = new ClassRoom();
       classRoom.setMainTeacher();
       classRoom.setSubTeacher();
       classRoom.setStudent();
       classRoom.showClassRoom();
    }
}
class ClassRoom {
    // <出席番号 Student型>
    private HashMap<Integer, Student> students = new HashMap<Integer, Student>();

    // <(主担任 | 副担任) Teacher型>
    private HashMap<String, Teacher> teachers = new HashMap<String, Teacher>();

    /**
     * 以下のフィールド変数を書き換えてはならない
     */
    // 生徒の氏名
    private String[] studentNames = {"赤城", "加賀", "工藤", "斎藤", "島野", "高橋", "橋本", "松村", "柳沢"};

    // 学年
    private int grade = 6;

    // クラス番号
    private int classNumber = 1;

    /**
     * 主担任をセットする
     */
    public void setMainTeacher() {
        Teacher mainTeacher = new Teacher();
        mainTeacher.setName("山田太郎");
        mainTeacher.setSubject("国語");
        this.teachers.put("主担任", mainTeacher);
    }

    /**
     * 副担任をセットする
     */
    public void setSubTeacher() {
      Teacher subTeacher = new Teacher();
      subTeacher.setName("佐々木一郎");
      subTeacher.setSubject("数学");
      this.teachers.put("副担任", subTeacher);
    }

    public void setStudent() {
      for (int i = 0; i < this.studentNames.length; i++) {
        Student student = new Student();
        student.setName(this.studentNames[i]);
        students.put(i + 0, student);
      }
    }

    /**
     * クラス名簿を出力する
     */
    public void showClassRoom() {
        System.out.println("------------------------------------");
        System.out.println(this.grade + "年" + this.classNumber + "組 クラス名簿");
        System.out.println("------------------------------------");
        this.teachers.forEach((key, teacher) -> {
            System.out.print(key + " ");
            teacher.showTeacherInformation();
        });
        System.out.println("------------------------------------");
        System.out.println("生徒一覧");
        this.students.forEach((key, student) -> {
            System.out.print(key + ". ");
            student.showName();
        });
        System.out.println("------------------------------------");
    }

    public ClassRoom () {
      this.setMainTeacher();
      this.setStudent();
      this.setSubTeacher();
    }

}
/**
 * 生徒クラス
 */
class Student {
    private String name;

    /**
     * 生徒の名前をセットする
     * @param String name
     */
    public void setName(String name) {
        this.name = name;
    }
    public void showName() {
      System.out.println(this.name);
    }
}
/**
 * 先生クラス
 */
class Teacher {
    // 先生の名前
    private String name;
    // 担当教科
    private String subject;

    /**
     * 先生の名前をセットする
     * @param String name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 担当教科をセットする
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * 先生の名前・担当教科を出力する
     */
    public void showTeacherInformation() {
        System.out.println("氏名: " + this.name + " 教科: " + this.subject);
    }
}

class Algorithm {
    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        System.out.println(isRotation(str1, str2));
    }

    public static boolean isSubstring(String s1, String s2) {
        return s1.matches(".*" + s2 + ".*$");
    }

    public static boolean isRotation(String s, String t) {
      
    }
}