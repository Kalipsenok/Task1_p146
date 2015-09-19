import java.util.Scanner;
public class CreateArray {
    public int size = 0;
    String str;

    public void createByWrite() {
        Scanner sz = new Scanner(System.in);
        System.out.print("Write rows number:");
        if (sz.hasNextInt()) {
            size = sz.nextInt();
            System.out.println("We have an array with " + size + " rows.");
        } else {
            System.out.println("You wrote non integer number. Write integer number");

        }

        String[] strArray = new String[size];

        int i;
        Scanner strg = new Scanner(System.in);
        for (i = 0; i < strArray.length; i++)

        {
            System.out.print("Write row's text " + i + ": ");
            if (strg.hasNextLine()) {
                str = strg.nextLine();

                String strEnd = "end";
                if (str.equals(strEnd)) {
                    while (i < size) {
                        str = String.valueOf(i);
                        strArray[i] = str;
                        System.out.println("Row " + i + " : " + strArray[i]);
                        i++;
                    }
                } else {
                    strArray[i] = str;
                    System.out.println("Row " + i + " : " + strArray[i]);
                }
            }
                   }

        System.out.println("Our array BEFORE sorting:");
        for (i = 0; i < strArray.length; i++) {
            System.out.println("mas[" + i + "]=" + strArray[i] + ";");
        }
        System.out.println("Our array after sorting:");
        String min = strArray[i];
        int iMin = i;
        for (int j = i + 1; j < strArray.length; j++) {
            if (strArray[j].compareTo(min) < 0) {
                min = strArray[j];
                iMin = j;
            }
        }
        if (i != iMin) {
            String temp = strArray[i];
            strArray[i] = strArray[iMin];
            strArray[iMin] = temp;
        }
        System.out.println("Our array after sorting:");
        for (i = 0; i < strArray.length; i++) {
            System.out.println("mas[" + i + "]=" + strArray[i] + ";");
        }
    }


}

