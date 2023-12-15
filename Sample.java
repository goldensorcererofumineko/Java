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