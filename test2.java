import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        System.out.println("欢迎来到猜数字游戏!");
        System.out.println("我已经选择了一个1到100之间的随机数字，请你猜一猜。");

        // 生成随机数
        int randomNumber = (int) (Math.random() * 100) + 1;

        Scanner scanner = new Scanner(System.in);
        int userGuess;

        do {
            System.out.print("你的猜测是： ");
            userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("恭喜你，猜对了！这个数字就是 " + randomNumber);
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("太小了，再试一次吧。");
            } else {
                System.out.println("太大了，再试一次吧。");
            }

        } while (true);

        scanner.close();
    }
}
