package pl.patryk.recruitment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer or press s to finish");
        while (!sc.hasNext("s") && sc.hasNextInt()) {
            System.out.println("Enter next integer: ");
            int a = sc.nextInt();
            integerList.add(a);
        }

        if (integerList.isEmpty()) {
            System.out.println("List is empty. App will be closed");
        } else {
            ArrayInfo arrayInfo = new ArrayInfo();
            System.out.println("Provided values: " + integerList);

            System.out.println(arrayInfo.preprareInfo(integerList));
        }
    }
}
