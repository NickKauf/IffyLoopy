import java.util.Scanner;

public class IffyLoopy {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //loopy

        String words = "your words: ";

        for (int index = 0; index < 5; index++) {
            System.out.println("enter a word:");
            words += kb.nextLine() + " ";
        }

        System.out.println(words);

        //iffy
            String tryAgain = "y";

            while (tryAgain.equals("y")) {

                System.out.println("Are your eyes red?(y/n)");
                String answer = kb.nextLine();
                boolean redEyes = (answer.equals("yes") || answer.equals("y"));
                if (redEyes) {
                    System.out.println("Get some sleep!");
                } else {
                    System.out.println("You look great!");
                }

                System.out.println("do you want to try again?(y/n)");
                tryAgain = kb.nextLine();
            }




        System.out.println("goodbye!");


    }
}
