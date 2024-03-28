import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class ATM {
    private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    public Map<Integer, String> menu = new HashMap<Integer, String>();
    private int money = 0;
    private static final int MIN = 1;
    private static final int MAX = 2000000;
        public ATM() {
        this.menu.put(1, "預け入れ");
        this.menu.put(2, "引き出し");
        this.menu.put(3, "残高照会");
        this.menu.put(4, "終了");
    };
    private void showMenu(Map<Integer, String> menu) {
        menu.forEach((key, value) -> System.out.print(key + ":" + value + " "));
        System.out.println();
    }
    private int inputMenu(Map<Integer, String> menu) {
        while (true) {
        this.showMenu(menu);
        int input = this.inputNum();
        if (input > 0 && input <= menu.size()) {
            return input;
        }
        System.out.println("該当する半角数字で入力してください");
        }
        }
    private int inputNum() {
        try {
        return Integer.parseInt(BR.readLine());
        } catch (NumberFormatException | IOException e) {
        return 0;
        }
        }
    public void selectMenu() {
        boolean isFinished = true;
        while (isFinished) {
        int inputMenu = this.inputMenu(menu);
            switch (inputMenu) {
                case 1:
                    this.deposit();
                    break;
                case 2:
                    break;
                case 3:
                    this.moneyCalc();
                    break;
                case 4:
                    System.out.println("ATM のご利用ありがとうございました");
                    isFinished = false;
                    break;
            }
        }
    }
    private void moneyCalc() {
        System.out.println("残高は" + this.money + "円です");
    }
    private void deposit() {
        int depo = -1;
        while(true) {
            System.out.println("金額を入力して下さい");
            depo = this.inputNum();
            if(depo >= MIN && depo <= MAX) {
                break;
            }
            System.out.println(MIN + "円から" + (MAX/10000) + "万円以内で入力して下さい");
        }
        this.money+=depo;
        System.out.println(money +"円お預かりしました");
    }
}
class ExecutionATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.selectMenu();
    }
}