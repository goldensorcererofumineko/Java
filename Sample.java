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