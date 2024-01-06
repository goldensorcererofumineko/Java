import java.util.Random;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

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